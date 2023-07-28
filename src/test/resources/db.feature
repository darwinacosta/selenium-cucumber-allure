
Feature: MongoDB
  Como QA Automation Engineer quiero acceder a la base de datos Mongo para verificar el backend de la aplicación


  Scenario: Conectarse a la base de datos mipcgamer y verificar los componentes
    Given Me he conectado a la base de datos mipcgamer
    When  Obtengo la PC de QA Automation
    Then  Debo obtener los siguientes componentes "<mother>" "<cpu>" "<memory1>" "<memory2>"

