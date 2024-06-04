package Tema11;

// Clase 'Car' que implementa la interfaz Vehicle
class Car implements Vehicle {
    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Implementación específica del método getMaxSpeed para Car.
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Implementación específica del método start para Car.
    @Override
    public void start() {
        System.out.println("El coche arranca con una llave.");
    }
}