package Tema11;

// Clase principal para ejecutar el ejemplo
public class MainAbstraccion {
    public static void main(String[] args) {
        Vehicle car = new Car(180);
        Vehicle bicycle = new Bicycle(25);

        // Uso de los objetos a través de la abstracción proporcionada por la interfaz.
        System.out.println("Velocidad máxima del coche: " + car.getMaxSpeed());
        car.start();

        System.out.println("Velocidad máxima de la bicicleta: " + bicycle.getMaxSpeed());
        bicycle.start();
    }
}