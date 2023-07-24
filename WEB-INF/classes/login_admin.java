import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class login_admin extends HttpServlet{
    public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException{
        String uname = req.getParameter("user_name");
        String pwd = req.getParameter("user_password");
        if(uname.equals("admin") && pwd.equals("user")){
            res.sendRedirect("admin.html");
        }
        else{
            res.sendRedirect("loginadmin.html");
        }
    }
}
