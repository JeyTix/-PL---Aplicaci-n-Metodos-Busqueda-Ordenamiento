package views;

import java.util.Scanner;
import models.Persona;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public int showMenu() {
        System.out.println("1. Ingresar personas");
        System.out.println("2. Mostrar personas");
        System.out.println("3. Ordenar personas");
        System.out.println("4. Buscar por edad");
        System.out.println("5. Buscar por nombre");
        System.out.println("100. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public int selectSortingMethods() {
        System.out.println("1. Ordenar por nombre (Burbuja)");
        System.out.println("2. Ordenar por nombre (Selección)");
        System.out.println("3. Ordenar por edad (Burbuja)");
        System.out.println("4. Ordenar por edad (Selección)");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public void displayPersons(Persona[] personas) {
        if (personas == null || personas.length == 0) {
            System.out.println("No hay personas registradas.");
            return;
        }
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

    public Persona inputPersons() {
        System.out.print("Ingrese el nombre: ");
        String name = scanner.next();
        System.out.print("Ingrese la edad: ");
        int age = scanner.nextInt();
        return new Persona(name, age);
    }

    public int inputInt(String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public String inputString(String message) {
        System.out.print(message);
        return scanner.next();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}
