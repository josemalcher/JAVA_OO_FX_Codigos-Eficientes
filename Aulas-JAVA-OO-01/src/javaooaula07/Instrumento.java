package javaooaula07;

/**
 *
 * @author josemalcher
 */
public class Instrumento {
    private String marca;
    private float preco;

    public Instrumento() {
    }

    
    public Instrumento(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;
    }
    
    public void Tocar(){
        System.out.println("O instumento "+this.marca+" está tocando");
    }
    
    public void Afinar(){
        System.out.println("O instrumento "+ this.marca + " está afinado agora!");
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }
    
    
    
}
