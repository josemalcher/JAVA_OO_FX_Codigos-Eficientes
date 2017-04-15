package javaooaula11;

import javax.swing.JOptionPane;

/**
 *
 * @author josemalcher
 * 
 * Java - Tratamento de várias exceções (Multi Exception)
 * https://www.youtube.com/watch?v=jigy61jn4HI
 * 
 */
public class JavaOOTratamentoMultException {
    public static void main(String[] args) {
        
        try {
            int valor = 30;
            int divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
            int[] meuArray = {1,2,3};
            
            System.out.println("Total= "+ (valor/divisor));
            System.out.println("Valor do array= "+ meuArray[1]);
            
        } catch (ArithmeticException e) {
            System.out.println("Não existe divisão por zero\n"+ e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Indice fora do limite do array\n"+e);
        }
        
    }
}
