package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrdenesServicio {
    private String numeroOrden, problema;
    private Bicicleta bicicletaAsociada;
    private LocalDate fechaIngreso;
    private ArrayList<Tareas> listaTareas = new ArrayList<>();
    private ArrayList<Repuestos> listaRepuestos = new ArrayList<>();

    public OrdenesServicio(String numeroOrden, Bicicleta b, String problema) {
        this.numeroOrden = numeroOrden;
        this.bicicletaAsociada = b;
        this.problema = problema;
        this.fechaIngreso = LocalDate.now();
    }
}