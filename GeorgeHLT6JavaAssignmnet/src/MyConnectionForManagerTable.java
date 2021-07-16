
//Only DB Connection
import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionForManagerTable {
    public static Connection connect()
    {
        Connection con = null;
        try
        {
        String URL = "jdbc:mysql://localhost:3306/george";//DB location
        String user = "root";//DB user name
        String pwd = "Wisconsin2019+";//DB password
        
        con = DriverManager.getConnection(URL , user , pwd);           
        }//try ends
        catch(Exception ex)
        {
            System.out.println("DataBase Error :"+ex);
        }//catch ends
        
        return con;
        
    }//main ends
}//class ends

