
public class ItemMain {
   
    public static void main(String[] args) {
       
         // Using a default Constructor to create an object class
         
        Item i1 = new Item();
        System.out.println("Item 1");
        i1.setItemid("F001");
        i1.setDish("Jollof Rice");
        i1.setPrice(250.00);
        i1.setCategory("Food");
        
        
        System.out.println("Item Id "+i1.getItemid());
        System.out.println("Dish "+i1.getDish());
        System.out.println("Price "+i1.getPrice());
        System.out.println("Category "+i1.getCategory());
        
        
    
        
        
        
        
    }//end of main
    
    
    
    
}//end of class
