package Tema6;

// Definición de la clase Persona
//los usuarios se van a agregar como personas
public class Persona {
    // Atributos de la clase
    private String nombre; // Atributo privado para almacenar el nombre de la persona
    private int edad;      // Atributo privado para almacenar la edad de la persona

    // Constructor sin parámetros
    public Persona() {
        // Inicializa los atributos con valores por defecto
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        // Inicializa los atributos con valores proporcionados por el usuario
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos getter y setter para el atributo nombre
    public String getNombre() {
        // Retorna el valor del atributo nombre
        return nombre;
    }

    public void setNombre(String nombre) {
        // Establece un nuevo valor para el atributo nombre
        this.nombre = nombre;
    }

    // Métodos getter y setter para el atributo edad
    public int getEdad() {
        // Retorna el valor del atributo edad
        return edad;
    }

    public void setEdad(int edad) {
        // Establece un nuevo valor para el atributo edad, con validación
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa");
        }
    }

    // Método para mostrar la información de la persona
    public void mostrarInformacion() {
        // Imprime los valores de los atributos nombre y edad
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }


}
