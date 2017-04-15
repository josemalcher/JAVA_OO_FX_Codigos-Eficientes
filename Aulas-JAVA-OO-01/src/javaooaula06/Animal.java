/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaooaula06;

/**
 *
 * @author josemalcher
 * 
 * Java - Aula 6 - Interfaces
 * https://www.youtube.com/watch?v=u1AiLIEhMTk
 * 
 */
public class Animal {
    private String nome;
    private int idade;
    private float altura;
    private String especie;

    public Animal() {
    }

    public Animal(String nome, int idade, float altura, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.especie = especie;
    }
    
    public void imprimeCaracteristicasAnimal(){
        System.out.println("*** IMPRIMINDO CARACTERISTICAS DO ANIMAL ***");
        System.out.println("NOME: " + this.nome);
        System.out.println("IDADE: " + this.idade);
        System.out.println("ALTURA: " + this.altura);
        System.out.println("ESPECIE: " + this.especie);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    
    
    
}
