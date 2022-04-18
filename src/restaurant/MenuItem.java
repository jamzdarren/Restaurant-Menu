package restaurant;

public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private boolean newItem;

    public MenuItem(Double price, String description, String category, boolean newItem) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }
}