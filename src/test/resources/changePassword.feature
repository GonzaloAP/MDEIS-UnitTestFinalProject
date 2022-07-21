Feature: ChangePassword

  Scenario: verify the changePassword is successfully

    Given la pagina "http://todo.ly/" este abierta
    And yo quiero realizar el login
      | email    | g_user0@gaguilar.com |
      | password | g4guil4r             |
    When realizo clic en el boton settings
    And registro la nueva clave
      | oldPassword | g4guil4r |
      | newPassword | gaguilar |
    Then deberia ingresar nuevamente a la pag web
      | email    | g_user0@gaguilar.com |
      | password | gaguilar             |
