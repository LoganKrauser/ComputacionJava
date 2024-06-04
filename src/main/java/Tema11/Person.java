package Tema11;


public class Person {
    // Atributos privados para evitar el acceso directo desde fuera de la clase
    private String name; // Nombre de la persona
    private int age; // Edad de la persona

    // Constructor para inicializar el objeto Person con nombre y edad
    public Person(String name, int age) {
        this.name = name;
        this.setAge(age); // Utiliza el método set para establecer la edad, que incluye validación
    }

    // Método público para obtener el nombre de la persona
    public String getName() {
        return name;
    }

    // Método público para establecer el nombre de la persona
    public void setName(String name) {
        this.name = name;
    }

    // Método público para obtener la edad de la persona
    public int getAge() {
        return age;
    }

    // Método público para establecer la edad de la persona
    // Incluye validación para asegurar que la edad es razonable
    public void setAge(int age) {
        if (age > 0 && age < 130) { // Valida que la edad sea positiva y razonablemente alta
            this.age = age;
        } else {
            this.age = 0; // Si la edad no es válida, se establece a 0
            System.out.println("Edad inválida proporcionada");
        }
    }
}