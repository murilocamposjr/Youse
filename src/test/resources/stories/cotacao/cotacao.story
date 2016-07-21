Funcionalidade: Cotacao no site Youse

Narrativa:
Para obter testar a funcionalidade de cotacao de seguro no site Youse
Como um usuario valido
Desejo validar o processo de cotação até chegar no pagamento

Cenário: cotar um seguro residencial
Dado que vou para a tela "Pagina Account Youse"
Quando clico em "Botao Cotar Seguro Residencial"

Dado que estou na tela "Pagina Order Seguro Residencial Youse"
Quando informo "Nome Teste" no campo "Campo Nome"
Quando informo "11999999999" no campo "Campo Celular"
Quando informo "xptow@xptow.com" no campo "Campo Email"
Quando seleciono a opção de valor "uma casa" no campo "Lista Tipo Imovel"
Quando informo "400000" no campo "Campo Valor"
Quando informo "01514000" no campo "Campo CEP"
Quando seleciono a opção de valor "não está" no campo "Lista Terreno Vizinho"
E clico em "Botao Escolher Coberturas"
Então será exibido "Essa é a parte mais legal: bora deixar o seguro com a sua cara?"

Dado que estou na tela "Pagina Coverage Seguro Residencial Youse"
Quando clico em "Botao Proximo Passo"
Então será exibido "assistências e serviços disponíveis"

Dado que estou na tela "Pagina Assistance Selection Seguro Residencial Youse"
Quando clico em "Botao Preencher Meus Dados"
Então será exibido "Aee! Estamos quase lá."

Dado que estou na tela "Pagina Insured Person Seguro Residencial Youse"
Quando informo "xptow nome" no campo "Campo Nome Completo"
Quando seleciono a opção de valor "Masculino" no campo "Lista Sexo"
Quando informo "69009770222" no campo "Campo CPF"
Quando informo "18/02/1992" no campo "Campo Data Nascimento"
Quando seleciono a opção de valor "Analista de crédito (instituições financeiras)" no campo "Lista Trabalho"
Quando seleciono a opção de valor "Até R$ 800,00" no campo "Lista Renda Familiar"
Quando seleciono a opção de valor "não possui nenhuma destas características" no campo "Lista Caracteristicas"
Quando clico em "Botao Proximo Passo"
Então será exibido "Estamos cada vez mais perto de fechar seu seguro :D"

Dado que estou na tela "Pagina Property Data Seguro Residencial Youse"
Quando informo "345" no campo "Campo Numero Imovel"
Quando informo "308" no campo "Campo Complemento Imovel"
Quando clico em "Botao Pagamento"
Então será exibido "Dê uma olhadinha no seguro que vc criou:"
