import java.util.Scanner;
public class Arreglo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud del arreglo: ");
        int cantidad = sc.nextInt();
        int accion;
        int []a = new int[cantidad];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese que quiere que tenga la posicion "+ i +" del arreglo:");
            a[i] = sc.nextInt();
        }
        do{
        System.out.println("Que accion desea ejecutar?");
        System.out.println("1. Agregar un numero diferente a cierta posicion.");
        System.out.println("2. Eliminar un numero de cierta posicion.");
        System.out.println("3. Imprimir el arreglo completo.");
        System.out.println("4. Buscar un numero en el arreglo.");
        System.out.println("5. Conocer el numero que mas se repite en el arreglo.");
        System.out.println("6. Saber si existe un numero perfecto en el arreglo.");
        System.out.println("7. Salir.");
        accion = sc.nextInt();
        switch (accion) {
            case 1 -> Funciones.agregarNumero(a);
            case 2 -> Funciones.eliminarNumero(a);
            case 3 -> Funciones.imprimirArreglo(a);
            case 4 -> Funciones.buscarNumero(a);
            case 5 -> Funciones.encontrarRepetido(a);
            case 6 -> Funciones.encontrarPerfecto(a);
            case 7 -> System.exit(0);
            default -> System.out.print("Ese numero no es valido.");
        }
        }while(accion!=7);
    }
}