-- 1. Crear la base de datos
CREATE DATABASE IF NOT EXISTS usuarios_combobox;
USE usuarios_db;

-- 2. Crear tabla EXACTAMENTE con los campos que tienes
CREATE TABLE IF NOT EXISTS usuarios (
    idUsuario INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    rol VARCHAR(50) NOT NULL
);



