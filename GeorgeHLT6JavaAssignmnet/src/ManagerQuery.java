import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ManagerQuery {
    //1. insert -> int
    public int insert(int mid, String fullname, String shift, int salary)
    {
        int row_insert = 0;
        try
        {
            Connection con = MyConnectionForManagerTable.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "insert into student(mid,fullname,shift,salary) values("+mid+" , '"+fullname+"' , '"+shift+"' , "+salary+")";
            
            row_insert = stmt.executeUpdate(qry);
            
        }
        catch(Exception ex)
        {
            System.out.println("Insert Error :"+ex);
        }
        
        return row_insert;
    }
    
     //2. select -> void
    public void display()
    {
        try
        {
            Connection con = MyConnectionForManagerTable.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "select * from manager";
            
            ResultSet rs = stmt.executeQuery(qry);//return ResultSet-> holds all rows from table
            
            //read all data
            //next() -> check if next row is present
            while(rs.next())
            {

             
                int i = rs.getInt(1);
                String f = rs.getString(2);
                String l = rs.getString(3);
                int s = rs.getInt(4);
                
                System.out.println("MID :"+i);
                System.out.println("FULL NAME :"+f);
                System.out.println("SHIFT :"+l);
                System.out.println("SALARY :"+s);
                
                System.out.println("========================");
                
            }//while ends
            
        }
        catch(Exception ex)
        {
            System.out.println("Display Error :"+ex);
        }
    } //display ends
    
    
    
} // managerQuery class ends
