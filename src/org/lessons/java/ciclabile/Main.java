package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("--------------------- fisrtArray ---------------------");
        Number firstArray = new Number(arr);
    
        System.out.println("Elemento corrente: " + firstArray.getNumbers());
        System.out.println("Elemento corrente: " + firstArray.getNumbers());
        System.out.println("Elemento corrente: " + firstArray.getNumbers());
        System.out.println("Elemento corrente: " + firstArray.getNumbers());
        System.out.println("Elemento corrente: " + firstArray.getNumbers());
        System.out.println("Elemento corrente: " + firstArray.getNumbers());
        System.out.println("Elemento corrente: " + firstArray.getNumbers());
        System.out.println("Elemento corrente: " + firstArray.getNumbers());
        // System.out.println("Elemento corrente: " + firstArray.getNumbers());
        
        // * Reset currentNumber
        // firstArray.resetCurrentNumber();
        // System.out.println("-- Dopo reset --");
        // System.out.println("Elemento corrente: " + firstArray.getNumbers());
        // System.out.println("Elemento corrente: " + firstArray.getNumbers());
        // System.out.println("Elemento corrente: " + firstArray.getNumbers());
        // System.out.println("Elemento corrente: " + firstArray.getNumbers());



        System.out.println("Ci sono ancora elementi? " + (firstArray.hasAncoraElementi() == true ? "Si, ci sono altri elementi" : "No, non ci sono altri elementi"));

        firstArray.addElemento(10);
        System.out.println("");


        System.out.println("--------------------- secondArray ---------------------");
        Number secondArray = new Number();
    
        System.out.println("Elemento corrente: " + secondArray.getNumbers());
        System.out.println("Elemento corrente: " + secondArray.getNumbers());
        System.out.println("Elemento corrente: " + secondArray.getNumbers());
        System.out.println("Elemento corrente: " + secondArray.getNumbers());
        System.out.println("Elemento corrente: " + secondArray.getNumbers());
        System.out.println("Elemento corrente: " + secondArray.getNumbers());
        System.out.println("Elemento corrente: " + secondArray.getNumbers());
        System.out.println("Elemento corrente: " + secondArray.getNumbers());
        // System.out.println("Elemento corrente: " + secondArray.getNumbers());


        System.out.println("Ci sono ancora elementi? " + (secondArray.hasAncoraElementi() == true ? "Si, ci sono altri elementi" : "No, non ci sono altri elementi"));

        secondArray.addElemento(10);
        System.out.println("");

    }
}
