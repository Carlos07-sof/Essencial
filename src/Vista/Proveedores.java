package Vista;

import Controlador.control_Proveedor;
import Modelo.Proveedor;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Proveedores extends javax.swing.JPanel {

    public Proveedores() {
        this.setSize(new Dimension(1370, 679));
        initComponents();
        Panel_Añadir.setVisible(false);
        Panel_Actualizar.setVisible(false);
        Mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Proveedores_t = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Actualizar_btn = new javax.swing.JButton();
        Eliminar_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Id_buscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        Añadir = new javax.swing.JButton();
        Panel_Actualizar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Email_act = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Telefono_act = new javax.swing.JTextField();
        Razon_act = new javax.swing.JTextField();
        Direccion_act = new javax.swing.JTextField();
        Categoria_act = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Panel_Añadir = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Razon = new javax.swing.JTextField();
        Telefono = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        Categoria = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Proveedores_t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Proveedores_t.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Proveedores_tMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Proveedores_t);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 900, 250));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Actualizar_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Actualizar_btn.setText("Actualizar");
        Actualizar_btn.setEnabled(false);
        Actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Actualizar_btnActionPerformed(evt);
            }
        });

        Eliminar_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Eliminar_btn.setText("Eliminar");
        Eliminar_btn.setEnabled(false);
        Eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_btnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Elegir Proveedor:");

        btnbuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnbuscar.setText("Elegir");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(82, Short.MAX_VALUE)
                        .addComponent(btnbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(Id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Actualizar_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Eliminar_btn)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addComponent(Id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar_btn)
                    .addComponent(Eliminar_btn))
                .addGap(24, 24, 24))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 250, 250));

        Añadir.setText("Añadir Proveedor");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 40, -1, -1));

        Panel_Actualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Id producto:");

        Id.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Proveedor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Email:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Telefono:");

        jLabel12.setText("Direccion:");

        jLabel13.setText("Categoria:");

        javax.swing.GroupLayout Panel_ActualizarLayout = new javax.swing.GroupLayout(Panel_Actualizar);
        Panel_Actualizar.setLayout(Panel_ActualizarLayout);
        Panel_ActualizarLayout.setHorizontalGroup(
            Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Razon_act, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12)
                            .addComponent(Direccion_act, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Categoria_act, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Telefono_act, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(Email_act, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        Panel_ActualizarLayout.setVerticalGroup(
            Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Razon_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Categoria_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        add(Panel_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 390, 620, 250));

        Panel_Añadir.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registro");

        Guardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Categoria");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Direccion");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Email");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Telefono");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Razon social");

        javax.swing.GroupLayout Panel_AñadirLayout = new javax.swing.GroupLayout(Panel_Añadir);
        Panel_Añadir.setLayout(Panel_AñadirLayout);
        Panel_AñadirLayout.setHorizontalGroup(
            Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AñadirLayout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(77, 77, 77))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AñadirLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(54, 54, 54)))
                            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(70, 70, 70)))
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Guardar)
                            .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Direccion, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Telefono, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Razon, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 56, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Panel_AñadirLayout.setVerticalGroup(
            Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Razon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(26, 26, 26)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(29, 29, 29)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(27, 27, 27)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addComponent(Guardar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        add(Panel_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 400, 390));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Gestion de proveedores");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1370, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void Proveedores_tMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Proveedores_tMouseClicked

    }//GEN-LAST:event_Proveedores_tMouseClicked

    private void Actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_btnActionPerformed
        if (!Razon_act.getText().isEmpty()) {
            if (!Telefono_act.getText().isEmpty()) {
                if (!Email_act.getText().isEmpty()) {
                    if (!Direccion_act.getText().isEmpty()) {
                        if (!Categoria_act.getText().isEmpty()) {
                            Actualizar();
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_Actualizar_btnActionPerformed

    private void Eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_btnActionPerformed
        String[] arreglo = {"Si", "No"};
        // int opcionp = JOptionPane.showOptionDialog(null, "¿Esta seguro de eliminar " + eliminar + " ?", mensaje, 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "No");
        //if (arreglo[opcionp].equals("Si")) {
        //      Eliminar(Integer.parseInt(Id_buscar.getText()));
        // }
    }//GEN-LAST:event_Eliminar_btnActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        Buscar(Integer.parseInt(Id_buscar.getText()));
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        if (Añadir.getText().equals("Añadir Proveedor")) {
            Panel_Añadir.setVisible(true);
            Añadir.setText("Ocultar");
        } else {
            Panel_Añadir.setVisible(false);
            Añadir.setText("Añadir Proveedor");
        }
    }//GEN-LAST:event_AñadirActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        if (!Razon.getText().isEmpty()) {
            if (!Telefono.getText().isEmpty()) {
                if (!Email.getText().isEmpty()) {
                    if (!Direccion.getText().isEmpty()) {
                        if (!Categoria.getText().isEmpty()) {
                            Insertar(Razon.getText(), Telefono.getText(), Email.getText(), Direccion.getText(), Categoria.getText());
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void Limpiar_Actualizar() {
        Id.setText("");
        Razon_act.setText("");
        Telefono_act.setText("");
        Email_act.setText("");
        Direccion_act.setText("");
        Categoria_act.setText("");
        Panel_Actualizar.setVisible(false);
    }
    
    private void Limpiar_Insertar() {
        Añadir.setText("Añadir Proveedor");
        Razon.setText("");
        Telefono.setText("");
        Email.setText("");
        Direccion.setText("");
        Categoria.setText("");
        Panel_Añadir.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_btn;
    private javax.swing.JButton Añadir;
    private javax.swing.JTextField Categoria;
    private javax.swing.JTextField Categoria_act;
    private javax.swing.JTextField Direccion;
    private javax.swing.JTextField Direccion_act;
    private javax.swing.JButton Eliminar_btn;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Email_act;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Id_buscar;
    private javax.swing.JPanel Panel_Actualizar;
    private javax.swing.JPanel Panel_Añadir;
    private javax.swing.JTable Proveedores_t;
    private javax.swing.JTextField Razon;
    private javax.swing.JTextField Razon_act;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField Telefono_act;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Insertar(String nombre, String telefono, String email, String direccion, String categoria) {
        control_Proveedor cp = new control_Proveedor();

        Proveedor P = new Proveedor(nombre, telefono, email, direccion, categoria);
        boolean status = cp.Insertar_proveedor(P);

        if (status) {
            JOptionPane.showMessageDialog(null, "Proveedor Registrado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            Limpiar_Insertar();
            Mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar el proveedor", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void Actualizar() {
        control_Proveedor cp = new control_Proveedor();
        Proveedor p = new Proveedor(Integer.parseInt(Id.getText()),
                Razon_act.getText(),
                Telefono_act.getText(),
                Email_act.getText(),
                Direccion_act.getText(),
                Categoria_act.getText());
        
        boolean status = cp.Actualizar_Proveedor(p);
        
        if (status) {
            JOptionPane.showMessageDialog(null, "Proveedor Actualizado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            Limpiar_Actualizar();
            Mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el proveedor", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void Buscar(int id) {
        control_Proveedor cp = new control_Proveedor();
        List<Proveedor> lista = cp.Search(id);
        int tam = lista.size();
        if (tam > 0) {
            Panel_Actualizar.setVisible(true);
            Actualizar_btn.setEnabled(true);
            Eliminar_btn.setEnabled(true);
            for (int i = 0; i < tam; i++) {
                Id.setText(lista.get(i).getId_proveedor().toString());
                Razon_act.setText(lista.get(i).getRazon_social());
                Telefono_act.setText(lista.get(i).getTelefono());
                Email_act.setText(lista.get(i).getEmail());
                Direccion_act.setText(lista.get(i).getDireccion());
                Categoria_act.setText(lista.get(i).getCategoria());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros para el id: " + id, "Sin registros", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void Mostrar() {
        control_Proveedor pr = new control_Proveedor();
        List<Proveedor> lista = pr.Tabla_proveedores();
        int tam = lista.size();
        String list[][] = new String[tam][6];
        for (int i = 0; i < tam; i++) {
            list[i][0] = String.valueOf(lista.get(i).getId_proveedor());
            list[i][1] = lista.get(i).getRazon_social();
            list[i][2] = lista.get(i).getTelefono();
            list[i][3] = lista.get(i).getEmail();
            list[i][4] = lista.get(i).getDireccion();
            list[i][5] = lista.get(i).getCategoria();
        }
        Proveedores_t.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "N°", "Razon social", "Telefono", "Email", "Direccion", "Categoria"
                }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

}
