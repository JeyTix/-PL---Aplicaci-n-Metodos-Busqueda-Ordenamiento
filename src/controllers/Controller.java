package controllers;

import models.Persona;
import views.View;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
    private Persona[] personas;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;
        this.searchMethods = searchMethods;
        this.sortingMethods = sortingMethods;
        this.personas = new Persona[0];
        System.out.println("Controller Created");
    }

    public void start() {
        int option;
        do {
            option = view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;
                case 2:
                    view.displayPersons(personas);
                    break;
                case 3:
                    sortPersons();
                    break;
                case 4:
                    searchPersonByAge();
                    break;
                case 5:
                    searchPersonByName();
                    break;
                case 100:
                    System.out.println("Adiós");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (option != 100);
    }

    public void sortPersons() {
        int sortingOption = view.selectSortingMethods();
        if (sortingOption == 1) {
            sortingMethods.sortByNameWithBubble(personas);
        } else if (sortingOption == 2) {
            sortingMethods.sortByNameWithSelection(personas);
        } else if (sortingOption == 3) {
            sortingMethods.sortByAgeWithBubble(personas);
        } else if (sortingOption == 4) {
            sortingMethods.sortByAgeWithSelection(personas);
        } else {
            view.showMessage("Opción no válida");
        }
        view.displayPersons(personas);
    }

    public void inputPersons() {
        int numeroPersonas = view.inputInt("Ingrese el número de personas: ");
        personas = new Persona[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = view.inputPersons();
        }
    }

    public void searchPersonByAge() {
        int age = view.inputInt("Ingrese la edad a buscar: ");
        Persona result = searchMethods.busquedaBinAge(personas, age);
        if (result != null) {
            view.showMessage("Persona encontrada: " + result);
        } else {
            view.showMessage("Persona no encontrada.");
        }
    }

    public void searchPersonByName() {
        String name = view.inputString("Ingrese el nombre a buscar: ");
        Persona result = searchMethods.busquedaBinName(personas, name);
        if (result != null) {
            view.showMessage("Persona encontrada: " + result);
        } else {
            view.showMessage("Persona no encontrada.");
        }
    }
}
