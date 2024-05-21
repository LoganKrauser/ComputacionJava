package Tema6;

public class ImplementaPersona {

    // Método main para probar la clase Persona
    public static void main(String[] args) {
        // Creación de objetos de la clase Persona
        Persona persona1 = new Persona(); // Uso del constructor sin parámetros
        Persona persona2 = new Persona("Carlos", 25); // Uso del constructor con parámetros

        // Acceso a miembros y uso de métodos
        System.out.println("Información de persona1:");
        persona1.mostrarInformacion(); // Muestra la información de persona1

        System.out.println("\nInformación de persona2:");
        persona2.mostrarInformacion(); // Muestra la información de persona2

        // Modificación de atributos usando setters
        persona1.setNombre("Ana"); // Cambia el nombre de persona1
        persona1.setEdad(30); // Cambia la edad de persona1

        // Mostrar la información actualizada
        System.out.println("\nInformación actualizada de persona1:");
        persona1.mostrarInformacion(); // Muestra la información actualizada de persona1
    }

}
