import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Get user credentials from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // For demonstration purposes, let's assume the valid credentials are:
        String validUsername = "user";
        String validPassword = "pass";

        // Set the response type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Check if the credentials are valid
        if (username.equals(validUsername) && password.equals(validPassword)) {
            // Successful login
            out.println("<html><body>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("</body></html>");
        } else {
            // Failed login
            out.println("<html><body>");
            out.println("<h2>Invalid username or password. Please try again.</h2>");
            out.println("</body></html>");
        }
    }
}
