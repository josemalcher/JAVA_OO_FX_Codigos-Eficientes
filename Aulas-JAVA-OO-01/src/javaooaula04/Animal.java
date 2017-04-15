package javaooaula04;

import javaooaula03.*;
import javaooaula02.*;
import javax.swing.JOptionPane;

/**
 *
 * @author josemalcher
 * 
 * Java - Aula 3 - Usando a classe JOptionPane
 * https://www.youtube.com/watch?v=pretB2Uny14
 * 
 */
public class Animal {
    private String nome;
    private int idade;
    private float altura;
    private String especie;

    public Animal() {
        nome = JOptionPane.showInputDialog("Digite o nome do animal");
        idade = Integer.parseInt(JOptionPane.showInputDialog("DIgite a idade do animal"));
        altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura do animal"));
        especie = JOptionPane.showInputDialog("Digite a espécie do animal");
    }
    
    public Animal(String nome, int idade, float altura, String especie) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.especie = especie;
    }
    
    public void MostrarCaracteristivas(){
        System.out.println("O nome do animal é "+ this.nome);
        System.out.println("A idade do animal é "+ this.idade);
        System.out.println("A altura do animal é "+ this.altura);
        System.out.println("A especie do animal é "+ this.especie);
    }
    
    public void FazerBarulho(){
        System.out.println("O animal fez barulho");
    }
    
}
