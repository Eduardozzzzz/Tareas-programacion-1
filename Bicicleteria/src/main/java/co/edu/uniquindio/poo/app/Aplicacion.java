package co.edu.uniquindio.poo.app;

import javax.swing.JOptionPane;
import co.edu.uniquindio.poo.model.Bicicleteria;
import co.edu.uniquindio.poo.model.Cliente;

public class Aplicacion {

    public static void main(String[] args) {

        Bicicleteria bicicleteria = new Bicicleteria("Taller de bicicletas profesional don juan", "21-73");
        int opcion = 0;

        while (opcion != 4) {
            opcion = Integer.valueOf(JOptionPane.showInputDialog(null,
                    "1. Registrar Cliente\n2. Registrar Bicicleta\n3. Crear Orden\n4. Salir"));

            switch (opcion) {
                case 1: {
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre");
                    String telefono = JOptionPane.showInputDialog(null, "Ingrese el telefono");
                    String identificacion = JOptionPane.showInputDialog(null, "Ingrese la identificacion");
                    String direccion = JOptionPane.showInputDialog(null, "Ingrese la direccion");

                    String resultado = bicicleteria.registrarCliente(nombre, telefono, identificacion, direccion);
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                }
                case 2: {
                    String identificacion = JOptionPane.showInputDialog(null, "Ingrese la identificacion del cliente");
                    Cliente clienteEncontrado = bicicleteria.buscarCliente(identificacion);

                    if (clienteEncontrado != null) {
                        String marca = JOptionPane.showInputDialog(null, "Ingrese la marca");
                        String modelo = JOptionPane.showInputDialog(null, "Ingrese el modelo");
                        String serie = JOptionPane.showInputDialog(null, "Ingrese el numero de serie");
                        String tipo = JOptionPane.showInputDialog(null, "Ingrese el tipo");

                        String resultado = bicicleteria.registrarBicicleta(marca, modelo, serie, tipo, clienteEncontrado);
                        JOptionPane.showMessageDialog(null, resultado);
                    } else {
                        JOptionPane.showMessageDialog(null, "Oe ese cliente no existe");
                    }
                    break;
                }
                case 3: {
                    String numero = JOptionPane.showInputDialog(null, "Ingrese el numero de orden");
                    String serie = JOptionPane.showInputDialog(null, "Ingrese el numero de serie de la bicicleta");
                    String falla = JOptionPane.showInputDialog(null, "Ingrese la descripcion de la falla");

                    String resultado = bicicleteria.crearOrden(numero, serie, falla);
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                }
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una opcion valida");
            }
        }
    }
}