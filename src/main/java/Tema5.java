public class Tema5 {

    public static void main(String[] args) {
        // Tipos de datos primitivos
        byte b = 10;        // byte: 8 bits, rango de -128 a 127
        short s = 20000;    // short: 16 bits, rango de -32768 a 32767
        int i = 100000;     // int: 32 bits, rango de -2^31 a 2^31-1
        long l = 100000L;   // long: 64 bits, rango de -2^63 a 2^63-1
        float f = 5.75f;    // float: 32 bits, rango de aproximadamente ±3.4E+38 (precisión simple)
        double d = 19.99;   // double: 64 bits, rango de aproximadamente ±1.8E+308 (precisión doble)
        char c = 'A';       // char: 16 bits, un solo carácter Unicode
        boolean bool = true;// boolean: 1 bit, valores true o false

        // Declaración de variables
        int numero1 = 5;
        int numero2 = 10;

        // Operadores
        int suma = numero1 + numero2;           // Operador de suma
        int resta = numero2 - numero1;          // Operador de resta
        int multiplicacion = numero1 * numero2; // Operador de multiplicación
        int division = numero2 / numero1;       // Operador de división
        int modulo = numero2 % numero1;         // Operador de módulo (residuo de la división)

        // String
        String saludo = "Hola, Mundo";          // Declaración e inicialización de una cadena de caracteres

        // Typecasting (conversiones de tipo)
        double numeroDouble = 9.78;
        int numeroInt = (int) numeroDouble;     // Typecasting de double a int, se trunca el valor decimal

        // Salida con System.out
        System.out.println("Tipos de datos primitivos:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        System.out.println("\nOperadores:");
        System.out.println("Suma: " + numero1 + " + " + numero2 + " = " + suma);
        System.out.println("Resta: " + numero2 + " - " + numero1 + " = " + resta);
        System.out.println("Multiplicación: " + numero1 + " * " + numero2 + " = " + multiplicacion);
        System.out.println("División: " + numero2 + " / " + numero1 + " = " + division);
        System.out.println("Módulo: " + numero2 + " % " + numero1 + " = " + modulo);

        System.out.println("\nString:");
        System.out.println(saludo);

        System.out.println("\nTypecasting:");
        System.out.println("double: " + numeroDouble);
        System.out.println("int (después del typecasting): " + numeroInt);
    }

}
