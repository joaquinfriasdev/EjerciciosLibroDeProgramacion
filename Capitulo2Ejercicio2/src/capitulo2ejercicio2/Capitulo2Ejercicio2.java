
package capitulo2ejercicio2;

import capitulo2ejercicio2.Planeta.tipoPlaneta;


public class Capitulo2Ejercicio2 {


    public static void main(String[] args) {
       
        Planeta tierra = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, tipoPlaneta.TERRESTRE, true, 1, 24);
        Planeta jupiter = new Planeta("Júpiter", 79, 1.899E25, 1.4313E15, 139820, 750000000, tipoPlaneta.GASEOSO, true, 11, 10);
        
        tierra.imprimirValores();
        System.out.println("Densidad del planeta Tierra: " + tierra.calcularDensidad());
        System.out.println("Es planeta exterior: " + tierra.esPlanetaExterior());
        System.out.println("--------------");
        
        jupiter.imprimirValores();
        System.out.println("Densidad del planeta Júpiter: " + jupiter.calcularDensidad());
        System.out.println("Es planeta exterior: " + jupiter.esPlanetaExterior());
    }
    
}
