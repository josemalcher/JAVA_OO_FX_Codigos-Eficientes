/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaooaula11;

/**
 *
 * @author josemalcher
 * 
 * Java - Aproveitando o processo paralelo com Threads
 * https://www.youtube.com/watch?v=z7Cm7vFfGcw
 * 
 */
public class JavaOOProcParaThreads {
    
    static int i = 0;
    
    public static void main(String[] args) {
        
        new Thread(T1).start();
        new Thread(T2).start();
        
    }
    
    
    private static void Contador(String nome){
        i++;
        System.out.println("Valor do contador: "+ i +" Atualizado por "+ nome);
    }
    
    private static Runnable T1 = new Runnable() {
        @Override
        public void run() {
            
            try {
                for(i = 0; i < 5;){
                    Contador("T1");
                }
            } catch (Exception e) {
                
            }
                
            
            
        }
    };
    
    private static Runnable T2 = new Runnable() {
        @Override
        public void run() {
            
            try {
                for(i = 0; i < 5;){
                    Contador("T2");
                }
            } catch (Exception e) {
                
            }
                
            
            
        }
    };
    
    
    
    
}
