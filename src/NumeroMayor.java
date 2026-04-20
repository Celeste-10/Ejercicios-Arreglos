import javax.swing.*;

public class NumeroMayor {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        int numero;
        System.out.println("Ingresa 5 numeros: ");
        for(int i=0; i<5; i++){
            numero= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número #" + (i+1) + ":"));
            numeros[i] = numero;
        }
        StringBuilder mensaje = new StringBuilder();
        int mayor = numeros[0];
        for(int n: numeros){
            if(n> mayor){
                mayor = n;
            }
        }

        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor, "Número Mayor", JOptionPane.INFORMATION_MESSAGE);
    }
}
