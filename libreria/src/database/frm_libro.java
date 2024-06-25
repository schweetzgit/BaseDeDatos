/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Random;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static libreria.Libreria.getConnection;

/**
 *
 * @author Carolina Colunga
 */
public class frm_libro extends javax.swing.JFrame {
    
    //ButtonGroup btnGr;
    /** Creates new form frm_libro */
    public frm_libro() {
        initComponents();
        cargarTabla();
        JOptionPane.showMessageDialog(null,"Conectado a la base de datos");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txt_isbn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_pag = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_edicion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_editorial = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_idioma = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_enc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_disp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_libros = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Libro");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Nirmala UI", 1, 18))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel10.setText("ISBN");

        txt_isbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_isbnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel2.setText("Paginas");

        txt_pag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_pagActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel3.setText("Edicion");

        txt_edicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edicionActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel4.setText("Editorial");

        txt_editorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_editorialActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel5.setText("Idioma");

        txt_idioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idiomaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel6.setText("Encuadernacion");

        txt_enc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_encActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel7.setText("Disponibilidad");

        txt_disp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dispActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabel8.setText("Nombre");

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_modificar.setText("Actualizar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_limpiar.setText("Limpiar");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(21, 21, 21)
                                .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_pag, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txt_enc))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_disp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txt_nombre)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_eliminar)
                    .addComponent(btn_modificar)
                    .addComponent(btn_guardar)
                    .addComponent(btn_limpiar))
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txt_isbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txt_pag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btn_guardar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_modificar)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txt_editorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_idioma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txt_enc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btn_eliminar)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_disp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_limpiar)
                .addContainerGap())
        );

        tbl_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Paginas", "Edicion", "Editorial", "Idioma", "Encuadernacion", "Diponible", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_libros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_librosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_libros);
        if (tbl_libros.getColumnModel().getColumnCount() > 0) {
            tbl_libros.getColumnModel().getColumn(0).setResizable(false);
            tbl_libros.getColumnModel().getColumn(0).setHeaderValue("ISBN");
            tbl_libros.getColumnModel().getColumn(1).setResizable(false);
            tbl_libros.getColumnModel().getColumn(1).setHeaderValue("Paginas");
            tbl_libros.getColumnModel().getColumn(2).setResizable(false);
            tbl_libros.getColumnModel().getColumn(2).setHeaderValue("Edicion");
            tbl_libros.getColumnModel().getColumn(3).setResizable(false);
            tbl_libros.getColumnModel().getColumn(3).setHeaderValue("Editorial");
            tbl_libros.getColumnModel().getColumn(4).setResizable(false);
            tbl_libros.getColumnModel().getColumn(4).setHeaderValue("Idioma");
            tbl_libros.getColumnModel().getColumn(5).setResizable(false);
            tbl_libros.getColumnModel().getColumn(5).setHeaderValue("Encuadernacion");
            tbl_libros.getColumnModel().getColumn(6).setResizable(false);
            tbl_libros.getColumnModel().getColumn(6).setHeaderValue("Diponible");
            tbl_libros.getColumnModel().getColumn(7).setResizable(false);
            tbl_libros.getColumnModel().getColumn(7).setHeaderValue("Nombre");
        }

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabel1.setText("Libros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_isbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_isbnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_isbnActionPerformed

    private void txt_pagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_pagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_pagActionPerformed

    private void txt_edicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edicionActionPerformed

    private void txt_editorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_editorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_editorialActionPerformed

    private void txt_idiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idiomaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idiomaActionPerformed

    private void txt_encActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_encActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_encActionPerformed

    private void txt_dispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dispActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:
        String isbn = txt_isbn.getText();
        int pag = Integer.parseInt(txt_pag.getText());
        String edicion = txt_edicion.getText();
        String editorial = txt_editorial.getText();
        String idioma = txt_idioma.getText();
        String enc = txt_enc.getText();
        int disp = Integer.parseInt(txt_disp.getText());
        String nombre = txt_nombre.getText();

        try{
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO libro (ISBN, paginas, edicion, editorial, idioma, encuadernacion, disponibilidad, nombre) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, isbn);
            ps.setInt(2, pag);
            ps.setString(3, edicion);
            ps.setString(4, editorial);
            ps.setString(5, idioma);
            ps.setString(6, enc);
            ps.setInt(7, disp);
            ps.setString(8, nombre);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro guardado");
            limpiar();
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }

    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        String isbn = txt_isbn.getText().toString();


        try{
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("DELETE FROM libro WHERE ISBN=?");
          
            ps.setString(1, isbn);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro eliminado");
            limpiar();
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void tbl_librosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_librosMouseClicked
        // TODO add your handling code here:
        try{
            int fila = tbl_libros.getSelectedRow();
            String isbn = tbl_libros.getValueAt(fila, 0).toString();
            PreparedStatement ps;
            ResultSet rs;
            
            Connection conn = getConnection();
            ps = conn.prepareStatement("SELECT paginas, edicion, editorial, idioma, encuadernacion, disponibilidad, nombre FROM libro WHERE ISBN=?");
            ps.setString(1, isbn);
            rs = ps.executeQuery();
            
            while(rs.next()){
                txt_isbn.setText(String.valueOf(isbn));
                txt_pag.setText(rs.getString("paginas"));
                txt_edicion.setText(rs.getString("edicion"));
                txt_editorial.setText(rs.getString("editorial"));
                txt_idioma.setText(rs.getString("idioma"));
                txt_enc.setText(rs.getString("encuadernacion"));
                txt_disp.setText(rs.getString("disponibilidad"));
                txt_nombre.setText(rs.getString("nombre"));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_tbl_librosMouseClicked

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        // TODO add your handling code here:
        
        String isbn = txt_isbn.getText().toString();
        int pag = Integer.parseInt(txt_pag.getText());
        String edicion = txt_edicion.getText();
        String editorial = txt_editorial.getText();
        String idioma = txt_idioma.getText();
        String enc = txt_enc.getText();
        int disp = Integer.parseInt(txt_disp.getText());
        String nombre = txt_nombre.getText();

        try{
            Connection conn = getConnection();
            PreparedStatement ps = conn.prepareStatement("UPDATE libro SET paginas=?, edicion=?, editorial=?, idioma=?, encuadernacion=?, disponibilidad=?, nombre=? WHERE ISBN=?");
            ps.setInt(1, pag);
            ps.setString(2, edicion);
            ps.setString(3, editorial);
            ps.setString(4, idioma);
            ps.setString(5, enc);
            ps.setInt(6, disp);
            ps.setString(7, nombre);
            ps.setString(8, isbn);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro actualizado");
            limpiar();
            cargarTabla();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_btn_limpiarActionPerformed
    private void limpiar(){
        txt_isbn.setText("");
        txt_pag.setText("");
        txt_edicion.setText("");
        txt_editorial.setText("");
        txt_idioma.setText("");
        txt_enc.setText("");
        txt_disp.setText("");
        txt_nombre.setText("");
    }
    private void cargarTabla(){
       DefaultTableModel  modeloTabla = (DefaultTableModel) tbl_libros.getModel();
       modeloTabla.setRowCount(0);
       
       PreparedStatement ps;
       ResultSet rs;
       ResultSetMetaData rsmd;
       int columnas;
       
       int[]anchos = {10,0, 20, 10, 10, 10,10,120};
       for(int i = 0; i < tbl_libros.getColumnCount(); i++){
           tbl_libros.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
       }
       
       try{
           Connection conn = getConnection();
           ps = conn.prepareStatement("SELECT ISBN, paginas, edicion, editorial, idioma, encuadernacion, disponibilidad, nombre FROM libro");
           rs = ps.executeQuery();
           rsmd = rs.getMetaData();
           columnas = rsmd.getColumnCount();
           
           while(rs.next()){
               Object[]fila = new Object[columnas];
               for(int indice = 0; indice < columnas; indice++){
                   fila[indice] = rs.getObject(indice + 1);
               }
               modeloTabla.addRow(fila);
           }
       }catch(SQLException e){
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_libro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_libro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_libros;
    private javax.swing.JTextField txt_disp;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_editorial;
    private javax.swing.JTextField txt_enc;
    private javax.swing.JTextField txt_idioma;
    private javax.swing.JTextField txt_isbn;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_pag;
    // End of variables declaration//GEN-END:variables

}
