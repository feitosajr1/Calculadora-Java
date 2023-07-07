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
        char op = '0';
        String msg;

        String msgOp = "Escolha opção:";
        msgOp = msgOp +"\n1 - Para somar os números: ";
        msgOp = msgOp +"\n2 - Para subtração: ";
        msgOp = msgOp +"\n3 - Para produto: ";
        msgOp = msgOp +"\n4 - Para divisão: ";
        msgOp = msgOp +"\n5 - Para sair: ";

// Entrada de dados 
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero:"));
        op = (JOptionPane.showInputDialog(msgOp)).charAt(0);

// Processamento
        switch (op){
            case '1': {
                r = soma(n1,n2);
                msg = "A soma de " + n1 + " e " + n2 + " é: " + r + "\n";
                JOptionPane.showMessageDialog(null, msg);
                System.out.println("\n" + msg + "\n");
                break;
            }

            case '2': {
                r = diferenca(n1,n2);
                msg =  "A diferença de " + n1 + " e " + n2 + " é: " + r + "\n";
                JOptionPane.showMessageDialog(null, msg);
                System.out.println("\n" + msg + "\n");
                break;

            }

            case '3': {
                r = produto(n1,n2);
                msg = "O produto de " + n1 + " e " + n2 + " é: " + r + "\n";
                JOptionPane.showMessageDialog(null, msg);
                System.out.println("\n" + msg + "\n");
                break;
            }

            case '4': {
                r = quociente(n1,n2);
                msg = "O quociente de " + n1 + " e " + n2 + " é: " + r;
                JOptionPane.showMessageDialog(null, msg);
                System.out.println("\n" + msg + "\n");
                break;
            }

            case '5': {
                JOptionPane.showMessageDialog(null, "Obrigado por usar o programa !");
                break;
            }
            default: JOptionPane.showMessageDialog(null, "Opção invalida, tente novamente.");
        }
    } 
}