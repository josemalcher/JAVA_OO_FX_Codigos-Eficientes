/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaooaula06;

/**
 *
 * @author josemalcher
 */
public class JavaOOaula06Interfaces {
    public static void main(String[] args) {
        Animal animal = new Animal("CACHORRO", 2, 0.5f, "MAmifero");
        Cachorro catiroto = new Cachorro("JOSE", "PRETO", true, 0, 0.5f, animal);
        
        
        
        catiroto.correr();
        catiroto.mamou();
        
        System.out.println(catiroto);
        
        
    }
}
