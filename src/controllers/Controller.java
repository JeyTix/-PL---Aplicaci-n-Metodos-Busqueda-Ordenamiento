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
            option= View.showMenu();
            switch (option) {
                case 1:
                    inputPersons();
                    break;

                case 2:
                    addPersons();
                    break;

                case 3:

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
        int numeroPersonas= view.inputInt("Ingrese el numero de personar a adicionar: ");
        Persona[] personasTotales= new Persona[personas.length+  numeroPersonas];
        for (int i = 0; i < personasTotales.length; i++) {
            personasTotales[i]= personas[i];
        }
        
    }

    public void sortPersons(){

    }
    
    public void searchPersons(){

    }
}
