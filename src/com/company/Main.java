package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayA = new ArrayList<>();
        ArrayList<String> arrayB = new ArrayList<>();
        ArrayList<String> arrayC = new ArrayList<>();

        System.out.println("введите 5 слов");
        for (int i = 0; i < 5; i++) {
            arrayA.add(scanner.next());
        }

        Iterator<String> iterator = arrayA.iterator();
        System.out.println("--------------------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("введите еще 5 слов");
        for (int i = 0; i < 5; i++) {
            arrayB.add(scanner.next());
        }
        Iterator<String> iterator1 = arrayB.iterator();
        System.out.println("-----------------------------");

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        int number = 0;
        int number1 = 4;
        System.out.println("-----------------------------");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                arrayC.add(i, arrayA.get(number));
                number++;
            } else {
                arrayC.add(i, arrayB.get(number1));
                number1--;
            }
        }

        Iterator<String> iterator2 = arrayC.iterator();

        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

        System.out.println("----------------------------");
        Collections.sort(arrayC, new LengthFirstComparator());
        Iterator<String> iterator3 = arrayC.iterator();

        while ((iterator3.hasNext())){
            System.out.println(iterator3.next());
        }



    }
}



