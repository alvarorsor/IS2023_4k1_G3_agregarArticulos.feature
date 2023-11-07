package domain;

public class Articulo {

    private final Integer codigo;
    private final String marca;
    private final String descripcion;
    private final Double precio;

    private final String color;

    private final String talle;

    private final Integer stock;

    public Articulo(Integer codigo, String marca, String descripcion, Double precio, String talle, String color, Integer stock) {

        this.codigo = codigo;
        this.marca = marca;
        this.descripcion = descripcion;
        this.precio = precio;
        this.talle = talle;
        this.color = color;
        this.stock = stock;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getTalle() {
        return talle;
    }

    public boolean tieneArticulo(Articulo articulo) {
        return this == articulo;
    }

    public boolean tieneCodigo(Integer codigo) {
        return this.codigo == codigo;
    }


}
