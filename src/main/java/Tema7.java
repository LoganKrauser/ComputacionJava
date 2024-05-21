public class Tema7 {

    public static void main(String[] args) {
        // Ejemplo de if-else
        int numero = 10;
        // Condicional que verifica si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }

        // Ejemplo de switch
        int dia = 3;
        // Utiliza switch para seleccionar y mostrar el nombre del día de la semana basado en el valor de dia
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día inválido");
                break;
        }

        // Ejemplo de while
        int contador = 1;
        // Bucle while que imprime el valor de contador mientras sea menor o igual a 5
        while (contador <= 5) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        // Ejemplo de do-while
        int numeroDoWhile = 1;
        // Bucle do-while que imprime el valor de numeroDoWhile al menos una vez y continúa mientras sea menor o igual a 5
        do {
            System.out.println("Número en do-while: " + numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile <= 5);

        // Ejemplo de for
        // Bucle for que imprime el valor de i desde 1 hasta 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("i en for: " + i);
        }

        // Ejemplo de foreach (usando un arreglo)
        int[] numeros = {1, 2, 3, 4, 5};
        // Bucle foreach que recorre un arreglo de enteros numeros y imprime cada valor
        for (int num : numeros) {
            System.out.println("Número en foreach: " + num);
        }

        // Ejemplo de break
        // Bucle for que imprime el valor de i desde 1 hasta 10, pero se detiene cuando i es igual a 5 debido a la instrucción break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break; // Sale del bucle cuando i es igual a 5
            }
            System.out.println("i con break: " + i);
        }


        // Declaración e inicialización de un arreglo de enteros
        int[] numerosa = {10, 20, 30, 40, 50};

        // Acceder a un elemento específico del arreglo
        System.out.println("El tercer elemento del arreglo es: " + numerosa[2]);

        // Modificar un elemento del arreglo
        numerosa[2] = 35;
        System.out.println("El tercer elemento modificado del arreglo es: " + numerosa[2]);

        // Calcular la suma de todos los elementos del arreglo
        int suma = 0;
        for (int i = 0; i < numerosa.length; i++) {
            suma += numerosa[i];
        }
        System.out.println("La suma de todos los elementos es: " + suma);

        // Iterar sobre todos los elementos del arreglo usando un bucle for-each
        System.out.println("Todos los elementos del arreglo:");
        for (int num : numerosa) {
            System.out.println(num);
        }


    }

}
