package javaooaula10;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author josemalcher
 * 
 * Java - Aula 10 - Ordenando um vetor ou lista de inteiros
 * https://www.youtube.com/watch?v=WVgC6J99j7Q
 * 
 */
public class JavaOOaula10Ordenando {
    public static void main(String[] args) {
        int[] lista = new int[20];
        Random numeroRandomico = new Random();
        for(int i = 0; i<lista.length; i++){
            lista[i] = numeroRandomico.nextInt(lista.length);
            System.out.print (lista[i]+" ");
        }
        System.out.println(" ");
        Arrays.sort(lista);
        for(int i = 0 ; i < lista.length ; i++){
            System.out.print(lista[i]+" ");
        }
    }
}
