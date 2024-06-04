package employee_management;

// Clase para un empleado "Developer", también hereda de Employee
class Developer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Developer(String name, String id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementación concreta de las tareas de un desarrollador
    @Override
    public void performDuties() {
        System.out.println("Escribe código y soluciona bugs.");
    }

    // Polimorfismo y overriding: Implementación específica para calcular el salario de un desarrollador
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
