package Tema11;


public class MainEncapsulacion {
    public static void main(String[] args) {
        // Crear una instancia de Person
        Person person = new Person("Juan", 25);

        // Acceder y modificar atributos mediante métodos getter y setter
        System.out.println("Nombre: " + person.getName() + ", Edad: " + person.getAge());

        // Establecer una nueva edad usando el setter
        person.setAge(30);
        System.out.println("Nueva Edad: " + person.getAge());

        // Intentar establecer una edad inválida
        person.setAge(-5); // Esto no cambiará la edad y mostrará un mensaje de error
        System.out.println("Edad después de intento inválido: " + person.getAge());
    }
}
