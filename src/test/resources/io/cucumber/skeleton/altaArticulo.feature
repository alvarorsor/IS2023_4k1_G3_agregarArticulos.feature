Feature: Agregar articulos



  Scenario: Se agrega el articulo en la linea de venta exitosamente

    Given que hay un artículo con los siguientes atributos:
      | Codigo | Marca | Descripcion | Precio | Color | Talle | Stock |
      |  123   | Lacoste | Camisa    | 1200.0   | Azul  | xl     |  3 |


    And hay una línea de venta vacía

    When el vendedor agrega 2 articulos a la línea de venta

    Then 2 unidades del articulo se agrega a la linea de venta

    And el subtotal de la línea de venta se actualiza a 2400.0
