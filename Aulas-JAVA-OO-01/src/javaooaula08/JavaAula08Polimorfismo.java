package javaooaula08;

/**
 *
 * @author josemalcher
 * 
 * Java - Aula 8 - Polimorfismo
 * https://www.youtube.com/watch?v=kbJQJB6IjZk
 * 
 */
public class JavaAula08Polimorfismo {
    
    
    static Cachorro c = new Cachorro();
    static Gato g = new Gato();
    
    public void alimentarAnimal(Animal animal){
        animal.comer();
    }
    
    public static void main(String[] args) {
        JavaAula08Polimorfismo bicho = new JavaAula08Polimorfismo();
        bicho.alimentarAnimal(c);
        bicho.alimentarAnimal(g);
    }
    
}
