package org.lessons.java.ciclabile;

public class Number {
    private int[] numbers;
    private int indexCurrentNumber;

    // * costruttore
    public Number(int[] numbers) {
        this.numbers = numbers;
        this.indexCurrentNumber = 0;
    }

    public Number() {
        int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        this.numbers = array;
        this.indexCurrentNumber = 0;
    }

    // * metodi
    public int getNumbers() {
        int currentNum = numbers[indexCurrentNumber];
        indexCurrentNumber++;
        return currentNum;
    }

    public boolean hasAncoraElementi() {
        return indexCurrentNumber < numbers.length ? true : false;
    }

    public void addElemento(int numberToAdd) {
        int[] newArray = new int[numbers.length + 1];
        for(int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        newArray[numbers.length] = numberToAdd;
        numbers = newArray;
        System.out.print("L'elemento '" + numberToAdd + "' è stato aggiunto correttamente, il nuovo array ora ha i seguenti vaolri: ");
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }

    public void debug() {
    }

}
