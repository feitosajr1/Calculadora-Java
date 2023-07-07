import javax.swing.*; 

public class Metodos {

    public static void soma (int x, int y) {
        double res;
        res = (double)x + (double)y;
        JOptionPane.showMessageDialog(null, "A soma de " + x + " e " + y + " é: " + res + "\n");
    } 

    public static void diferenca (int x, int y) {
        double res;
        res = (double)x - (double)y;
        JOptionPane.showMessageDialog(null, "A subtração de " + x + " e " + y + " é: " + res + "\n");
    } 

    public static void produto (int x, int y) {
        double res;
        res = (double)x * (double)y;
        JOptionPane.showMessageDialog(null, "A produto de " + x + " e " + y + " é: " + res + "\n");
    } 
    
    public static void quociente (int x, int y) {
        double res, resto, ext;
        String msg;
        if ((double)x % (double)y == 0) {
            res = (double)x / (double)y;
            JOptionPane.showMessageDialog(null, "A divisão de " + x + " por " + y + " é: " + res + "\n");
        } 
        else {
            res = (int)x / (int)y;
            resto = (int)x % (int)y;
            ext = (double)x / (double)y;

            msg = "A divisão gera resto";
            msg = msg + "\nA divisão inteira de " + x + " com " + y + " é " + res + " com resto " + resto;
            msg = msg + "\nA divisão real de " + x + " com " + y + " é " + ext;
            JOptionPane.showInputDialog(null, msg);
        }
    }

    public static void main (String entrada[]) {
        
// Declaração de variaveis.
        int n1, n2;
        char op = '0';
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
                soma(n1,n2);
                break;
            }

            case '2': {
                diferenca(n1,n2);
                break;
            }

            case '3': {
                produto(n1,n2);
                break;
            }

            case '4': {
                quociente(n1,n2);
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