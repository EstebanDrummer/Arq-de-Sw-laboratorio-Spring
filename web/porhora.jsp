<%-- 
    Document   : porhora
    Created on : May 1, 2013, 5:12:35 PM
    Author     : yepesk8r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="org.payroll.CommissionEmployee, org.payroll.Employee,
         org.payroll.HourlyEmployee, org.payroll.SalariedEmployee,
         org.springframework.context.ApplicationContext,
         org.springframework.context.support.ClassPathXmlApplicationContext"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleado por hora</title>
    </head>
    <body>
        <h1>Empleado por hora</h1>
         <a href="index.jsp">Regresar al inicio</a><BR>
         <% 
             //creacion del formulario
             out.println("<FORM ACTION=porhora.jsp METHOD=post>");
             out.println("wage : <input type=text name=wage><BR>");
             out.println("hours: <input type=text name=hours><BR>");
             out.println("<INPUT TYPE=SUBMIT NAME=calcular VALUE= calcular><BR>");
             out.println("</FORM>");
             //accion del boton calcular
             if (request.getParameter("calcular") != null) {
                 try {
         ApplicationContext context = new ClassPathXmlApplicationContext("/org/payroll/Spring.xml");
         
             String wage = request.getParameter("wage");
             String hours = request.getParameter("hours");
            HourlyEmployee he = context.getBean(HourlyEmployee.class);
            he.setFirstName("Bruce");
            he.setLastName("Banner");
            he.setSsn("567-78-678");
            he.setHours(Double.parseDouble(wage));
            he.setWage(Double.parseDouble(hours));
                 out.println(" Payment : "+
               " "+he.getFirstName() +" "+he.getLastName()+" "+he.payment());
                              } catch (Exception Ex) {
                        out.println("Débes ingresar datos válidos");
                         System.out.println("Exception" + Ex.toString());
             }
             };
         %>
    </body>
</html>
