<%-- 
    Document   : normal
    Created on : May 1, 2013, 5:12:00 PM
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
        <title>Empleado Normal</title>
    </head>
    <body>
        <h1>Empleado Normal</h1>
         <a href="index.jsp">Regresar al inicio</a><BR>
                  <% 
             //creacion del formulario
             out.println("<FORM ACTION=normal.jsp METHOD=post>");
             out.println("salary : <input type=text name=salary><BR>");
             out.println("<INPUT TYPE=SUBMIT NAME=calcular VALUE= calcular><BR>");
             out.println("</FORM>");
             //accion del boton calcular
             if (request.getParameter("calcular") != null) {
                 try {
         ApplicationContext context = new ClassPathXmlApplicationContext("/org/payroll/Spring.xml");
         
             String salary = request.getParameter("salary");
             CommissionEmployee ce = context.getBean(CommissionEmployee.class);
               SalariedEmployee se = context.getBean(SalariedEmployee.class);
               se.setFirstName("Thor");
               se.setLastName("odinson");
               se.setSsn("123-234-45");
               se.setSalary(Double.parseDouble(salary));
                 out.println(" Payment : "+
               " "+se.getFirstName() +" "+se.getLastName()+" "+se.payment());
                              } catch (Exception Ex) {
                        out.println("Débes ingresar datos válidos");
                         System.out.println("Exception" + Ex.toString());
             }
             };
         %>
    </body>
</html>
