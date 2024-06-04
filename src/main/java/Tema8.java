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
        Integer integerObject = new Integer(50);
        int unboxedInt = integerObject; // Auto-unboxing

        // Ejemplo de String y formateo de String
        String nombre = "Mundo";
        String saludo = String.format("Hola %s!", nombre); // Formateo de string
        System.out.println(saludo);

        // Ejemplo de java.lang.Math
        double raizCuadrada = Math.sqrt(32); // Calcula la raíz cuadrada de 16
        System.out.println("Raíz cuadrada de 32: " + raizCuadrada);
        double potencia = Math.pow(2, 4); // 2 elevado a la potencia de 3
        System.out.println("2 elevado a 3 es: " + potencia);
        double redondear = Math.round(5.5);
        System.out.println("numero redondeado " + redondear);

        // Ejemplo de java.lang.System
        long tiempoActual = System.nanoTime(); // Obtiene el tiempo actual en milisegundos
        System.out.println("Tiempo actual en milisegundos: " + tiempoActual);

        // Ejemplo de ArrayList
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1"); // Agrega un elemento a la lista
        lista.add("Elemento 2");
        System.out.println("ArrayList: " + lista);

        // Ejemplo de HashMap
        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("JUAN", "Monterrey"); // Agrega un par clave-valor al mapa
        mapa.put("PEDRO", "GUADALUPE");
        mapa.put("PABLO", "SALTILLO");
        mapa.put("ANA", "ENSENADA");


        String clave = mapa.get("PABLO");
        System.out.println("EL USUARIO ES DE LA SIGUIENTE CIUDAD: " + clave);
        System.out.println("HashMap: " + mapa);

        // Ejemplo de HashSet
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("A"); // Agrega un elemento al conjunto
        conjunto.add("B");
        System.out.println("HashSet: " + conjunto);

        // Ejemplo de java.util.Random
        Random aleatorio = new Random();
        int numeroAleatorio = aleatorio.nextInt(100); // Genera un número aleatorio entre 0 y 99
        System.out.println("Número aleatorio: " + numeroAleatorio);
    }
}