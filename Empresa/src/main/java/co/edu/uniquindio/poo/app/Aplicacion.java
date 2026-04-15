package co.edu.uniquindio.poo.app;

import javax.swing.JOptionPane;
import co.edu.uniquindio.poo.model.*;

public class Aplicacion {

    private static Empresa miEmpresa = new Empresa();

    public static void main(String[] args) {
        ejecutarMenu();
    }

    private static void ejecutarMenu() {
        int sel = 0;
        String menu = """
                Sistema de gestion de empleados
                1. Registrar empleado planta
                2. Registrar empleado ventas
                3. Registrar empleado temporal
                4. Listar todos los empleados
                5. Buscar por identificación
                6. Ver salario más alto
                7. Calcular nómina global
                8. Ver reportes de pago
                9. Finalizar
                """;

        while (sel != 9) {
            try {
                sel = Integer.parseInt(JOptionPane.showInputDialog(menu));

                switch (sel) {
                    case 1:
                        nuevoPlanta();
                        break;
                    case 2:
                        nuevoVentas();
                        break;
                    case 3:
                        nuevoTemporal();
                        break;
                    case 4:
                        miEmpresa.mostrarTodos();
                        break;
                    case 5:
                        String idBusqueda = JOptionPane.showInputDialog("Ingrese el documento:");
                        miEmpresa.buscarPorDocumento(idBusqueda);
                        break;
                    case 6:
                        miEmpresa.mostrarEmpleadoConMayorSalario();
                        break;
                    case 7:
                        miEmpresa.calcularNominaTotal();
                        break;
                    case 8:
                        miEmpresa.mostrarResumenesPago();
                        break;
                    case 9:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido.");
            }
        }
    }

    private static void nuevoPlanta() {
        try {
            String nom = JOptionPane.showInputDialog("Nombre completo:");
            String id = JOptionPane.showInputDialog("Cédula/ID:");
            int ed = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
            float sueldoBase = Float.parseFloat(JOptionPane.showInputDialog("Salario base:"));
            CategoriaEmpleado categoria = CategoriaEmpleado.valueOf(JOptionPane.showInputDialog("Categoría:").toUpperCase());
            float pSalud = Float.parseFloat(JOptionPane.showInputDialog("Porcentaje Salud:"));
            float pPension = Float.parseFloat(JOptionPane.showInputDialog("Porcentaje Pensión:"));
            String puesto = JOptionPane.showInputDialog("Cargo:");
            int hExtra = Integer.parseInt(JOptionPane.showInputDialog("Cantidad horas extra:"));
            float costoHora = Float.parseFloat(JOptionPane.showInputDialog("Valor de la hora:"));
            float subsidio = Float.parseFloat(JOptionPane.showInputDialog("Valor auxilio:"));

            miEmpresa.agregarEmpleado(new EmpleadoPlanta(nom, id, ed, sueldoBase, categoria,
                    pSalud, pPension, puesto, hExtra, costoHora, subsidio));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en datos: " + ex.getMessage());
        }
    }

    private static void nuevoVentas() {
        try {
            String nom = JOptionPane.showInputDialog("Nombre completo:");
            String id = JOptionPane.showInputDialog("Numero documento:");
            int ed = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
            float sueldoBase = Float.parseFloat(JOptionPane.showInputDialog("Salario base:"));
            CategoriaEmpleado categoria = CategoriaEmpleado.valueOf(JOptionPane.showInputDialog("Categoría:").toUpperCase());
            float pSalud = Float.parseFloat(JOptionPane.showInputDialog("Porcentaje salud:"));
            float pPension = Float.parseFloat(JOptionPane.showInputDialog("Porcentaje pensión:"));
            float totalVentas = Float.parseFloat(JOptionPane.showInputDialog("Monto ventas:"));
            float pctComision = Float.parseFloat(JOptionPane.showInputDialog("Porcentaje comisión:"));

            miEmpresa.agregarEmpleado(new EmpleadoVentas(nom, id, ed, sueldoBase, categoria,
                    pSalud, pPension, totalVentas, pctComision));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en datos: " + ex.getMessage());
        }
    }

    private static void nuevoTemporal() {
        try {
            String nom = JOptionPane.showInputDialog("Nombre completo:");
            String id = JOptionPane.showInputDialog("Cédula/ID:");
            int ed = Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
            float sueldoBase = Float.parseFloat(JOptionPane.showInputDialog("Salario base:"));
            CategoriaEmpleado categoria = CategoriaEmpleado.valueOf(JOptionPane.showInputDialog("Categoría:").toUpperCase());
            float pSalud = Float.parseFloat(JOptionPane.showInputDialog("Porcentaje Salud:"));
            float pPension = Float.parseFloat(JOptionPane.showInputDialog("Porcentaje Pensión:"));
            int diasLab = Integer.parseInt(JOptionPane.showInputDialog("Días laborados:"));
            float pagoDia = Float.parseFloat(JOptionPane.showInputDialog("Valor por día:"));

            miEmpresa.agregarEmpleado(new EmpleadoTemporal(nom, id, ed, sueldoBase, categoria,
                    pSalud, pPension, diasLab, pagoDia));

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en datos: " + ex.getMessage());
        }
    }
}