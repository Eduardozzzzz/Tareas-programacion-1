import javax.swing.JOptionPane;

public class Arreglo_funcional{
    public static void main(String[] args) {
        int cantidad=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la cantidad de notas:"));
        double[]notas=new double[cantidad];
        for(int i=0;i<notas.length;i++){
            notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nota de la posicion: " + (i+1)));
        }
        double promedio=calcularPromedio(notas);
        double mayor=encontrarMayor(notas);
        double menor=encontrarMenor(notas);
        double repetido=determinarMasRepetido(notas);
        JOptionPane.showMessageDialog(null,"El promedio de sus notas es de " + promedio + " \n" + 
        "La mayor nota es de " + mayor + " y la menor de " + menor + " \n" + 
        "La nota que mas se repite es " + repetido + ".");
        ordenarBurbuja(notas);
        String notasOrdenadas = "";
        for(int i = 0; i < notas.length; i++){
            if(i==notas.length-1){
                notasOrdenadas += notas[i] + " ";
            }else{
                notasOrdenadas += notas[i] + ", ";
            }
            
        }
        JOptionPane.showMessageDialog(null, "Notas ordenadas de menor a mayor: " + notasOrdenadas);
        buscarNumero(notas);
    }

    public static double calcularPromedio(double[]notas){
        int sum=0;
        for(int i=0;i<notas.length;i++){
            sum+=notas[i];
        }
        return sum/notas.length;
    }

    public static double encontrarMayor(double[]notas){
        double mayor=0;
        double menor=notas.length-1;
        for(int i=0;i<notas.length;i++){
            if(notas[i]>mayor){
                mayor=notas[i];

            }else if(notas[i]<menor){
                menor=notas[i];
            }

        }
        return mayor;
    }

    public static double encontrarMenor(double[]notas){
        double mayor=0;
        double menor=6.0;
        for(int j=0;j<notas.length;j++){
            if(notas[j]>mayor){
                mayor=notas[j];

            }else if(notas[j]<menor){
                menor=notas[j];
            }

        }
        return menor;
    }

    public static double determinarMasRepetido(double[]notas){
        double repetido=0;
        double anterior=0;
        for (int i = 0; i < notas.length; i++) {
            int actual=0;
            for (int j = i+1; j < notas.length; j++) {
                if(notas[j]==notas[i]){
                    actual++;
                }
            }
            if(actual>anterior){
                repetido=notas[i];
                anterior=actual;
            }
        }
        return repetido;
    }
    public static void buscarNumero(double[] notas){
        double numero = Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nota que desea buscar: "));
        boolean encontrado = false;
        String resultados= "";
        for (int i = 0; i <notas.length; i++) {
           if(notas[i]==numero){
                encontrado = true;
                resultados += "La nota que buscas esta en la posicion " + (i+1) + ".\n";
           }
        }
        if(!encontrado){
           resultados += "No se encontro este numero.";
        }
        JOptionPane.showMessageDialog(null,resultados);
    }
    public static void ordenarBurbuja(double[] notas){
    int n = notas.length;
    
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n - i - 1; j++){
            if(notas[j] > notas[j + 1]){
                double temp = notas[j];
                notas[j] = notas[j + 1];
                notas[j + 1] = temp;
            }
        }
    }
}
}