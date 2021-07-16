
package com.tta.controller;

import com.tta.model.StudentQuery;
import com.tta.model.Student;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CreateStudent extends HttpServlet {

    int sid;
    String firstName;
    String lastName;
    int score;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
          // getting request parameters
          
         sid = Integer.parseInt(request.getParameter("sid"));  //String -> Int
         firstName = request.getParameter("fname");
         lastName = request.getParameter("lname");
         score = Integer.parseInt(request.getParameter("score"));
          
         
         //create student object
         Student s = new Student(sid, firstName, lastName, score);
         
            //insert Student into DB
            
            int r = StudentQuery.insert(s);
            
            if(r==1)
            {
                out.print("Student record saved");
                request.getRequestDispatcher("display.jsp").include(request, response);
            } // ends if 
            
            else
            {
              out.print("Something wrong... Can not save record"); 
                  request.getRequestDispatcher("create.jsp").include(request, response);
            } //ends else
            
            
        }// try ends
    } // processRequest ends

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
