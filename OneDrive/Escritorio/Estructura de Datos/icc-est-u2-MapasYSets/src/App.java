import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Juan Pérez", 25));
        personas.add(new Persona("juan pérez", 25)); // Duplicado jejejejjejejeje
        personas.add(new Persona("María", 30));
        personas.add(new Persona("Pedro", 18));
        personas.add(new Persona("Ana", 22));
        personas.add(new Persona("Carlos", 30));
        personas.add(new Persona("Luis", 17));
        personas.add(new Persona("Marta", 45));
        personas.add(new Persona("José", 60));
        personas.add(new Persona("Lucía", 70));
        personas.add(new Persona("Miguel", 15));
        personas.add(new Persona("Sofía", 28));
        personas.add(new Persona("Diego", 35));
        personas.add(new Persona("Valentina", 55));
        personas.add(new Persona("Andrés", 65));
        personas.add(new Persona("Camila", 40));
        personas.add(new Persona("Javier", 50));    
        personas.add(new Persona("Isabella", 20));
        personas.add(new Persona("Sebastián", 33));
        personas.add(new Persona("Gabriela", 27));


        PersonaController controller = new PersonaController();

        Set<Persona> resultado = controller.filtrarYOrdenar(personas, 18);

        for (Persona p : resultado) {
            System.out.println(p);
        }
        
    }
}