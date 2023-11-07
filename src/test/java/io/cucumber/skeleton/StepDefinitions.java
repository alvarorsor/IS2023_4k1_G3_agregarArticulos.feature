package io.cucumber.skeleton;

import domain.Articulo;
import domain.LineaDeVenta;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StepDefinitions {


    private Articulo articulo;

    LineaDeVenta lineaDeVenta;





    @Given("que hay un artículo con los siguientes atributos:")
    public void que_hay_un_artículo_con_los_siguientes_atributos(List<Map<String, String>> tabla) {
        for (Map<String, String> fila : tabla) {
            Integer codigo = Integer.parseInt(fila.get("Codigo"));
            String marca = fila.get("Marca");
            String descripcion = fila.get("Descripcion");
            Double precio = Double.parseDouble(fila.get("Precio"));
            String color = fila.get("Color");
            String talle = fila.get("Talle");
            Integer stock = Integer.parseInt(fila.get("Stock"));

            articulo = new Articulo(codigo, marca, descripcion, precio, color, talle, stock);
        }

    }


    @Given("hay una línea de venta vacía")
    public void hay_una_linea_de_venta_vacia() {

        lineaDeVenta = new LineaDeVenta();
    }



    @When("el vendedor agrega {int} articulos a la línea de venta")
    public void el_vendedor_agrega_el_artículo_a_la_línea_de_venta(Integer cantidad) {

        lineaDeVenta.agregarArticuloALineaDeVenta(cantidad, articulo);


    }

    @Then("{int} unidades del articulo se agrega a la linea de venta")
    public void el_articulo_se_agrega_a_la_linea_de_venta(Integer cantidad) {

        int resultado = lineaDeVenta.getCantidadArticulos();

        assertEquals(resultado, cantidad);
        assertEquals(lineaDeVenta.getArticulo(), articulo);
    }

    @Then("el subtotal de la línea de venta se actualiza a {double}")
    public void el_subtotal_de_la_línea_de_venta_se_actualiza_a_con_el_impuesto_iva_aplicado(double subtotal) {

        double resultado = lineaDeVenta.getSubTotal();

        assertEquals(resultado, subtotal);
    }

}
