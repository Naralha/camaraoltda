#!/bin/bash
read_parameters() {
    while getopts "u:p:r" opt; do
        case $opt in
            r)
                RESET_DATABASE=true
                ;;
            u)
                POSTGRES_USERNAME="${OPTARG}"
                ;;
            p)
                POSTGRES_PASSWORD="${OPTARG}"
                ;;  
            \?)
                exit 1
                ;;
        esac
    done
} 

read_parameters "$@"

echo "Removendo containers existentes..."
docker-compose 2>/dev/null

if [ "${RESET_DATABASE}" = "true" ]; then
    echo "Removendo os volumes existentes..."
    docker volume rm "camaraoltda_pgdata" 2>/dev/null
fi

echo "Subindo os novos containers..."
docker-compose up -d

sleep 15

echo "Fazendo carga no banco..."

echo "*:*:*:*:${POSTGRES_PASSWORD}" > "${HOME}/pgpass.conf"

docker cp "${HOME}/pgpass.conf" postgres:/
docker cp ./deploy_files/carga_pesada.sql postgres:/carga.pesada.sql

docker exec -it postgres bash -c "chmod 0600 ./pgpass.conf"

PGPASSFILE=/pgpass.conf docker exec postgres psql -d camaraoltda -w -U "postgres" -f "./carga.pesada.sql"

if [ $? != 0 ]; then
    echo " Failed"
else
    echo " Succeeded"
fi

# docker exec postgres rm "pgpass.conf"
rm "${HOME}/pgpass.conf";
