#!/bin/bash
set -e

# Start PostgreSQL in the background
docker-entrypoint.sh postgres &

# Wait for PostgreSQL to be ready
until pg_isready -U "$POSTGRES_USER"; do
  echo "Waiting for PostgreSQL to be ready..."
  sleep 2
done

# Execute the SQL commands
psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    -- Создание пользователя и базы данных для UserService
    CREATE USER UserService if not exists WITH PASSWORD 'UserService';
    CREATE DATABASE UserServiceDB;
    GRANT ALL PRIVILEGES ON DATABASE UserServiceDB TO UserService;

    -- Создание пользователя и базы данных для CompanyService
    CREATE USER CompanyService WITH PASSWORD 'CompanyService';
    CREATE DATABASE CompanyServiceDB;
    GRANT ALL PRIVILEGES ON DATABASE CompanyServiceDB TO CompanyService;

    -- Создание пользователя и базы данных для PaymentService
    CREATE USER PaymentService WITH PASSWORD 'PaymentService';
    CREATE DATABASE PaymentServiceDB;
    GRANT ALL PRIVILEGES ON DATABASE PaymentServiceDB TO PaymentService;

    -- Создание пользователя и базы данных для NotificationsService
    CREATE USER NotificationsService WITH PASSWORD 'NotificationsService';
    CREATE DATABASE NotificationsServiceDB;
    GRANT ALL PRIVILEGES ON DATABASE NotificationsServiceDB TO NotificationsService;

    -- Создание пользователя и базы данных для FileService
    CREATE USER FileService WITH PASSWORD 'FileService';
    CREATE DATABASE FileServiceDB;
    GRANT ALL PRIVILEGES ON DATABASE FileServiceDB TO FileService;

    -- Создание пользователя и базы данных для AuthServer
    CREATE USER AuthServer WITH PASSWORD 'AuthServer';
    CREATE DATABASE AuthServerDB;
    GRANT ALL PRIVILEGES ON DATABASE AuthServerDB TO AuthServer;
EOSQL

# Bring PostgreSQL back to the foreground
wait
