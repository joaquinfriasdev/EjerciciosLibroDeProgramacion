
package capitulo2ejercicio4;


public class Circulo {
    
    private double radioCm;

    public Circulo() {
    }

    public Circulo(double radioCm) {
        this.radioCm = radioCm;
    }
    
    public double calcularArea(){
        return Math.PI * (radioCm * radioCm);
    }
    
    public double calcularPerimetro(){
        return 2 * Math.PI * radioCm;
    }
    
}
