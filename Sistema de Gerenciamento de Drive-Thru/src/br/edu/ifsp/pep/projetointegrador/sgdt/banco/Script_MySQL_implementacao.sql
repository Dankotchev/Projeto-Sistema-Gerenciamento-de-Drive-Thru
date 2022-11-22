DROP DATABASE IF EXISTS sgdt;
CREATE DATABASE IF NOT EXISTS sgdt;
USE sgdt;

CREATE TABLE
    IF NOT EXISTS refeicao (
        id INT AUTO_INCREMENT NOT NULL,
        nome VARCHAR(45) NOT NULL,
        preco_unitario DECIMAL(10, 2) NOT NULL,
        quantidade INT NOT NULL DEFAULT 0,
        descricao VARCHAR(90) NOT NULL,
        lista_ingredientes TEXT NOT NULL,
        status BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id)
    );
   
INSERT INTO refeicao (nome,preco_unitario, descricao, lista_ingredientes) 
    VALUES
        ('Refeição Barata A', 12.50, 'Uma refeição boa e barata', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Barata B', 11.50, 'Uma refeição boa e barata', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Especial Diferente', 19.99, 'Uma refeição especial', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Cara 1', 33.33, 'Uma refeição cara e otima', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Cara 2', 39.60, 'Uma refeição cara e otima', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Cara 3', 40.99, 'Uma refeição cara e otima', 'ingrediente 1, ingrediente 2, ingrediente 3');

CREATE TABLE
    IF NOT EXISTS produto (
        id INT AUTO_INCREMENT NOT NULL,
        nome VARCHAR(45) NOT NULL,
        preco_unitario DECIMAL(10, 2) NOT NULL,
        quantidade INT NOT NULL,
        descricao VARCHAR(90) NULL,
        status BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id)
    );

INSERT INTO produto (nome, preco_unitario, quantidade, descricao)
	VALUES 
    ('Água Mineral', 1.20, 250, 'Água mineral'),
    ('Suco de Uva 300ml', 4.5, 100, 'Suco de uva em caixinha'),
    ('Coca-cola 600ml', 10.99, 200, 'Refrigerante Coca-cola'),
    ('Kit-kat 180g', 5.66, 125, 'Barra de chocolate kit-kat');

CREATE TABLE
    IF NOT EXISTS funcionario (
        id_funcionario INT AUTO_INCREMENT NOT NULL,
        nome_funcionario VARCHAR(60) NOT NULL,
        cpf VARCHAR(14) NOT NULL,
        senha VARCHAR (16) NOT NULL,
        data_nascimento DATE NULL,
        cargo VARCHAR(11) NULL,
        estado_civil VARCHAR(14) NULL,
        status_funcionario BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id_funcionario),
        UNIQUE (cpf, nome_funcionario)
    );
    
INSERT INTO funcionario (nome_funcionario, cpf, senha, data_nascimento, cargo, estado_civil)
	VALUES
	('Danilo Quirino', '111.111.111-11', 'danilo123', '1996-06-27', 'GERENTE', 'SOLTEIRO'),
	('Tereza Domingues', '222.222.222-22', 'tereza123', '1963-09-15', 'GERENTE', 'CASADO'),
        ('Giovana Perreira Dassie', '333.333.333-33', 'giovana123' , '1999-01-01', 'ATENDENTE', 'CASADO'),
	('Lucas Quirino', '444.444.444-44', 'lucas123' , '1965-03-30', 'COZINHEIRO', 'CASADO'),
	('Dani Domingues Quirino', '555.555.555-55', 'dani123', '1999-08-24', 'ATENDENTE', 'SOLTEIRO');

CREATE TABLE
    IF NOT EXISTS caixa (
        id_caixa INT AUTO_INCREMENT NOT NULL,
        data DATE NOT NULL,
        funcionario_id INT NOT NULL,
        estado VARCHAR(8) NOT NULL,
        abertura DECIMAL(10, 2) NOT NULL,
        entradas DECIMAL(10, 2) NOT NULL DEFAULT 0,
        saidas DECIMAL(10, 2) NOT NULL DEFAULT 0,
        status_caixa BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id_caixa),
        FOREIGN KEY (funcionario_id) REFERENCES funcionario (id_funcionario)
    );
    
