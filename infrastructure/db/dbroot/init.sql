-- Создание пользователей и баз данных

-- Создание пользователя и базы данных для UserService
CREATE USER UserService;
ALTER USER UserService WITH ENCRYPTED PASSWORD '12345';
CREATE DATABASE UserServiceDB;
GRANT ALL PRIVILEGES ON DATABASE UserServiceDB TO UserService;

-- Создание пользователя и базы данных для CompanyService
CREATE USER CompanyService;
ALTER USER CompanyService WITH ENCRYPTED PASSWORD '12345';
CREATE DATABASE CompanyServiceDB;
GRANT ALL PRIVILEGES ON DATABASE CompanyServiceDB TO CompanyService;

-- Создание пользователя и базы данных для PaymentService
CREATE USER PaymentService;
ALTER USER PaymentService WITH ENCRYPTED PASSWORD '12345';
CREATE DATABASE PaymentServiceDB;
GRANT ALL PRIVILEGES ON DATABASE PaymentServiceDB TO PaymentService;

-- Создание пользователя и базы данных для NotificationsService
CREATE USER NotificationsService;
ALTER USER NotificationsService WITH ENCRYPTED PASSWORD '12345';
CREATE DATABASE NotificationsServiceDB;
GRANT ALL PRIVILEGES ON DATABASE NotificationsServiceDB TO NotificationsService;

-- Создание пользователя и базы данных для FileService
CREATE USER FileService;
ALTER USER FileService WITH ENCRYPTED PASSWORD '12345';
CREATE DATABASE FileServiceDB;
GRANT ALL PRIVILEGES ON DATABASE FileServiceDB TO FileService;
