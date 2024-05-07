-- Создание пользователей и баз данных
CREATE USER if not exists UserService WITH PASSWORD 'UserService';
CREATE DATABASE if not exists  UserServiceDB;
GRANT ALL PRIVILEGES ON DATABASE UserServiceDB TO UserService;

CREATE USER if not exists CompanyService WITH PASSWORD 'CompanyService';
CREATE DATABASE if not exists CompanyServiceDB;
GRANT ALL PRIVILEGES ON DATABASE CompanyServiceDB TO CompanyService;

CREATE USER IF NOT EXISTS PaymentService WITH PASSWORD 'PaymentService';
CREATE DATABASE IF NOT EXISTS PaymentServiceDB;
GRANT ALL PRIVILEGES ON DATABASE PaymentServiceDB TO PaymentService;

CREATE USER IF NOT EXISTS NotificationsService WITH PASSWORD 'NotificationsService';
CREATE DATABASE IF NOT EXISTS NotificationsServiceDB;
GRANT ALL PRIVILEGES ON DATABASE NotificationsServiceDB TO NotificationsService;

CREATE USER IF NOT EXISTS FileService WITH PASSWORD 'FileService';
CREATE DATABASE IF NOT EXISTS FileServiceDB;
GRANT ALL PRIVILEGES ON DATABASE FileServiceDB TO FileService;

CREATE USER IF NOT EXISTS AuthServer WITH PASSWORD 'AuthServer';
CREATE DATABASE IF NOT EXISTS AuthServerDB;
GRANT ALL PRIVILEGES ON DATABASE AuthServerDB TO AuthServer;