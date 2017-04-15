package javaooaula08;

/**
 *
 * @author josemalcher
 * 
 * Java - Aula 8 - Polimorfismo
 * https://www.youtube.com/watch?v=kbJQJB6IjZk
 * 
 */
public class Gato extends Animal implements Mamifero{
    private String dono;
    private String corPelo;
    private boolean colera;
    private int numFIlhores;
    private float preco;

    public Gato() {
        super("Felix",2,1.20f,"Gato");
    }

    
    
    public Gato(String dono, String corPelo, boolean colera, int numFIlhores, float preco) {
        super("Felix",2,1.20f,"Gato");
        this.dono = dono;
        this.corPelo = corPelo;
        this.colera = colera;
        this.numFIlhores = numFIlhores;
        this.preco = preco;
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

    @Override
    public String toString() {
        return "Gato{" + "dono=" + dono + ", corPelo=" + corPelo + ", colera=" + colera + ", numFIlhores=" + numFIlhores + ", preco=" + preco + '}';
    }

    @Override
    public void mamou() {
        System.out.println("O "+ this.getNome()+"MAMOU!");
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O "+ this.getNome()+ "Fez Barulho");
    }

    @Override
    public void correr() {
        System.out.println("O "+this.getNome()+"CORREU!!");
    }

    @Override
    public void comer() {
        System.out.println("O "+this.getNome()+ " COMEU!!!");
    }
    
    
    
    
    
    
    
}
