import javax.swing.*;

public class InvertirArreglo {
    public static void main(String[] args) {
        int [] numeros = new int [5];
        int numero;
        System.out.println("Ingresa 5 numeros: ");
        for(int i=0; i<5; i++){
            numero= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número #" + (i+1) + ":"));
            numeros[i] = numero;
        }
        StringBuilder mensaje = new StringBuilder();

        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }
        JOptionPane.showMessageDialog(null, "El arreglo invertido es: " + numeros, "Arreglo Invertido", JOptionPane.INFORMATION_MESSAGE);

    }
}
