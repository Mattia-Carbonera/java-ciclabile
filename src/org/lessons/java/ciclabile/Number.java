package org.lessons.java.ciclabile;

import java.util.HashSet;
import java.util.Iterator;

public class Number {
    private int[] numbers;
    private HashSet<Integer> num = new HashSet<>();
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
        currentNumber = iterator.next();
        System.out.println(currentNumber);
    }

    public void hasAncoraElementi() {
        System.out.println("Sono presenti altri numeri oltre a questo: " + iterator.hasNext());
    }

    public void addElemento(int numbetToAdd) {
        num.add(numbetToAdd);
        System.out.println("è stato inserito il numero: " + numbetToAdd);
        System.out.println(num);
    }

}
