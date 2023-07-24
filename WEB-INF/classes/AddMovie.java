import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
import javax.servlet.annotation.*;

@MultipartConfig

public class AddMovie extends HttpServlet{

    public void doPost(HttpServletRequest req , HttpServletResponse res)throws ServletException,IOException{
        PrintWriter out = res.getWriter();
          try{

           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Blume1","root","Sairam@1234");
           String q = "insert into movies1(movie_name,movie_desc,movie_url,movie_poster) values (?,?,?,?)"; 
           PreparedStatement ps = con.prepareStatement(q);

           String mname = req.getParameter("movie_name");
           String mdesc = req.getParameter("movie_desc"); 
           String murl = req.getParameter("movie_url");
           Part part = req.getPart("movie_poster");

           ps.setString(1,mname);
           ps.setString(2,mdesc);
           ps.setString(3,murl);
           ps.setString(4,part.getSubmittedFileName());
           ps.executeUpdate();

           // upload in folder

           String path = req.getRealPath("images")+File.separator+"new_movies"+File.separator+part.getSubmittedFileName();
            
           FileOutputStream fout = new FileOutputStream(path);
           InputStream is = part.getInputStream(); 
           byte[] data = new byte[is.available()];
           is.read(data);
           fout.write(data);
           fout.close();
           
            res.sendRedirect("admin.html");
           con.close();
           }catch(Exception e){
               out.println(e);
           }
      }
       
}