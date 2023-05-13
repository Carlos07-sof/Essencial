package Vista;

import Controlador.control_Usuario;
import Modelo.Usuario;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JOptionPane;

public class Gestionar_usuarios extends javax.swing.JPanel {

    public Gestionar_usuarios() {
        initComponents();
        Panel_Añadir.setVisible(false);
        Panel_Actualizar.setVisible(false);
        Mostrar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_mostrar = new javax.swing.JTable();
        Panel_Añadir = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nombre_re = new javax.swing.JTextField();
        Apellido_p_re = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Apellido_m_re = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        User_re = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Password_re = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Telefono_re = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Añadir = new javax.swing.JButton();
        Panel_Actualizar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Apellido_p = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Nombre_act = new javax.swing.JTextField();
        Apellido_m = new javax.swing.JTextField();
        User = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Telefono = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Actualizar_btn = new javax.swing.JButton();
        Eliminar_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        Id_buscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla_mostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tabla_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_mostrarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_mostrar);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 900, 250));

        Panel_Añadir.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Titulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Nuevo Usuario");

        btnguardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        jPanel8.setLayout(new javax.swing.BoxLayout(jPanel8, javax.swing.BoxLayout.LINE_AXIS));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Password:");
        jPanel8.add(jLabel11);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nombre:");

        Nombre_re.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre_reKeyTyped(evt);
            }
        });

        Apellido_p_re.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apellido_p_reKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Apellio Paterno:");

        Apellido_m_re.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apellido_m_reKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Apellio Materno:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Usuario:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Password:");

        Telefono_re.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Telefono_reKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Telefono:");

        javax.swing.GroupLayout Panel_AñadirLayout = new javax.swing.GroupLayout(Panel_Añadir);
        Panel_Añadir.setLayout(Panel_AñadirLayout);
        Panel_AñadirLayout.setHorizontalGroup(
            Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Panel_AñadirLayout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel12)))
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(User_re)
                            .addComponent(Nombre_re, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Apellido_p_re, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Apellido_m_re, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Password_re, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                            .addComponent(Telefono_re))
                        .addGap(280, 280, 280)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnguardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel_AñadirLayout.setVerticalGroup(
            Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addComponent(Titulo)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AñadirLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Nombre_re, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Apellido_p_re, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Apellido_m_re, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(User_re, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Password_re, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Telefono_re, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(btnguardar)
                .addGap(55, 55, 55))
        );

        add(Panel_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 400, 390));

        Añadir.setText("Añadir Usuario");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 40, -1, -1));

        Panel_Actualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Id usuario:");

        Id.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido Materno:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Apellido Paterno:");

        Apellido_p.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apellido_pKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        Nombre_act.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre_actKeyTyped(evt);
            }
        });

        Apellido_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apellido_mKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Usuario:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Password:");

        Telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TelefonoKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Telefono:");

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

        javax.swing.GroupLayout Panel_ActualizarLayout = new javax.swing.GroupLayout(Panel_Actualizar);
        Panel_Actualizar.setLayout(Panel_ActualizarLayout);
        Panel_ActualizarLayout.setHorizontalGroup(
            Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ActualizarLayout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                        .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nombre_act, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                        .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                                .addComponent(Actualizar_btn)
                                .addGap(40, 40, 40)
                                .addComponent(Eliminar_btn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_ActualizarLayout.createSequentialGroup()
                                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))))
                        .addGap(37, 37, 37)
                        .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(62, 62, 62))
        );
        Panel_ActualizarLayout.setVerticalGroup(
            Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ActualizarLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_ActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar_btn)
                    .addComponent(Eliminar_btn))
                .addGap(0, 38, Short.MAX_VALUE))
        );

        add(Panel_Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 640, 290));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Elegir Usuario:");

        Id_buscar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Id_buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Id_buscarKeyTyped(evt);
            }
        });

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
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnbuscar)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel7)
                .addGap(31, 31, 31)
                .addComponent(Id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbuscar)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 240, 180));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Gestion de usuarios");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1370, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void Tabla_mostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_mostrarMouseClicked

    }//GEN-LAST:event_Tabla_mostrarMouseClicked

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (!Nombre_re.getText().isEmpty()) {
            if (!Apellido_p_re.getText().isEmpty()) {
                if (!Apellido_m_re.getText().isEmpty()) {
                    if (!Telefono_re.getText().isEmpty()) {
                        if (!User_re.getText().isEmpty()) {
                            if (!Password_re.getText().isEmpty()) {
                                InsertarUsuario();
                            } else {
                                Password_re.requestFocus();
                            }
                        } else {
                            User_re.requestFocus();
                        }
                    } else {
                        Telefono_re.requestFocus();
                    }
                } else {
                    Apellido_m_re.requestFocus();
                }
            } else {
                Apellido_p_re.requestFocus();
            }
        } else {
            Nombre_re.requestFocus();
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        if (Añadir.getText().equals("Añadir Usuario")) {
            Panel_Añadir.setVisible(true);
            Añadir.setText("Ocultar");
        } else {
            Panel_Añadir.setVisible(false);
            Añadir.setText("Añadir Usuario");
        }
    }//GEN-LAST:event_AñadirActionPerformed

    private void Actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_btnActionPerformed
        if (!Nombre_act.getText().isEmpty()) {
            if (!Apellido_p.getText().isEmpty()) {
                if (!Apellido_m.getText().isEmpty()) {
                    if (!Telefono.getText().isEmpty()) {
                        if (!User.getText().isEmpty()) {
                            if (!Password.getText().isEmpty()) {
                                ActualizarUser();
                            } else {
                                Password.requestFocus();
                            }
                        } else {
                            User.requestFocus();
                        }
                    } else {
                        Telefono.requestFocus();
                    }
                } else {
                    Apellido_m.requestFocus();
                }
            } else {
                Apellido_p.requestFocus();
            }
        } else {
            Nombre_act.requestFocus();
        }
    }//GEN-LAST:event_Actualizar_btnActionPerformed

    private void Eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_btnActionPerformed
        /* String[] arreglo = {"Si", "No"};
        int opcionp = JOptionPane.showOptionDialog(null, "¿Esta seguro de eliminar " + eliminar + " ?", mensaje, 0, JOptionPane.QUESTION_MESSAGE, null, arreglo, "No");
        if (arreglo[opcionp].equals("Si")) {
            Eliminar(Integer.parseInt(Id_buscar.getText()));
        }*/
    }//GEN-LAST:event_Eliminar_btnActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        if (!Id_buscar.getText().isEmpty()) {
            buscarUsuario();
        }
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void TelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TelefonoKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Telefono.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_TelefonoKeyTyped

    private void Id_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Id_buscarKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

    }//GEN-LAST:event_Id_buscarKeyTyped

    private void Telefono_reKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Telefono_reKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }

        if (Telefono.getText().trim().length() == 10) {
            evt.consume();
        }

    }//GEN-LAST:event_Telefono_reKeyTyped

    private void Nombre_reKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_reKeyTyped
        ValidarLetras(evt);
    }//GEN-LAST:event_Nombre_reKeyTyped

    private void Apellido_p_reKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apellido_p_reKeyTyped
        ValidarLetras(evt);
    }//GEN-LAST:event_Apellido_p_reKeyTyped

    private void Apellido_m_reKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apellido_m_reKeyTyped
        ValidarLetras(evt);
    }//GEN-LAST:event_Apellido_m_reKeyTyped

    private void Nombre_actKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_actKeyTyped
        ValidarLetras(evt);
    }//GEN-LAST:event_Nombre_actKeyTyped

    private void Apellido_pKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apellido_pKeyTyped
        ValidarLetras(evt);
    }//GEN-LAST:event_Apellido_pKeyTyped

    private void Apellido_mKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apellido_mKeyTyped
        ValidarLetras(evt);
    }//GEN-LAST:event_Apellido_mKeyTyped
    private void buscarUsuario() {
        control_Usuario cu = new control_Usuario();
        List<Usuario> lista = cu.Buscar_Usuario(Integer.valueOf(Id_buscar.getText()));
        int tam = lista.size();
        if (tam > 0) {
            Panel_Actualizar.setVisible(true);
            Actualizar_btn.setEnabled(true);
            Eliminar_btn.setEnabled(true);

            for (int i = 0; i < tam; i++) {
                Id.setText(String.valueOf(lista.get(i).getIdUsuario()));
                Nombre_act.setText(lista.get(i).getNombre());
                Apellido_p.setText(lista.get(i).getApellido_p());
                Apellido_m.setText(lista.get(i).getApellido_m());
                Telefono.setText(lista.get(i).getTelefono());
                User.setText(lista.get(i).getUsuario());
                Password.setText(lista.get(i).getPassword());
            }
        } else {
            Panel_Actualizar.setVisible(false);
            Actualizar_btn.setEnabled(false);
            Eliminar_btn.setEnabled(false);

            Id.setText("");
            Nombre_act.setText("");
            Apellido_p.setText("");
            Apellido_m.setText("");
            Telefono.setText("");
            User.setText("");
            Password.setText("");
            JOptionPane.showMessageDialog(null, "No se encontro algun registro para el usuario con id: "+Id_buscar.getText(),"Error",JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void InsertarUsuario() {

        Usuario usuario = new Usuario(Nombre_re.getText(),
                Apellido_p_re.getText(),
                Apellido_m_re.getText(),
                User_re.getText(),
                Password_re.getText(),
                Telefono_re.getText());

        control_Usuario controlUsuario = new control_Usuario();

        boolean status = controlUsuario.guardar(usuario);

        if (status) {
            JOptionPane.showMessageDialog(null, "Registrado con exito", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            Limpiar_Guardar();
            Mostrar();
        }
    }

    private void ActualizarUser() {
        control_Usuario cu = new control_Usuario();
        Usuario use = new Usuario(Integer.parseInt(Id.getText()),
                Nombre_act.getText(),
                Apellido_p.getText(),
                Apellido_m.getText(),
                User.getText(),
                Password.getText(),
                Telefono.getText());
        boolean status = cu.actualizar(use);
        if (status) {
            JOptionPane.showMessageDialog(null, "Actualizado con exito", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            Limpiar_Actualizar();
            Mostrar();
        }
    }

    private void Mostrar() {
        control_Usuario cu = new control_Usuario();
        List<Usuario> lista = cu.Mostrar_Usuarios();
        int tam = lista.size();
        String list[][] = new String[tam][6];
        for (int i = 0; i < tam; i++) {
            list[i][0] = String.valueOf(lista.get(i).getIdUsuario());
            list[i][1] = lista.get(i).getNombre();
            list[i][2] = lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m();
            list[i][3] = lista.get(i).getUsuario();
            list[i][4] = lista.get(i).getPassword();
            list[i][5] = lista.get(i).getTelefono();
        }
        Tabla_mostrar.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "N°", "Nombre", "Apellidos", "Usuario", "Password", "Telefono"
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

    private void Limpiar_Guardar() {
        Nombre_re.setText("");
        Apellido_p_re.setText("");
        Apellido_m_re.setText("");
        Telefono_re.setText("");
        User_re.setText("");
        Password_re.setText("");
        Panel_Añadir.setVisible(false);
    }

    private void Limpiar_Actualizar() {
        Id_buscar.setText("");
        Id.setText("");
        Nombre_act.setText("");
        Apellido_p.setText("");
        Apellido_m.setText("");
        Telefono.setText("");
        User.setText("");
        Password.setText("");
        Panel_Actualizar.setVisible(false);
    }

    private void ValidarLetras(KeyEvent evt) {
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_btn;
    private javax.swing.JTextField Apellido_m;
    private javax.swing.JTextField Apellido_m_re;
    private javax.swing.JTextField Apellido_p;
    private javax.swing.JTextField Apellido_p_re;
    private javax.swing.JButton Añadir;
    private javax.swing.JButton Eliminar_btn;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Id_buscar;
    private javax.swing.JTextField Nombre_act;
    private javax.swing.JTextField Nombre_re;
    private javax.swing.JPanel Panel_Actualizar;
    private javax.swing.JPanel Panel_Añadir;
    private javax.swing.JTextField Password;
    private javax.swing.JTextField Password_re;
    private javax.swing.JTable Tabla_mostrar;
    private javax.swing.JTextField Telefono;
    private javax.swing.JTextField Telefono_re;
    private javax.swing.JLabel Titulo;
    private javax.swing.JTextField User;
    private javax.swing.JTextField User_re;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
