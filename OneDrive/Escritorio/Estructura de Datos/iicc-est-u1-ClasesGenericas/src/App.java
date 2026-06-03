import models.Caja;
import models.Par;

public class App {
    public static void main(String[] args) {

        System.out.println("=== PRÁCTICA DE CLASES GENÉRICAS ===");

        System.out.println("\n--- Uso de Caja<T> ---");

        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Hola mundo");

        Caja<Integer> cajaEntero = new Caja<>();
        cajaEntero.guardar(100);

        Caja<Double> cajaDecimal = new Caja<>();
        cajaDecimal.guardar(9.75);

        System.out.println("Caja de texto: " + cajaTexto.obtener());
        System.out.println("Caja de entero: " + cajaEntero.obtener());
        System.out.println("Caja de decimal: " + cajaDecimal.obtener());

        System.out.println("¿La caja de texto está vacía?: " + (cajaTexto.obtener() == null));

        System.out.println("\n--- Uso de Par<K, V> ---");

        Par<Integer, String> par1 = new Par<>(1, "Juan Pérez");
        Par<String, Integer> par2 = new Par<>("Edad", 20);
        Par<String, Double> par3 = new Par<>("Promedio", 8.75);

        System.out.println("Clave: " + par1.obtenerClave() + " | Valor: " + par1.obtenerValor());
        System.out.println("Clave: " + par2.obtenerClave() + " | Valor: " + par2.obtenerValor());
        System.out.println("Clave: " + par3.obtenerClave() + " | Valor: " + par3.obtenerValor());
    }
}