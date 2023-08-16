
package capitulo1ejercicio1;

import java.util.Scanner;


public class Capitulo1Ejercicio1 {


    public static void main(String[] args) {
        
        double peso, estatura, imc;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese su peso");
        peso = teclado.nextDouble();
        System.out.println("Ingrese su estatura en metros");
        estatura = teclado.nextDouble();
        
        System.out.println("Usted tiene " + peso + " kilogramos y una estatura de " + estatura + " metros");
        
        imc = (peso / Math.pow(estatura, 2));
        
        if (imc<16) {
            System.out.println("Usted tiene delgadez severa");
        } else if (imc < 17) {
            System.out.println("Usted tiene delgadez moderada");
        } else if (imc < 18.5) {
            System.out.println("Usted tiene delgadez leve");
        } else if (imc < 25) {
            System.out.println("Usted tiene un peso normal");
        } else if (imc < 30) {
            System.out.println("Usted tiene sobrepeso");
        } else if (imc < 35) {
            System.out.println("Usted tiene obesidad leve");
        } else if (imc < 40) {
            System.out.println("Usted tiene obesidad moderada");
        } else {
            System.out.println("Usted tiene obesidad mórbida");
        }
    }  
}
