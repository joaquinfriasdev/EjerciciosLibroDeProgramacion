
package capitulo1ejercicio3;

import java.util.Scanner;


public class Capitulo1Ejercicio3 {

    public static void main(String[] args) {
        
        //Ejercicio
        //Se requiere desarrollar un programa que determine si un numero es un numero perfecto.
        
        int suma = 0; // Variable que sumara los divisores del numero
        int i = 1; // Variable utilizada para determinar los divisores del numero
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int numero = teclado.nextInt(); // numero a determinar si es perfecto o no
        
        do {  
            if (numero % i == 0) {
                suma = suma + i;
            }
            i++;
        } while (i <= numero/2);
        
        if (suma == numero) {
            System.out.println(numero + " es un numero perfecto");
        } else{
            System.out.println(numero + " no es un numero perfecto");
        }
        
    }
    
}
