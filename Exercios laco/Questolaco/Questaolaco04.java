import javax.swing.JOptionPane;

public class Questaolaco04 {

    public static void main(String[] args) {
        int num1, num2;
        //float[] vetor = new float[3];
        num1 = (Integer.parseInt(JOptionPane.showInputDialog("Digite primeiro número")));
        num2 = (Integer.parseInt(JOptionPane.showInputDialog("Digite segundo número")));
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
            
            //JOptionPane.showMessageDialog(null, i);
         
          
        }
    }

}
