<%-- 
    Document   : porcomision
    Created on : May 1, 2013, 5:10:29 PM
    Author     : yepesk8r
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="org.payroll.CommissionEmployee, org.payroll.Employee,
         org.payroll.HourlyEmployee, org.payroll.SalariedEmployee,
         org.springframework.context.ApplicationContext,
         org.springframework.context.support.ClassPathXmlApplicationContext"%>
<!--
Los anteriores son imports necesarios
import org.payroll.CommissionEmployee;
import org.payroll.Employee;
import org.payroll.HourlyEmployee;
import org.payroll.SalariedEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

-->

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleado por comision</title>
    </head>
    <body>
        <h1>Empleado por comision</h1>
         <a href="index.jsp">Regresar al inicio</a><BR>
         <% 
             
             //creacion del formulario
             out.println("<FORM ACTION=porcomision.jsp METHOD=post>");
             out.println("Commissionrate : <input type=text name=rate><BR>");
             out.println("GrossSales: <input type=text name=gross><BR>");
             out.println("<INPUT TYPE=SUBMIT NAME=calcular VALUE= calcular><BR>");
             out.println("</FORM>");
             //accion del boton calcular
             if (request.getParameter("calcular") != null) {
                 try {
             ApplicationContext context = new ClassPathXmlApplicationContext("/org/payroll/Spring.xml");
         
             String rate = request.getParameter("rate");
             String gross = request.getParameter("gross");
             CommissionEmployee ce = context.getBean(CommissionEmployee.class);
            ce.setFirstName("Jacques");
            ce.setLastName("Duquesne");
            ce.setSsn("345-67-890");
            ce.setGrossSales(Double.parseDouble(gross));
            ce.setCommissionRate(Double.parseDouble(rate));
                 out.println(" Payment : "+
               " "+ce.getFirstName() +" "+ce.getLastName()+" "+ce.payment());
             } catch (Exception Ex) {
                        out.println("Débes ingresar datos válidos");
                         System.out.println("Exception" + Ex.toString());
             }
             };
         %>
    </body>
</html>
