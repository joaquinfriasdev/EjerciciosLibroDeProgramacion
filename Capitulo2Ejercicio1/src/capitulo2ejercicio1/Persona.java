
package capitulo2ejercicio1;


public class Persona {
    
    private String nombre;
    private String apellido;
    private int dni;
    private int añoNac;
    private String nacionalidad;
    private char genero;
    

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, int añoNac, String nacionalidad, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.añoNac = añoNac;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
    }

   
    
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Año de Nacimiento: " + añoNac);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("Género: " + genero);
    }
    
}
