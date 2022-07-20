Feature: Project

  @Regression
  Scenario: verify the create/update project

    Given la pagina "http://todo.ly/" este abierta
    And yo quiero realizar el login
      | email    | maestria@maestria.com |
      | password | 12345                 |
    When yo creo un projecto con el nombre "Cucumber"
    Then el projecto "Cucumber" deberia ser mostrado
    When yo actualizo el projecto "Cucumber" con el nombre "CucumberUpdate"
    Then el projecto "CucumberUpdate" deberia ser mostrado
