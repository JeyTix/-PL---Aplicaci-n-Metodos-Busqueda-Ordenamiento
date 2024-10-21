import controllers.*;
import views.View;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Crear vista
        View vista= new View();

        //Crear las clases con los metodos
        SortingMethods sT= new SortingMethods();
        SearchMethods sM= new SearchMethods();

        //Crear controlador
        Controller controller= new Controller(vista, sT, sM);

        //Iniciar aplicacion
        

    }
}
