package restaurant;

public class MenuItem {
    // properties/fields
    private String name;
    private Double price;
    private String description;
    private String category;
    private boolean newItem;

    // constructors
    public MenuItem(String name, Double price, String description, String category, boolean newItem) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.newItem = newItem;
    }

    // getters/setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNewItem() {
        return newItem;
    }
    public void setNewItem(boolean newItem) {
        this.newItem = newItem;
    }
}