/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2015-03-04 21:39:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.axis2_002dweb;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.axis2.Constants;
import org.apache.axis2.description.AxisOperation;
import org.apache.axis2.description.AxisService;
import java.util.Hashtable;
import java.util.Iterator;

public final class listFaultyService_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/httpbase.jsp", out, false);
      out.write("\n");
      out.write("    <title>List Single service</title>\n");
      out.write("    <link href=\"axis2-web/css/axis-style.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/header.inc", out, false);
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/link-footer.jsp", out, false);
      out.write('\n');
      out.write(' ');
      out.write(' ');

        String prifix = request.getAttribute("frontendHostUrl") + (String)request.getSession().getAttribute(Constants.SERVICE_PATH) +"services/";
    
      out.write("\n");
      out.write("        ");

            String isFault = (String)request.getSession().getAttribute(Constants.IS_FAULTY);
            String servicName = request.getParameter("serviceName");
            if(Constants.IS_FAULTY.equals(isFault)){
                Hashtable errornessservices =(Hashtable)request.getSession().getAttribute(Constants.ERROR_SERVICE_MAP);
                
      out.write("\n");
      out.write("                    <h3>This Web axisService has deployment faults</h3>");

                     
      out.write("<font color=\"red\" >");
      out.print((String)errornessservices.get(servicName) );
      out.write("</font>\n");
      out.write("                ");


                    }else {

                    AxisService axisService =
                            (AxisService) request.getSession().getAttribute(Constants.SINGLE_SERVICE);
                    if(axisService!=null){
           Iterator opItr = axisService.getOperations();
            //operationsList = operations.values();
          String  serviceName = axisService.getName();
            
      out.write("<h2><font color=\"blue\"><a href=\"");
      out.print(prifix + axisService.getName());
      out.write("?wsdl\">");
      out.print(serviceName);
      out.write("</a></font></h2>\n");
      out.write("           <font color=\"blue\">Service EPR : </font><font color=\"black\">");
      out.print(prifix + axisService.getName());
      out.write("</font><br>\n");
      out.write("           <h4>Service Description : <font color=\"black\">");
      out.print(axisService.getServiceDescription());
      out.write("</font></h4>\n");
      out.write("           <i><font color=\"blue\">Service Status : ");
      out.print(axisService.isActive()?"Active":"InActive");
      out.write("</font></i><br>\n");
      out.write("           ");

            if (opItr.hasNext()) {
                
      out.write("<i>Available operations</i>");

            } else {
                
      out.write("<i> There are no Operations specified</i>");

            }
               opItr = axisService.getOperations();
           
      out.write("<ul>");

            while (opItr.hasNext()) {
                AxisOperation axisOperation = (AxisOperation) opItr.next();
                
      out.write("<li>");
      out.print(axisOperation.getName().getLocalPart());
      out.write("</li>\n");
      out.write("                ");

            }
           
      out.write("</ul>\n");
      out.write("           ");

                    } else{
                           
      out.write("\n");
      out.write("                <h3><font color=\"red\" >No services found in this location.</font></h3>\n");
      out.write(" ");

                    }

            }
        
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "include/footer.inc", out, false);
      out.write("\n");
      out.write("        </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
