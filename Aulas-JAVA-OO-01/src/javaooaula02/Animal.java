package javaooaula02;

/**
 *
 * @author josemalcher
 * 
 * Java - Aula 2 - Conceitos de Programação Orientada a Objetos
 * https://www.youtube.com/watch?v=eXW5WTRGAck
 * 
 */
public class Animal {
    private String nome;
    private int idade;
    private float altura;
    private String especie;

    public Animal(String nome, int idade, float altura, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.especie = especie;
    }
    
    public void MostrarCaracteristivas(){
        System.out.println("javaooaula02.Animal.MostrarCaracteristivas()");
        System.out.println("O nome do animal é "+ this.nome);
        System.out.println("A idade do animal é "+ this.idade);
        System.out.println("A altura do animal é "+ this.altura);
        System.out.println("A especie do animal é "+ this.especie);
    }
    
    public void FazerBarulho(){
        System.out.println("O animal fez barulho");
    }
    
}
