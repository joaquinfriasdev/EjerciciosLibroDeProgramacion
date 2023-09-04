
package capitulo2ejercicio4;


public class Cuadrado {
    
    private double longitudLadosCm;

    public Cuadrado() {
    }

    public Cuadrado(double longitudLadosCm) {
        this.longitudLadosCm = longitudLadosCm;
    }
    
    public double calcularArea(){
        return longitudLadosCm * longitudLadosCm;
    }
    
    public double calcularPerimetro(){
        return 4 * longitudLadosCm;
    }
}
