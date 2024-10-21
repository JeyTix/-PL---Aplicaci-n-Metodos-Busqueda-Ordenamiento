package views;

import java.util.Scanner;
import models.Persona;

public class View {
    private Scanner xd;

    // Constructor corregido
    public View() {
        xd = new Scanner(System.in);
    }

    // Mostrar el menú
    public int showMenu() {
        System.out.println("MENU");
        System.out.println("1. Ingresar personas");
        System.out.println("2. Adicionar personas");
        System.out.println("100. Salir");
        System.out.print("Ingrese una opcion: ");
        return xd.nextInt(); // Retorna la opción elegida
    }

    // Método para ingresar enteros con un mensaje
    public int inputInt(String message) {
        System.out.print(message);
        return xd.nextInt(); // Lee un entero
    }

    // Método para crear una Persona
    public Persona inputPersons() {
        String name = inputName();
        int age = inputAge();
        return new Persona(name, age); // Crea y retorna un objeto Persona
    }

    // Método para ingresar el nombre
    public String inputName() {
        System.out.print("Ingrese el nombre: ");
        return xd.next(); // Lee una cadena
    }

    // Método para ingresar la edad
    public int inputAge() {
        return inputInt("Ingrese la edad: ");
    }

    // Método para mostrar un mensaje
    public void showMessage(String message) {
        System.out.println(message); // Corrige el mensaje pasado como parámetro
    }

    // Método para seleccionar el método de ordenamiento
    public int selectSortingMethods() {
        System.out.println("***** Ingrese la condicion a ordenar *****");
        System.out.println("1. Por nombre");
        System.out.println("2. Por edad");
        System.out.print("Ingrese una opcion: ");
        return xd.nextInt(); // Lee y retorna la opción ingresada
    }
}
