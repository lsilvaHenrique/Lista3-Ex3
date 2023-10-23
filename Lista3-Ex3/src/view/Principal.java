package view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Integer> L = new ArrayList<>();
        L.add(3);
        L.add(5);
        L.add(8);
        L.add(12);
        L.add(9);
        L.add(7);
        L.add(6);
        L.add(2);
        L.add(3);
        L.add(7);
        L.add(16);

        findTwoLargest(L);
    }

    public static void findTwoLargest(List<Integer> list) {
        if (list.size() < 2) {
            System.out.println("A lista não possui pelo menos dois elementos.");
            return;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : list) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        System.out.println("Maior valor: " + largest);
        System.out.println("Segundo maior valor: " + secondLargest);
    }
}

