/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Ropa;
import clasesmetodos.Ropa_metodos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class Registro_ropa extends javax.swing.JInternalFrame {
Ropa rp= new    Ropa();
Ropa_metodos rm= new Ropa_metodos();
Otros otros= new Otros();
Validaciones valida= new Validaciones();

 
    /**
     * Creates new form Registro_ropa
     */
    public Registro_ropa() {
        initComponents();
         this.setClosable(true);
        this.setMaximizable(true);
         btnguardarropa.setVisible(true);
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
        txtcodigo = new javax.swing.JTextField();
        lcodigodeprenda = new javax.swing.JLabel();
        txtmarca = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txttipo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txttalla = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        cbttipoprenda = new javax.swing.JComboBox<>();
        txtbuscar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaropa = new javax.swing.JTable();
        btningresar = new javax.swing.JButton();
        btnguardarropa = new javax.swing.JButton();
        txtdescripcion = new javax.swing.JTextField();
        cbttipoprenda1 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtcodigo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        txtcodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodigoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcodigoKeyTyped(evt);
            }
        });

        lcodigodeprenda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lcodigodeprenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lcodigodeprenda.setText("CODIGO DE PRENDA");

        txtmarca.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtmarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtmarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtmarcaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("MARCA");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIPO DE PRENDA");

        txttipo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txttipo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttipoActionPerformed(evt);
            }
        });
        txttipo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttipoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DESCRIPCION");

        txttalla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txttalla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txttalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttallaKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TALLA");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PRECIO");

        txtprecio.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioActionPerformed(evt);
            }
        });
        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });

        cbttipoprenda.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        cbttipoprenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA:", "PLAYERA", "CAMISA", "PANTALON", "VESTIDO", "BLUSA", "FALDA", "SHORT", "BERMUDA" }));
        cbttipoprenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbttipoprendaActionPerformed(evt);
            }
        });

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("BUSCAR");

        tablaropa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaropa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaropaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaropa);

        btningresar.setBackground(new java.awt.Color(153, 51, 0));
        btningresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btningresar.setForeground(new java.awt.Color(255, 255, 255));
        btningresar.setText("BORRAR");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        btnguardarropa.setBackground(new java.awt.Color(0, 0, 0));
        btnguardarropa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnguardarropa.setForeground(new java.awt.Color(255, 255, 255));
        btnguardarropa.setText("REGISTRAR");
        btnguardarropa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarropaActionPerformed(evt);
            }
        });

        txtdescripcion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtdescripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });

        cbttipoprenda1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        cbttipoprenda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA:", "CHICA", "MEDIANA", "GRANDE", "5", "6", "7", "8", "9", "10", "11", "28", "30", "32", "36" }));
        cbttipoprenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbttipoprenda1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lcodigodeprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnguardarropa, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbttipoprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttalla, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbttipoprenda1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 926, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lcodigodeprenda)
                        .addGap(3, 3, 3)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbttipoprenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttalla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbttipoprenda1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13)
                        .addComponent(txtdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(13, 13, 13)
                        .addComponent(txtprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnguardarropa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btningresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        rellenarRopa(txtcodigo.getText());

    }//GEN-LAST:event_txtcodigoActionPerformed

    private void txtcodigoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyReleased
        int x=evt.getExtendedKeyCode();
        int y=evt.getKeyCode();
        System.out.println("x="+x);
        System.out.println("y"+y);
    }//GEN-LAST:event_txtcodigoKeyReleased

    private void txtcodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodigoKeyTyped
        // TODO add your handling code here:
        //datos_completos();
        valida.numeros(evt,txtcodigo, 5);
    }//GEN-LAST:event_txtcodigoKeyTyped

    private void txtmarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmarcaKeyTyped
        // TODO add your handling code here:
        //datos_completos();
        valida.texto(evt,txtmarca,15);
    }//GEN-LAST:event_txtmarcaKeyTyped

    private void txttipoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttipoKeyTyped
    /*txttipo.getText().toUpperCase();
        int ct=txttipo.getText().length();

        int x=evt.getExtendedKeyCode();
        int y=evt.getKeyCode();
        System.out.println("x="+x);
        System.out.println("y"+y);
        // evt.setKeyCode;
       // datos_completos();
        */
    valida.texto(evt, txttipo,15);
    }//GEN-LAST:event_txttipoKeyTyped

    private void txttallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttallaKeyTyped
        // TODO add your handling code here:
        //datos_completos();
        valida.numylet(evt, txttalla, 15);
    }//GEN-LAST:event_txttallaKeyTyped

    private void txtprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioActionPerformed

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        // TODO add your handling code here:
       // datos_completos();
       
       valida.numpnt(evt, txtprecio);
    }//GEN-LAST:event_txtprecioKeyTyped

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
        limpiarrr();

    }//GEN-LAST:event_btningresarActionPerformed

    private void btnguardarropaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarropaActionPerformed
        String tc=otros.novacio(txtcodigo.getText());
        String tp= otros.novacio(rm.ropaTDA(tc).getClave());
       if(!"".equals(tp)){
        if(tc.equals(tp)){
            
            //System.out.println("producto registrado");
            JOptionPane.showMessageDialog(null,"PRODUCTO YA REGISTRADO");
            //limpiarrr();
           
        }
       }
        else{
            guardarropa();
           
        
         }
    }//GEN-LAST:event_btnguardarropaActionPerformed

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
      valida.texto(evt,txtdescripcion,15);
      
    }//GEN-LAST:event_txtdescripcionKeyTyped

    private void tablaropaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaropaMouseClicked
    
         int filaInicio = tablaropa.getSelectedRow();
            int numFS = tablaropa.getSelectedRowCount();
            ArrayList<String> listId = new ArrayList();
            String id = "";
            if (filaInicio >= 0) {
                for (int i = 0; i < numFS; i++) {
                    id = String.valueOf(tablaropa.getValueAt(i + filaInicio, 0));
                    listId.add(id);
                }
               txtcodigo.setText(id);
               rellenarRopa(id);
               btningresar.setVisible(true);
               
              
               
                 // txtcodigo.setEditable(false);
                
               
            } else {
                JOptionPane.showMessageDialog(null, "debes seleccionar solo una fila");
              //  btnok.setVisible(false);
            }  
    }//GEN-LAST:event_tablaropaMouseClicked

    private void cbttipoprendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbttipoprendaActionPerformed
        String t=(String)  cbttipoprenda.getSelectedItem();
     if(t.equals("SELECCIONA:")){
        txttipo.setText(null);
    }
     else{
         txttipo.setText(t);
     }
    }//GEN-LAST:event_cbttipoprendaActionPerformed

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
       String buscar=  txtbuscar.getText();
      if(buscar.isEmpty()){
          System.out.println("nada en buscar");
      }
      else{
          mostrarpor(tablaropa,buscar);
      }
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void txttipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttipoActionPerformed

    private void cbttipoprenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbttipoprenda1ActionPerformed
         String t=(String)  cbttipoprenda1.getSelectedItem();
     if(t.equals("SELECCIONA:")){
       txttalla.setText(null);
    }
     else{
      txttalla.setText(t);
     }
    }//GEN-LAST:event_cbttipoprenda1ActionPerformed

    public void limpiarrr(){
    txtcodigo.setText(null);
    txtdescripcion.setText(null);
    txtmarca.setText(null);
    txtprecio.setText(null);
    txttalla.setText(null);
    txttipo.setText(null);
   // btnguardarropa.setVisible(false);
}

