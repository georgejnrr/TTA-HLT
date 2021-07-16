
package com.tta.model;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement; // pre-complied statement


public class StudentQuery {
    
    //1. Insert Student record
    public static int insert(Student s)
    {
        
        Connection con = MyConnection.connect();
           int row_insert =0;
       try{
           String qry = "insert into student(sid, firstName, lastName,score) values(?,?,?,?)";
           PreparedStatement stmt = con.prepareStatement(qry);
          
           //setting column values in student table
           stmt.setInt(1, s.getSid());
            stmt.setString(2, s.getFirstName());
            stmt.setString(3, s.getLastName());
            stmt.setInt(4, s.getScore());
            
            row_insert = stmt.executeUpdate();
           
           
           
       } // try ends
       
       catch(Exception ex)
       {
           System.out.println("Insert error : "+ex); // print error on server logs
           
       } // catch ends
        
        return row_insert;
        
        
    } //insert ends
    
     public static int update(int sid , int score)
    {
        int row_update = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "update student set score="+score+" where sid="+sid;;
            
            row_update = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Update Error :"+ex);
        }
        
        return row_update;
    }
    
      public static int delete(int sid)
    {
        int row_delete = 0;
        try
        {
            Connection con = MyConnection.connect();//get connection
            Statement stmt = con.createStatement();
            
            String qry = "delete from student where sid = "+sid;
            
            row_delete = stmt.executeUpdate(qry);
        }
        catch(Exception ex)
        {
            System.out.println("Delete Error :"+ex);
        }
        
        return row_delete;
    }
    

    
    
    
}//class ends

