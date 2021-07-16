/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

     import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;


/**
 *
 * @author GEORGE JNR
 */
@WebServlet(urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

  String uname, pass;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          uname = request.getParameter("uname");
          pass = request.getParameter("pass");
          
          //Enter  DB Connection Code here
    


        try
        {
            
            //1. Add driver
            Class.forName("com.mysql.cj.jdbc.Driver");//mysql DB
            
            //2. Get Connection
            String URL = "jdbc:mysql://localhost:3306/tta?autoReconnect=true&useSSL=false";//DB location
            String user = "root";//DB user name
            String pwd = "Wisconsin2019+";//DB password
            
            Connection con = DriverManager.getConnection(URL , user , pwd); 
            
            //4. Write Sql
            Statement stmt = con.createStatement();
            
             
            String qry2 = "select * from myuser where username='"+uname+"' and password='"+pass+"'";
            ResultSet rs1 = stmt.executeQuery(qry2);
            if(rs1.next())
            {
              out.print("Hi "+uname+ "Welcome, to sage Online.");
              
              HttpSession se = request.getSession();
              se.setAttribute("myuser" , uname);
              
              request.getRequestDispatcher("profile.jsp").forward(request, response);
          }
          else{
              out.print("Oops.. your username or password is incorrect.");
              
              request.getRequestDispatcher("login.jsp").include(request, response);
          }
            
        }
        catch(Exception ex)
        {
            System.out.println("DB error :"+ex);
        }
    


          
          
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
