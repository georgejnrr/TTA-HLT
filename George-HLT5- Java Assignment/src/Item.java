
public class Item {
    // declaring variables
    String itemid;
    String dish;
    double price;
    String category;

    
    // default constructor
    public Item() {
        
       this.itemid = "F001";
       this.dish = "Jollof Rice";
       this.price = 250.00;
       this.category = "Food";
    }

    
    //paratermerized constructor
    public Item(String itemid, String dish, double price, String category) {
        this.itemid = itemid;
        this.dish = dish;
        this.price = price;
        this.category = category;
    } // end of paratermerized constructor
    
    //set and get 

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    } // end of set and get
    
    
    
    
    
}//end of class
