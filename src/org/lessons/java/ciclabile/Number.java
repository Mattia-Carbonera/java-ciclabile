package org.lessons.java.ciclabile;

import java.util.ArrayList;
import java.util.Iterator;

public class Number {
    private int[] numbers;
    private ArrayList<Integer> num = new ArrayList<>();
    private Iterator<Integer> iterator;
    private Integer currentNumber;

    // * costruttore
    public Number(int[] numbers) {
        this.numbers = numbers;

        for (int i = 0; i < numbers.length; i++) {
            num.add(numbers[i]);
        }

        this.iterator = num.iterator();
    }

    
    public void getNumbers() {
        if (iterator.hasNext()) {
            currentNumber = iterator.next();
            System.out.println("Prossimo numero: " + currentNumber);
        } else {
            System.out.println("Non ci sono più numeri");
        }
    }

    public void hasAncoraElementi() {
        System.out.println("Sono presenti altri numeri oltre a questo: " + iterator.hasNext());
    }

    public void addElemento(int numberToAdd) {
        num.add(numberToAdd);

        System.out.println("è stato inserito il numero: " + numberToAdd);
        System.out.println("La nuova lista: " + num);
        
        // aggiorno l'array
        int[] newArray = new int[num.size()];
        for(int i = 0; i < num.size(); i++) {
            newArray[i] = num.get(i);
        }
        this.numbers = newArray;
    }

    public void debug() {
        System.out.println("");
        System.out.println("-------------------------- debug --------------------------");
        System.out.println("num length: " + num.size());
        System.out.println("num content: " + num);

        System.out.println("numbers length: " + numbers.length);
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("numbers at index " + i + ": " + numbers[i]);
        }
    }

}
