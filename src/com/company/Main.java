package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Podaj ilość liczb do posortowania");

        ArrayOfNumbersToSort arrayOfNumbersToSort = new ArrayOfNumbersToSort();
        System.out.println("Wprowadz liczb");
        System.out.println(arrayOfNumbersToSort.userInputListMethod());
        System.out.println(arrayOfNumbersToSort.sortedArray());
        System.out.println(arrayOfNumbersToSort.sortedBubleArray());
    }
}
