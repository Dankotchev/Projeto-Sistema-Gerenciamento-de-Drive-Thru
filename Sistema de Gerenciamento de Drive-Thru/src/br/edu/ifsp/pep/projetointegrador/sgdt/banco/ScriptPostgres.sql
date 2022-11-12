CREATE TABLE
    IF NOT EXISTS refeicao (
        id_refeicao SERIAL,
        nome_refeicao VARCHAR(45) NOT NULL,
        preco_unitario_refeicao DECIMAL(10, 2) NOT NULL,
        descricao_refeicao VARCHAR(90) NOT NULL,
        lista_ingredientes TEXT NOT NULL,
        status_refeicao BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id_refeicao)
    );

INSERT INTO refeicao (nome_refeicao,preco_unitario_refeicao, descricao_refeicao, lista_ingredientes) 
    VALUES
        ('Refeição Barata A', 12.50, 'Uma refeição boa e barata', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Barata B', 11.50, 'Uma refeição boa e barata', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Especial Diferente', 19.99, 'Uma refeição especial', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Cara 1', 33.33, 'Uma refeição cara e otima', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Cara 2', 39.60, 'Uma refeição cara e otima', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Cara 3', 40.99, 'Uma refeição cara e otima', 'ingrediente 1, ingrediente 2, ingrediente 3');

CREATE TABLE
    IF NOT EXISTS produto (
        id_produto SERIAL,
        nome_produto VARCHAR(45) NOT NULL,
        preco_unitario_produto DECIMAL(10, 2) NOT NULL,
        quantidade_produto INT NOT NULL,
        descricao_produto VARCHAR(90) NULL,
        status_produto BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id_produto)
    );

INSERT INTO produto (nome_produto, preco_unitario_produto, quantidade_produto, descricao_produto)
	VALUES 
    ('Água Mineral', 1.20, 250, 'Água mineral'),
    ('Suco de Uva 300ml', 4.5, 100, 'Suco de uva em caixinha'),
    ('Coca-cola 600ml', 10.99, 200, 'Refrigerante Coca-cola'),
    ('Kit-kat 180g', 5.66, 125, 'Barra de chocolate kit-kat');

CREATE TABLE
    IF NOT EXISTS ingrediente (
        id_ingredientes SERIAL,
        refeicao_id INT NOT NULL,
        estoque_id INT NOT NULL,
        quantidade_ingredientes INT NULL,
        PRIMARY KEY (id_ingredientes),
        UNIQUE (refeicao_id, estoque_id),
        status_ingrediente BOOLEAN NOT NULL DEFAULT TRUE,
        FOREIGN KEY (refeicao_id) REFERENCES refeicao (id_refeicao)
    );

CREATE TABLE
    IF NOT EXISTS veiculo (
        id_veiculo SERIAL,
        placa VARCHAR(8) UNIQUE NULLS NOT DISTINCT,
        status_veiculo BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id_veiculo)
    );

INSERT INTO veiculo (placa)
	VALUES
	('ABC4F568'),
	('BCC5A658'),
	('BGH3D658'),
	('MJU5D475'),
	('RGT6D985');

CREATE TABLE
    IF NOT EXISTS funcionario (
        id_funcionario SERIAL,
        nome_funcionario VARCHAR(60) NOT NULL,
        cpf VARCHAR(11) NOT NULL,
        data_nascimento DATE NULL,
        cargo VARCHAR(11) NULL,
        estado_civil VARCHAR(14) NULL,
        status_funcionario BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id_funcionario),
        UNIQUE (cpf, nome)
    );
INSERT INTO funcionario (nome_funcionario, cpf, data_nascimento, cargo, estado_civil)
	VALUES
	('Danilo Quirino', '45632598210', '1996-06-27', 'GERENTE', 'SOLTEIRO'),
	('Tereza Domingues', '36598745230', '1963-09-15', 'GERENTE', 'CASADO'),
	('Lucas Quirino', '10236502500', '1965-03-30', 'COZINHEIRO', 'CASADO'),
	('Dani Domingues Quirino', '00014530266', '1999-08-24', 'ATENDENTE', 'SOLTEIRO');

