import javax.swing.*;

public class ElementosPares {
    public static void main(String[] args) {
        int [] numeros = new int[5];
        int numero;
        int elementos= 0;
        System.out.println("Ingresa 5 numeros: ");
        for(int i=0; i<5; i++){
            numero= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número #" + (i+1) + ":"));
            numeros[i] = numero;
        }
        StringBuilder mensaje = new StringBuilder();
        for(int n: numeros){
            if(n%2 ==0){
                elementos++;
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de elementos pares es: " + elementos, "Elementos Pares", JOptionPane.INFORMATION_MESSAGE);
    }
}
