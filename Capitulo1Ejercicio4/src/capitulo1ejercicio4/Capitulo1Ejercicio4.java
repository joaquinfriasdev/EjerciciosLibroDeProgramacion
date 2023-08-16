
package capitulo1ejercicio4;

import java.util.Scanner;


public class Capitulo1Ejercicio4 {


    public static void main(String[] args) {
        
      int suma = 0;
      int num1, num2;
      Scanner teclado = new Scanner(System.in);
      
        System.out.println("Ingrese el primer numero");
        num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = teclado.nextInt();
        
        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                suma = suma+i;
            }
        }
        if (suma == num2) {
            suma =0;
            for (int i = 1; i < num2; i++) {
                if (num2 % i ==0) {
                    suma = suma + i;
                }
            }
            
            if (suma == num1) {
                System.out.println(num1 + " y " + num2 + " son amigos");
            } else{
                System.out.println(num1 + " y " + num2 + " no son amigos");
            }
        }
    }
    
}
