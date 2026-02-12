import java.util.Scanner;
public class Funciones {
    public static int[] agregarNumero(int[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("La longitud del arreglo es de: "+ a.length);
        System.out.println("En que posicion desea agregar su numero: ");
        int posicion = sc.nextInt();
        System.out.println("Que numero desea agregar en esa posicion: ");
        a[posicion] = sc.nextInt();
        System.out.println("Numero agregado.");
        return a;
    }
    public static int[] eliminarNumero(int[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("La longitud del arreglo es de: "+ a.length);
        System.out.println("De que posicion es el numero que desea eliminar: ");
        int posicion = sc.nextInt();
        a[posicion] = 0;
        System.out.println("Numero eliminado.");
        return a;
    }
    public static void imprimirArreglo(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void buscarNumero(int[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero que desea buscar en el arreglo: ");
        int numero = sc.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < a.length; i++) {
           if(a[i]==numero){
                encontrado = true;
                System.out.println("El numero que buscas esta en la posicion " + i+".");
           }
        }
        if(!encontrado){
            System.out.println("No se encontro este numero.");
        }
    }
    public static void encontrarRepetido(int[] a){
        int repetido=0;
        int anterior=0;
        boolean repite = false;
        for (int i = 0; i < a.length; i++) {
            int actual=0;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]==a[i]){
                    actual++;
                }
            }
            if(actual>anterior){
                repetido=a[i];
                repite = true;
                anterior=actual;
            }
        }
        if(repite==true){
            System.out.println("El mas repetido es el " + repetido);
        }else{
            System.out.println("Ninguno se repite");
        }
        
    }
    public static void encontrarPerfecto(int[] a){

        for (int i = 0; i < a.length; i++) {
           int sum = 1;
           for (int j = 2; j < a[i]; j++) {
               if(a[i]%j==0){
                sum = sum + j;
               }
           }
           if(sum==a[i]&&sum!=0&&sum!=1){
            System.out.println("En la posicion "+i+" esta "+a[i]+", que es un numero perfecto.");
           }else{
            System.out.println(a[i]+" no es un numero perfecto.");
           }
        }
    }
}
