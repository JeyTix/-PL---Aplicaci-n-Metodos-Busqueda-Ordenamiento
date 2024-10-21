package views;

import java.util.Scanner;

public class View {
    private Scanner xd= new Scanner();

    public view(){
        xd=  new Scanner(System.in);
    }

    public int showMenu(){
        System.out.println("MENU");
        System.out.println("1. Ingresar personas");

        System.out.println("100. Salir");
        System.out.println("Ingrese una opcion");
        
        return ;
    }

    public int inputInt(String message){
        System.out.println(message);
        return xd.next();
    }

    public Persona inputPersons(){
        Strin name= inputName();
        int age= inputAge();

        return new Person(name,age);
    }

    public String inputName(){
        System.out.println("Ingrese el nombre: ");
        return xd.nextInt();
    }

    public String inputAge(){
        return inputInt("Ingrese la edad: ");
    }

    
    
}
