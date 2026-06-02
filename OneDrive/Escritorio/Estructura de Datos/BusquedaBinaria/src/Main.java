import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de personas que va a listar; ");
        int cantidad = sc.nextInt();
        sc.nextLine();

        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese Persona:");

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            int edad;

            do {
                System.out.print("Edad: ");
                edad = sc.nextInt();
                sc.nextLine();

                if (edad < 0) {
                    System.out.println("La edad no debe ser negativa.");
                }

            } while (edad < 0);

            personas[i] = new Persona(nombre, edad);
        }

        Arrays.sort(personas, Comparator.comparingInt(Persona::getEdad));

        System.out.print("Valor de la persona de la edad: ");
        int edadBuscar = sc.nextInt();

        Persona encontrada = BusquedaBinaria.buscarPorEdad(personas, edadBuscar);

        if (encontrada != null) {
            System.out.println("La persona con la edad " + edadBuscar + " es " + encontrada.getNombre());
        } else {
            System.out.println("No existe una persona con la edad " + edadBuscar);
        }

        sc.close();
    }
}