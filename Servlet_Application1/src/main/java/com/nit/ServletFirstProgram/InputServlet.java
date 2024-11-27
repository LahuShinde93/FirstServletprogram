package com.nit.ServletFirstProgram;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;

@WebServlet("/dis")
public class InputServlet implements Servlet {
 
    private ServletConfig config;

    // Initialization method 
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("Servlet is initialized");
    }
 
    // Service method (handles client requests)
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        
        PrintWriter write = res.getWriter();
        
        String uname = req.getParameter("uname");
        String mailid = req.getParameter("mailid");
        String pno = req.getParameter("pno");
        
        write.println("Your User Name is : "+uname+"<br>");
        write.println("Your Email-id is : "+mailid+"<br>");
        write.println("Your Phone No is : "+pno+"<br>");
        
        
    }

    // Cleanup method
    @Override
    public void destroy() {
        System.out.println("Servlet is being destroyed");
    }

    // To retrieve servlet configuration
    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    // To retrieve servlet information
    @Override
    public String getServletInfo() {
        return "InputServlet implementing Servlet Interface";
    }
}
