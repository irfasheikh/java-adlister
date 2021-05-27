import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//annotation goes here to annotate the whole thing
@WebServlet(name = "HelloWorld", urlPatterns = "/hello")  // metadata to go along with our servlet
public class HelloWorldServlet extends HttpServlet { //defining the class name / extending HttpServlet


    //put doGet doPost methods in here
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("<h1> Hello World! It is I, Iffy!<h1>");


    }
}

