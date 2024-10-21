package controllers;

import views.Vista; 
import models.Person;

public class Controller {

    private Vista view; 
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    private Person[] personas;

    public Controller(Vista view, SortingMethods sortingMethods, SearchMethods searchMethods) {
        this.view = view;                        
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
        System.out.println("Controller Created");                        
    }

    public void start() {
        int opcion = 0;
        do {
            opcion = view.showMenu(); 
            switch (opcion) {
                case 1:
                    inputPersons();
                    break;

                case 100:
                    System.out.println("Adios");
                    break; 

                default:
                    System.out.println("Opcion No valida");
                    break; 
            }
        } while (opcion != 0); 
    }

    public void inputPersons() {
        System.out.println("Ingrese el numero de personas");
        int numeroPersonas = view.inputInt("Ingrese el numero de personas");
        personas = new Person[numeroPersonas];
        for (int i = 0; i < numeroPersonas; i++) {
            personas[i] = view.inputPerson(); 
        }
    }

    public void addPerson(){
        int numeroPersonas = view.inputInt("Ingres el numero de personas a adicionar");
        Person[] personasTotales = new Person[personas.length + numeroPersonas];
        for (int i = 0 ; i < personas.length; i++){

            Person personTot = personas[i];
            
        }
    }
}
