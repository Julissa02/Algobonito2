/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import clasesmetodos.Apartado_metodos;
import clasesmetodos.Usuario_metodos;
import static interfaces.Cliente_buscar.nombre_cliente;
import static interfaces.Cliente_buscar.v_consulta;
import static interfaces.Cliente_buscar.valor_clientes;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 
 */
public class Apartado_pagos extends javax.swing.JInternalFrame {
Cliente_buscar cliebus= new Cliente_buscar();
Apartado_metodos apdao= new Apartado_metodos();
Usuario_metodos usm= new Usuario_metodos();
public static String id_apar=null;
DefaultTableModel modeloTablap;

    /**
     * Creates new form Apartado_pagos
     */
    public Apartado_pagos() {
        initComponents();
        vbuscarclientes.setVisible(false);
        btnprenda1.setVisible(false);
        resultado(1);
         String encabezado[]={"NO","ID APARTADO","FECHA","HORA","PAGO"}; String datos[][]={};
        modeloTablap=new DefaultTableModel(datos,encabezado); 
         
        tpagos.setModel(modeloTablap);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        vbuscarclientes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_pagos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdinerojuntado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtrestante = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tpagos = new javax.swing.JTable();
        txtfecha = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtvendedor = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnprenda1 = new javax.swing.JButton();
        lid_apartado = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombrecliente_pagosa = new javax.swing.JTextField();
        vpanel = new javax.swing.JPanel();
        lmensajepago = new javax.swing.JLabel();
        lid_clienteapartadopago = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        vbuscarclientes.setBackground(new java.awt.Color(255, 255, 255));

        tabla_pagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla_pagos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_pagosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_pagos);

