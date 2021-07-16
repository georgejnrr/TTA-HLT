
public class Manager {
    String name;
    String shift;
    double salary;
    int mid;

    public Manager() {
        this.name = "Mr George";
        this.shift = "AM";
        this.salary = 35000.00;
        this.mid = 101;
        
    }//end of default constructor
    
    
    
    

    public Manager(String name, String shift, double salary, int mid) {
        this.name = name;
        this.shift = shift;
        this.salary = salary;
        this.mid = mid;
        
    } // end of parameterized constructor

    // The getter and setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    } // end of the getter and setter 
    
    
    
    
    
    
    
    
    
    
    
}// end of Manager Class
