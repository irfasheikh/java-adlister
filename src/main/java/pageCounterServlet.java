import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Page Counter", urlPatterns = "/count")
public class pageCounterServlet extends HttpServlet {
//Create a page view counter
    private int counter = 0;

//Create a page that displays a numbe that goes up by one every time the /count page is viewed

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        counter += 1; // this means counter = counter + 1
        response.getWriter().println("<h1>The count is " + counter + ".<h1>");

        //for the bonuses get parameter stuff


    }
}

