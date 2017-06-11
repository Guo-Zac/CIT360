// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Alink extends HttpServlet {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>Welcome, but you should not check this page directly</h1>");
      out.println("<a href='/Home'>Go back home</a>");
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      try {

          String user=request.getParameter("user");

          if(Character.isDigit(user.charAt(0))){
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "We want real names, not numbers.");
          }
          else{
            out.println("<h2> Welcome "+user+"</h2>");
            out.println("<a href='/Home'>Go back home</a>");
          }
      } finally {
          out.close();
      }
  }
}
