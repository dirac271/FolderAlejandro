CREATE DATABASE CAJEROCUNOR
USE CAJEROCUNOR
---
CREATE TABLE ADMINSTRADOR(
id_admin INT IDENTITY(1,1) PRIMARY KEY,
username VARCHAR(100) NOT NULL,
password VARCHAR(255) NOT NULL
)
-- COLUMNA IMPORTANTE, USUARIO Y CONTRA DEL ADMIN. esta tabla debe tener unicamente ese valor. No la cambien putas
INSERT INTO ADMINSTRADOR (username, password) 
VALUES ('Lechero2004','josueyaxcalel123');

-- ESTADO del usuario para su token si es 

SELECT * FROM ADMINSTRADOR;

CREATE TABLE CREAR_USUARIOS (
    id_usuario INT IDENTITY(1,1) PRIMARY KEY,
    nombre VARCHAR(50),
    numero_tarjeta CHAR(16) UNIQUE,
    PIN CHAR(4)UNIQUE,
    saldo DECIMAL(18, 2),
    monto_maximo DECIMAL(18, 2),
    ultima_modificacion DATETIME NULL,
    monto_retirado_hoy DECIMAL(18, 2) DEFAULT 0,
    ultimo_acceso DATETIME NULL,
	token CHAR(6) NOT NULL UNIQUE
);


-- cambiamos a unique token si TokenTipo = 0 su token es dinamico, si su es TokenTipo = 1 entonces es estatico
ALTER TABLE CREAR_USUARIOS
ADD CONSTRAINT UQ_token UNIQUE (token);

CREATE TABLE CAJERO (
    id_cajero INT IDENTITY(1,1) PRIMARY KEY,
    total_dinero DECIMAL(18, 2), 
    billetes_200 INT,
    billetes_100 INT,
    billetes_50 INT,
    billetes_20 INT,
    billetes_10 INT,
    billetes_5 INT,
    billetes_1 INT,
    estado_inicializado BIT DEFAULT 0  -- Para verificar si está inicializado
);

CREATE TABLE CAMBIOS_TARJETA (
    id_cambio INT IDENTITY(1,1) PRIMARY KEY,
    id_usuario INT FOREIGN KEY REFERENCES CREAR_USUARIOS(id_usuario),
    numero_tarjeta_anterior CHAR(16),
    numero_tarjeta_nuevo CHAR(16),
    fecha_cambio DATETIME DEFAULT GETDATE()
);

CREATE TABLE MODIFICAR_LIMITE (
    id_modificacion INT IDENTITY(1,1) PRIMARY KEY,   -- ID único autoincremental para la modificación
    id_usuario INT FOREIGN KEY REFERENCES CREAR_USUARIOS(id_usuario),  -- Referencia al usuario afectado
    monto_anterior DECIMAL(18, 2) NOT NULL,          -- Monto máximo anterior
    monto_nuevo DECIMAL(18, 2) NOT NULL,             -- Monto máximo nuevo
    fecha_modificacion DATETIME DEFAULT GETDATE(),   -- Fecha y hora en que se realizó la modificación
);

CREATE TABLE CONSULTA_USUARIO (
    id_consulta INT IDENTITY(1,1) PRIMARY KEY,      -- ID único para la consulta
    id_usuario INT FOREIGN KEY REFERENCES CREAR_USUARIOS(id_usuario),  -- Referencia al usuario consultado
    monto_maximo DECIMAL(18, 2) NOT NULL,           -- Monto máximo disponible para el retiro
    monto_retirado_hasta_ahora DECIMAL(18, 2) NOT NULL,  -- Cantidad retirada hasta el momento por el usuario
    saldo_actual DECIMAL(18, 2) NOT NULL,           -- Saldo actual del usuario
    ultimo_acceso DATETIME,                         -- Fecha y hora del último acceso del usuario
    fecha_consulta DATETIME DEFAULT GETDATE()       -- Fecha y hora en que se realizó la consulta
);
--ojo below
CREATE TABLE CONTROL_USUARIOS ( -- Deleteeeddddddddddddddddd
    id_control INT IDENTITY(1,1) PRIMARY KEY,
    total_retirado DECIMAL(18, 2),
    promedio_depositos DECIMAL(18, 2),
    cambios_PIN INT,
    ultimo_usuario_acceso INT FOREIGN KEY REFERENCES CREAR_USUARIOS(id_usuario),
    fecha_ultimo_acceso DATETIME
);

CREATE TABLE CAMBIOS_PIN (
    id_cambio INT IDENTITY(1,1) PRIMARY KEY,
    id_usuario INT FOREIGN KEY REFERENCES CREAR_USUARIOS(id_usuario),
    fecha_cambio DATETIME DEFAULT GETDATE(),
    pin_anterior CHAR(4),
    nuevo_pin CHAR(4)
);

CREATE TABLE TRANSACCIONES (
    id_transaccion INT IDENTITY(1,1) PRIMARY KEY,
    id_usuario INT FOREIGN KEY REFERENCES CREAR_USUARIOS(id_usuario),
	Id_cajero int FOREIGN KEY REFERENCES CAJERO(Id_cajero),
    fecha DATETIME DEFAULT GETDATE(),
    tipo_transaccion VARCHAR(10) CHECK (tipo_transaccion IN ('Deposito', 'Retiro')),
    monto DECIMAL(18, 2),
	tokenTransaccion CHAR(10) NOT NULL , --UNIQUE
	token CHAR(6) NOT NULL, 
	CONSTRAINT FK_Transacciones_Token FOREIGN KEY (id_usuario, token)
    REFERENCES CREAR_USUARIOS(id_usuario, token)
);


CREATE TABLE TRANSACCIONES (
    id_transaccion INT IDENTITY(1,1) PRIMARY KEY,
    id_usuario INT,
    id_cajero INT FOREIGN KEY REFERENCES CAJERO(id_cajero),
    fecha DATETIME DEFAULT GETDATE(),
    tipo_transaccion VARCHAR(10) CHECK (tipo_transaccion IN ('Deposito', 'Retiro')),
    monto DECIMAL(18, 2),
    token CHAR(6) NOT NULL,
    CONSTRAINT FK_Transacciones_Token FOREIGN KEY (id_usuario, token)
    REFERENCES CREAR_USUARIOS(id_usuario, token)
);



DROP TABLE CONTROL_USUARIOS
-- SEPARADOR DE LO QUE YA ESTA EN LA BASE









