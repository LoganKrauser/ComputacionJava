import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Tema8 {
    public static void main(String[] args) {
        // Ejemplo de boxing: convierte un int primitivo a un Integer objeto
        int i = 10;
        Integer boxedInt = i; // Autoboxing

        // Ejemplo de unboxing: convierte un Integer objeto a un int primitivo
        Integer integerObject = new Integer(10);
        int unboxedInt = integerObject; // Auto-unboxing

        // Ejemplo de String y formateo de String
        String nombre = "Mundo";
        String saludo = String.format("Hola %s!", nombre); // Formateo de string
        System.out.println(saludo);

        // Ejemplo de java.lang.Math
        double raizCuadrada = Math.sqrt(16); // Calcula la raíz cuadrada de 16
        System.out.println("Raíz cuadrada de 16: " + raizCuadrada);
        double potencia = Math.pow(2, 3); // 2 elevado a la potencia de 3
        System.out.println("2 elevado a 3 es: " + potencia);

        // Ejemplo de java.lang.System
        long tiempoActual = System.currentTimeMillis(); // Obtiene el tiempo actual en milisegundos
        System.out.println("Tiempo actual en milisegundos: " + tiempoActual);

        // Ejemplo de ArrayList
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1"); // Agrega un elemento a la lista
        lista.add("Elemento 2");
        System.out.println("ArrayList: " + lista);

        // Ejemplo de HashMap
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("clave1", 100); // Agrega un par clave-valor al mapa
        mapa.put("clave2", 200);
        System.out.println("HashMap: " + mapa);

        // Ejemplo de HashSet
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("A"); // Agrega un elemento al conjunto
        conjunto.add("B");
        System.out.println("HashSet: " + conjunto);

        // Ejemplo de java.util.Random
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
        System.out.println("Número aleatorio: " + numeroAleatorio);
    }
}