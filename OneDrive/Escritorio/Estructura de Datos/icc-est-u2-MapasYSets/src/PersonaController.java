import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;


public class PersonaController {

    public Set<Persona> filtrarYOrdenar(List<Persona> personas, int umbral) {
        
        // Usamos un TreeSet pasándole un Comparator. 
     // El TreeSet usa este Comparator tanto para ORDENAR como para decidir la UNICIDAD.
        Set<Persona> resultado = new TreeSet<>(new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                // 1. Prioridad: Edad descendente (mayor a menor)
                if (p1.getEdad() != p2.getEdad()) {
                    return Integer.compare(p2.getEdad(), p1.getEdad()); 
                }
                
                // 2. Si la edad es igual: Nombre ascendente (case-insensitive)
                // OJO: Si este método devuelve 0, el TreeSet asume que los objetos son DUPLICADOS y no añade el segundo.
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
            }
        });

        // Iteramos manualmente ya que no podemos usar Streams
        for (Persona p : personas) {
            // Solo consideramos personas con edad mayor o igual al umbral
            if (p.getEdad() >= umbral) {
                resultado.add(p); // El TreeSet automáticamente lo ordena o lo descarta si es duplicado
            }
        }

        return resultado;
    }

    // ==========================================
    // Método B: Agrupar por Rango de Edad
    // ==========================================
    public Map<String, Set<String>> agruparPorRangoEdad(List<Persona> personas) {
        
        // Usamos un TreeMap porque las claves del mapa ("ADULTO", "JOVEN", "MAYOR") 
        // deben estar ordenadas alfabéticamente de forma automática.
        Map<String, Set<String>> mapa = new TreeMap<>();

        // Iteración manual
        for (Persona p : personas) {
            // Determinamos el rango etario
            String categoria;
            if (p.getEdad() < 30) {
                categoria = "JOVEN";
            } else if (p.getEdad() < 60) {
                categoria = "ADULTO";
            } else {
                categoria = "MAYOR";
            }

            // Extraemos solo el primer nombre dividiendo por espacios
            String primerNombre = p.getNombre().split(" ")[0];

            // Si la categoría aún no existe en el mapa, la creamos
            if (!mapa.containsKey(categoria)) {
                // Usamos LinkedHashSet porque garantiza unicidad de nombres 
                // Y ADEMÁS respeta el orden de inserción (aparición en la lista original).
                mapa.put(categoria, new LinkedHashSet<>());
            }

            // Añadimos el primer nombre al Set correspondiente
            mapa.get(categoria).add(primerNombre);
        }

        return mapa;
    }
}