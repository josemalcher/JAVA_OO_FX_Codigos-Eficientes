package javaooaula05;

import javaooaula04.*;
import javaooaula03.*;
import javaooaula02.*;

/**
 *
 * @author josemalcher
 *
 * Java - Aula 5 - Herança
 * https://www.youtube.com/watch?v=j_01zjFBzqg
 * 
 */
public class JavaAula05 {
    public static void main(String[] args) {
//        Animal animal01 = new Animal();;
//        animal01.MostrarCaracteristivas();
//        animal01.FazerBarulho();

        Cachorro cachorro01 = new Cachorro("Jose", "preto", true, 0, 20);
        System.out.println(cachorro01);
    }
}
