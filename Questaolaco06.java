import java.util.Scanner;
public class Questaolaco06 {   

        public static void main (String []args) {
            Scanner in= new Scanner (System.in);
            int numero;
            int i=2;
            System.out.println("Digite um número para saber se é primo ou não:");
            numero=in.nextInt ();
            while (i<2 ) {
                if ( numero % i == 0 ) {
                    System.out.println("O número não é primo!");
                }else {
            }
        }
            i = i + 1; 
            System.out.println ("O número é primo! "+numero);
        }
    }
    