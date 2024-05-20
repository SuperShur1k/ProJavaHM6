package org.example.lesson6.ls6hm.task2;

import java.util.ArrayList;
import java.util.List;


// Напишите метод, принимащий два массива целых и возвращающий список из общих элементов этих массивов.
//
//
//Например: [1, 2, 5, 5, 8, 9, 7, 10], [1, 0, 6, 15, 6, 4, 7, 0] -> {1, 7}
public class Ints {
    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>(
                List.of(
                        1, 2, 5, 5, 8, 9, 7, 10
                )
        );

        List<Integer> a2 = new ArrayList<>(
                List.of(
                        1, 0, 6, 15, 6, 4, 7, 0
                )
        );

        System.out.println(findCommonElements(a1, a2));
    }//main

    public static List<Integer> findCommonElements(List<Integer> a, List<Integer> b){
        List<Integer> commonElements = new ArrayList<>();

        for (Integer num : a) {
            if (b.contains(num) && !commonElements.contains(num)) {
                commonElements.add(num);
            }
        }
        return commonElements;
    }

}
