import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ShowFeed extends HttpServlet {
    public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException{
        PrintWriter out = res.getWriter();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Blume1","root","Sairam@1234");
            res.setContentType("text/html");
            
            String q = "select * from feedback";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(q);

            String str="<!DOCTYPE html>"+
            "<html lang=\"en\">"+
            "<head>"+
            "<title>Document</title>"+
            "<link rel=\"stylesheet\" href=\"css/showfeedback.css\">"+
            "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">"+
            "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>"+
            "</head>"+
            "<body style=\"background-color: black;\">"+
            "<nav class=\"navbar navbar-expand-lg nav_bar navbar-dark sticky-top\">"+
            "<div class=\"nav-container\">"+
            "<a class=\"navbar-brand\" href=\"index.html\">"+
            "<img src=\"images\\login page\\logo.png\" alt=\"logo\" class=\"logo_img\">"+
            "</a>"+
            "<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarTogglerDemo02\" aria-controls=\"navbarTogglerDemo02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">"+
            "<span class=\"navbar-toggler-icon\"></span>"+
            "</button>"+
            "<div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo02\">"+  
            "<ul class=\"navbar-nav ms-auto nav-list\">"+
            "<li class=\"nav-item\">"+
            "<a class= \"nav-link\" href=\"index.html\">Home</a></li>"+
            "<li class=\"nav-item\">"+
            "<a class= \"nav-link\" href=\"about.html\">About</a>"+
            "</li>"+
            "</ul>"+
            "</div>"+
            "</div>"+
            "</nav>"+
            "<br><br><br>"+
            "<center><table class=\"table table-success table-striped\" style=\" height:200px;width:600px;\">"+
            "<tr><th>User Name</th><th>User email</th><th>Feedback Text</th><th>Overall Rating</th></tr>";

            while(rs.next()){
            String uname = rs.getString("uname");
            String uemail = rs.getString("uemail");
            String feedback = rs.getString("feedtext");
            String rating = rs.getString("rating");
            str=str+"<tr>"+
            "<td>"+uname+"</td>"+
            "<td>"+uemail+"</td>"+
            "<td>"+feedback+"</td>"+
            "<td>"+rating+"</td>"+
            "</tr>";
            }

            str=str+"</table></center>"+
            "</body>"+
            "</html>";
            out.println(str);
            con.close();
        }catch(Exception e)
    {
        out.println(e);
    }
}}
