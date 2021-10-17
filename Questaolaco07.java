import javax.swing.JOptionPane;
public class Questaolaco07 {
      
        public static void main(String[] args) {
    
                    String senha = JOptionPane.showInputDialog("Digite sua senha: ");
    
                    int senha_ok = Integer.parseInt(senha);
    
                    String msg = "";
    
                    if(senha_ok ==1234){
                        msg = "ACESSO PERMITIDO";
                    } else{
                        msg = "ACESSO NEGADO";
                    }
                    JOptionPane.showMessageDialog(null, msg);
                }
    
    
 } 
