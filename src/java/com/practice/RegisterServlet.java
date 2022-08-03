package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        
        
        
        String name = request.getParameter("user_name");
        String password = request.getParameter("user_password");
        String email = request.getParameter("user_email");
        String gender = request.getParameter("user_gender");
        String course = request.getParameter("user_course");
        String condition = request.getParameter("condition");
        
        if(condition != null) {
            
            if(condition.equals("checked")) {
                printWriter.println("<h2> Thank You for Register Your Self!!!</h2>");
                printWriter.println("<h2> Name : " + name + "</h2>");
                printWriter.println("<h2> Password : " + password + "</h2>");
                printWriter.println("<h2> Email : " + email + "</h2>");
                printWriter.println("<h2> Gender : " + gender + "</h2>");
                printWriter.println("<h2> Course : " + course + "</h2>");
                
                RequestDispatcher requestDispatcher = request.getRequestDispatcher("success");
                requestDispatcher.forward(request, response);
                
            } else {
                
                printWriter.println("<h2> You have not accept our terms & conditions, You can not be Register Your self </h2>");
                
            }
        } else {
            
            printWriter.println("<h2> You have not accept our terms & conditions, You can not be Register Your self </h2>");   
            
            // outpput of index.html

            // get the object of RequestDispatcher                    response.setContentType("text/html");


            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
            
            // include 
            
            requestDispatcher.include(request, response);
        }
    }
}
