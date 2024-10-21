SELECT * FROM CREAR_USUARIOS;          
SELECT * FROM CAJERO;
SELECT * FROM CAMBIOS_TARJETA
SELECT * FROM MODIFICAR_LIMITE
SELECT * FROM CONSULTA_USUARIO
SELECT * FROM CAMBIOS_PIN
SELECT * FROM ADMINSTRADOR
SELECT * FROM TRANSACCIONES
;
-- RECORDATORIO ACTUALIZAR EL CAJERO EN LOS RETIROS Y DEPOSITOS EN ESAS VENTANAS PARA CONSULTAR USUARIO
SELECT * FROM CAJERO;
SELECT * FROM CREAR_USUARIOS;  
SELECT * FROM CONSULTA_USUARIO
SELECT * FROM TRANSACCIONES;

USE CAJEROCUNOR
INSERT INTO CAJERO (total_dinero, billetes_200, billetes_100, billetes_50, billetes_20, billetes_10, billetes_5, billetes_1, estado_inicializado)
VALUES (0, 0, 0, 0, 0, 0, 0, 0, 0);

UPDATE CAJERO
SET total_dinero = 6060, 
    billetes_200 = 30, 
    billetes_100 = 0, 
    billetes_50 = 0, 
    billetes_20 = 3, 
    billetes_10 = 0, 
    billetes_5 = 0, 
    billetes_1 = 0,
    estado_inicializado = 1
WHERE id_cajero = 4;

DELETE FROM CAJERO
WHERE id_cajero = 5;

ALTER TABLE CREAR_USUARIOS
ADD TokenTipo BIT 

SELECT * FROM CREAR_USUARIOS
where nombre = 'culo'

SELECT TOP 1 id_cajero FROM CAJERO ORDER BY id_cajero DESC