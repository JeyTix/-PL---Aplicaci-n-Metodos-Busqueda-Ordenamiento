import controllers.*;
import views.View;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Crear vista
        View vista = new View();

        // Crear las clases con los métodos
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        // Crear controlador
        Controller controller = new Controller(vista, sortingMethods, searchMethods);

        // Iniciar aplicación
        controller.start();
    }
}
