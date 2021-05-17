package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
        System.out.println("введите 5 слов");
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        String fourth = scanner.next();
        String fifth = scanner.next();

        System.out.println("введите еще раз 5 слов");
        ArrayList<String> arrayA = new ArrayList<>();
        arrayA.add(first);
        arrayA.add(second);
        arrayA.add(third);
        arrayA.add(fourth);
        arrayA.add(fifth);


        Iterator<String> iterator = arrayA.iterator();
        System.out.println("--------------------------");

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        String firstb = scanner.next();
        String secondb = scanner.next();
        String thirdb = scanner.next();
        String fourthb = scanner.next();
        String fifthb = scanner.next();

        ArrayList<String> arrayB = new ArrayList<>();
        arrayB.add(firstb);
        arrayB.add(secondb);
        arrayB.add(thirdb);
        arrayB.add(fourthb);
        arrayB.add(fifthb);

        Iterator<String> iterator1 = arrayB.iterator();
        System.out.println("-----------------------------");

        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        ArrayList<String> arrayC = new ArrayList<>();
        arrayC.add(0,first);
        arrayC.add(1,fifthb);
        arrayC.add(2,second);
        arrayC.add(3,fourthb);
        arrayC.add(4,third);
        arrayC.add(5,thirdb);
        arrayC.add(6,fourth);
        arrayC.add(7,secondb);
        arrayC.add(8,fifth);
        arrayC.add(9,firstb);


        Collections.sort(arrayC, new LengthFirstComparator());

        Iterator<String> iterator2 = arrayC.iterator();
        System.out.println("----------------------------");

        while ((iterator2.hasNext())){
            System.out.println(iterator2.next());
        }


    }
}
