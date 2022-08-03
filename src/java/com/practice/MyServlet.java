
package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
    
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        System.out.println("This is get method.............");
        
        response.setContentType("text/html");
        
        PrintWriter printWriter = response.getWriter();
        
        printWriter.print("<h1> This is get method of my servlet</h1>");
        printWriter.print("<h1>"+ new Date().toString() + "</h1> ");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
         
        
    }
    
    
    
}
