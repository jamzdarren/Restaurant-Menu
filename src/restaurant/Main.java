package restaurant;

public class Main {
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("Caesar Salad", 6.50, "Romaine lettuce, shaved cheese, and tangy caesar dressing.", "Appetizer", true);
//        Menu menu = new Menu(item1);
//        menu.addNewItem(item1);
        System.out.print(item1.getName());
    }
}
