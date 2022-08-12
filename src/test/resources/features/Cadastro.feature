#language: pt
#UTF: 8
#Author: Alana Mendes

@cadastro @regressivo
Funcionalidade: Cadastro no site alexspalermo
  Como usuario do site alexspalermo
  Quero realizar o cadastro
  Para ter uma conta no site

Contexto:
  Dado que estou na tela de Cadastro no site alexspalermo

@cadastroSucesso
Cenario: Cadastro com sucesso
  Quando inserir no campo nome o valor "cad"
  E inserir no campo e-mail o valor "a@sulamerica.com"
  E na senha inserir o valor "123"
  Entao visualizarei a mensagem de sucesso "Cadastro realizado com sucesso!"

@cadastroInvalido
Cenario: Cadastro com email invalido
  Quando inserir no campo nome o valor "cad"
  E inserir no campo e-mail o valor "asulamerica.com"
  E na senha inserir o valor "123"
  Entao visualizarei a mensagem de sucesso "Inclua um @ no endereço de e-mail."



