package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;;

public final class displaydata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspdb?autoReconnect=true&useSSL=false","root","Wafijailani84278");
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM jspdb.lab5");
             
      out.write("\n");
      out.write("             <table border=1 align=center style=text-align:center\">\n");
      out.write("                 <tr>\n");
      out.write("                     <th>ID</th>\n");
      out.write("                     <th>First Name</th>\n");
      out.write("                     <th>Last Name</th>\n");
      out.write("                     <th>Username</th>\n");
      out.write("                     <th>Address</th>\n");
      out.write("                     <th>Contact</th>\n");
      out.write("                 </tr>\n");
      out.write("                 \n");
      out.write("             ");
        
             while(rs.next()){
             String ID = rs.getString("id");
             String FirstName = rs.getString("firstname");
             String LastName = rs.getString("lastname");
             String Username = rs.getString("username");
             String Address = rs.getString("address");
             String Contact = rs.getString("contact");
             
      out.write("\n");
      out.write("             <tr>\n");
      out.write("                     <td> ");
      out.print( ID );
      out.write(" </td>\n");
      out.write("                     <td> ");
      out.print( FirstName );
      out.write(" </td>\n");
      out.write("                     <td> ");
      out.print( LastName );
      out.write(" </td>\n");
      out.write("                     <td> ");
      out.print( Username );
      out.write(" </td>\n");
      out.write("                     <td> ");
      out.print( Address );
      out.write(" </td>\n");
      out.write("                     <td> ");
      out.print( Contact );
      out.write(" </td>\n");
      out.write("             </tr>   \n");
      out.write("                 \n");
      out.write("             ");

             }
      out.write("\n");
      out.write("             </table>\n");
      out.write("             ");

             con.close();
             
        } catch (Exception e) {
            out.print(e);
        }
            
            
            
      out.write("\n");
      out.write("            <br/> <a href=\"index.jsp\"> Insert data</a>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
