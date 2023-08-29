
package capitulo2ejercicio2;


public class Planeta {
   
    private String nombre = null;
    private int cantidadSaletites = 0;
    private double masa = 0;
    private double volumen = 0;
    private int diametro = 0;
    private int distanciaSol = 0;
    public enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO};
    private tipoPlaneta tipo;
    private boolean esObservable = false;
    private int periodoOrbital;
    private int periodoRotacion;

    public Planeta() {
    }

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, 
            int diametro, int distanciaSol, tipoPlaneta tipo, boolean esObservable, int periodoOrbital, int periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSaletites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    //Método que imprime en pantalla los valores de los atributos de Planeta
    public void imprimirValores(){
        System.out.println("El nombre es " + nombre);
        System.out.println("Cantidad de Satélites: " + cantidadSaletites);
        System.out.println("Masa en kilogramos: " +  masa);
        System.out.println("Volumen en kilómetros: " + volumen);
        System.out.println("Diámetro en kilómetros: " + diametro);
        System.out.println("Distancia media al Sol en millones de kilómetros: " + distanciaSol);
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Observable a simple vista: " + esObservable);
        System.out.println("El período Orbital es: " + periodoOrbital);
        System.out.println("El período de rotación es: " + periodoRotacion);
    }
    
    //Método para calcular la densidad de un Planeta
    public double calcularDensidad(){
       return masa/volumen;
    }
    
    // Método para determinar si un planeta se considera exterior
    public boolean esPlanetaExterior(){
        float limite = (float)(149597870 * 3.4);
        
        if(distanciaSol>limite) {
            return true;
        } else {
            return false;
        }
    }
    
}
