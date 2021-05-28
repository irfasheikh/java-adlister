import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/helloLecture")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");

        if(name==null) {
            name="World!";
        }else if (name.equals("ken")){
            name = "Mr. Ken";
        }

        request.setAttribute("viewName", name); //view name and the name from our internal java
        request.getRequestDispatcher("/hello.jsp").forward(request, response);
    }
}
