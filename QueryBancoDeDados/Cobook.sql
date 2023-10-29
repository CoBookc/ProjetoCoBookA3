CREATE DATABASE CoBook;
USE CoBook;

CREATE TABLE Usuarios (
    cod_usuarios INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40),
    email VARCHAR(50) UNIQUE,
    CPF VARCHAR(14) UNIQUE NOT NULL,
    idade INT,
    sexo VARCHAR(10),
    tipo_livro_preferido1 VARCHAR(100),
    tipo_livro_preferido2 VARCHAR(100),
    senha VARCHAR(100)
);

CREATE TABLE Cargos (
    cod_cargos INT AUTO_INCREMENT PRIMARY KEY,
    tipo_cargo VARCHAR(20)
);


CREATE TABLE cargos_usuarios (
    cod_cargos INT,
    cod_usuarios INT,
    PRIMARY KEY (cod_cargos, cod_usuarios),
    CONSTRAINT FK_COD_USUARIOS FOREIGN KEY(cod_usuarios) REFERENCES Usuarios (cod_usuarios),
    CONSTRAINT FK_COD_CARGOS_USUARIOS FOREIGN KEY(cod_cargos) REFERENCES Cargos (cod_cargos)
);


CREATE TABLE Livro (
    cod_livro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100),
	tipo_livro VARCHAR(100),
    autor VARCHAR(100),
    nota INT,
    cod_usuario INT,
    CONSTRAINT FK_COD_USUARIOS_LIVRO FOREIGN KEY(cod_usuario) REFERENCES Usuarios (cod_usuarios)
);