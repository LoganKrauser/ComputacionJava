package employee_management;

// Clase abstracta para definir un empleado general en la empresa
abstract class Employee implements Payable {
    private String name; // Encapsulación: propiedad privada, accesible solo mediante métodos públicos
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Método para obtener el nombre del empleado, demostrando encapsulación
    public String getName() {
        return name;
    }

    // Método para obtener el ID del empleado, demostrando encapsulación
    public String getId() {
        return id;
    }

    // Método abstracto que será sobrescrito en subclases
    public abstract void performDuties();
}
