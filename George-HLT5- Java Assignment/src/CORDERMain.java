
public class CORDERMain {
    public static void main(String[] args) {
        
        // Using a default Constructor to create an object class
        CORDER c1 = new CORDER();
        System.out.println("CORDER 1");
        c1.setOrderid(001);
        c1.setCname("Joseph");
        c1.setPhone("0765432588");
        c1.setAddress("Birmingham");
        c1.setItemid("SB01");
        c1.setQty(25);
        c1.setTotal(2000.00);
        c1.setDate("10th June, 2021");
        
        System.out.println("Order id "+c1.getOrderid());
        System.out.println("Cname "+c1.getCname());
        System.out.println("Phone "+c1.getPhone());
        System.out.println("Address "+c1.getAddress());
        System.out.println("Item id "+c1.getItemid());
        System.out.println("Qty "+c1.getQty());
        System.out.println("Total "+c1.getTotal());
        System.out.println("Date "+c1.getDate());
        
        
        
        
        
    }// end of psvm main
    
    
    
    
    
    
}//end of CorderMain Class


