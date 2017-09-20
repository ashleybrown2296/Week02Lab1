/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg252;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 679918
 */
public class AgeCalculatorServlet extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String bday = request.getParameter("bday");
        String submit = request.getParameter("submit");
        request.setAttribute("age", bday);
        
        if(submit != null)
        {
            
        
        if (bday!=null
                && !bday.equals(""))
        {
            
            Integer newage = Integer.parseInt(bday);
            request.setAttribute("answer", "Your age next birthday will be " + (newage+1));
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        }
        else
        {   
         request.setAttribute("errorMessage", "You must give your current age");
         //getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
         
        }
        }
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

}