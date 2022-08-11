#language: pt
#UTF: 8
#Author: Alana Mendes

@cadastro
Funcionalidade: Cadastro no site alexspalermo
  Como usuario do site alexpalermo
  Quero realizar o cadastro
  Para ter uma conta no site

Cenario: Cadastro com sucesso
  Dado que estou no site alexspalermo
  Quando inserir no campo nome o valor "a"
  E inserir no campo e-mail o valor "a@sulamerica.com"
  E na senha inserir o valor "123"
  Entao visualizarei a mensagem de sucesso "Cadastro realizado com sucesso!"