package employee_management;

// Clase para un empleado de tipo "Manager", hereda de Employee y especifica detalles adicionales
class Manager extends Employee {
    private double baseSalary; // Encapsulación: Detalle interno sobre el salario

    public Manager(String name, String id, double baseSalary) {
        super(name, id);
        this.baseSalary = baseSalary;
    }

    // Implementación concreta de las tareas de un gerente
    @Override
    public void performDuties() {
        System.out.println("Maneja las operaciones diarias y coordina entre departamentos.");
    }

    // Polimorfismo y overriding: Implementación específica para calcular el salario de un gerente
    @Override
    public double calculateSalary() {
        return baseSalary + (baseSalary * 0.15); // 15% de bonificación
    }
}
