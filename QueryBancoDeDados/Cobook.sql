CREATE DATABASE CoBook;
USE CoBook;

CREATE TABLE Usuarios (
    cod_usuarios INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40),
    email VARCHAR(50),
    CPF VARCHAR(14) NOT NULL,
    idade INT,
    sexo VARCHAR(10),
    tipo_livro_preferido1 VARCHAR(100),
    tipo_livro_preferido2 VARCHAR(100)
);

CREATE TABLE Atividades (
    cod_atividades INT AUTO_INCREMENT PRIMARY KEY,
    atividades VARCHAR(120)
);

CREATE TABLE Cargos (
    cod_cargos INT AUTO_INCREMENT PRIMARY KEY,
    tipo_funcao VARCHAR(20)
);

CREATE TABLE cargos_atividades (
    cod_cargos INT,
    cod_atividades INT,
    PRIMARY KEY (cod_cargos, cod_atividades),
    CONSTRAINT FK_COD_CARGOS_ATIVIDADES FOREIGN KEY(cod_cargos) REFERENCES Cargos (cod_cargos),
    CONSTRAINT FK_COD_ATIVIDADES FOREIGN KEY(cod_atividades) REFERENCES Atividades (cod_atividades)
);

CREATE TABLE cargos_usuarios (
    cod_cargos INT,
    cod_usuarios INT,
    PRIMARY KEY (cod_cargos, cod_usuarios),
    CONSTRAINT FK_COD_USUARIOS FOREIGN KEY(cod_usuarios) REFERENCES Usuarios (cod_usuarios),
    CONSTRAINT FK_COD_CARGOS_PESSOAS FOREIGN KEY(cod_cargos) REFERENCES Cargos (cod_cargos)
);

CREATE TABLE tipo_telefone (
    cod_tipo_telefone INT AUTO_INCREMENT PRIMARY KEY,
    tipo_telefone VARCHAR(8)
);

CREATE TABLE Telefone (
    cod_telefone INT AUTO_INCREMENT PRIMARY KEY,
    numero_telefone VARCHAR(20),
    cod_usuarios INT,
    cod_tipo_telefone INT,
    CONSTRAINT FK_COD_USUARIOS_TELEFONE FOREIGN KEY(cod_usuarios) REFERENCES Usuarios (cod_usuarios),
    CONSTRAINT FK_COD_TIPO_TELEFONE_TELEFONE FOREIGN KEY(cod_tipo_telefone) REFERENCES tipo_telefone (cod_tipo_telefone)
);

CREATE TABLE tipo_livro (
    cod_tipo_livro INT PRIMARY KEY,
    tipo_livro VARCHAR(20)
);

CREATE TABLE Livro (
    cod_livro INT PRIMARY KEY,
    nome_livro VARCHAR(100),
    titulo VARCHAR(50),
    autor VARCHAR(50),
    nota INT,
    cod_usuario INT,
    cod_tipo_livro INT,
    CONSTRAINT FK_COD_USUARIOS_LIVRO FOREIGN KEY(cod_usuario) REFERENCES Usuarios (cod_usuarios),
    CONSTRAINT FK_COD_TIPO_LIVRO_LIVRO FOREIGN KEY(cod_tipo_livro) REFERENCES tipo_livro (cod_tipo_livro)
);