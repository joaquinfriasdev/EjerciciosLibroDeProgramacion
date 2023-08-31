
package capitulo2ejercicio3;


public class Capitulo2Ejercicio3 {


    public static void main(String[] args) {
        
        Auto auto1 = new Auto("Ford", 2018, 3, Auto.tipoCombustible.DIESEL, Auto.tipoAutomovil.EJECUTIVO, 5, 6, 250, Auto.color.NEGRO, 0, false);

        auto1.imprimir();
        
        System.out.println("------------------------------");
        
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.getVelocidadActual());
        
        auto1.desacelerar(20);
    }
    
}
