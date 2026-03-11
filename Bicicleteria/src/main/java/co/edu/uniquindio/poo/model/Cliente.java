package co.edu.uniquindio.poo.model;
public class Cliente {
    private String nombre;
    private String telefono;
    private String identificacion;
    private String direccion;

    public Cliente(String nombre, String telefono, String identificacion, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.identificacion = identificacion;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}
