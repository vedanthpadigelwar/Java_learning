/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 7559
 */
//@WebServlet (urlPatterns=("/xtr_client_sservlet"))
public class xtr_client_sservlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet xtr_client_sservlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet xtr_client_sservlet at " + request.getContextPath() + "</h1>");
              String username=request.getParameter("username");
           
                    String password=request.getParameter("password");
                   
            
            
             int x=Integer.parseInt(request.getParameter("a"));     
            int y=Integer.parseInt(request.getParameter("b"));       
            int z=Integer.parseInt(request.getParameter("c"));  
            int fans=Integer.parseInt(request.getParameter("captcha"));
            int ans=0;
            if(z==1) 
            {
               ans=add(x,y);
            }
            else if(z==2)
            {
                ans=subtract(x,y);
            }
            else if(z==3)
            {
                ans=multiply(x,y);
            }
            else if(z==4)
            {
            ans=divide(x,y);
            }
            
            if(fans==ans)
            {
               
                if(username.equals("cloud")&& password.equals("1234"))
                    { 
                        out.println("<h1>Registration Successful</h1>");
                  
                          
                    }  
                             else
                    {
                              out.println("<h1>authentication failed</h1>");
                    }
            }
            else 
               out.println("<h1>Incorrect Captcha i think u r a robot</h1>");
            out.println("</body>");
            out.println("</html>");
            
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

    private static int add(int intA, int intB) {
        externalserver.Calculator service = new externalserver.Calculator();
        externalserver.CalculatorSoap port = service.getCalculatorSoap();
        return port.add(intA, intB);
    }

    private static int divide(int intA, int intB) {
        externalserver.Calculator service = new externalserver.Calculator();
        externalserver.CalculatorSoap port = service.getCalculatorSoap();
        return port.divide(intA, intB);
    }

    private static int multiply(int intA, int intB) {
        externalserver.Calculator service = new externalserver.Calculator();
        externalserver.CalculatorSoap port = service.getCalculatorSoap();
        return port.multiply(intA, intB);
    }

    private static int subtract(int intA, int intB) {
        externalserver.Calculator service = new externalserver.Calculator();
        externalserver.CalculatorSoap port = service.getCalculatorSoap();
        return port.subtract(intA, intB);
    }

}
