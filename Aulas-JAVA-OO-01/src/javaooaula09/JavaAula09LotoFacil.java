/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaooaula09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author josemalcher
 * 
 * Java - Aula 9 - Gerando aposta da Lotofácil com List
 * https://www.youtube.com/watch?v=BriKqk-v3uU
 * 
 */
public class JavaAula09LotoFacil {
    public static void main(String[] args) {
        
        String[] valores = new String[25];
        for(int i = 0 ; i < valores.length ; i ++){
            
            System.out.print((i+1)+" ");
            
            valores[i] = String.valueOf(i);
            
        }
        System.out.println(" ");
            
        List<String> list = Arrays.asList(valores);
        Collections.shuffle(list);
        int contador = 0;
        while(contador < 15){
            System.out.print(list.get(contador));
            contador++;
            System.out.print(" ");
        }
        System.out.println(" ");
       
        
        
        
    }
}
