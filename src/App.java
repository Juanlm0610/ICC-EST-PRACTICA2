import controllers.SearchMethods;
import controllers.SortingMethods;
import views.Vista;
import controllers.Controller; // Asegúrate de que este import sea correcto

public class App {
    public static void main(String[] args) throws Exception {
        Vista vista = new Vista();

        // Crear Clases Métodos Ordenamiento y Búsqueda
        SortingMethods sortingMethods = new SortingMethods();
        SearchMethods searchMethods = new SearchMethods();

        // Crear Controlador
        Controller controller = new Controller(null, sortingMethods, searchMethods);
    }
}
