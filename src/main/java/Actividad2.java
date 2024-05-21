public class Actividad2 {

    public static void main(String[] args) {
        String tienda = "Tienda Central";
        int[] visitasDiarias = {120, 135, 150, 145, 160, 178, 165}; // Visitas de lunes a domingo

        // Encuentra el día con el máximo número de visitas
        int maxVisitas = encontrarMaximoVisitas(visitasDiarias);
        String diaMaximo = encontrarDiaMaximo(visitasDiarias, maxVisitas);

        // Imprime los resultados
        System.out.println("Reporte de " + tienda);
        System.out.println("Visitas diarias:");
        for (int i = 0; i < visitasDiarias.length; i++) {
            System.out.println("Día " + (i+1) + ": " + visitasDiarias[i] + " visitas");
        }
        System.out.println("El día con más visitas fue: " + diaMaximo + " con " + maxVisitas + " visitas.");
    }

    public static int encontrarMaximoVisitas(int[] visitas) {
        int maximo = visitas[0];
        for (int visita : visitas) {
            if (visita > maximo) {
                maximo = visita;
            }
        }
        return maximo;
    }

    public static String encontrarDiaMaximo(int[] visitas, int maximo) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (int i = 0; i < visitas.length; i++) {
            if (visitas[i] == maximo) {
                return dias[i];
            }
        }
        return "No disponible";
    }

}
