package Dado;

public class Main {
    public static void main(String[] args) {
        // Crear una bolsa de dados con 5 dados de 6 caras
        DiceBag diceBag = new DiceBag(5, 6);

        // Mostrar el primer dado
        System.out.println("Mostrando el primer dado:");
        diceBag.showFirstDie();

        // Lanzar todos los dados
        System.out.println("\nLanzando todos los dados:");
        diceBag.rollAll();

        // Escoger y mostrar un dado al azar
        System.out.println("\nEscogiendo y mostrando un dado al azar:");
        diceBag.pickRandomDie();

        // Lanzar y mostrar 3 dados al azar
        System.out.println("\nLanzando y mostrando 3 dados al azar:");
        diceBag.rollRandomDice(3);
    }
}