CREATE TABLE
    IF NOT EXISTS caixa (
        id_caixa SERIAL,
        data DATE NOT NULL,
        funcionario_id INT NOT NULL,
        estado VARCHAR(45) NOT NULL,
        abertura DECIMAL(10, 2) NOT NULL,
        entradas DECIMAL(10, 2) NOT NULL DEFAULT 0,
        saidas DECIMAL(10, 2) NOT NULL DEFAULT 0,
        status_caixa BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id_funcionario),
        FOREIGN KEY (funcionario_id) REFERENCES funcionario (id_funcionario)
    );

CREATE TABLE
    IF NOT EXISTS pedido (
        id_pedido INT NOT NULL,
        veiculo_id INT NOT NULL,
        caixa_id INT NOT NULL,
        forma_pagamento VARCHAR(45) NOT NULL,
        data_pagamento DATE NOT NULL,
        estado_pedido VARCHAR(45) NOT NULL DEFAULT 'ABERTO',
        status_pedido BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id),
        FOREIGN KEY (veiculo_id) REFERENCES veiculo (id),
        FOREIGN KEY (caixa_id) REFERENCES caixa (id)
    );

CREATE TABLE
    IF NOT EXISTS pedido_produto (
        produto_id INT NOT NULL,
        pedido_id INT NOT NULL,
        quantidade_pedido_produto INT NOT NULL,
        preco_unitario_produto DECIMAL(10, 2) NOT NULL,
        status_pedido_produto BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (pedido_id, produto_id),
        FOREIGN KEY (produto_id) REFERENCES produto (id_produto),
        FOREIGN KEY (pedido_id) REFERENCES pedido (id_pedido)
    );

CREATE TABLE
    IF NOT EXISTS pedido_refeicao (
        refeicao_id INT NOT NULL,
        pedido_id INT NOT NULL,
        quantidade_pedido_refeicao INT NOT NULL,
        preco_unitario_refeicao DECIMAL(10, 2) NOT NULL,
        status_pedido_refeicao BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (refeicao_id, pedido_id),
        FOREIGN KEY (refeicao_id) REFERENCES refeicao (id_refeicao),
        FOREIGN KEY (pedido_id) REFERENCES pedido (id_pedido)
    );

CREATE TABLE
    IF NOT EXISTS fornecedor (
        id_fornecedor SERIAL,
        cnpj VARCHAR(15) UNIQUE NULLS NOT DISTINCT,
        razao_social VARCHAR(60) NOT NULL,
        nome_fantasia VARCHAR(60) NULL,
        contato_interno VARCHAR(60) NOT NULL,
        status_fornecedor BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id_fornecedor)
    );

CREATE TABLE
    IF NOT EXISTS contato (
        id_contato SERIAL,
        telefone VARCHAR(11) NULL,
        email VARCHAR(60) NULL,
        status_contato BOOLEAN NOT NULL DEFAULT TRUE,
        PRIMARY KEY (id_contato)
    );

CREATE TABLE
    IF NOT EXISTS funcionario_tem_contato (
        funcionario_id INT NOT NULL,
        contato_id INT NOT NULL,
        PRIMARY KEY (funcionario_id, contato_id),
        FOREIGN KEY (funcionario_id) REFERENCES funcionario (id_funcionario),
        FOREIGN KEY (contato_id) REFERENCES contato (id_fornecedor)
    );

CREATE TABLE
    IF NOT EXISTS fornecedor_tem_contato (
        fornecedor_id INT NOT NULL,
        contato_id INT NOT NULL,
        PRIMARY KEY (fornecedor_id, contato_id),
        FOREIGN KEY (fornecedor_id) REFERENCES fornecedor (id_fornecedor),
        FOREIGN KEY (contato_id) REFERENCES contato (id_contato)
    );

CREATE TABLE
    IF NOT EXISTS fornece_produtos (
        fornecedor_id INT NOT NULL,
        produto_id INT NOT NULL,
        PRIMARY KEY (fornecedor_id, produto_id),
        FOREIGN KEY (fornecedor_id) REFERENCES fornecedor (id_fornecedor),
        FOREIGN KEY (produto_id) REFERENCES produto (id_produto)
    );

CREATE TABLE
    IF NOT EXISTS fornece_ingredientes (
        fornecedor_id INT NOT NULL,
        ingrediente_id INT NOT NULL,
        PRIMARY KEY (fornecedor_id, ingrediente_id),
        FOREIGN KEY (fornecedor_id) REFERENCES fornecedor (id_fornecedor),
        FOREIGN KEY (ingrediente_id) REFERENCES ingrediente (id_ingredientes)
    );