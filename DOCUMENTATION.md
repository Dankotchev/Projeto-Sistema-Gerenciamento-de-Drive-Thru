# SUMÁRIO

[TOC]

# Capítulo 1 - DESCRIÇÃO GERAL DO PRODUTO

## 1.1	Escopo do Sistema

O sistema SGP (Software de Gerenciamento de Pedidos) tem como função realizar a coleta de pedidos do drive-thru de uma lanchonete. Os pedidos poderão ser gerenciados em etapas individuais, tendo como usuários os atendentes, os cozinheiros e o gerente.

O sistema contará com um acesso por chaves, para cada funcionário será entregue uma chave que deve ser utilizada para ter acesso à sua área em específico, como o cozinheiro para acessar a área da cozinha, etc. A aplicação possuirá três etapas principais. A primeira consistirá em registrar os pedidos a partir do caixa, que depois de confirmado passará para a segunda etapa, onde o pedido será enviado para uma lista ordenada. Esta lista será exibida em um monitor dentro da cozinha e informará as escolhas realizadas pelo cliente.

Quando o preparo do pedido estiver concluído, o responsável expedirá a ordem, que por sua vez será enviada para outra lista, localizada na área de entrega, sendo esta a última etapa do processo. Esta lista terá a função de organizar os pedidos já prontos, no qual o responsável, após realizar a entrega, deverá finalizar o pedido marcando-o como concluído, alterando assim o seu status.

O sistema também contará com acesso específico para gerência, na qual consiste em gerar relatórios, disponibilizando resumos sobre os pedidos realizados em um determinado período. Estes relatórios poderão ser utilizados em consultas para poder realizar o gerenciamento do estabelecimento. Assim como o relatório de pedidos, o sistema possuirá um relatório, que ao ser gerado, apresentará os produtos removidos do estoque e todos os recursos utilizados durante um período.

A implementação deste sistema facilitará o gerenciamento das vendas e a realização dos pedidos, desde a coleta até a entrega dos mesmos. Agilizando estes processos e permitindo um controle maior, diminuindo contratempos adversos.

## 1.2	Funções do Produto

### 1.2.1	Funções Básicas

RF FB01 – **Manter Refeições.** Itens de informação necessários: Código, Descrição, Categoria, Lista de Ingredientes, Preço Unitário.

RF FB02 – **Manter Produtos.** Itens de informação necessários: Código, Descrição, Categoria, Preço Unitário.

RF FB03 – **Manter Estoque.** Itens de informação necessários: Código, Descrição, Quantidade em Estoque, Custo Unitário.

RF FB04 – **Manter Funcionários.** Itens de informação necessários: Itens de informação necessários: CPF, RG, Nome, Estado Civil, Endereço, Data de nascimento, E-mail e Telefones, Cargo e Nível de acesso.

RF FB05 – **Manter Fornecedores.** Itens de informação necessários: CNPJ, Razão social, Nome fantasia, E-mail e Telefones, Nome do contato interno.

### 1.2.2	Funções Fundamentais

RF FF01 – **Realizar Pedido.** Esta função permite ao sistema registrar os dados relacionados ao pedido e os encaminha para uma lista principal onde ficam todos os outros, para controle e gerenciamento de estoque e pedidos. *Itens de informação:* Nome do cliente, número da placa do veículo, identificação do(s) produto(s), quantidade do(s) produto(s), forma de pagamento (à vista em espécie, cartão (crédito ou débito), ou PIX), e observações (caso tenha). O pedido só pode ser realizado por uma pessoa utilizando um automóvel com placa.

RF FF02 – **Preparar Pedido.** Esta função permite ao cozinheiro informar ao sistema, quais os itens que estão prontos e o status do pedido será alterado para que siga para a função Entregar Pedido. *Itens de informação:* Número da Placa do Carro, Identificação do(s) Produto(s), Conclusão da preparação do(s) Produto(s), Status do Pedido.

RF FF03 – **Entregar Pedido.** Após o pedido ser entregue, o atendente altera o status do pedido para “Completo”, que significa que ele já foi concluído. *Itens de informação:* Nome do Cliente, Número da Placa do Carro, Status do Pedido.

RF FF04 – **Identificar Usuário.** Identificar por identificador único (número de registro na empresa) e senha o usuário atual do terminal e atribuir corretamente os níveis de acesso.

### 1.2.3	Funções de Saída

RF FS01 – **Gerar Relatório Estoque.** *Itens de informação exibidos*: Identificação do(s) Item(ns)/Ingrediente(s) e Quantidade em Estoque, Consumo médio diário na última semana.

RF FS02 – **Gerar Relatório de Vendas.** Filtro: período / produto. *Itens de informação exibidos:* Nome do Produto, Quantidade Vendida, Preço Médio de Venda, Porcentagem do Faturamento de cada produto durante o período.

RF FS03 – **Gerar Fluxo de Caixa.** Filtro: período. *Itens de informação exibidos:* Momento de Ocorrência, Descrição da operação, Movimentação Financeira, Saldo consolidado, Comparativo entre receitas e despesas.
