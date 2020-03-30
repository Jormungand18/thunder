/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paneles;

import Pedido.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Rosario
 */
public class PanelJuridico extends javax.swing.JPanel {

    /**
     * Creates new form PanelJuridico
     */
    List<PedJuridico> lis=new ArrayList();
    public PanelJuridico() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        Queso = new javax.swing.JRadioButton();
        Leche = new javax.swing.JRadioButton();
        Mantequilla = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jurCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jurFecha = new javax.swing.JTextField();
        jurTienda = new javax.swing.JTextField();
        jurRuc = new javax.swing.JTextField();
        jurDireccion = new javax.swing.JTextField();
        jurCorreo = new javax.swing.JTextField();
        jurTelefono = new javax.swing.JTextField();
        jurGUARDAR = new javax.swing.JButton();
        jurLIMPIAR = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jurNroPedido = new javax.swing.JTextField();
        MOSTRAR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablita = new javax.swing.JTable();
        EliminarRegistro = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        PAGAAAR = new javax.swing.JTextField();

        jLabel1.setText("¿Qué desea comprar?");

        buttonGroup1.add(Queso);
        Queso.setText("Queso");

        buttonGroup1.add(Leche);
        Leche.setText("Leche");

        buttonGroup1.add(Mantequilla);
        Mantequilla.setText("Mantequilla");

        jLabel2.setText("Cantidad(múltiplo de 100)");

        jurCantidad.setColumns(10);

        jLabel3.setText("Fecha");

        jLabel4.setText("Nombre de la Tienda");

        jLabel5.setText("RUC");

        jLabel6.setText("Direccion");

        jLabel7.setText("Correo");

        jLabel8.setText("Telefono");

        jurFecha.setColumns(10);

        jurTienda.setColumns(10);

        jurRuc.setColumns(10);

        jurDireccion.setColumns(10);

        jurCorreo.setColumns(10);

        jurTelefono.setColumns(10);