/*public void datos_completos(){
     String dcomple=null;
     for (int i = 0; i < 9; i++) {
     dcomple= cajasvacias(txtcodigo.getText()) + cajasvacias(txtdescripcion.getText())+
      cajasvacias(txtmarca.getText())+cajasvacias(txtprecio.getText())+
      cajasvacias(txttalla.getText())+cajasvacias(txttipo.getText());
    }
     if(dcomple.equals("AAAAAA")){
         btnguardarropa.setVisible(true);
     }
     else{
        btnguardarropa.setVisible(false);
     }
}
*/

 public String mayus(String my){
       return my.toUpperCase();
   }
public String cajasvacias(String cvh){
    String cjv=null;
    if(cvh.isEmpty()){
        cjv=null;
    }
    else{
        cjv="A";
    }
    return cjv;
}
    
public void rellenarRopa(String rropa){
 // txtcodigo.setText(rm.ropaTDA(r).getClave( ));
    txtdescripcion.setText(rm.ropaTDA(rropa).getDescripcion());
   txtmarca.setText(rm.ropaTDA(rropa).getMarca());
    double precioregistro =rm.ropaTDA(rropa).getPrecio();
    if(precioregistro==0){
        txtprecio.setText(null);
    }
    if(precioregistro>0){
        txtprecio.setText(Double.toString(precioregistro));
    }
   
    txttalla.setText(rm.ropaTDA(rropa).getTalla());
    txttipo.setText(rm.ropaTDA(rropa).getTipo_producto());
   
}
    
    public void guardarropa(){
        try{
     String codigo=txtcodigo.getText();
     String descripcion=otros.novacio(txtdescripcion.getText());
     String marca=otros.novacio(txtmarca.getText());
    String pre=otros.novacio(txtprecio.getText());
    String talla=otros.novacio(txttalla.getText());
    String tipop=otros.novacio(txttipo.getText());
    double prec=0;
    String val[]=  {"","","","","",""};
    String dete="N";
    
    if(codigo.length()<4 && valida.vnumentero(codigo)==false){
        dete="ESCRIBE ALMENOS TRES NUMEROS EN EL ID";
        val[0]=dete;
    }
      if(descripcion.length()<4){
        dete="ESCRIBE ALMENOS CUATRO CARACTERES EN LA DESCRIPCION";
        val[1]=dete;
    }
     if(marca.length()<3){
        dete="ESCRIBE ALMENOS TRES CARACTERES EN LA MARCA";
        val[2]=dete;
    }
     if(valida. vdecimal(pre)==false){
        dete="EN EL PRECIO PUEDES PONER (80,80.0,95.5)";
        val[3]=dete;
       
    }else{
          prec=Double.parseDouble(pre);
     }
         
     if(tipop.length()<5){
        dete="ESCRIBE ALMENOS CINCO CARACTERES EN TIPO";
        val[4]=dete;
    }
     if(talla.length()<2){
        dete="ESCRIBE ALMENOS DOS EN LA TALLA ";
        val[5]=dete;
    }
   if(dete.equals("N")){
     
   rp.setClave(codigo);
    rp.setDescripcion(descripcion);
    rp.setMarca(marca);
    rp.setPrecio(prec);
    rp.setTalla(talla);
    rp.setTipo_producto(tipop);
    rp.setCantidad_existente(0);
   int ttt= rm.guardar_ropa(rp);
       System.out.println("TAMAÑO= "+ttt);
   if(ttt==0){
     mostrarropa(tablaropa);
     JOptionPane.showMessageDialog(null,"SE GUARDO EL PRODUCTO "+codigo);
      limpiarrr();
   }
   }else{
       JOptionPane.showMessageDialog(null,val);
   }
    
        }catch(Exception e){
            System.out.println(e);
        }
    
    }

        public void mostrarpor(JTable tablaD,String t) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaD.setModel(modeloTabla);
       
     modeloTabla.addColumn("CLAVE");
       modeloTabla.addColumn("TIPO DE PRENDA");
       modeloTabla.addColumn("MARCA");
       modeloTabla.addColumn("TALLA");
       modeloTabla.addColumn("DESCRIPCIÓN");
        modeloTabla.addColumn("PRECIO");
      
    

        Object[] columna = new Object[6];
        int numReg=rm.Ropatotal(t).size();

        for (int i = 0; i < numReg; i++) {
            
          columna[0] = rm.Ropatotal(t).get(i).getClave();
          columna[1] = rm.Ropatotal(t).get(i).getTipo_producto();
          columna[2] = rm.Ropatotal(t).get(i).getMarca();
          columna[3] = rm.Ropatotal(t).get(i).getTalla();
          columna[4] = rm.Ropatotal(t).get(i).getDescripcion();
          columna[5] = rm.Ropatotal(t).get(i).getPrecio();
       
           
        

           
            modeloTabla.addRow(columna);
        }
    }
    
             public void mostrarropa(JTable tablaD) {
        DefaultTableModel modeloTabla = new DefaultTableModel();
        tablaD.setModel(modeloTabla);
       
     modeloTabla.addColumn("CLAVE");
       modeloTabla.addColumn("TIPO DE PRENDA");
       modeloTabla.addColumn("MARCA");
       modeloTabla.addColumn("TALLA");
       modeloTabla.addColumn("DESCRIPCIÓN");
        modeloTabla.addColumn("PRECIO");
      
    

        Object[] columna = new Object[6];
        int numReg=rm.ropatodo().size();

        for (int i = 0; i < numReg; i++) {
            
          columna[0] = rm.ropatodo().get(i).getClave();
          columna[1] = rm.ropatodo().get(i).getTipo_producto();
          columna[2] = rm.ropatodo().get(i).getMarca();
          columna[3] = rm.ropatodo().get(i).getTalla();
          columna[4] = rm.ropatodo().get(i).getDescripcion();
          columna[5] = rm.ropatodo().get(i).getPrecio();
       
           
        

           
            modeloTabla.addRow(columna);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnguardarropa;
    public javax.swing.JButton btningresar;
    public javax.swing.JComboBox<String> cbttipoprenda;
    public javax.swing.JComboBox<String> cbttipoprenda1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel lcodigodeprenda;
    private javax.swing.JTable tablaropa;
    public javax.swing.JTextField txtbuscar;
    public javax.swing.JTextField txtcodigo;
    public javax.swing.JTextField txtdescripcion;
    public javax.swing.JTextField txtmarca;
    public javax.swing.JTextField txtprecio;
    public javax.swing.JTextField txttalla;
    public javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}
