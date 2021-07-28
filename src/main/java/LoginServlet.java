import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        System.out.println(name + " ： " + password);

        if ("john".equals(name) && "123".equals(password)){
            resp.sendRedirect(req.getContextPath() + "/login_succeed.jsp");
        }else {
            resp.sendRedirect(req.getContextPath() + "/login_failed.jsp");
        }
    }
}
