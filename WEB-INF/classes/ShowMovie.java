import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class ShowMovie extends HttpServlet {
    public void doGet(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException{
        PrintWriter out = res.getWriter();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Blume1","root","Sairam@1234");
            res.setContentType("text/html");
            
            Statement stmt = con.createStatement();
            ResultSet result =stmt.executeQuery("select * from movies1");

            String str="<!DOCTYPE html><html lang=\"en\">"+
           "<head>"+
           "<title>Blume - Watch trending Movies and Web Series</title>"+
           "<script src=\"https://kit.fontawesome.com/6d45926cf6.js\" crossorigin=\"anonymous\"></script>"+
           "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\""+
           "rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" "+
           "crossorigin=\"anonymous\"/>"+
           "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" "+
            "integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\""+
            "crossorigin=\"anonymous\"></script>"+
           "<link rel=\"stylesheet\" href=\"css/drama.css\" />"+
            "<link rel=\"stylesheet\"href=\"https://fonts.googleapis.com/css?family=Sofia&effect=neon|outline|emboss|shadow-multiple\"/>"+
            "<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />"+
            "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />"+
            "<link href=\"https://fonts.googleapis.com/css2?family=Merriweather&family=Montserrat:wght@400;900&family=Quicksand&family=Red+Hat+Display&family=Sacramento&family=Source+Sans+Pro&family=Ubuntu&display=swap\""+
            "rel=\"stylesheet\"/>"+
            "<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Sofia&effect=fire\"/> "+
            "<script src=\"js/playmovie.js\"></script>"+
           "</head>"+
           "<body>"+
              "<nav class=\"navbar navbar-expand-lg nav_bar navbar-dark sticky-top\">"+
                "<div class=\"nav-container\">"+
                "<a class=\"navbar-brand\" href=\"index.html\">"+
                "<img src=\"images/login page/logo.png\" alt=\"logo\" class=\"logo_img\" />"+
                "</a>"+
               "<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarTogglerDemo02\" "+
                "aria-controls=\"navbarTogglerDemo02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">"+
                "<span class=\"navbar-toggler-icon\"></span>"+
                "</button>"+
        "<div class=\"collapse navbar-collapse\" id=\"navbarTogglerDemo02\">"+
        "<ul class=\"navbar-nav ms-auto nav-list\">"+
        "<li class=\"nav-item\">"+
            "<a class=\"nav-link\" href=\"index.html\">Home</a>"+
            "</li>"+
            "<li class=\"nav-item\">"+
              "<a class=\"nav-link\" href=\"about.html\">About</a>"+
            "</li></ul></div></div></nav>"+

    "<div class=\"main_container\"><center>"+
    "<h1 class=\"heading1 font-effect-fire\">New Movies</h1>"+
    "</center><center><div class=\"dramaList\"><div class=\"row\">";
    while(result.next()){
        String movie_name = result.getString("movie_name");
        String movie_url = result.getString("movie_url");
        String movie_poster = result.getString("movie_poster");
    str=str+"<div class=\"col-lg-3\"><div class=\"card\" >"+
    "<img class=\"card-img-top\" "+
    "src=\"images/new_movies/"+movie_poster+"\""+
     "alt=\"Card image cap\"/>"+
    "<div class=\"card-body\">"+
     "<h5 class=\"card-title\">"+movie_name+"</h5>"+
    "<a href=\"#video-container\" class=\"btn\" onclick=\"displayVideo(\'"+movie_url+"\',\'"+movie_name+"\')\">Watch Now</a>"+
    "</div></div></div>";
    }
   str=str+"</div></div></center></div><center><hr class=\"hr-line\"></center>"+
   "<h1 id=\"video-container-h1\"></h1><center>"+
   "<div id=\"video-container\"> </div></center>"+
  "</body>"+
  "</html>";

         out.println(str);
         con.close();
        }catch(Exception e)
        {
        out.println(e);
       }
    }
}
