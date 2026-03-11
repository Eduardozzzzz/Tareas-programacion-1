package co.edu.uniquindio.poo.model;

public class Bicicleta {
    private String marca, modelo, numSerie, tipo;
    private Cliente propietario;

    public Bicicleta(String marca, String modelo, String numSerie, String tipo, Cliente prop) {
        this.marca = marca;
        this.modelo = modelo;
        this.numSerie = numSerie;
        this.tipo = tipo;
        this.propietario = prop;
    }

    public String getNumSerie() { return numSerie; }
}