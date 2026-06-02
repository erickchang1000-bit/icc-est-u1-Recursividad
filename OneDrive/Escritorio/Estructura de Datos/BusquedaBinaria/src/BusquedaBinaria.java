public class BusquedaBinaria {

    public static void mostrarSubArreglo(Persona[] personas, int bajo, int alto) {

        for (int i = bajo; i <= alto; i++) {
            System.out.print(personas[i].getEdad() + " | ");
        }

        System.out.println();
    }
    public static Persona buscarPorEdad(Persona[] personas, int edadBuscar) {

        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {

            mostrarSubArreglo(personas, bajo, alto);

            int centro = (bajo + alto) / 2;
            int valorCentro = personas[centro].getEdad();

            System.out.print("bajo=" + bajo);
            System.out.print(" alto=" + alto);
            System.out.print(" centro=" + centro);
            System.out.print(" valorCentro=" + valorCentro);

            if (valorCentro == edadBuscar) {

                System.out.println(" --> ENCONTRADO");

                return personas[centro];

            } else if (edadBuscar > valorCentro) {

                System.out.println(" --> DERECHA");

                bajo = centro + 1;

            } else {

                System.out.println(" --> IZQUIERDA");

                alto = centro - 1;
            }
        }

        return null;
    }
}