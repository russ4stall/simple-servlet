import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by russellf on 2/25/2016.
 */
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String name = req.getParameter("name");


        req.setAttribute("email", email);
        req.setAttribute("name", name);

        req.getRequestDispatcher("/WEB-INF/jsp/HelloWorld.jsp").forward(req, resp);
    }
}
