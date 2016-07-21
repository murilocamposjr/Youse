Funcionalidade: Logar no site Youse

Narrativa:
Para obter um teste de login
Como um usuario valido
Desejo Logar no website e testar o cadastro e acesso

Cenário: Logar no site Youse com email "{email}" e senha "{password}"
Dado que vou para a tela "Pagina Login Youse"
Quando informo "{email}" no campo "Campo Email"
E clico em "Botao Proximo Passo"
Quando informo "{password}" no campo "Campo Senha"
E clico em "Botao Entrar"
Então será exibido "Login efetuado com sucesso."

Cenário: Acesso com Usuário Valido
Logar no site Youse com email "xptow@xptow.com" e senha "testxptow"