        javax.swing.GroupLayout vbuscarclientesLayout = new javax.swing.GroupLayout(vbuscarclientes);
        vbuscarclientes.setLayout(vbuscarclientesLayout);
        vbuscarclientesLayout.setHorizontalGroup(
            vbuscarclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vbuscarclientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        vbuscarclientesLayout.setVerticalGroup(
            vbuscarclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vbuscarclientesLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("TOTAL DE APARTADO");

        txttotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txttotal.setForeground(new java.awt.Color(0, 0, 204));
        txttotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttotal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("CANTIDAD FALTANTE ");

        txtdinerojuntado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtdinerojuntado.setForeground(new java.awt.Color(51, 153, 0));
        txtdinerojuntado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdinerojuntado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("TOTAL DE DINERO RECAUDADO");

        txtrestante.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtrestante.setForeground(new java.awt.Color(153, 0, 0));
        txtrestante.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtrestante.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        tpagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tpagos);

        txtfecha.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtfecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtfecha.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("FECHA: ");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("VENDEDOR:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        txtvendedor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtvendedor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtvendedor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        btnprenda1.setBackground(new java.awt.Color(255, 255, 255));
        btnprenda1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnprenda1.setText("INGRESAR PAGO");
        btnprenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprenda1ActionPerformed(evt);
            }
        });

        lid_apartado.setText("jLabel2");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lid_apartado, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btnprenda1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(39, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lid_apartado)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(35, Short.MAX_VALUE)
                    .addComponent(btnprenda1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(txtdinerojuntado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52)
                                        .addComponent(txtrestante, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8))
                                        .addGap(39, 39, 39)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(126, 126, 126)
                                .addComponent(jLabel6)
                                .addGap(47, 47, 47)))
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1083, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtvendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdinerojuntado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtrestante, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CLIENTE: ");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        txtnombrecliente_pagosa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtnombrecliente_pagosa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombrecliente_pagosa.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtnombrecliente_pagosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombrecliente_pagosaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtnombrecliente_pagosa, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel1)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnombrecliente_pagosa, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vbuscarclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(vbuscarclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        vpanel.setBackground(new java.awt.Color(255, 255, 51));

        lmensajepago.setBackground(new java.awt.Color(0, 0, 0));
        lmensajepago.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lmensajepago.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lmensajepago.setText("APARTADO PAGADO COMPLETAMENTE");

        lid_clienteapartadopago.setText("0");

        javax.swing.GroupLayout vpanelLayout = new javax.swing.GroupLayout(vpanel);
        vpanel.setLayout(vpanelLayout);
        vpanelLayout.setHorizontalGroup(
            vpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vpanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lid_clienteapartadopago, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267)
                .addComponent(lmensajepago)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        vpanelLayout.setVerticalGroup(
            vpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lmensajepago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lid_clienteapartadopago))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(vpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       cliebus.setVisible(true);
          cliebus.v_consulta=15;
          vbuscarclientes.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void txtnombrecliente_pagosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombrecliente_pagosaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombrecliente_pagosaActionPerformed

    private void tabla_pagosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_pagosMouseClicked
         int filaInicio = tabla_pagos.getSelectedRow();
            int numFS = tabla_pagos.getSelectedRowCount();
            ArrayList<String> listId = new ArrayList();
            String id = "";
            if (filaInicio >= 0) {
                for (int i = 0; i < numFS; i++) {
                    id = String.valueOf(tabla_pagos.getValueAt(i + filaInicio, 0));
                    
                    listId.add(id);
                     
                    
                }
               mostrarapartado(id);
               id_apar=id;
                 
                 // txtcodigo.setEditable(false);
                
               
            } else {
              JOptionPane.showMessageDialog(null, "debes seleccionar solo una fila");
              
            }  
             vbuscarclientes.setVisible(false);
    }//GEN-LAST:event_tabla_pagosMouseClicked

    private void btnprenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprenda1ActionPerformed
      Cambio_apartado2 capa= new Cambio_apartado2 ();
        if( capa.isVisible()==false){
            String id_apa= lid_apartado.getText();
            
           capa.lid_apartadoAP.setText("1");
           capa.id_apartados=id_apa;
           capa.ltotale1.setText(txtrestante.getText());
            capa.lc_claveventa1.setText( id_apa);
           capa.setVisible(true);
        }
        else{
            capa.setVisible(false);
        }
    }//GEN-LAST:event_btnprenda1ActionPerformed
   
    
    
   public void resultado(int iresu){
       if(iresu==1){
           vpanel.setBackground(Color.BLUE);
           lmensajepago.setText(null);
       }
       if(iresu==2){
           vpanel.setBackground(Color.GREEN);
            lmensajepago.setText("APARTADO PAGADO TOTALMENTE");
           
       }
       if(iresu==3){
         vpanel.setBackground(Color.RED);   
          lmensajepago.setText("APARTADO PENDIENTE");
       }
 
   }
    
    
    public void clientespor(JTable tablaD,String t) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaD.setModel(modeloTabla);
       
     modeloTabla.addColumn("ID_APARTADO");
       modeloTabla.addColumn("FECHA INICIO");
       modeloTabla.addColumn("FECHA FIN");
       modeloTabla.addColumn("HORA");
        modeloTabla.addColumn("ESTADO");
  
      
    

        Object[] columna = new Object[5];
        int numReg=apdao.apartado_todo(t,1).size();

        for (int i = 0; i < numReg; i++) {
            
          int is_us=apdao.apartado_todo(t,1).get(i).getId_usuario();
         int esapr=  apdao.apartado_todo(t,1).get(i).getEstado_apartado();
         String napar=null;
         if(esapr==0){
             napar="PENDIENTE...";
         }
         if(esapr==5){
             napar="PAGO COMPLETO";
         }
         String iapart=apdao.apartado_todo(t,1).get(i).getId_apartado();
         
            System.out.println("el id del usuari es:"+is_us);
          columna[0] = iapart;
          columna[1] =apdao.apartado_todo(t,1).get(i).getFecha_inicio();
        
          columna[2] =  apdao.apartado_todo(t,1).get(i).getFecha_fin();
          columna[3] = apdao.apartado_todo(t,1).get(i).getHora();
           
           columna[4] = napar;
         
      
            modeloTabla.addRow(columna);
        }}
    
    public void mostra(){
        mostrarapartado(id_apar);
    }
    
    public void mostrarapartado(String id_apa){
     String fecha=  " INICIO: "+apdao.apartadotodoTDA(id_apa).getFecha_inicio()+" FIN: "+apdao.apartadotodoTDA(id_apa).getFecha_fin();
     String vendedo=usm.usTDAporid(apdao.apartadotodoTDA(id_apa).getId_usuario()).getNombre_completo();
     txtfecha.setText(fecha);
     txtvendedor.setText(vendedo);
     txttotal.setText(Double.toString(apdao.apartadotodoTDA(id_apa).getTotal_apartado()));
     Pagosapartados(tpagos,id_apa);
     lid_apartado.setText(id_apa);
         int tamrven=   tpagos.getRowCount();
     if( tamrven>0){
         
      pagoscontrol();
     double tot= Double.parseDouble(txttotal.getText());
     double tjun= Double.parseDouble(txtdinerojuntado.getText());
     if(tot>= tjun){
         double restaa=tot-tjun;
         txtrestante.setText(Double.toString(restaa));
         double restau=  Double.parseDouble(txtrestante.getText());
         if(restau>0){
             resultado(3);
             btnprenda1.setVisible(true);
         }
         if(restau==0){
             resultado(2);
              btnprenda1.setVisible(false);
         }
     }
     }
     
    }
        public void pagoscontrol(){
               
       int tamañovector=tpagos.getRowCount();
          if(tamañovector>0){
              double tf=0;
              int lart=0;
              for (int i =0; i < tamañovector; i++) {
           
                  double tprec=Double.parseDouble(tpagos.getModel().getValueAt(i,4).toString());
                  
                  
                tf=tf+tprec;
               txtdinerojuntado.setText(Double.toString(tf));
}
              
  }  
        }
         public void Pagosapartados(JTable tablaD,String t) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaD.setModel(modeloTabla);
       
     modeloTabla.addColumn("NO");
       modeloTabla.addColumn("ID APARTADO");
       modeloTabla.addColumn("FECHA");
       modeloTabla.addColumn("HORA");
       modeloTabla.addColumn("PAGO");
      
  
      
    

        Object[] columna = new Object[5];
        int numReg=apdao.pagosrporfecha(t).size();

        for (int i = 0; i < numReg; i++) {
    
          columna[0] = i+1;
          columna[1] =apdao.pagosrporfecha(t).get(i).getId_apartado();
        
          columna[2] = apdao.pagosrporfecha(t).get(i) .getFecha_pago();
          columna[3] = apdao.pagosrporfecha(t).get(i).getHora_pago();
          columna[4] = apdao.pagosrporfecha(t).get(i).getPago_apartado();
          
         
      
            modeloTabla.addRow(columna);
        }
         
         
         
         }
        
        public void limpiar(){
            btnprenda1.setVisible(false);
            resultado(1);
            txtnombrecliente_pagosa.setText(null);
            txtfecha.setText(null);
            txtvendedor.setText(null);
            txttotal.setText(null);
            txtdinerojuntado.setText(null);
            txtrestante.setText(null);
            //limpiartabla();
        }
        public void limpiartabla(){
    int modlta= modeloTablap.getRowCount()-1;
    for (int o = modlta; o>-1; o--) {
        modeloTablap.removeRow(o);
    }
  } 
          //  apago_idaparatado.setText(iapart);
           // String detalle_pago="FECHA INICIO: "+apdao.apartado_todo(t).get(i).getFecha_inicio()+"  FECHA FIN: "+apdao.apartado_todo(t).get(i).getFecha_fin();
        
        
     
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnprenda1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lid_apartado;
    public javax.swing.JLabel lid_clienteapartadopago;
    public javax.swing.JLabel lmensajepago;
    public javax.swing.JTable tabla_pagos;
    private javax.swing.JTable tpagos;
    private javax.swing.JTextField txtdinerojuntado;
    private javax.swing.JTextField txtfecha;
    public javax.swing.JTextField txtnombrecliente_pagosa;
    private javax.swing.JTextField txtrestante;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtvendedor;
    public javax.swing.JPanel vbuscarclientes;
    public javax.swing.JPanel vpanel;
    // End of variables declaration//GEN-END:variables
}
