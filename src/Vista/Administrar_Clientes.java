package Vista;

import Controlador.control_Cliente;
import Modelo.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Administrar_Clientes extends javax.swing.JPanel {

    public Administrar_Clientes() {
        initComponents();
        Mostrar();
        Panel_Añadir.setVisible(false);
        Panel_actualizar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_actualizar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nombre_act = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ap_p_act = new javax.swing.JTextField();
        Ap_m_act = new javax.swing.JTextField();
        Residencia_act = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Calle_act = new javax.swing.JTextField();
        Manzana_act = new javax.swing.JTextField();
        Lote_act = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Telefono_act = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Clientes = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Actualizar_btn = new javax.swing.JButton();
        Eliminar_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Id_buscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        Añadir = new javax.swing.JButton();
        Panel_Añadir = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        btnguardar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Nombre_re = new javax.swing.JTextField();
        Apellido_p_re = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Apellido_m_re = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Telefono_re = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Residencia_re = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Calle_re = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Manzana_re = new javax.swing.JTextField();
        Lote_re = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_actualizar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_actualizar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        Panel_actualizar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        Panel_actualizar.add(Nombre_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 120, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Apellido paterno:");
        Panel_actualizar.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Apellido materno:");
        Panel_actualizar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Residencia:");
        Panel_actualizar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        Panel_actualizar.add(Ap_p_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 120, -1));
        Panel_actualizar.add(Ap_m_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 120, -1));
        Panel_actualizar.add(Residencia_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Calle:");
        Panel_actualizar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, -1, -1));
        Panel_actualizar.add(Calle_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 120, -1));

        Manzana_act.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Manzana_actKeyTyped(evt);
            }
        });
        Panel_actualizar.add(Manzana_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 120, -1));

        Lote_act.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Lote_actKeyTyped(evt);
            }
        });
        Panel_actualizar.add(Lote_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 100, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Manzana:");
        Panel_actualizar.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Lote:");
        Panel_actualizar.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Id Cliente");
        Panel_actualizar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IdKeyTyped(evt);
            }
        });
        Panel_actualizar.add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 70, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Telefono:");
        Panel_actualizar.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, -1, -1));

        Telefono_act.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Telefono_actKeyTyped(evt);
            }
        });
        Panel_actualizar.add(Telefono_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 110, -1));

        add(Panel_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 630, 250));

        Clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Clientes);

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

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Elegir Materia:");

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
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Actualizar_btn)
                        .addGap(45, 45, 45)
                        .addComponent(Eliminar_btn)
                        .addGap(16, 16, 16))
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
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addComponent(Id_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actualizar_btn)
                    .addComponent(Eliminar_btn))
                .addGap(40, 40, 40))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 250, 250));

        Añadir.setText("Añadir Cliente");
        Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AñadirActionPerformed(evt);
            }
        });
        add(Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 40, -1, -1));

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

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Password:");
        jPanel8.add(jLabel13);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Apellio Paterno:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Apellio Materno:");

        Telefono_re.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Telefono_reKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Telefono:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Residencia:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Calle:");

        Manzana_re.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Manzana_reKeyTyped(evt);
            }
        });

        Lote_re.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Lote_reKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Manzana:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Lote:");

        javax.swing.GroupLayout Panel_AñadirLayout = new javax.swing.GroupLayout(Panel_Añadir);
        Panel_Añadir.setLayout(Panel_AñadirLayout);
        Panel_AñadirLayout.setHorizontalGroup(
            Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Nombre_re, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(Apellido_p_re, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(Apellido_m_re, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel15)
                .addGap(12, 12, 12)
                .addComponent(Telefono_re, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel16)
                .addGap(12, 12, 12)
                .addComponent(Residencia_re, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel17)
                .addGap(12, 12, 12)
                .addComponent(Calle_re, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel18)
                .addGap(12, 12, 12)
                .addComponent(Manzana_re, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel19)
                .addGap(12, 12, 12)
                .addComponent(Lote_re, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(476, 476, 476)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btnguardar))
        );
        Panel_AñadirLayout.setVerticalGroup(
            Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_AñadirLayout.createSequentialGroup()
                .addComponent(Titulo)
                .addGap(23, 23, 23)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Nombre_re, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Apellido_p_re, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Apellido_m_re, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Telefono_re, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Residencia_re, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Calle_re, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel18))
                    .addComponent(Manzana_re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Panel_AñadirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel19))
                    .addComponent(Lote_re, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_AñadirLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(btnguardar))
        );

        add(Panel_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 100, 400, 530));

        jLabel21.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Gestion de clientes");
        add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1370, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMouseClicked

    }//GEN-LAST:event_ClientesMouseClicked

    private void Actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Actualizar_btnActionPerformed

    }//GEN-LAST:event_Actualizar_btnActionPerformed

    private void Eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_btnActionPerformed

    }//GEN-LAST:event_Eliminar_btnActionPerformed

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        Panel_actualizar.setVisible(true);
        Buscar();
        
    }//GEN-LAST:event_btnbuscarActionPerformed

    private void AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AñadirActionPerformed
        if (Añadir.getText().equals("Añadir Cliente")) {
            Panel_Añadir.setVisible(true);
            Añadir.setText("Ocultar");
        } else {
            Panel_Añadir.setVisible(false);
            Añadir.setText("Añadir Cliente");
        }
    }//GEN-LAST:event_AñadirActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        if (!Nombre_re.getText().isEmpty()) {
            if (!Apellido_p_re.getText().isEmpty()) {
                if (!Apellido_m_re.getText().isEmpty()) {
                    if (!Telefono_re.getText().isEmpty()) {
                        if (!Residencia_re.getText().isEmpty()) {
                            if (!Calle_re.getText().isEmpty()) {
                                if (!Manzana_re.getText().isEmpty()) {
                                    if (!Lote_re.getText().isEmpty()) {
                                        Insertar();
                                    } else {
                                        Lote_re.requestFocus();
                                    }
                                } else {
                                    Manzana_re.requestFocus();
                                }
                            } else {
                                Calle_re.requestFocus();
                            }
                        } else {
                            Residencia_re.requestFocus();
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

    private void Manzana_reKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Manzana_reKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_Manzana_reKeyTyped

    private void Lote_reKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Lote_reKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_Lote_reKeyTyped

    private void Telefono_reKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Telefono_reKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
        if(Telefono_re.getText().trim().length() > 10){
            evt.consume();
        }
    }//GEN-LAST:event_Telefono_reKeyTyped

    private void Manzana_actKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Manzana_actKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_Manzana_actKeyTyped

    private void Lote_actKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Lote_actKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_Lote_actKeyTyped

    private void Telefono_actKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Telefono_actKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
        if(Telefono_act.getText().trim().length() > 10){
            evt.consume();
        }
    }//GEN-LAST:event_Telefono_actKeyTyped

    private void IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_IdKeyTyped

    private void Id_buscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Id_buscarKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_Id_buscarKeyTyped

    private void Limpiar_Añadir(){
        Nombre_re.setText("");
        Apellido_p_re.setText("");
        Apellido_m_re.setText("");
        Telefono_re.setText("");
        Residencia_re.setText("");
        Calle_re.setText("");
        Manzana_re.setText("");
        Lote_re.setText("");
        Panel_Añadir.setVisible(false);
        Añadir.setText("Añadir Cliente");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar_btn;
    private javax.swing.JTextField Ap_m_act;
    private javax.swing.JTextField Ap_p_act;
    private javax.swing.JTextField Apellido_m_re;
    private javax.swing.JTextField Apellido_p_re;
    private javax.swing.JButton Añadir;
    private javax.swing.JTextField Calle_act;
    private javax.swing.JTextField Calle_re;
    private javax.swing.JTable Clientes;
    private javax.swing.JButton Eliminar_btn;
    private javax.swing.JTextField Id;
    private javax.swing.JTextField Id_buscar;
    private javax.swing.JTextField Lote_act;
    private javax.swing.JTextField Lote_re;
    private javax.swing.JTextField Manzana_act;
    private javax.swing.JTextField Manzana_re;
    private javax.swing.JTextField Nombre_act;
    private javax.swing.JTextField Nombre_re;
    private javax.swing.JPanel Panel_Añadir;
    private javax.swing.JPanel Panel_actualizar;
    private javax.swing.JTextField Residencia_act;
    private javax.swing.JTextField Residencia_re;
    private javax.swing.JTextField Telefono_act;
    private javax.swing.JTextField Telefono_re;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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

    private void Insertar() {
        control_Cliente cc = new control_Cliente();
        Cliente cl = new Cliente(Nombre_re.getText(),
                Apellido_p_re.getText(),
                Apellido_m_re.getText(),
                Telefono_re.getText(),
                Residencia_re.getText(),
                Calle_re.getText(),
                Manzana_re.getText(),
                Lote_re.getText());
        boolean status = cc.Insertar_Cliente(cl);
        if (status) {
            JOptionPane.showMessageDialog(null, "Cliente registrado", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            Limpiar_Añadir();
            Mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "El cliente no se pudo registrar", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void Buscar(){
        if(!Id_buscar.getText().isEmpty()){
            control_Cliente cc = new control_Cliente();
            
            List<Cliente>lista = cc.Search(Integer.parseInt(Id_buscar.getText()));
            int tam = lista.size();
            
            for (int i = 0; i < tam; i++) {
                Id.setText(String.valueOf(lista.get(i).getIdCliente()));
                Nombre_act.setText(lista.get(i).getNombre());
                Ap_p_act.setText(lista.get(i).getApellido_p());
                Ap_m_act.setText(lista.get(i).getApellido_m());
                Telefono_act.setText(lista.get(i).getTelefono());
                Residencia_act.setText(lista.get(i).getResidencia());
                Calle_act.setText(lista.get(i).getCalle());
                Manzana_act.setText(lista.get(i).getManzana());
                Lote_act.setText(lista.get(i).getLote());
            }
        }
    }

    private void Mostrar() {

        control_Cliente cc = new control_Cliente();
        List<Cliente> lista = cc.Mostrar_Clientes();

        int tam = lista.size();
        String list[][] = new String[tam][9];

        for (int i = 0; i < tam; i++) {
            list[i][0] = String.valueOf(lista.get(i).getIdCliente());
            list[i][1] = lista.get(i).getNombre()+" "+lista.get(i).getApellido_p()+" "+lista.get(i).getApellido_m();
            list[i][2] = lista.get(i).getTelefono();
            list[i][3] = lista.get(i).getResidencia();
            list[i][4] = lista.get(i).getCalle();
            list[i][5] = lista.get(i).getManzana();
            list[i][6] = lista.get(i).getLote();
        }
        Clientes.setModel(new javax.swing.table.DefaultTableModel(
                list,
                new String[]{
                    "N°", "Nombre","Telefono", "Residencia", "Calle", "Manzana", "Lote"
                }) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false, false
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
        if (Clientes.getColumnModel().getColumnCount() > 0) {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            ((DefaultTableCellRenderer) Clientes.getTableHeader().getDefaultRenderer())
                    .setHorizontalAlignment(SwingConstants.CENTER);
            Clientes.getColumnModel().getColumn(0).setPreferredWidth(30);
            Clientes.getColumnModel().getColumn(0).setCellRenderer(tcr);
            Clientes.getColumnModel().getColumn(1).setPreferredWidth(200);
            Clientes.getColumnModel().getColumn(2).setPreferredWidth(50);
            Clientes.getColumnModel().getColumn(2).setCellRenderer(tcr);
            Clientes.getColumnModel().getColumn(3).setPreferredWidth(50);
            Clientes.getColumnModel().getColumn(3).setCellRenderer(tcr);
            Clientes.getColumnModel().getColumn(4).setPreferredWidth(200);
            Clientes.getColumnModel().getColumn(4).setCellRenderer(tcr);
            Clientes.getColumnModel().getColumn(5).setPreferredWidth(50);
            Clientes.getColumnModel().getColumn(5).setCellRenderer(tcr);
            Clientes.getColumnModel().getColumn(6).setPreferredWidth(50);
            Clientes.getColumnModel().getColumn(6).setCellRenderer(tcr);
        }
    }

}
