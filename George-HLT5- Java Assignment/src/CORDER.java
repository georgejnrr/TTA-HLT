
public class CORDER {

    int orderid;
    String cname;
    String phone;
    String address;
    String itemid;
    int qty;
    double total;
    String date;
            
    
    // default constructor
    public CORDER() {
        this.orderid = 001;
        this.cname = "Joseph";
        this.phone ="0765432588";
        this.address = "Birmingham";
        this.itemid = "SB01";
        this.qty = 25;
        this.total = 2000.00;
        this.date ="10th June, 2021";
        
    } //end of default constructor
    
    // Parameterized Constructor with values

    public CORDER(int orderid, String cname, String phone, String address, String itemid, int qty, double total, String date) {
        this.orderid = orderid;
        this.cname = cname;
        this.phone = phone;
        this.address = address;
        this.itemid = itemid;
        this.qty = qty;
        this.total = total;
        this.date = date;
    } // end of parameterized constructor
    
    
    // set and getter for CORDER

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    } // end of set and get 
    
     
    
    
}// end of class
