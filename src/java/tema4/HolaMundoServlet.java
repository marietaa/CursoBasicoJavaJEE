package tema4;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//declaraciones mediante anotacionesa del servelet 
//@= son anotaciones para kitar los arxibos de configuracion

@WebServlet(name="HolaMundoServlet", urlPatterns={"/HolaMundo"})
public class HolaMundoServlet extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
               response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Hola mundo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola mundo!</h1>");
            out.print("<img src=\"./tema4/jv.jpg\"></img>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

}
