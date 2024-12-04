package controllers;

import models.Persona;

public class SearchMethods {
    public Persona busquedaBinAge(Persona[] personas, int valor){
        int ini= 0;
        int fin= personas.length-1;

        while (ini<=fin) {
            int medio= ini+(fin-ini)/2;

            for (int i = ini; i <= fin; i++) {
                System.out.println(personas[i].getAge()+"| ");
            }

            if (personas[medio].getAge()== valor) {
                return personas[medio];
            } else if (personas[medio].getAge()< valor) {
                ini= medio+1;
            } else {
                fin= medio-1;
            }
        }
        return null;
    }

    public Persona busquedaBinName(Persona[] personas, String valor){
        int ini= 0;
        int fin= personas.length-1;

        while (ini<= fin) {
            int medio= ini+(fin-ini)/2;

            for (int i = ini; i <= fin; i++) {
                System.out.println(personas[i].getName()+"| ");
            }

            if (personas[medio].getName().compareTo(valor)==0) {
                return personas[medio];
            } else if (personas[medio].getName().compareTo(valor)<0){
                ini= medio+1;
            } else {
                fin= medio-1;
            }
        }
        return null;
    }
}
