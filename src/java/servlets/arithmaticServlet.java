
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class arithmaticServlet extends HttpServlet {

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmaticCalculator.jsp").forward(request, response);
        return;
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int firstNumber = Integer.parseInt(request.getParameter("firstNumber"));
        int secondNumber = Integer.parseInt(request.getParameter("secondNumber"));
        int calc = 0;
        
        if (request.getParameter("plus") != null && !request.getParameter("plus").equals("")) {
                calc = firstNumber + secondNumber;
            } else if (request.getParameter("minus") != null) {
                calc = firstNumber - secondNumber;
            } else if (request.getParameter("multiply") != null) {
                calc = firstNumber * secondNumber;
            } else if (request.getParameter("modulo") != null) {
                calc = firstNumber % secondNumber;
            }
        request.setAttribute("calc", calc);
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmaticCalculator.jsp").forward(request, response);
        return;
        
    }

}
