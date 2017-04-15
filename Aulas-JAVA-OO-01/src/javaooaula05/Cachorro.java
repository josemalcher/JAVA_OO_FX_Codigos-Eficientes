package javaooaula05;

/**
 *
 * @author josemalcher
 * Java - Aula 5 - Herança
 * https://www.youtube.com/watch?v=j_01zjFBzqg
 */
public class Cachorro extends Animal{
    private String dono;
    private String corPelo;
    private boolean colera;
    private int numFIlhores;
    private float preco;

    public Cachorro(String dono, String corPelo, boolean colera, int numFIlhores, float preco) {
        super();
        this.dono = dono;
        this.corPelo = corPelo;
        this.colera = colera;
        this.numFIlhores = numFIlhores;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Especie : "+ super.getEspecie() + " Cachorro{" + "dono=" + dono + ", corPelo=" + corPelo + ", colera=" + colera + ", numFIlhores=" + numFIlhores + ", preco=" + preco + '}';
    }

   
    
    
    
    
}
