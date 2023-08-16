package capitulo1ejercicio5;

public class Capitulo1Ejercicio5 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 3, 4, 4, 5, 2}; // Definicion de un array de datos int
        System.out.println("Elementos del array");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Elemento [" + i + "] = " + array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println("Elemento duplicado: " + array[j]);
                }
            }
        }
    }

}
