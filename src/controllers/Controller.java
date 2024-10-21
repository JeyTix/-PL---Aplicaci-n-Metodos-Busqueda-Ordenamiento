package controllers;

import models.Persona;
import views.View;;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;
    private Persona[] personas;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods){
        this.view= view;
        this.sortingMethods= sortingMethods;
        this.searchMethods= searchMethods;
        System.out.println("Controller created");
    }

    public void start(){
        int option= 0;
        do {
            option= view.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;

                case 2:
                    addPersons();
                    break;

                case 3:
                    sortPersons();
                    break;

                case 100:
                    System.out.println("Adios...");
                    break;
            
                default:
                System.out.println("Opcion no valida");
                    break;
            }
        } while (option!= 0);
    }
    
    public void inputPersons(){
        int numeroPersonas= view.inputInt("Ingrese el numero de personas: ");
        personas= new Persona[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++) {
            personas[i]= view.inputPersons();
        }
    }

    public void addPersons(){
        if(personas== null){
            inputPersons();
        } else{
            int numeroPersonas= view.inputInt("Ingrese el numero de personar a adicionar: ");
            Persona[] personasTotales= new Persona[personas.length+  numeroPersonas];
            for (int i = 0; i < personasTotales.length; i++) {
                personasTotales[i]= personas[i];
            }
            for (int i = personas.length; i < personasTotales.length; i++) {
                personas[i]= view.inputPersons();
            }

            personas= personasTotales;
        }
    }

    public void sortPersons(){
        int sortingOption= view.selectSortingMethods();
        if (sortingOption== 1) {
            sortingMethods.sortByNameBubble(personas);
        } else if (sortingOption== 2) {
            sortingMethods.sortByAgeSelection(personas);
        } else {
            view.showMessage("Opcion validad");        
        }
    }
    
    public void searchPersons(){

    }
}
