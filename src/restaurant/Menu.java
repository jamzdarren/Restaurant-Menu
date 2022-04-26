package restaurant;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Menu {
    // properties/fields
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    // constructors
    public Menu() {
        this.menuItems = menuItems;
    }

    // getters/setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // methods
    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
    public void removeItem(MenuItem menuItem) {
        menuItems.remove(menuItem);
    }
    public void isNew(MenuItem menuItem) {
        menuItems.remove(menuItem);
        this.lastUpdated = LocalDateTime.now();
    }

}