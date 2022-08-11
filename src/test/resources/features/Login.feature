#language: pt
#UTF: 8
#Author: Alana Mendes

@login
Funcionalidade: Login no site alexspalermo
  Como usuario do site alexpalermo
  Quero realizar login
  Para utilizar as funcionaliades do site

Contexto:
  Dado que estou no site alexspalermo

  @loginValido
Cenario: Login com dados validos
  Quando insiro no campo email o valor "a@a.com"
  E insiro no campo senha o valor "123"
  Entao visualizo a mensagem "Login realizado com sucesso!"

  @loginInvalido
Cenario: Login com email invalido
   Quando insiro no campo email o valor "a"
   E insiro no campo senha o valor "123"
   Entao visualizo a mensagem "Inclua um @ no endereço de e-mail."
