Funcionalidade: Cadastrar no site Youse

Narrativa:
Para obter um teste com cadastro
Como um usuario valido
Desejo cadastrar um novo usuario


Cenário: Cadastrar no site Youse com nome "{nome}" , email "{email}", senha "{senha}" e confirmacao "{confirmacao}"
Dado que vou para a tela "Pagina Cadastro Youse"
Quando informo "{nome}" no campo "Campo Nome"
Quando informo "{email}" no campo "Campo Email"
Quando informo "{senha}" no campo "Campo Senha"
Quando informo "{confirmacao}" no campo "Campo Confirme Senha"
E clico em "Botao Enviar Cadastro"
Então será exibido "Bem vindo! Você realizou seu registro com sucesso."

Cenário: Cadastro no site com usuario valido
Cadastrar no site Youse com nome "Testexptow" , email "xptow@xptow.com", senha "testxptow" e confirmacao "testxptow"