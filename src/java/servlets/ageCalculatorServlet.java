package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Scanner;

public class ageCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if (request.getParameter("ageNumber") != null && !request.getParameter("ageNumber").equals("")) {
            String result;
            String input = "";
            try {
                int currentAge = Integer.parseInt(request.getParameter("ageNumber"));
                int nextAge = ++currentAge;

                if (nextAge < 0) {

                    result = "You must give a valid number ";
                    request.setAttribute("result", result);
                    getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
                    return;
                }

                //System.out.println(currentAge);
                result = "Your age will be " + nextAge + "!";
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
                return;
                
            }// end of try
            catch (Exception ex) {
                result = "Please enter your age";
                request.setAttribute("result", result);
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
                return;
            }
        } else {
            String result = "Please enter a number";
            request.setAttribute("result", result);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }

    }

}
