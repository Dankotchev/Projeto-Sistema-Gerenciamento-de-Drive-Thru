SET search_path TO public;

INSERT INTO refeicao (nome, preco_unitario, descricao, lista_ingredientes) 
    VALUES
        ('Refeição Barata A', 12.50, 'Uma refeição boa e barata', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Barata B', 11.50, 'Uma refeição boa e barata', 'ingrediente 1, ingrediente 2, ingrediente 3'),
        ('Refeição Especial Diferente', 19.99, 'Uma refeição especial', 'ingrediente 4, ingrediente D'),
        ('Refeição Cara 1', 33.33, 'Uma refeição cara e otima', 'ingrediente A, ingrediente B, ingrediente C'),
        ('Refeição Cara 2', 39.60, 'Uma refeição cara e otima', 'ingrediente A, ingrediente B, ingrediente C'),
        ('Refeição Cara 3', 40.99, 'Uma refeição cara e otima', 'ingrediente A, ingrediente B, ingrediente C');

    );
INSERT INTO produto (nome, preco_unitario, quantidade, descricao)
	VALUES 
    ('Água Mineral', 1.20, 250, 'Água mineral'),
    ('Suco de Uva 300ml', 4.5, 100, 'Suco de uva em caixinha'),
    ('Coca-cola 600ml', 10.99, 200, 'Refrigerante Coca-cola'),
    ('Kit-kat 180g', 5.66, 125, 'Barra de chocolate kit-kat');

INSERT INTO ingrediente (nome_ingrediente, quantidade_ingrediente)
	VALUES
	('Ingrediente A', 3600), ('Ingrediente 1', 2580), 
	('Ingrediente B', 1250), ('Ingrediente 2', 3658),
	('Ingrediente C', 850), ('Ingrediente 3', 10250),
	('Ingrediente D', 125), ('Ingrediente 4', 1102);

INSERT INTO refeicao_ingrediente (refeicao_id, ingrediente_id, quantidade_preparo)
	VALUES
	(1, 1, 9), (1, 3, 5), (1, 5, 8),
	(2, 2, 9), (2, 4, 5), (2, 3, 8),
	(3, 7, 3), (3, 8, 3),
	(4, 2, 7), (4, 4, 5), (4, 6, 8),
	(5, 2, 3), (5, 4, 9), (5, 6, 5),
	(6, 2, 6), (6, 4, 4), (6, 6, 3);

INSERT INTO funcionario (nome_funcionario, cpf, senha, data_nascimento, cargo, estado_civil)
	VALUES
	('Danilo Quirino', '111.111.111-11', 'danilo123', '1996-06-27', 'GERENTE', 'SOLTEIRO'),
	('Tereza Domingues', '222.222.222-22', 'tereza123', '1963-09-15', 'GERENTE', 'CASADO'),
        ('Giovana Perreira Dassie', '333.333.333-33', 'giovana123' , '1999-01-01', 'ATENDENTE', 'CASADO'),
	('Lucas Quirino', '444.444.444-44', 'lucas123' , '1965-03-30', 'COZINHEIRO', 'CASADO'),
	('Dani Domingues Quirino', '555.555.555-55', 'dani123', '1999-08-24', 'ATENDENTE', 'SOLTEIRO');

INSERT INTO caixa (data, funcionario_id, estado, abertura, entradas, saidas)
	VALUES 
	('2022-11-01', 1, 'FECHADO', 0, 3650, 1100),
	('2022-11-01', 2, 'FECHADO', 0, 2580, 850),
	('2022-11-02', 4, 'FECHADO', 0, 5600, 630),
	('2022-11-03', 4, 'FECHADO', 65, 1250, 0),
	('2022-11-03', 5, 'FECHADO', 80, 8350, 155),
	('2022-11-04', 4, 'FECHADO', 100, 3254, 120),
	('2022-11-05', 5, 'ABERTO', 0, 3000, 0);

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
        ('SSW-4H58', 6, 'PIX', 10.99);
