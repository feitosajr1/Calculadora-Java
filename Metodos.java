import java.security.DrbgParameters.Reseed;

import javax.swing.*; 

public class Metodos {

    public static double soma (int x, int y) {
        double res;
        res = x + y;
        
        return res; 
    } 

    public static double diferenca (int x, int y) {
        double res;
        res = x-y;

        return res;
    } 

    public static double produto (int x, int y) {
        double res;
        res = x * y;

        return res; 
    } 
    
    public static double quociente (int x, int y) {
        double res;
        res = x / y;

        return res;
    }

    public static void main (String entrada[]) {
        
// Declaração de variaveis.
        int n1, n2;
        double r;
        String msg;

// Entrada de dados 
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero:"));

// Processamento
        r = soma(n1,n2);
        msg = "A soma de " + n1 + " e " + n2 + " é: " + r + "\n";

        r = diferenca(n1,n2);
        msg = msg + "\nA diferença de " + n1 + " e " + n2 + " é: " + r + "\n";
        
        r = produto(n1,n2);
        msg = msg + "\nO produto de " + n1 + " e " + n2 + " é: " + r + "\n";
        
        r = quociente(n1,n2);
        msg = msg + "\nO quociente de " + n1 + " e " + n2 + " é: " + r;
       
        JOptionPane.showMessageDialog(null, msg);
    } 
}