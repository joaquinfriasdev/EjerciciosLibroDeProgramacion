
package capitulo2ejercicio4;


public class Capitulo2Ejercicio4 {


    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(2);
        Rectangulo rectangulo1 = new Rectangulo(1, 2);
        Cuadrado cuadrado1 = new Cuadrado(3);
        TrianguloRectangulo triangulo1 = new TrianguloRectangulo(3, 5);
        Trapecio trapecio1 = new Trapecio(8, 4, 5, 3, 7);
        Rombo rombo1 = new Rombo(8, 6, 5);
        
        System.out.println("El área del círculo es: " + circulo1.calcularArea());
        System.out.println("El perímetro del círculo es: " + circulo1.calcularPerimetro());
        System.out.println("-------------------------------------");
        System.out.println("El área del rectángulo es: " + rectangulo1.calcularArea());
        System.out.println("El perímetro del rectángulo es: " + rectangulo1.calcularPerimetro());
        System.out.println("-------------------------------------");
        System.out.println("El área del cuadrado es: " + cuadrado1.calcularArea());
        System.out.println("El perímetro del cuadrado es: " + cuadrado1.calcularPerimetro());
        System.out.println("--------------------------------------");
        System.out.println("El área del triángulo es: " + triangulo1.calcularArea());
        System.out.println("El perímetro del triángulo es: " + triangulo1.calcularPerimetro());
        triangulo1.tipoTriangulo();
        System.out.println("--------------------------------------");
        System.out.println("El área del trapecio es: " + trapecio1.calcularArea());
        System.out.println("El perímetro del trapecio es: " + trapecio1.calcularPerimetro());
        System.out.println("--------------------------------------");
        System.out.println("El área del rombo es: " + rombo1.calcularArea());
        System.out.println("El perímetro del rombo es: " + rombo1.calcularPerimetro());
        
    }
    
}
