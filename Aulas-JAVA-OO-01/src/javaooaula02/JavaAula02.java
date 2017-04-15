package javaooaula02;

/**
 *
 * @author josemalcher
 *
 * Java - Aula 2 - Conceitos de Programação Orientada a Objetos
 * https://www.youtube.com/watch?v=eXW5WTRGAck
 * 
 */
public class JavaAula02 {
    public static void main(String[] args) {
        Animal animal01 = new Animal("Cachorro", 3, 0.05f, "Mamifero");
        animal01.MostrarCaracteristivas();
        animal01.FazerBarulho();
    }
}
