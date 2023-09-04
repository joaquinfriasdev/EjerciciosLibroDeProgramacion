
package capitulo2ejercicio4;


public class Rectangulo {
    
    private double baseCm;
    private double alturaCm;

    public Rectangulo() {
    }

    public Rectangulo(double baseCm, double alturaCm) {
        this.baseCm = baseCm;
        this.alturaCm = alturaCm;
    }
    
    public double calcularArea(){
        return baseCm * alturaCm;
    }
    
    public double calcularPerimetro(){
        return 2 * (baseCm*alturaCm);
    }
    
}
