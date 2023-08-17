
package capitulo2ejercicio1;


public class Capitulo2Ejercicio1 {

//Consigna
    /*
    Se requiere un programa que modele el concepto de una persona. Una persona posee nombre, apellido, 
    número de documento de identidad y año de nacimiento. La clase debe tener un constructor que inicialice 
    los valores de sus respectivos atributos.
    La clase debe incluir los siguientes métodos:
        -- Definir un método que imprima en pantalla los valores de los atributos del objeto.
        -- En un método main se deben crear dos personas y mostrar los valores de sus atributos en pantalla.
    */
    public static void main(String[] args) {
        
     Persona joaPer = new Persona("Joaquin", "Frias", 40404332, 1998);
     joaPer.imprimir();  
        System.out.println("----------------------------");
     Persona verePer = new Persona("Verena", "Ortiz", 33433232, 1998);
     verePer.imprimir();
    }
    
}
