package co.edu.uniquindio.poo.model;

import java.util.ArrayList;

public class Bicicleteria {
    private String nombre;
    private String direccion;

    private ArrayList<Cliente> listaClientes;
    private ArrayList<Bicicleta> listaBicicletas;
    private ArrayList<Mecanicos> listaMecanicos;
    private ArrayList<OrdenesServicio> listaOrdenes;

    public Bicicleteria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaClientes = new ArrayList<>();
        this.listaBicicletas = new ArrayList<>();
        this.listaMecanicos = new ArrayList<>();
        this.listaOrdenes = new ArrayList<>();
    }

    public String registrarCliente(String nombre, String telefono, String id, String direccion) {
        if (buscarCliente(id) != null) {
            return "El cliente ya existe en el sistema";
        }
        Cliente nuevo = new Cliente(nombre, telefono, id, direccion);
        listaClientes.add(nuevo);
        return "Cliente registrado correctamente";
    }

    public Cliente buscarCliente(String id) {
        for (Cliente clienteAux : listaClientes) {
            if (clienteAux.getIdentificacion().equals(id)) {
                return clienteAux;
            }
        }
        return null;
    }

    public String eliminarCliente(String id) {
        Cliente encontrado = buscarCliente(id);
        if (encontrado != null) {
            listaClientes.remove(encontrado);
            return "Cliente eliminado";
        }
        return "No se encontro el cliente para eliminar";
    }

    public String actualizarCliente(String id, String nuevoTel, String nuevaDir) {
        Cliente encontrado = buscarCliente(id);
        if (encontrado != null) {
            encontrado.setTelefono(nuevoTel);
            encontrado.setDireccion(nuevaDir);
            return "Datos actualizados";
        }
        return "El cliente no existe";
    }

    public String registrarBicicleta(String marca, String modelo, String serie, String tipo, Cliente prop) {
        if (buscarBicicleta(serie) != null) {
            return "Esta bicicleta ya esta registrada";
        }
        Bicicleta nuevaBici = new Bicicleta(marca, modelo, serie, tipo, prop);
        listaBicicletas.add(nuevaBici);
        return "Bicicleta agregada";
    }

    public Bicicleta buscarBicicleta(String numSerie) {
        for (Bicicleta biciAux : listaBicicletas) {
            if (biciAux.getNumSerie().equals(numSerie)) {
                return biciAux;
            }
        }
        return null;
    }

    public String crearOrden(String numero, String serieBici, String falla) {
        Bicicleta bici = buscarBicicleta(serieBici);
        if (bici == null) {
            return "Error: Bicicleta no encontrada";
        }
        OrdenesServicio nuevaOrden = new OrdenesServicio(numero, bici, falla);
        listaOrdenes.add(nuevaOrden);
        return "Orden generada";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}