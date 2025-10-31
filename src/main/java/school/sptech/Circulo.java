package school.sptech;
import org.w3c.dom.css.CSSImportRule;

public class Circulo extends Figura{
    private Double raio;

    public Circulo(){}

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    @Override
    public String toString() {
        return "Circulo raio=" + raio + ", cor=" + getCor() +
                ", espessura=" + getEspessura() +
                ", área=" + calcularArea();
    }
}
