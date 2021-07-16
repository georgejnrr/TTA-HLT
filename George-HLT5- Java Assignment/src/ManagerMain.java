
public class ManagerMain {
    public static void main(String[] args) {
        // Using a default Constructor to create an object class 
        
        Manager m1 = new Manager();
        System.out.println("Manager 1");
        m1.setMid(101);
        m1.setName("Mr George");
        m1.setSalary(35000.00);
        m1.setShift("AM");
        System.out.println("Mid "+m1.getMid());
        System.out.println("Name "+m1.getName());
        System.out.println("Salary "+m1.getSalary());
        System.out.println("Shift "+m1.getShift());

       System.out.println("==================================");    
       
       // object using Parameterized constructor

   
     
        
    } // end of main

   
  
}// end of class ManagerMain
