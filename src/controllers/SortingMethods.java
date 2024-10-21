package controllers;

import models.Persona;

public class SortingMethods {

    public void sortByNameBubble(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (personas[j].getName().compareTo(personas[j + 1].getName()) > 0) {
                    Persona temp = personas[j];
                    personas[j] = personas[j + 1];
                    personas[j + 1] = temp;
                }
            }
        }
    }

    public void sortByAgeSelection(Persona[] personas) {
        int n = personas.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (personas[j].getAge() < personas[minIndex].getAge()) {
                    minIndex = j;
                }
            }
            Persona temp = personas[minIndex];
            personas[minIndex] = personas[i];
            personas[i] = temp;
        }
    }
}
