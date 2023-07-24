import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class login_user extends HttpServlet{
    public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException{
        
        PrintWriter out = res.getWriter();
        try{
        String uname = req.getParameter("user_email");
        String pwd = req.getParameter("user_password");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Blume1","root","Sairam@1234");
        String q1 = "select (uemail) from users"; 
        String q2 = "select (upw) from users";
        Statement stmt1 = con.createStatement();
        Statement stmt2 = con.createStatement();
        ResultSet rs1 = stmt1.executeQuery(q1);
        ResultSet rs2 = stmt2.executeQuery(q2);
        while(rs1.next() && rs2.next()){
            String user = rs1.getString("uemail");
            String pass = rs2.getString("upw");
            if(user.equals(uname) && pass.equals(pwd)){
                res.sendRedirect("homepage.html");
            }
        }
        res.sendRedirect("login_user.html");
    }catch(Exception e){
        out.println(e);
    }
    }
}
