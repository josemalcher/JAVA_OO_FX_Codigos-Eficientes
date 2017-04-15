package javaooaula07;

/**
 *
 * @author josemalcher
 */
public class JavaAula07SobreescritaMetodos {
    public static void main(String[] args) {
        Violao vi01 = new Violao("AZUL", "Basico", 333.00f);
        System.err.println(vi01);
        
        vi01.Tocar();
    }
}
