import javax.swing.*;

public class EliminarDuplicados {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        int unicos[] = new int[5];
        int numero;
        int contador=0;
        System.out.println("Ingresa 5 numeros: ");
        for(int i=0; i<5; i++){
            numero= Integer.parseInt(javax.swing.JOptionPane.showInputDialog(null, "Ingresa el número #" + (i+1) + ":"));
            numeros[i] = numero;
            //Comprobar si el número ya existe en el arreglo de números únicos
            boolean duplicado= false;
            for(int j=0;  j<contador; j++){
                if(numero == unicos[j]){
                    duplicado = true;
                    break;
                }
            }
            //Si es un numero nuevo lo guardamos en el arreglo de números únicos
            if(!duplicado){
                unicos[contador] = numero;
                contador++;
            }
        }
        int [] resultado = new int[contador];
        for(int i=0; i<contador; i++){
            resultado[i] = unicos[i];
        }
        StringBuilder mensaje = new StringBuilder();
        JOptionPane.showMessageDialog(null, "Los números sin duplicados son: " + resultado, "Números Únicos", JOptionPane.INFORMATION_MESSAGE);

    }
}
