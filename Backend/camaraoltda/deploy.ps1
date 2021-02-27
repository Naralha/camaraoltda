 param (
    [string]$postgres_username = "postgres",
    [Parameter(Mandatory=$true)][string]$postgres_password,
    [switch]$reset_database = $true,
    [switch]$no_cache = $false
 )

Write-Host "Removendo containers existentes...";
docker-compose down;

if($reset_database) {
    Write-Host "Removendo os volumes existentes...";
    docker volume rm "camaraoltda_pgdata";
    docker volume rm "deploy_files_pgdata";
}

if($no_cache) {
    docker-compose build --no-cache;
}

Write-Host "Subindo os novos containers...";
docker-compose up -d;

Start-Sleep -s 15;

Write-Host "Fazendo carga no banco...";

Remove-Item "${HOME}/pgpass.conf" -Force;
New-Item "${HOME}/pgpass.conf"
Set-Content "${HOME}/pgpass.conf" "*:*:*:${postgres_username}:${postgres_password}"

docker cp "${HOME}/pgpass.conf" postgres:/;
docker cp ./deploy_files/carga_pesada.sql postgres:/carga.pesada.sql;

docker exec -it postgres bash -c "chmod 0600 ./pgpass.conf";

$cmd_execute = 'docker exec postgres psql -d camaraoltda -w -U "postgres" -f "./carga.pesada.sql"'
$env:PGPASSFILE = "/pgpass.conf"; Invoke-Expression $cmd_execute;

if($LASTEXITCODE) {
    Write-Host " Failed";
} else {
    Write-Host " Succeeded";
}

docker exec postgres rm "pgpass.conf";

Remove-Item "$env:HOME/pgpass.conf" -Force;