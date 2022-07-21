Feature: Signup

  Scenario: verify the signup is successfully

    Given la pagina "http://todo.ly/" este abierta
    When realizo clic en el boton signup
    And me registro en la pagina
      | fullName | Gonzalo Aguilar             |
      | email    | g_user{number}@gaguilar.com |
      | password | g4guil4r                    |
      | counter  | 0                           |
    Then deberia ingresar a la app web
