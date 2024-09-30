public class Notas {   
    public static void main(String[] args) {

        System.out.println("Introduce las notas de los alumnos: ");
        double nota;
        int alumnos = 30;

        for (int i = 0; i <= alumnos; i++) {
            nota = Double.parseDouble(System.console().readLine());
            if (nota < 0 || nota > 10) {
                System.out.println("Nota no válida");
            } else if (nota < 5) {
                System.out.println("Suspenso");
            } else if (nota >= 5) {
                System.out.println("Aprobado");
            }
        }       
    }
}
