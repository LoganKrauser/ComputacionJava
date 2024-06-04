package Tema13;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {


        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        // Ejemplo de clase anónima
        Consumer<Person> anonClassConsumer = new Consumer<Person>() {
            @Override
            public void accept(Person p) {
                System.out.println("Anonymous Class: " + p.getName());
            }
        };

        // Ejemplo de expresión lambda
        Consumer<Person> lambdaConsumer = p -> System.out.println("Lambda Expression: " + p.getName());

        // Ejemplo de interfaz funcional y método de referencia a método de instancia
        Consumer<Person> methodRefInstance = Person::printInfo;

        // Ejemplo de método de referencia a método de clase
        Function<String, Integer> methodRefStatic = Integer::parseInt;

        // Ejemplo de constructor de referencia
        Supplier<Person> personSupplier = Person::new; // Aquí se requiere un constructor por defecto o una adaptación funcional

        Supplier<Double> randomValue = () -> Math.random();
        Double value = randomValue.get();

        // Utilizar java.util.function.Consumer para procesar la lista con diferentes enfoques
        people.forEach(anonClassConsumer); // Usando clase anónima
        people.forEach(lambdaConsumer);    // Usando expresión lambda
        people.forEach(methodRefInstance); // Usando método de referencia a instancia

        // Usar la función para convertir una cadena a entero
        int number = methodRefStatic.apply("123");
        System.out.println("Converted string to integer using method reference: " + number);

        // Crear una nueva persona usando el constructor de referencia
        // Aquí asumimos un constructor adicional adecuado para la interfaz
        // Person newPerson = personSupplier.get();
        // System.out.println("Created new person: " + newPerson.getName());
    }
}