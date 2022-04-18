package restaurant;

import java.util.Date;

public class Menu {
    private MenuItem[] menuItems;
    private Date lastUpdated;

    public Menu(MenuItem[] menuItems, String lastUpdated) {
        this.menuItems = menuItems;
        this.lastUpdated = lastUpdated;
    }
}
