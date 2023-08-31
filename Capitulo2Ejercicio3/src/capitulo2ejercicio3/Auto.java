
package capitulo2ejercicio3;

public class Auto {
    
    private String marca;
    private int modelo;
    private double motor;
    public enum tipoCombustible{GASOLINA,BIOETANOL,DIESEL,BIODIESEL,GASNATURAL};
    private tipoCombustible tipoComb;
    public enum tipoAutomovil{CARRODECIUDAD,SUBCOMPACTO,COMPACTO,FAMILIAR,EJECUTIVO,SUV};
    private tipoAutomovil tipoA;
    private int cantPuertas;
    private int cantAsientos;
    private double velocidadMax;
    public enum color{BLANCO,NEGRO,ROJO,NARANJA,AMARILLO,VERDE,AZUL,VIOLETA};
    private color tipoColor;
    private double velocidadActual;
    private boolean esAutomatico;

    public Auto() {
    }

    public Auto(String marca, int modelo, double motor, tipoCombustible tipoComb, tipoAutomovil tipoA, 
            int cantPuertas, int cantAsientos, double velocidadMax, color tipoColor, double velocidadActual, boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoComb = tipoComb;
        this.tipoA = tipoA;
        this.cantPuertas = cantPuertas;
        this.cantAsientos = cantAsientos;
        this.velocidadMax = velocidadMax;
        this.tipoColor = tipoColor;
        this.velocidadActual = velocidadActual;
        this.esAutomatico = esAutomatico;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public tipoCombustible getTipoComb() {
        return tipoComb;
    }

    public void setTipoComb(tipoCombustible tipoComb) {
        this.tipoComb = tipoComb;
    }

    public tipoAutomovil getTipoA() {
        return tipoA;
    }

    public void setTipoA(tipoAutomovil tipoA) {
        this.tipoA = tipoA;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public color getTipoColor() {
        return tipoColor;
    }

    public void setTipoColor(color tipoColor) {
        this.tipoColor = tipoColor;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean isEsAutomatico() {
        return esAutomatico;
    }

    public void setEsAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }
  
    
    public void acelerar(double acecelerarVelocidad){
    
        if ((velocidadActual+acecelerarVelocidad)<velocidadMax) {
            velocidadActual = acecelerarVelocidad + velocidadActual;
        } else{
            System.out.println("No se puede acelerar a una velocidad superior a la velocidad máxima del automóvil");
        }
    }
    
    public void desacelerar(double desacelerarVelocidad){
        if ((velocidadActual-desacelerarVelocidad)>0) {
            velocidadActual = velocidadActual - desacelerarVelocidad;
        } else {
            System.out.println("No se puede desacelerar a una velocidad menor a cero");
        }
    }
    
    public void frenar(){
        velocidadActual = 0;
    }
    
    public double calcularTiempo(double distancia){
      return distancia/velocidadActual;  
    }
    
    public void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo de combustible: " + tipoComb);
        System.out.println("Tipo de automóvil: " + tipoA);
        System.out.println("Cantidad de puertas: " + cantPuertas);
        System.out.println("Cantidad de asientos: " + cantAsientos);
        System.out.println("Velocidad máxima: " + velocidadMax);
        System.out.println("Velocidad actual: " + velocidadActual);
        System.out.println("Color: " + tipoColor);
        System.out.println("Es automático: " + esAutomatico);
    }
}
