
package capitulo1ejercicio2;

import java.util.Scanner;




public class Capitulo1Ejercicio2 {


    public static void main(String[] args) {
        
        int numeroOriginal, ultimoDigito; //Variables para el número original y su ultimo digito
        
        double digitos; //cantidad de digitos que tiene el numero
        double suma = 0; // Variable que sumara los digitos elevados a su cantidad de digitos
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el numero");
        int numero = teclado.nextInt(); //Numero a determinar si es un numero de Amstrong
        
        numeroOriginal = numero; // copia el valor del numero para su procesamiento
        
        digitos = Math.floor(Math.log10(numero))+1; // Calcula el total de digitos del numero
        
        while (numero >0) {            
            ultimoDigito = numero % 10; //Extrae el ultimo digito
            suma = suma + Math.pow(ultimoDigito, digitos);
            numero = numero / 10;
        }
        
        if (numeroOriginal == suma) {
            System.out.println(numeroOriginal + " es un numero de Amstrong");
        } else {
            System.out.println(numeroOriginal + " no es un numero ded Amstrong");
        }
    }
    
}
