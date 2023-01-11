Feature: iniciar sesion en la aplicacion de saucedemo
  Scenario:ingresar a la aplicacion con credenciales
    Given que el usuario ingrese a la pagina web
    When el se logea con las credenciales "standard_user" "secret_sauce"
    Then el valida  en la pagina principal "PRODUCTS"

  @FiltroPorPrecio
  Scenario:Filtrar los productos por orden de precio
    Given el da click a la seccion de filtracion
    When  el filtra la busqueda por precio "LowPrice"
    Then  valida que se haya filtrado de forma correcta "True"

  @FiltroPorOrdenAlfabetico
  Scenario:Filtrar los productos por orden alfabetica
    Given el da click a la seccion de filtracion
    When  filtra busqueda por nombre de producto  "Name(ZtoA)"
    Then  Valida que se haya filtrado de forma alfabetica "True"