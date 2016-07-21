Funcionalidade: Mensagem de erro de Login

Narrativa:
Para obter a mensagem de erro ao tentar logar no site Youse.com
Como um usuario e senha inválidos
Desejo verificar a mensagem de erro exibida

Cenário: Logar no site Youse com email "{email}" e senha "{password}"
Dado que vou para a tela "Pagina Login Youse"
Quando informo "{email}" no campo "Campo Email"
E clico em "Botao Proximo Passo"
Quando informo "{password}" no campo "Campo Senha"
E clico em "Botao Entrar"
Então será exibido "Email ou senha inválidos."

Cenário: Acesso com Usuário invalido
Logar no site Youse com email "murilo_teste_erro@hotmail.com" e senha "TesteErro01"
