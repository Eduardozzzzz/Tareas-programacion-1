import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dulces[] canasta = new Dulces[5];
        
        for (int i = 0; i < canasta.length; i++) {
            System.out.print("Que dulce quieres en la posicion " + i + "? ");
            String nombreDulce = sc.nextLine();
            
            System.out.print("Cuantos " + nombreDulce + " quieres? ");
            int cantidadDulce = sc.nextInt();
            sc.nextLine();  // IMPORTANTE: limpiar el buffer después de nextInt
            
            canasta[i] = new Dulces(nombreDulce, cantidadDulce);
        }
        
        System.out.println("\nTu canasta contiene:");
        for (int j = 0; j < canasta.length; j++) {
            System.out.println((j+1) + ". " + canasta[j].nombre + " - Cantidad: " + canasta[j].cantidad);
        }
        
        sc.close();
    }
}