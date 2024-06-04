import java.io.*;
import java.nio.file.*;

public class Tema12 {
    public static void main(String[] args) {


        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";
        String appendText = "Este es un texto adicional. que se va a agregar al final";


        // Copiar un archivo utilizando FileReader y FileWriter.
        copyFileUsingFileReaderWriter(sourceFile, destinationFile);

        // Añadir texto al final de un archivo utilizando FileWriter.
        appendToFileUsingFileWriter(destinationFile, appendText);

        // Crear un nuevo archivo y escribir texto en él utilizando la API de NIO2.
        String newFile = "newFile.txt";
        createAndWriteFileUsingNIO2(newFile, "Contenido inicial del archivo.\n");

        // Leer y mostrar el contenido de un archivo.
        readFileUsingBufferedReader(newFile);
    }

    private static void copyFileUsingFileReaderWriter(String source, String destination) {
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destination))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void appendToFileUsingFileWriter(String file, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.write(text);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createAndWriteFileUsingNIO2(String file, String text) {
        Path path = Paths.get(file);
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardOpenOption.CREATE, StandardOpenOption.APPEND)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFileUsingBufferedReader(String file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}