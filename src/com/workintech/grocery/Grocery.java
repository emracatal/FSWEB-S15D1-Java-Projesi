package com.workintech.grocery;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Grocery {

    private static String getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static boolean checkItemsInList(List<String> groceryList, String item) {
        return groceryList.contains(item.trim());
    }

    public static void printSortedList(List<String> items) {
        Collections.sort(items);
        System.out.println(items);
    }

    public static void addItems(List<String> groceryList) {
        System.out.println("Enter item/s to be added:");
        String input = getInput();
        if (input.contains(",")) {
            String[] elements = input.split(",");
            for (String element : elements) {
                if (element != null &&
                        !element.trim().isEmpty() &&
                        !checkItemsInList(groceryList, element)) {
                    groceryList.add(element.toLowerCase().trim());
                } else {
                    System.out.println(element+" already exist!");
                }
            }
        } else {
            if (input != null &&
                    !input.trim().isEmpty() &&
                    !checkItemsInList(groceryList, input)) {
                groceryList.add(input.toLowerCase().trim());
            }
        }
        printSortedList(groceryList);
    }

    public static void removeItems(List<String> groceryList) {
        System.out.println("Enter item/s to be removed:");
        String input = getInput();
        if (input.contains(",")) {
            String[] elements = input.split(",");
            for (String element : elements) {
                if (element != null &&
                        !element.trim().isEmpty() &&
                        checkItemsInList(groceryList, element)) {
                    groceryList.remove(element.toLowerCase().trim());

                } else {
                    System.out.println(element+" is not exist!");
                }
            }
        } else {
            if (input != null &&
                    !input.trim().isEmpty() &&
                    checkItemsInList(groceryList, input)) {
                groceryList.remove(input.toLowerCase().trim());
            }
        }
        printSortedList(groceryList);
    }
}
