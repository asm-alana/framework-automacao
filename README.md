## PROJETO DE AUTOMAÇÃO
----

PRÉ-REQUISTOS
----
Requisitos de software e hardware necessários para executar esse projeto de automação:
  - Java 1.8 SDK
  - Eclipse IDE ou IntelliJ IDE
  - Maven 3.0
  - Selenium WebDriver
  - JUnit 
  - Plugins:
      - Cucumber Eclipse Plugin
      - Cucumber for Java + Gherkin (IntelliJ)
  
ESTRUTURA DO PROJETO
---
 
 | Diretório                         | Finalidade                                                                         |
 ------                              |--------                                                                            |
 | src\main\java\core                | Métodos genéricos que apoiam as classes de testes                                  |
 | src\main\java\page                | Métodos para interação da página web com as steps                                  |
 | src\main\resources                | Local em que são são criados arquivos json para massa de dados                     |
 | src\test\hooks                    | Métodos que executam o antes e depois de cada teste                                |
 | src\test\runner                   | Local com as configurações da Cucumber Runner                                      |
 | src\test\steps                    | Métodos que executam os passos das funcionalidades criadas com o BDD               |
 | src\test\resources\evidencias     | Local com pastas das evidências e relatórios gerados após cada execução dos testes |
 | src\test\resources\features       | Funcionalidade e cenários de teste escritos em linguagem DSL (Gherkin language)    |

 FRAMEWORKS UTILIZADOS
 ------
 Abaixo estão os frameworks utilizados nesse projeto:
  - Cucumber: Responsável pela especificação executável dos cenários;
  - Selenium WebDriver: Responsável pela interação com os navegadores web;
  - JUnit: Responsável pela execução dos testes unitários junto ao Cucumber.
  
 AUTORES
 -------
  - Alana Mendes - Analista de testes/QA.