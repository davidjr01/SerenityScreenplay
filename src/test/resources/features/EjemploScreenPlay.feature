Feature: iniciar sesion en la aplicacion de saucedemo
  Scenario:ingresar a la aplicacion con credenciales
    Given que el usuario ingrese a la pagina web
    When el se logea con las credenciales "standard_user" "secret_sauce"
    Then el valida  en la pagina principal "PRODUCTS"

  @FiltroPorPrecio
  Scenario:Filtrar los productos por orden de precio
    Given que el usuario de click a la seccion de filtracion
    When  filtrar busqueda por precio "LowPrice"
    Then  Validamos que se haya filtrado de forma correcta "True"