package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    // properties/fields
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    // constructors
    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    // getters/setters
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
    public void setMenuItems(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void addNewItem(MenuItem menuItem) {
        menuItems.add(menuItem);
        this.lastUpdated = null;
    }
}