INSERT INTO caixa (data, funcionario_id, estado, abertura, entradas, saidas)
	VALUES 
	('2022-11-01', 1, 'FECHADO', 0, 3650, 1100),
	('2022-11-01', 2, 'FECHADO', 0, 2580, 850),
	('2022-11-02', 4, 'FECHADO', 0, 5600, 630),
	('2022-11-03', 4, 'FECHADO', 65, 1250, 0),
	('2022-11-03', 5, 'FECHADO', 80, 8350, 155),
	('2022-11-04', 4, 'FECHADO', 100, 3254, 120),
	('2022-11-05', 5, 'ABERTO', 0, 3000, 0);

CREATE TABLE
    IF NOT EXISTS pedido (
        id_pedido INT AUTO_INCREMENT NOT NULL,
        veiculo VARCHAR(8) NOT NULL,
        caixa_id INT NOT NULL,
        forma_pagamento VARCHAR(45) NOT NULL,
        total_pedido DECIMAL(10, 2) NOT NULL,
        estado_pedido VARCHAR(45) NOT NULL DEFAULT 'ABERTO',
        status_pedido BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id_pedido),
        FOREIGN KEY (caixa_id) REFERENCES caixa (id_caixa)
    );
    
INSERT INTO pedido (veiculo, caixa_id, forma_pagamento, total_pedido)
	VALUES 
	('MJU-D475', 1, 'PIX', 120),
	('BGH-D658', 2, 'PIX', 85),
	('BGH-D658', 3, 'PIX', 36.90),
	('BCC-A658', 4, 'PIX', 14.50),
	('ABC-D123', 4, 'PIX', 65.66),
	('MJU-D475', 5, 'PIX', 70.15),
	('BCC-A658', 5, 'PIX', 100),
        ('KJH-L3GF', 7, 'PIX', 39.99),
        ('KJH-V369', 7, 'PIX', 12.50),
        ('MMM-S365', 7, 'PIX', 55.90),
        ('SSW-4H58', 7, 'PIX', 14.85),
        ('EEE-5G96', 7, 'PIX', 36.58),
        ('SSW-4H58', 7, 'PIX', 36.14),
        ('SSW-4H58', 7, 'PIX', 22.99),
        ('SSW-4H58', 6, 'PIX', 10.99),
UPDATE pedido SET estado_pedido = 'ENTREGUE' WHERE  id_pedido > 0 AND id_pedido <= 5;
UPDATE pedido SET estado_pedido = 'EM_FILA' WHERE  id_pedido > 5 AND id_pedido <= 10;
UPDATE pedido SET estado_pedido = 'EM_PREPARO' WHERE  id_pedido > 10;

CREATE TABLE
    IF NOT EXISTS pedido_produto (
        produto_id INT NOT NULL,
        pedido_id INT NOT NULL,
        quantidade_pedido_produto INT NOT NULL,
        preco_unitario_produto DECIMAL(10, 2) NOT NULL,
        status_pedido_produto BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (pedido_id, produto_id),
        FOREIGN KEY (produto_id) REFERENCES produto (id),
        FOREIGN KEY (pedido_id) REFERENCES pedido (id_pedido)
    );
    
INSERT INTO pedido_produto (pedido_id, produto_id, quantidade_pedido_produto, preco_unitario_produto)
	VALUES 
	(2, 1, 2, 4.75),
	(1, 1, 2, 1.25),
	(4, 4, 2, 6.50),
	(4, 1, 2, 1.25),
	(5, 1, 2, 1.25),
	(5, 3, 2, 12.00);

CREATE TABLE
    IF NOT EXISTS pedido_refeicao (
        refeicao_id INT NOT NULL,
        pedido_id INT NOT NULL,
        quantidade_pedido_refeicao INT NOT NULL,
        preco_unitario_refeicao DECIMAL(10, 2) NOT NULL,
        status_pedido_refeicao BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (refeicao_id, pedido_id),
        FOREIGN KEY (refeicao_id) REFERENCES refeicao (id),
        FOREIGN KEY (pedido_id) REFERENCES pedido (id_pedido)
    );
    
 INSERT INTO pedido_refeicao (pedido_id, refeicao_id, quantidade_pedido_refeicao, preco_unitario_refeicao)
	VALUES 
	(3, 1, 2, 12.75),
	(3, 2, 2, 11.25),
	(6, 4, 2, 33.33),
	(6, 1, 2, 12.75),
	(7, 1, 2, 12.25),
	(7, 5, 1, 40.00),
	(7, 6, 1, 42.00);
