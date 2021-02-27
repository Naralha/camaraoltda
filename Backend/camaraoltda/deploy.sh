#!/bin/bash
read_parameters() {
    while getopts "r" opt; do
        case $opt in
            r)
                RESET_DATABASE=true
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
    docker volume rm "pgdata" 2>/dev/null
fi

echo "Subindo os novos containers..."
docker-compose up -d

sleep 15

echo "Fazendo carga no banco..."

docker cp ./deploy_files/carga_pesada.sql postgres:/carga_pesada.sql
docker exec postgres psql -d camaraoltda -U postgres -W -f "./carga_pesada.sql"
