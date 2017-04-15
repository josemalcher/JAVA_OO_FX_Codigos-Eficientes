/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaooaula11;

/**
 *
 * @author josemalcher
 */
public class JavaOOTratarExcecoesException {
    public static void main(String[] args) {
        int valor = 20;
        int denominador = 0;
        
        try {
            System.out.println("Resultado = " + (valor / denominador));
        } catch (Exception e) {
            System.out.println("Não há divisão por zero "+e);
        }
    }
}
