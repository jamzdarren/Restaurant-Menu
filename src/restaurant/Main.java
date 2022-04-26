package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Menu jacquesMenu = new Menu();

        System.out.println("Jacques Cafe Menu");

        while (true) {
            System.out.println("\nEnter number choice: 1) View Menu 2) View Item 3) Add New Item 4) Remove Item");
            String choice = in.nextLine();

            if (choice == null) {
                break;
            } else if (choice.equals("3")) {
                System.out.println("Name: ");
                String name = in.nextLine();
                System.out.println("Price: ");
                Double price = Double.valueOf(in.nextLine());
                System.out.println("Description: ");
                String description = in.nextLine();
                System.out.println("Category: ");
                String category = in.nextLine();
                MenuItem newItem = new MenuItem(name, price, description, category);
                jacquesMenu.addItem(newItem);
            } else if (choice.equals("1")) {
                for (int i = 0; i < jacquesMenu.size(); i++) System.out.println(jacquesMenu.get(i));
            }
        }





//        MenuItem item1 = new MenuItem("Caesar Salad", 6.50, "Romaine lettuce, shaved cheese, and tangy caesar dressing.", "Appetizer");
////        Menu menu = new Menu(item1);
////        menu.addNewItem(item1);
//        System.out.println(item1.getName());
//        System.out.println(item1.isLastUpdated());
    }
}
