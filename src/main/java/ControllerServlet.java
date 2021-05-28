import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "ControllerServlet", urlPatterns = "/game")

public class ControllerServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Random random = new Random();
        int randoNum = random.nextInt(3 + 1) + 1; //max, min and then min on outside
        String guess = request.getParameter("guess");


        // now do logic so that if the guess equals the random number generated --> use .equals

        if(guess.equals(randoNum)){
            response.sendRedirect("/correct.jsp");
        } else {
            response.sendRedirect("incorrect.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
    response.sendRedirect("/guess.jsp");
    }
}
