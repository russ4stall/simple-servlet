import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Russ Forstall
 */
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Form form = (Form) req.getSession().getAttribute("form");
        req.setAttribute("form", form);

        req.getRequestDispatcher("/WEB-INF/jsp/Form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Form form = new Form(
                req.getParameter("name"),
                req.getParameter("username"),
                req.getParameter("email"),
                req.getParameter("phone")
        );

        req.getSession().setAttribute("form", form);

        resp.sendRedirect("/form");
    }
}
