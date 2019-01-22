
package Vista;

import Modelo.AccesoLinea;
import Modelo.AccesoEstacion;
import Modelo.ComboBox;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Estaciones extends javax.swing.JInternalFrame {

    ComboBox combo;
    AccesoEstacion estacion = new AccesoEstacion();
    DefaultTableModel tm;
    int fila;
    int res = 1;
    int cont=0;
    AccesoLinea linea = new AccesoLinea();
    
    public Estaciones() {
        initComponents();
        cargarTabla();
        cargarComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtIdEstaciones = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombreEstacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbTipoEstacion = new javax.swing.JComboBox<>();
        chbTiendas = new javax.swing.JCheckBox();
        chbAireAcondicionado = new javax.swing.JCheckBox();
        chbAccesoMinusvalidos = new javax.swing.JCheckBox();
        chbSalidaParadero = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        cmbLinea = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstaciones = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Estaciones");

        jLabel2.setText("ID");

        txtIdEstaciones.setEditable(false);

        jLabel3.setText("NOMBRE");

        txtNombreEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEstacionActionPerformed(evt);
            }
        });

        jLabel4.setText("TIPO");

        cmbTipoEstacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal", "Autónomo" }));
        cmbTipoEstacion.setSelectedIndex(-1);
        cmbTipoEstacion.setToolTipText("");

        chbTiendas.setText("Tiendas?");

        chbAireAcondicionado.setText("Aire Acondicionado?");

        chbAccesoMinusvalidos.setText("Acceso Minusválidos?");

        chbSalidaParadero.setText("Salida a Paradero?");

        jLabel5.setText("LINEA");

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

        tblEstaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "TIPO", "TIENDAS?", "AIRE?", "MINUSVALIDOS?", "PARADERO?", "LINEA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.String.class
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
        tblEstaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEstacionesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEstaciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtIdEstaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombreEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cmbTipoEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cmbLinea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chbTiendas)
                                        .addGap(18, 18, 18)
                                        .addComponent(chbAireAcondicionado))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnGuardar)
                                        .addGap(51, 51, 51)
                                        .addComponent(btnActualizar)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chbAccesoMinusvalidos)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(btnEliminar)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar)
                                    .addComponent(chbSalidaParadero))
                                .addGap(0, 36, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdEstaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipoEstacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cmbLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chbTiendas)
                    .addComponent(chbAireAcondicionado)
                    .addComponent(chbAccesoMinusvalidos)
                    .addComponent(chbSalidaParadero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEstacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEstacionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro de ingresar Estación?");
        String cat;
        if (resp == 0) {
            tm = (DefaultTableModel) tblEstaciones.getModel();
        String nombreEstacion = txtNombreEstacion.getText();
        String tipoEstacion = (String) cmbTipoEstacion.getSelectedItem();
        boolean tiendas = chbTiendas.isSelected();
        boolean aireAcondicionado = chbAireAcondicionado.isSelected();
        boolean accesoMinusvalidos = chbAccesoMinusvalidos.isSelected();
        boolean salidaParadero = chbSalidaParadero.isSelected();
        ComboBox colorEstacion = (ComboBox) cmbLinea.getSelectedItem();
        try {
            estacion.ingresarEstacion(nombreEstacion, tipoEstacion, tiendas, aireAcondicionado,
                    accesoMinusvalidos, salidaParadero,colorEstacion.getIdLinea());
            limpiarTabla();
            tblEstaciones.setModel(tm);
            JOptionPane.showMessageDialog(null, "Ingreado con éxito", "Ingreso Estación",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
        }
         
        limpiar();
            
        }else{
            JOptionPane.showMessageDialog(null, "No Ingreado", "Ingreso Estación",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Seguro de actualizar la información de la Estación?");
        if (resp == 0) {
        
        int idEstaciones = Integer.parseInt(txtIdEstaciones.getText());
        tm.setValueAt(idEstaciones, fila, 0);
        String nombreEstacion = txtNombreEstacion.getText();
        tm.setValueAt(nombreEstacion, fila, 1);
        String tipoEstacion = (String) cmbTipoEstacion.getSelectedItem();
        tm.setValueAt(tipoEstacion, fila, 2);
        boolean tiendas = chbTiendas.isSelected();
        tm.setValueAt(tiendas, fila, 3);
        boolean aireAcondicionado = chbAireAcondicionado.isSelected();
        tm.setValueAt(aireAcondicionado, fila, 4);
        boolean accesoMinusvalidos = chbAccesoMinusvalidos.isSelected();
        tm.setValueAt(accesoMinusvalidos, fila, 5);
        boolean salidaParadero = chbSalidaParadero.isSelected();
        tm.setValueAt(salidaParadero, fila, 6); 
        ComboBox color = (ComboBox) cmbLinea.getSelectedItem();
        tm.setValueAt(color.getIdLinea(), fila, 7);
        
        
        
        tblEstaciones.setModel(tm);
        
         try {
            estacion.actualizarEstacion(idEstaciones, nombreEstacion, tipoEstacion, tiendas,
                    aireAcondicionado, accesoMinusvalidos, salidaParadero, color.getIdLinea());
            tblEstaciones.setModel(tm);
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Actualizado con éxito", "Actualizar Estación",
                    JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        }else{
            JOptionPane.showMessageDialog(null, "No Actualizado", "Actualizar Estación",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        tm = (DefaultTableModel) tblEstaciones.getModel();
        
        int idEstaciones = Integer.parseInt(txtIdEstaciones.getText());
        tm.setValueAt(idEstaciones, fila, 0);
        
        tblEstaciones.setModel(tm);
        
        try {
            estacion.eliminarEstacion(idEstaciones);
            tm.removeRow(fila);
            tblEstaciones.setModel(tm);
        } catch (Exception e) {
        }
        JOptionPane.showMessageDialog(null, "Eliminado con éxito", "Eliminar Estación",
                    JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
        limpiarTabla();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tblEstacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEstacionesMouseClicked
        fila = tblEstaciones.getSelectedRow();
        tm = (DefaultTableModel) tblEstaciones.getModel();
        
        String idEstaciones = String.valueOf(tm.getValueAt(fila, 0));
        txtIdEstaciones.setText(String.valueOf(idEstaciones));
        String nombreEstacion = String.valueOf(tm.getValueAt(fila, 1));
        txtNombreEstacion.setText(nombreEstacion);
        String tipoEstacion = String.valueOf(tm.getValueAt(fila, 2));
        cmbTipoEstacion.setSelectedItem(tipoEstacion);
        chbTiendas.setSelected((Boolean) tm.getValueAt(fila, 3));
        chbAireAcondicionado.setSelected((Boolean) tm.getValueAt(fila, 4));
        chbAccesoMinusvalidos.setSelected((Boolean) tm.getValueAt(fila, 5));
        chbSalidaParadero.setSelected((Boolean) tm.getValueAt(fila, 6));
        String color = String.valueOf(tm.getValueAt(fila, 7));
        cmbLinea.setSelectedItem(compararObjeto(color));
    }//GEN-LAST:event_tblEstacionesMouseClicked

    public void limpiarTabla(){
        tm = (DefaultTableModel) tblEstaciones.getModel();
        int total = tm.getRowCount();
        for (int i = total -1 ; i >= 0; i--) {
           tm.removeRow(i);
        }
        tblEstaciones.setModel(tm);
        cargarTabla();
    }
    
    public void cargarTabla(){
        ResultSet rs = estacion.listarEstacion();
        tm = (DefaultTableModel) tblEstaciones.getModel();
        try {
            while (rs.next()) {
                int idEstaciones = rs.getInt("id");
                String nombreEstacion = rs.getString("nombre");
                String tipoEstacion = rs.getString("tipo");
                boolean tiendas = rs.getBoolean("tiendas");
                boolean aireAcondicionado = rs.getBoolean("aire");
                boolean accesoMinusvalidos = rs.getBoolean("acceso");
                boolean salidaParadero = rs.getBoolean("paradero");
                String colorEstacion  = rs.getString("color");
                
                
                tm.addRow(new Object[]{idEstaciones,nombreEstacion,tipoEstacion,
                    tiendas,aireAcondicionado,accesoMinusvalidos,salidaParadero,colorEstacion});
            }
                tblEstaciones.setModel(tm);
        } catch (SQLException ex) {
            Logger.getLogger(Estaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    public void limpiar(){
        txtIdEstaciones.setText("");
        txtNombreEstacion.setText("");
        cmbTipoEstacion.setSelectedItem(-1);
        chbTiendas.setSelected(false);
        chbAireAcondicionado.setSelected(false);
        chbAccesoMinusvalidos.setSelected(false);
        chbSalidaParadero.setSelected(false);
        cmbLinea.setSelectedItem(-1);
        
        fila = -1;
    }
    
    public void cargarComboBox(){
        AccesoLinea linea = new AccesoLinea();
        ResultSet rs = linea.listarLinea();
        try {
            while (rs.next()) {
                cmbLinea.addItem(new ComboBox(rs.getInt("idLinea"),rs.getString("colorEstacion")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Estaciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ComboBox compararObjeto(String colorEstacion){
       ComboBox cm = new ComboBox();
       int total = cmbLinea.getItemCount();
        for (int i = 1; i < total; i++) {
            combo = (ComboBox) cmbLinea.getItemAt(i);
            if (combo.getColorEstacion().equals(colorEstacion)) {
                cm = combo;
            }    
        }
        return cm;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JCheckBox chbAccesoMinusvalidos;
    private javax.swing.JCheckBox chbAireAcondicionado;
    private javax.swing.JCheckBox chbSalidaParadero;
    private javax.swing.JCheckBox chbTiendas;
    private javax.swing.JComboBox<Object> cmbLinea;
    private javax.swing.JComboBox<String> cmbTipoEstacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tblEstaciones;
    private javax.swing.JTextField txtIdEstaciones;
    private javax.swing.JTextField txtNombreEstacion;
    // End of variables declaration//GEN-END:variables
}
