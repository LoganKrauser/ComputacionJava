import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LectorArchivo {

    public static void main(String[] args) {


        // Define la ruta del archivo
        String rutaArchivo = "pacientes.txt";

        File archivo = new File(rutaArchivo);


        ArrayList<String> datos = new ArrayList<>();

        try {

            // Crear el objeto Scanner para leer el archivo
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {

                // Leer la línea del archivo
                String linea = scanner.nextLine();
                // Agregar la línea leída al ArrayList
                datos.add(linea);


            }

            scanner.close(); // Cerrar el scanner

        } catch (FileNotFoundException e) {

            System.out.println("Error: El archivo no fue encontrado.");
            e.printStackTrace();
            return;

        }

        // Mostrar los datos en pantalla

        System.out.println("Datos leídos del archivo:");

        for (String dato : datos) {

            System.out.println(dato);

        }
    }
}