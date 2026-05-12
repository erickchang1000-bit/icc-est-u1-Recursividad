public class App {

    public static void main(String[] args) throws Exception {

        Ejercicios ejercicios = new Ejercicios();

        System.out.print("Ejercicio 1 = ");

        int rest1 = ejercicios.sumaConsecutivosPasos(5);

        System.out.println(rest1);

        System.out.println("EJercicio 2 ");
        int rest2 = ejercicios.getPotencia(2, 5);
        System.out.println("Ejercicio 2 = " + rest2);

        System.out.println("Ejercicio 3 ");
    int rest3 = ejercicios.sumaDigitos(456);
    System.out.println("Ejercicio 3 = " + rest3);
    }
}