import javax.swing.JOptionPane;

public class Questaolaco03 {
 public static void main(String[] args) {
     int num;
     num=(Integer.parseInt(JOptionPane.showInputDialog("Digite um numero")));
     for (int i = 0; i <= 10; i++ ){
         int mult = num * 1;
         JOptionPane.showMessageDialog(null, num+" x "+i+" = "+mult);
     }
 }
    


}


//Escreva um código que pergunte um número ao usuário, e mostre sua tabuada (de 1 até 10).