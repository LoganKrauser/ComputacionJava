import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tema10 {


    public static void main(String[] args) {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        try {

            System.out.println("Ingrese números separados por coma (ej. 3,5,6,7,2):");
            String input = reader.readLine();
            double average = calculateAverage(input);

            System.out.println("La media es: " + average);

        } catch (IOException e) {

            // Captura excepciones relacionadas con problemas de I/O.
            System.err.println("Error al leer la entrada: " + e.getMessage());

        } catch (NumberFormatException e) {

            // Captura excepciones cuando la conversión de String a número falla.
            System.err.println("Por favor, ingrese solo números separados por comas: " + e.getMessage());

        } catch (ArithmeticException e) {

            // Captura excepciones específicas como división por cero.
            System.err.println("Error matemático: " + e.getMessage());
        }
    }


    static double calculateAverage(String input) throws NumberFormatException, ArithmeticException {

        if (input == null || input.isEmpty()) {

            throw new ArithmeticException("No se proporcionaron datos.");

        }


        String[] numbers = input.split(",");
        double sum = 0;
        for (String number : numbers) {

            sum += Double.parseDouble(number.trim());  // Puede lanzar NumberFormatException

        }

        if (numbers.length == 0) {

            throw new ArithmeticException("No se puede dividir por cero.");

        }


        return sum / numbers.length;  // Puede lanzar ArithmeticException si numbers.length es cero


    }
}