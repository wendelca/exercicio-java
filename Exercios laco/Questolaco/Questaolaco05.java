import javax.swing.JOptionPane;

public class Questaolaco05 {
    // 5. Escreva um código que permita ao usuário entrar com um número, o programa
    // vai mostrar o seu fatorial.

    public static void main(String[] args) {
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número!"));
        JOptionPane.showMessageDialog(null, calcFatorial(numero));
        JOptionPane.showMessageDialog(null, calcFatorialDetalhado(numero));

    }

    public static int calcFatorial(int numero) {
        int resultado = 0;
        for (int i = numero; i != 1; i--) {
            if(i == numero){
                resultado = i * (i - 1);
                System.out.print(i);
            }else{
                System.out.print(resultado);
                resultado = resultado * (i - 1);
            }
            System.out.println(" x " + (i - 1) + " = " + resultado);
        }
        return resultado;
    }

    public static String calcFatorialDetalhado(int numero) {
       String texto = "";
       int resultado = 0;
        for (int i = numero; i != 1; i--) {
            if(i == numero){
                resultado = i * (i - 1);
                texto += i;
            }else{
                texto += resultado;
                resultado = resultado * (i - 1);
            }
            texto += " x " + (i - 1) + " = " + resultado + "\n";
        }
        return texto;
    }
}

/* Passo-a-passo do algoritmo
fat = fat * i -> fat
fat = 1 * 1 -> 1
fat = 1 * 2 -> 2
fat = 2 * 3 -> 6
fat = 6 * 4 -> 24
fat = 24 * 5 -> 120
 */

