/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.payrollDesktop;


import javax.swing.JOptionPane;
import org.payroll.CommissionEmployee;
import org.payroll.HourlyEmployee;
import org.payroll.SalariedEmployee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author usuario
 */
public class aplicacionEscritorio extends javax.swing.JFrame {

    ApplicationContext context = new
        ClassPathXmlApplicationContext("/org/payroll/Spring.xml"); 

    
    /**
     * Crea tes new form aplicacionEscritorio
     */
    public aplicacionEscritorio() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipoEmpleado = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        wage = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JBCalculate = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JTsalary = new javax.swing.JTextField();
        jThours = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTRate = new javax.swing.JTextField();
        jTSales = new javax.swing.JTextField();
        jBHabi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("payroll");

        tipoEmpleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "normal", "horas", "comision" }));

        jLabel1.setText("tipoEmpleado");

        jLabel2.setText("normal");

        jLabel3.setText("por horas");

        jLabel4.setText("por comision");

        jLabel5.setText("wage");

        wage.setText("0");
        wage.setEnabled(false);

        jLabel6.setText("hours");

        JBCalculate.setText("calculate");
        JBCalculate.setEnabled(false);
        JBCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCalculateActionPerformed(evt);
            }
        });

        jLabel7.setText("salary");

        JTsalary.setText("0");
        JTsalary.setEnabled(false);

        jThours.setText("0");
        jThours.setEnabled(false);

        jLabel8.setText("Commissionrate");

        jLabel9.setText("GrossSales");

        jTRate.setText("0");
        jTRate.setEnabled(false);

        jTSales.setText("0");
        jTSales.setEnabled(false);

        jBHabi.setText("Habilitar");
        jBHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBHabiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7))
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel5))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(JTsalary, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jThours, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                            .addComponent(wage)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel4)
                        .addContainerGap(143, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTRate)
                            .addComponent(jTSales))
                        .addGap(110, 110, 110))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBHabi)
                    .addComponent(JBCalculate))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(JTsalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(wage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(17, 17, 17)
                                .addComponent(jTRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTSales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jThours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jBHabi)
                .addGap(44, 44, 44)
                .addComponent(JBCalculate)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCalculateActionPerformed
          String r =(String) tipoEmpleado.getSelectedItem();
         
          if(r.equalsIgnoreCase("normal")) {
               SalariedEmployee se = context.getBean(SalariedEmployee.class);
               se.setFirstName("Thor");
               se.setLastName("odinson");
               se.setSsn("123-234-45");
               String salario = JTsalary.getText();
               JTsalary.setEnabled(false);
               se.setSalary(Double.parseDouble(salario));
               JOptionPane.showMessageDialog(rootPane," Payment : "+
               " "+se.getFirstName() +" "+se.getLastName()+" "+se.payment() 
               ,"pago", WIDTH);
                JTsalary.setText("0");
        }else
        if(r.equalsIgnoreCase("horas")){
            wage.setEnabled(false);
            jThours.setEnabled(false);
             HourlyEmployee he = context.getBean(HourlyEmployee.class);
            he.setFirstName("Bruce");
            he.setLastName("Banner");
            he.setSsn("567-78-678");
            he.setHours(Double.parseDouble(jThours.getText()));
            he.setWage(Double.parseDouble(wage.getText()));
              JOptionPane.showMessageDialog(rootPane," Payment : "+
               " "+he.getFirstName() +" "+he.getLastName()+" "+he.payment() 
               ,"pago", WIDTH);
               wage.setText("0");
            jThours.setText("0");
        }else
        if(r.equalsIgnoreCase("comision")){
            
            jTRate.setEnabled(false);
            jTSales.setEnabled(false);
            CommissionEmployee ce = context.getBean(CommissionEmployee.class);
            ce.setFirstName("Jacques");
            ce.setLastName("Duquesne");
            ce.setSsn("345-67-890");
            ce.setGrossSales(Double.parseDouble(jTSales.getText()));
            ce.setCommissionRate(Double.parseDouble(jTRate.getText()));
            JOptionPane.showMessageDialog(rootPane," Payment : "+
               " "+ce.getFirstName() +" "+ce.getLastName()+" "+ce.payment() 
               ,"pago", WIDTH);
            jTRate.setText("0");
            jTSales.setText("0");
        } 
          jBHabi.setEnabled(true);
        JBCalculate.setEnabled(false);
    }//GEN-LAST:event_JBCalculateActionPerformed

    private void jBHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBHabiActionPerformed
        jBHabi.setEnabled(false);
        JBCalculate.setEnabled(true);
        String r =(String) tipoEmpleado.getSelectedItem();
        System.out.println(r);
        if(r.equalsIgnoreCase("normal")) {
            JTsalary.setEnabled(true);
        }else
        if(r.equalsIgnoreCase("horas")){
            wage.setEnabled(true);
            jThours.setEnabled(true);
            HourlyEmployee he = context.getBean(HourlyEmployee.class);
            he.setFirstName("Bruce");
            he.setLastName("Banner");
            he.setSsn("567-78-678");
            he.setHours(30);
            he.setWage(500);
        }else
        if(r.equalsIgnoreCase("comision")){
            jTRate.setEnabled(true);
            jTSales.setEnabled(true);
        }  
    }//GEN-LAST:event_jBHabiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(aplicacionEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aplicacionEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aplicacionEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aplicacionEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 // List employees  = new ArrayList();
        
      
        
       
        
       
        
//        employees.add(se);
//        
//        employees.add(ce);
//        
//        employees.add(he);
        
//        for(Iterator it = employees.iterator(); it.hasNext();) {
//            Employee e = (Employee) it.next();
//            
//            System.out.printf("\nName: %s %s Payment: %.2f",e.getFirstName(),e.getLastName(),e.payment());
//        }
//        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aplicacionEscritorio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCalculate;
    private javax.swing.JTextField JTsalary;
    private javax.swing.JButton jBHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTRate;
    private javax.swing.JTextField jTSales;
    private javax.swing.JTextField jThours;
    private javax.swing.JComboBox tipoEmpleado;
    private javax.swing.JTextField wage;
    // End of variables declaration//GEN-END:variables
}
