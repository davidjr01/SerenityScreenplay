Feature: iniciar sesion en la aplicacion de saucedemo
  Scenario:Que el usuario ingrese a la pagina con credenciales
    Given el usuario ingrese a la pagina web
    When el usuario se logea con las credenciales "standard_user" "secret_sauce"
    Then  se valida  en la pagina principal "PRODUCTS"

  @FiltroPorPrecio
  Scenario:Filtrar los productos por orden de precio
    Given el usuraio da click a la seccion de filtracion
    When  el usuario filtra la busqueda por precio "LowPrice"
    Then  el usuario valida que se haya filtrado de forma correcta "True"

  @FiltroPorOrdenAlfabetico
  Scenario:Filtrar los productos por orden alfabetica
    Given el usuraio da click a la seccion de filtracion
    When  el usuario filtra la busqueda por nombre de producto "Name(ZtoA)"
    Then  Valida que se haya filtrado de forma alfabetica "True"

  @AddToCart
  Scenario:Agregar item al carrito de comprar y eliminarlo
    Given  el usuario agregue el producto al carrito de compras
    When  el usuario da click al boton  carrito de compras
    And   el usuario verifica que este en la pagina del carrito de compras "YOUR CART"
    And   el usuario valida que el producto se encuentre en el carrito "Sauce Labs Backpack"
    Then  el usuario elimina el producto del carrito y regresamos al home

  @BuyProducts
  Scenario:Comprar los productos
    Given el usuario agregue el producto al carrito de compras
    When  el usuario da click al boton  carrito de compras
    And el usuario da click en el boton Checkout
    And el usuario ingresa sus credenciales "Luis" "Juarez","0012"
    And el usuario da click en el boton FINISH
    Then  el usuario valida que se realizo la compra "CHECKOUT: COMPLETE!"