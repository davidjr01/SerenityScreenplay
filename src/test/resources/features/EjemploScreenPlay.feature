Feature: iniciar sesion en la aplicacion de saucedemo
  Scenario:ingresar a la aplicacion con credenciales
    Given que el usuario ingrese a la pagina web
    When el se logea con las credenciales "standard_user" "secret_sauce"
    Then el valida  en la pagina principal "PRODUCTS"