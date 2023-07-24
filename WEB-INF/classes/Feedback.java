import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Feedback extends HttpServlet{
    public void doPost(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException{
       PrintWriter out=res.getWriter();
        try{
        String uname = req.getParameter("uname");
        String uemail = req.getParameter("uemail");
        String feedback = req.getParameter("feedback");
        String rating = req.getParameter("rating1");
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Blume1","root","Sairam@1234");
        String q1="insert into feedback(uname,uemail,feedtext,rating) values(?,?,?,?)";
        PreparedStatement ps=con.prepareStatement(q1);
        ps.setString(1,uname);
        ps.setString(2,uemail);
        ps.setString(3,feedback);
        ps.setString(4,rating);
        ps.executeUpdate();
        res.sendRedirect("homepage.html");
    }catch(Exception e){
           out.println(e);
       }
    }
}
