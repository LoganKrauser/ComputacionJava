package Tema11;

// Clase 'Bicycle' que implementa la interfaz Vehicle
class Bicycle implements Vehicle {
    private int maxSpeed;

    public Bicycle(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Implementación específica del método getMaxSpeed para Bicycle.
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Implementación específica del método start para Bicycle.
    @Override
    public void start() {
        System.out.println("La bicicleta comienza al comenzar a pedalear.");
    }
}