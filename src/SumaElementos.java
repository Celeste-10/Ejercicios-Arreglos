import javax.swing.*;

public class SumaElementos {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        int numero;
        System.out.println("Ingresa 5 números:");
        for(int i=0; i<5; i++){
            numero= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número #" + (i+1) + ":"));
            numeros[i] = numero;
        }
        StringBuilder mensaje = new StringBuilder();
        int suma = 0;
        for(int n: numeros){
             suma += n;
        }

        JOptionPane.showMessageDialog(null, "La suma de los numeros es: " + suma, "Suma", JOptionPane.INFORMATION_MESSAGE);

    }
}
