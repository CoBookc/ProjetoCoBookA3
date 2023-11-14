CREATE DATABASE CoBook;
USE CoBook;
CREATE TABLE Usuarios (
    cod_usuarios INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    email VARCHAR(50) UNIQUE NOT NULL,
    CPF VARCHAR(14) UNIQUE NOT NULL,
    idade INT NOT NULL,
    sexo VARCHAR(10) NOT NULL,
    tipo_livro_preferido1 VARCHAR(100),
    tipo_livro_preferido2 VARCHAR(100),
    senha VARCHAR(100) NOT NULL,
    administrador BOOLEAN
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
    titulo VARCHAR(100) NOT NULL,
	tipo_livro VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    nota INT NOT NULL,
    cod_usuario INT,
    CONSTRAINT FK_COD_USUARIOS_LIVRO FOREIGN KEY(cod_usuario) REFERENCES Usuarios (cod_usuarios)
);
INSERT INTO Usuarios (nome, email, CPF, idade, sexo, tipo_livro_preferido1, tipo_livro_preferido2, senha, administrador) VAlUES ('Guilherme Caetano da Silva', 'guilherme.caetano@gmail.com', '400.289.222-22' , 22, 'Masculino', 'Percy Jackson e o ladrão de raios', 'Harry Potter e a pedra filosofal', 'admin01', TRUE);

																																					