        jurGUARDAR.setText("GUARDAR");
        jurGUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurGUARDARActionPerformed(evt);
            }
        });

        jurLIMPIAR.setText("LIMPIAR");
        jurLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurLIMPIARActionPerformed(evt);
            }
        });

        jLabel9.setText("Numero de Pedido");

        jurNroPedido.setColumns(10);

        MOSTRAR.setText("MOSTRAR PEDIDOS");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });

        tablita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nro Pedido", "Fecha ", "Cantidad", "Tienda", "RUC", "Telefono", "Direccion", "Correo"
            }
        ));
        jScrollPane1.setViewportView(tablita);

        EliminarRegistro.setText("ELIMINAR REGISTRO");
        EliminarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarRegistroActionPerformed(evt);
            }
        });

        jLabel10.setText("TOTAL A PAGAR:");

        jLabel11.setText("Soles");

        PAGAAAR.setColumns(7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jurGUARDAR)
                        .addGap(18, 18, 18)
                        .addComponent(jurLIMPIAR))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jurTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jurCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jurDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jurRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jurFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jurTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel9))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jurNroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jurCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(Queso)
                                .addGap(18, 18, 18)
                                .addComponent(Leche)
                                .addGap(19, 19, 19)
                                .addComponent(Mantequilla))
                            .addComponent(jLabel1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel10)
                                        .addGap(11, 11, 11)
                                        .addComponent(PAGAAAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(183, 183, 183)
                                        .addComponent(MOSTRAR)))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(EliminarRegistro)
                                        .addGap(180, 180, 180))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 486, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Queso)
                            .addComponent(Leche)
                            .addComponent(Mantequilla))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jurNroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jurCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jurFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jurTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jurRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(MOSTRAR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jurDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(EliminarRegistro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jurCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jurTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(PAGAAAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jurGUARDAR)
                    .addComponent(jurLIMPIAR))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jurLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurLIMPIARActionPerformed
        jurNroPedido.setText("");
        jurCantidad.setText("");
        jurFecha.setText("");
        jurTienda.setText("");
        jurRuc.setText("");
        jurDireccion.setText("");
        jurCorreo.setText("");
        jurTelefono.setText("");
        PAGAAAR.setText("");
    }//GEN-LAST:event_jurLIMPIARActionPerformed

    private void jurGUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurGUARDARActionPerformed
        int TotalPag;
        int NroPedidoo=Integer.parseInt(jurNroPedido.getText());       
        String Fechaa=jurFecha.getText();
        String Tiendaa=jurTienda.getText();
        int Rucc=Integer.parseInt(jurRuc.getText());
        String Direccionn=jurDireccion.getText();
        String Correoo=jurCorreo.getText();
        int telefonoo=Integer.parseInt(jurTelefono.getText());   
        if(Queso.isSelected()){
           
           int newCant=0;
           int condicion;  
           int Cantidadd=Integer.parseInt(jurCantidad.getText());
           int multiplosDe = 100;
           if(Cantidadd<=8000){
               condicion=Cantidadd%multiplosDe;  // el % mostrara si hay cociente
               if(condicion==0){
                   newCant=Cantidadd;
                   TotalPag=Cantidadd*10;
                   PedJuridico obj1=new PedJuridico(NroPedidoo, Fechaa, newCant, Tiendaa, Rucc, telefonoo, Direccionn, Correoo);
                   lis.add(obj1);
                   PAGAAAR.setText(Integer.toString(TotalPag));
                   JOptionPane.showMessageDialog(null, "¡Se guardo el Pedido!");
               }
               else{
                   JOptionPane.showMessageDialog(this, "El pedido ingresado no es multiplo de 100");
               }
           }  
           else{
               JOptionPane.showMessageDialog(this, "El pedido excede el stock");
           }
           
           
       }
       if(Leche.isSelected()){
       
           int newCant=0;
           int condicion;  
           int Cantidadd=Integer.parseInt(jurCantidad.getText());
           int multiplosDe = 100;
           if(Cantidadd<=10200){
               condicion=Cantidadd%multiplosDe;  // el % mostrara si hay cociente
               if(condicion==0){
                   newCant=Cantidadd;
                   TotalPag=Cantidadd*8;
                   PedJuridico obj1=new PedJuridico(NroPedidoo, Fechaa, newCant, Tiendaa, Rucc, telefonoo, Direccionn, Correoo);
                   lis.add(obj1);
                   PAGAAAR.setText(Integer.toString(TotalPag));
                   JOptionPane.showMessageDialog(null, "¡Se guardo el Pedido!");
               }
               else{
                   JOptionPane.showMessageDialog(this, "El pedido ingresado no es multiplo de 100");
               }
           }   
           else{
               JOptionPane.showMessageDialog(this, "El pedido excede el stock");
           }
           
           
       }
       if(Mantequilla.isSelected()){
       
           int newCant=0;
           int condicion;  
           int Cantidadd=Integer.parseInt(jurCantidad.getText());
           int multiplosDe = 100;
           if(Cantidadd<=12000){
               condicion=Cantidadd%multiplosDe;  // el % mostrara si hay cociente
               if(condicion==0){
                   newCant=Cantidadd;
                   TotalPag=Cantidadd*3;
                   PedJuridico obj1=new PedJuridico(NroPedidoo, Fechaa, newCant, Tiendaa, Rucc, telefonoo, Direccionn, Correoo);
                   lis.add(obj1);
                   PAGAAAR.setText(Integer.toString(TotalPag));
                   JOptionPane.showMessageDialog(null, "¡Se guardo el Pedido!");
               }
               else{
                   JOptionPane.showMessageDialog(this, "El pedido ingresado no es multiplo de 100");
               }
           }  
           else{
               JOptionPane.showMessageDialog(this, "El pedido excede el stock");
           }
           
           
       }
        
       
    }//GEN-LAST:event_jurGUARDARActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
        DefaultTableModel dt=(DefaultTableModel)tablita.getModel();
        dt.setRowCount(0);
        for (PedJuridico obj:lis) {
            dt.addRow(new Object[] {
                obj.getNroPedido() , obj.getFechaPedido(), obj.getCantPedido(),
                obj.getNomTienda(),obj.getRUC(),obj.getTelefono(),obj.getDireccion(),obj.getCorreo()

            });

        }

    }//GEN-LAST:event_MOSTRARActionPerformed

    private void EliminarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarRegistroActionPerformed
        DefaultTableModel dt=(DefaultTableModel)tablita.getModel();
        if(tablita.getSelectedRow()!= -1){
            dt.removeRow(tablita.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
        }
        else{
            JOptionPane.showMessageDialog(null, "No hay registro para eliminar");

        }
    }//GEN-LAST:event_EliminarRegistroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarRegistro;
    private javax.swing.JRadioButton Leche;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JRadioButton Mantequilla;
    private javax.swing.JTextField PAGAAAR;
    private javax.swing.JRadioButton Queso;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jurCantidad;
    private javax.swing.JTextField jurCorreo;
    private javax.swing.JTextField jurDireccion;
    private javax.swing.JTextField jurFecha;
    private javax.swing.JButton jurGUARDAR;
    private javax.swing.JButton jurLIMPIAR;
    private javax.swing.JTextField jurNroPedido;
    private javax.swing.JTextField jurRuc;
    private javax.swing.JTextField jurTelefono;
    private javax.swing.JTextField jurTienda;
    private javax.swing.JTable tablita;
    // End of variables declaration//GEN-END:variables
}