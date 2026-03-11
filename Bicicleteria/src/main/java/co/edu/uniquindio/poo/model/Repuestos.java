package co.edu.uniquindio.poo.model;

public class Repuestos {
    private String nombre;
    private int cantidad;
    private double precio;

    public Repuestos(String n, int c, double p) {
        this.nombre = n;
        this.cantidad = c;
        this.precio = p;
    }

    public double calcularSubtotal() { return cantidad * precio; }
}