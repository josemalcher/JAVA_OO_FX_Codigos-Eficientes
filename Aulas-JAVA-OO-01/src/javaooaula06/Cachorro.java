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
public class Cachorro extends Animal implements Mamifero{
    private String dono;
    private String corPelo;
    private boolean colera;
    private int numFIlhores;
    private float preco;
    
    Animal animal;

    public Cachorro(String dono, String corPelo, boolean colera, int numFIlhores, float preco, Animal animal) {
        this.dono = dono;
        this.corPelo = corPelo;
        this.colera = colera;
        this.numFIlhores = numFIlhores;
        this.preco = preco;
        this.animal = animal;
    }

    public Cachorro(String dono, String corPelo, boolean colera, int numFIlhores, float preco, Animal animal, String nome, int idade, float altura, String especie) {
        super(nome, idade, altura, especie);
        this.dono = dono;
        this.corPelo = corPelo;
        this.colera = colera;
        this.numFIlhores = numFIlhores;
        this.preco = preco;
        this.animal = animal;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public boolean isColera() {
        return colera;
    }

    public void setColera(boolean colera) {
        this.colera = colera;
    }

    public int getNumFIlhores() {
        return numFIlhores;
    }

    public void setNumFIlhores(int numFIlhores) {
        this.numFIlhores = numFIlhores;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void mamou() {
        System.out.println("OK MAMOU");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void fazerBarulho() {
        System.out.println("OK FEZ BARULHO!!");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void correr() {
        System.out.println("SIM CORRE MUITO!!");
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cachorro{" + "dono=" + dono + ", corPelo=" + corPelo + ", colera=" + colera + ", numFIlhores=" + numFIlhores + ", preco=" + preco + ", animal=" + animal.getNome() + '}';
    }
    
    
    
    
}
