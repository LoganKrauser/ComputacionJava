import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Tema9 {

    public static void main(String[] args) {
        // Procesar los argumentos recibidos desde la línea de comandos
        int argSum = 0;
        if (args.length > 0) {
            System.out.println("Sumando valores de argumentos...");
            for (String arg : args) {
                argSum += Integer.parseInt(arg);  // Convertir cada argumento a int y sumar
            }
            System.out.println("Suma de argumentos: " + argSum);
        } else {
            System.out.println("No se recibieron argumentos desde la línea de comandos.");
        }

        // Crear un BufferedReader para leer la entrada del usuario
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Usando BufferedReader para obtener el primer número
            System.out.println("Ingrese el primer número (BufferedReader): ");
            String input1 = reader.readLine();
            int number1 = Integer.parseInt(input1);  // Typecasting de String a int

            // Crear un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Usando Scanner para obtener el segundo número
            System.out.println("Ingrese el segundo número (Scanner): ");
            int number2 = scanner.nextInt();  // Scanner ya proporciona un método para leer int

            // Cálculo de la suma de los números ingresados y los argumentos
            int totalSum = number1 + number2 + argSum;

            // Imprimir el resultado usando la salida estándar
            System.out.println("La suma total de " + number1 + " y " + number2 + " más la suma de argumentos es " + totalSum);
        } catch (IOException e) {
            System.out.println("Error al leer desde la consola. + " + e.toString());
        }
    }
}