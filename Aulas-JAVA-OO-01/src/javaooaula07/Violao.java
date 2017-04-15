package javaooaula07;

/**
 *
 * @author josemalcher
 */
public class Violao extends Instrumento{
    private String cor;
    private String modelo;
    private float preso;

    public Violao(String cor, String modelo, float preso) {
        super("Tonante", 250.40f);
        this.cor = cor;
        this.modelo = modelo;
        this.preso = preso;
    }

    @Override
    public void Tocar() {
        System.out.println("SOBREESCRITO METODO TOCAR!! Marca "+super.getMarca());
    }
    
    

    @Override
    public String toString() {
        return "Violao{" + "cor=" + cor + ", modelo=" + modelo + ", preso=" + preso + '}'+" MARCA => "+super.getMarca();
    }
    
    
    
}
