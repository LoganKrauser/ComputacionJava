package Dado;

public class Die {

    private int faces; // Número de caras del dado
    private int currentFaceValue; // Valor actual visible en el dado

    public Die(int faces) {
        this.faces = faces;
        roll(); // Inicia el dado con un valor aleatorio
    }

    public void roll() {
        this.currentFaceValue = (int) (Math.random() * faces) + 1;
    }

    public int getCurrentFaceValue() {
        return currentFaceValue;
    }

    @Override
    public String toString() {
        return "Face: " + currentFaceValue;
    }
}