package capitulo2ejercicio4;

public class TrianguloRectangulo {

    private double baseCm;
    private double alturaCm;

    public TrianguloRectangulo() {
    }

    public TrianguloRectangulo(double baseCm, double alturaCm) {
        this.baseCm = baseCm;
        this.alturaCm = alturaCm;
    }

    public double calcularArea() {
        return (baseCm * alturaCm) / 2;
    }

    public double calcularPerimetro() {
        return (baseCm + alturaCm + calcularHipotenusa());
    }

    public double calcularHipotenusa() {
        return Math.pow(baseCm * baseCm + alturaCm * alturaCm, 0.5);
    }

    public void tipoTriangulo() {
        if (baseCm == alturaCm && baseCm == calcularHipotenusa() && alturaCm == calcularHipotenusa()) {
            System.out.println("Es un triángulo equilátero");
        } else if (baseCm != alturaCm && baseCm != calcularHipotenusa() && alturaCm != calcularHipotenusa()) {
            System.out.println("Es un triángulo escaleno");
        } else {
            System.out.println("Es un triángulo isósceles");
        }
    }

}
