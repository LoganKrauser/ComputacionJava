package employee_management;


// Clase principal para ejecutar el ejemplo
public class Main {
    public static void main(String[] args) {
        Employee manager = new Manager("John Doe", "M001", 5000);
        Employee developer = new Developer("Jane Smith", "D001", 50, 160);

        // Polimorfismo: Aunque ambos son empleados, cada uno calcula su salario de manera diferente
        System.out.println(manager.getName() + " earns: $" + manager.calculateSalary());
        System.out.println(developer.getName() + " earns: $" + developer.calculateSalary());

        // Ejemplo de llamada a métodos específicos de la clase
        manager.performDuties();
        developer.performDuties();
    }
}