package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayOfNumbersToSort {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    ArrayList<Integer> userInputList = new ArrayList<>();

    public ArrayList<Integer> userInputListMethod(){

        for (int i = 1; i<=n; i++){
            int m = scanner.nextInt();
            userInputList.add(m);
        }
        return userInputList;
    }

    public ArrayList<Integer> sortedArray(){
        Collections.sort(userInputList);
        return userInputList;
    }

    public ArrayList<Integer> sortedBubleArray(){       //bąbelkowe sortowanie listy
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (userInputList.get(j) > userInputList.get(j+1)) {
                    int temp = userInputList.get(j);
                    userInputList.set(j, j+1);
                    userInputList.set(j+1,temp);
                }
            }
        }
        return userInputList;
    }

}
