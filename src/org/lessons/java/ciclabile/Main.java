package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Number firstArray = new Number(arr);
        firstArray.getNumbers();
        firstArray.getNumbers();
        firstArray.getNumbers();
        firstArray.getNumbers();
        firstArray.getNumbers();
        firstArray.getNumbers();
        firstArray.getNumbers();
        firstArray.getNumbers();
        firstArray.getNumbers();
        firstArray.getNumbers();

        
        firstArray.hasAncoraElementi();

        firstArray.addElemento(10);
        firstArray.addElemento(11);
        firstArray.addElemento(12);

        firstArray.debug();

    }
}
