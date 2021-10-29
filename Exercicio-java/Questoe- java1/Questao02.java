import javax.swing.JOptionPane;

public class Questao02 {
    public static void main(String[] args) {
        String aux = JOptionPane.showInputDialog("Digite um número!");
        int numero = Integer.parseInt(aux);
        JOptionPane.showMessageDialog(null, (numero - 1)+" "+aux+" "+(numero + 1));

    }
}