UPDATE pedido SET estado_pedido = 'ENTREGUE' WHERE  id_pedido > 0 AND id_pedido <= 5;
UPDATE pedido SET estado_pedido = 'EM_FILA' WHERE  id_pedido > 5 AND id_pedido <= 10;
UPDATE pedido SET estado_pedido = 'EM_PREPARO' WHERE  id_pedido > 10;

INSERT INTO pedido_produto (pedido_id, produto_id, quantidade_pedido_produto , preco_unitario_produto)
	VALUES 
	(2, 1, 2, 4.75),
	(1, 1, 2, 1.25),
	(4, 4, 2, 6.50),
	(4, 1, 2, 1.25),
	(5, 1, 2, 1.25),
	(5, 3, 2, 12.00);

INSERT INTO pedido_refeicao  (pedido_id, refeicao_id, quantidade_pedido_refeicao, preco_unitario_refeicao)
	VALUES 
	(3, 1, 2, 12.75),
	(3, 2, 2, 11.25),
	(6, 4, 2, 33.33),
	(6, 1, 2, 12.75),
	(7, 1, 2, 12.25),
	(7, 5, 1, 40.00),
	(7, 6, 1, 42.00);

INSERT INTO fornecedor (cnpj, razao_social, nome_fantasia, contato_interno)
	VALUES
	('12.546.589/0001-12', 'Fornecedor A', 'Fantasia A', 'Carlos'),
	('65.842.456/0001-36', 'Fornecedor B', 'Fantasia B', 'Maruan');

INSERT INTO contato (telefone)
	VALUES
	('25658458748'), ('36258471425'), ('14365458758'), ('16325142536'), ('36478954788'),
	('14258478965'), ('10214253625');

INSERT INTO funcionario_tem_contato (contato_id, funcionario_id)
	VALUES
	(1,1), (2,2), (3,3), (4,4), (5,5);

INSERT INTO fornecedor_tem_contato (fornecedor_id, contato_id)
	VALUES
	(1,6), (2,7);

INSERT INTO fornece_produtos (fornecedor_id, produto_id)
	VALUES
	(1,1), (1,2), (2, 2), (1, 3), (2, 4), (1, 4);

INSERT INTO fornece_ingredientes (fornecedor_id, ingrediente_id)
	VALUES
	(1, 1), (1, 2), (2, 2), (2, 3), (2,4), (1, 5), (1, 6), (2, 7), (1, 8), (2, 8);


-- Triggers

-- Atualiza o Estoque de produtos após gravar uma venda
CREATE OR REPLACE FUNCTION f_atualizar_estoque()
RETURNS TRIGGER AS $$
BEGIN
	IF (TG_OP = 'INSERT') THEN
			UPDATE produto p SET p.quantidade = p.quantidade - NEW.quantidade_pedido_produto WHERE p.id = NEW.pedido_id;
		RETURN NEW;
	IF (TG_OP = 'UPDATE') THEN
			UPDATE produto p
				SET p.quantidade = p.quantidade - NEW.quantidade_pedido_produto + OLD.quantidade_pedido_produto
				WHERE p.id = NEW.pedido_id;
		RETURN NEW;
	END IF;

END;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER t_atualizar_estoque
AFTER INSERT OR UPDATE ON pedido_produto
FOR EACH ROW EXECUTE PROCEDURE f_atualizar_estoque();

-- Atualiza o saldo do caixa ao finalizar um pedido
CREATE OR REPLACE FUNCTION f_pagar_pedido()
RETURNS TRIGGER AS $$
BEGIN
	IF (TG_OP = 'UPDATE') THEN
            IF (OLD.estado_pedido = 'ABERTO' AND NEW.estado_pedido = 'EM_FILA') THEN
                UPDATE caixa c SET c.entradas = c.entradas + NEW.total_pedido WHERE c.id_caixa = NEW.caixa_id;
            END IF;
		RETURN NEW;
	END IF;

END;
$$ LANGUAGE 'plpgsql';

CREATE TRIGGER t_pagar_pedido
AFTER UPDATE ON pedido
FOR EACH ROW EXECUTE PROCEDURE f_pagar_pedido();
