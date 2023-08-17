
package capitulo2ejercicio1;


public class Persona {
    
    private String nombre;
    private String apellido;
    private int dni;
    private int añoNac;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int dni, int añoNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.añoNac = añoNac;
    }
    
    public void imprimir(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Año de Nacimiento: " + añoNac);
    }
    
}
