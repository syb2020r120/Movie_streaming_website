import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Registration extends HttpServlet{
    public void doPost(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException{
      PrintWriter out = res.getWriter();
        try{
         String uname = req.getParameter("user_name");
         String uemail = req.getParameter("user_email"); 
         String pwd = req.getParameter("user_password");
         String umobile = req.getParameter("user_mobile");
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Blume1","root","Sairam@1234");
         String q = "insert into users(uname,upw,uemail,umobile) values (?,?,?,?)"; 
         PreparedStatement ps = con.prepareStatement(q);
         ps.setString(1,uname);
         ps.setString(2,pwd);
         ps.setString(3,uemail);
         ps.setString(4,umobile);
         ps.executeUpdate();
         res.sendRedirect("signup.html");
         con.close();
         }catch(Exception e){
             out.println(e);
         }
    }
}
