CREATE DATABASE OPENPAY
GO

CREATE LOGIN [openpay] WITH PASSWORD='openpay', DEFAULT_LANGUAGE=[Español], CHECK_EXPIRATION=OFF, CHECK_POLICY=OFF
GO

EXEC sp_addsrvrolemember @loginame = N'openpay', @rolename = N'sysadmin'
GO

Configurar application.properties y cambiar CARLES-PORTATIL por el nombre del servidor SQL local:

- spring.datasource.url=jdbc:sqlserver://CARLES-PORTATIL:1433;databaseName=OPENPAY