
package Vista;

import Modelo.AccesoLinea;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Lineas extends javax.swing.JInternalFrame {

    AccesoLinea linea = new AccesoLinea();
    DefaultTableModel tm;
    int fila;
    int res = 1;
    int cont=0;

    public Lineas() {
        initComponents();
        cargarTabla();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtIdLinea = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtColorEstacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAnoInauguracion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLineas = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Lineas del Metro");

        jLabel2.setText("ID");

        jLabel3.setText("COLOR ESTACION");

        jLabel4.setText("AÑO DE INAUGURACION");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tblLineas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Color Estación", "Año de Inauguración"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLineas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLineasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLineas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(68, 68, 68)
                                .addComponent(btnActualizar)
                                .addGap(76, 76, 76)
                                .addComponent(btnEliminar)
                                .addGap(68, 68, 68)
                                .addComponent(btnLimpiar)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtColorEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnoInauguracion))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtColorEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtAnoInauguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro de ingresar Línea?");
        if (resp == 0) {
            tm = (DefaultTableModel) tblLineas.getModel();
        int idLinea = Integer.parseInt(txtIdLinea.getText());
        String colorEstacion = txtColorEstacion.getText();
        int anoInauguracion = Integer.parseInt(txtAnoInauguracion.getText());
        try {
            linea.ingresarLinea(idLinea, colorEstacion, anoInauguracion);
            limpiarTabla();
            JOptionPane.showMessageDialog(null, "Ingreado con éxito", "Ingreso Línea",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }
         
        limpiar();
            
        }else{
            JOptionPane.showMessageDialog(null, "No Ingreado", "Ingreso Línea",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro de actualizar la información de la Línea?");
        if (resp == 0) {
        
        int idLinea = Integer.parseInt(txtIdLinea.getText());
        tm.setValueAt(idLinea, fila, 0);
        String colorEstacion = txtColorEstacion.getText();
        tm.setValueAt(colorEstacion, fila, 1);
        int anoInauguracion = Integer.parseInt(txtAnoInauguracion.getText());
        tm.setValueAt(anoInauguracion, fila, 2);
        
        
        tblLineas.setModel(tm);
        
         try {
            linea.actualizarLinea(idLinea, colorEstacion, anoInauguracion);
            tblLineas.setModel(tm);
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Actualizado con éxito", "Actualizar Línea",
                    JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "No Actualizado", "Actualizar Línea",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void tblLineasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLineasMouseClicked
        fila = tblLineas.getSelectedRow();
        tm = (DefaultTableModel) tblLineas.getModel();
        
        String idLinea = String.valueOf(tm.getValueAt(fila, 0));
        txtIdLinea.setText(String.valueOf(idLinea));
        String colorEstacion = String.valueOf(tm.getValueAt(fila, 1));
        txtColorEstacion.setText(colorEstacion);
        String anoInauguracion = String.valueOf(tm.getValueAt(fila, 2));
        txtAnoInauguracion.setText(anoInauguracion);
    }//GEN-LAST:event_tblLineasMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        tm = (DefaultTableModel) tblLineas.getModel();
        
        int idLinea = Integer.parseInt(txtIdLinea.getText());
        tm.setValueAt(idLinea, fila, 0);
        
        tblLineas.setModel(tm);
        
        try {
            linea.eliminarLinea(idLinea);
            tm.removeRow(fila);
            tblLineas.setModel(tm);
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Eliminado con éxito", "Eliminar Línea",
                    JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void limpiarTabla(){
        tm = (DefaultTableModel) tblLineas.getModel();
        int total = tm.getRowCount();
        for (int i = total -1 ; i >= 0; i--) {
           tm.removeRow(i);
        }
        tblLineas.setModel(tm);
        cargarTabla();
    }
    
    public void cargarTabla(){
        ResultSet rs = linea.listarLinea();
        tm = (DefaultTableModel) tblLineas.getModel();
        try {
            while (rs.next()) {
                int idLinea = rs.getInt("idLinea");
                String colorEstacion = rs.getString("colorEstacion");
                int anoInauguracion = rs.getInt("anoInauguracion");
                
                
                tm.addRow(new Object[]{idLinea,colorEstacion,anoInauguracion});
            }
                tblLineas.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(Lineas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public void limpiar(){
        txtIdLinea.setText("");
        txtColorEstacion.setText("");
        txtAnoInauguracion.setText("");
        
        fila = -1;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblLineas;
    private javax.swing.JTextField txtAnoInauguracion;
    private javax.swing.JTextField txtColorEstacion;
    private javax.swing.JTextField txtIdLinea;
    // End of variables declaration//GEN-END:variables
}
