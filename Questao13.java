import javax.swing.JOptionPane;
//import java.util.Scanner;

public class Questao13 {
   
public static void main(String[] args) {

    int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
    int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
    int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número"));
    Integer maiorNumero = 0;

    if ((a > b) && (a > c)); {
        maiorNumero = a; 

}  if ((b > a) && (b > c)); {
        maiorNumero = b; 

    }  if ((c > a) && (c > b)); {
        maiorNumero = c; }
{ 
    JOptionPane.showMessageDialog(null, "O  maior numero é = " +maiorNumero);   
    }
    }
}