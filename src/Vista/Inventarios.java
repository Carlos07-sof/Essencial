package Vista;

import Controlador.control_Materia;
import Controlador.control_Producto;
import Controlador.control_Stock;
import Modelo.Inventario_Materia;
import Modelo.Inventario_Producto;
import Modelo.Stock_Entrada;
import Modelo.Stock_Salida;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

public class Inventarios extends javax.swing.JPanel {

    String[][] Productos;
    String[][] Materias;
    boolean valido = false;
    int id_prod;
    int id_mat;

    public Inventarios() {
        initComponents();
        Enable(false, false);
        Entradas.setEnabled(false);
        Salidas.setEnabled(false);
        Cargando.setVisible(false);
        this.setSize(new Dimension(1018, 571));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Cargando = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Inventarios = new javax.swing.JTable();
        Radio_prod = new javax.swing.JRadioButton();
        Radio_mat = new javax.swing.JRadioButton();
        Entradas = new javax.swing.JButton();
        Salidas = new javax.swing.JButton();
        Entrada_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Producto_e = new javax.swing.JLabel();
        Stock_e = new javax.swing.JComboBox<>();
        Actual_e = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Factura = new javax.swing.JTextField();
        Fecha_e = new com.toedter.calendar.JDateChooser();
        Cantidad_e = new javax.swing.JTextField();
        Precio_e = new javax.swing.JTextField();
        Entrada = new javax.swing.JButton();
        Salida_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Producto_s = new javax.swing.JLabel();
        Stock_s = new javax.swing.JComboBox<>();
        Actual_s = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Fecha_s = new com.toedter.calendar.JDateChooser();
        Cantidad_s = new javax.swing.JTextField();
        Salida = new javax.swing.JButton();
        Concepto_s = new javax.swing.JTextArea();
        Title = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1250, 150));

        Inventarios.setBackground(new java.awt.Color(255, 255, 255));
        Inventarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Inventarios);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1250, 150));

        buttonGroup1.add(Radio_prod);
        Radio_prod.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Radio_prod.setText("Inventario de Productos");
        Radio_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_prodActionPerformed(evt);
            }
        });
        add(Radio_prod, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        buttonGroup1.add(Radio_mat);
        Radio_mat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Radio_mat.setText("Inventario de Materia Prima");
        Radio_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Radio_matActionPerformed(evt);
            }
        });
        add(Radio_mat, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        Entradas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Entradas.setText("Añadir entradas");
        Entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradasActionPerformed(evt);
            }
        });
        add(Entradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, -1, -1));

        Salidas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salidas.setText("Añadir salidas");
        Salidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidasActionPerformed(evt);
            }
        });
        add(Salidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 40, -1, -1));

        Entrada_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entrada Stock");

        Producto_e.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Producto_e.setText(":");

        Stock_e.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Stock_eItemStateChanged(evt);
            }
        });
        Stock_e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Stock_eActionPerformed(evt);
            }
        });

        Actual_e.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Cantidad actual:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Folio de la factura:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Fecha de compra:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cantidad adquirida:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Precio de compra:");

        Cantidad_e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cantidad_eKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad_eKeyTyped(evt);
            }
        });

        Precio_e.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Precio_eKeyTyped(evt);
            }
        });

        Entrada.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Entrada.setText("Actualizar");
        Entrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Entrada_panelLayout = new javax.swing.GroupLayout(Entrada_panel);
        Entrada_panel.setLayout(Entrada_panelLayout);
        Entrada_panelLayout.setHorizontalGroup(
            Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Entrada_panelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(Producto_e)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Entrada)
                    .addComponent(Cantidad_e, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Factura)
                        .addComponent(Stock_e, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Actual_e)
                        .addComponent(Fecha_e, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                    .addComponent(Precio_e, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        Entrada_panelLayout.setVerticalGroup(
            Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Entrada_panelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Producto_e)
                    .addComponent(Stock_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actual_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fecha_e, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Cantidad_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Entrada_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Precio_e, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Entrada)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        add(Entrada_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 450, 380));

        Salida_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Salida Stock");

        Producto_s.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Producto_s.setText(":");

        Stock_s.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Stock_sItemStateChanged(evt);
            }
        });

        Actual_s.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Cantidad actual:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Fecha de salida:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Cantidad:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Concepto de salida:");

        Cantidad_s.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Cantidad_sKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Cantidad_sKeyTyped(evt);
            }
        });

        Salida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Salida.setText("Actualizar");
        Salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalidaActionPerformed(evt);
            }
        });

        Concepto_s.setColumns(20);
        Concepto_s.setLineWrap(true);
        Concepto_s.setRows(5);
        Concepto_s.setWrapStyleWord(true);

        javax.swing.GroupLayout Salida_panelLayout = new javax.swing.GroupLayout(Salida_panel);
        Salida_panel.setLayout(Salida_panelLayout);
        Salida_panelLayout.setHorizontalGroup(
            Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Salida_panelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Salida_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(Producto_s))
                .addGap(44, 44, 44)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fecha_s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Cantidad_s)
                    .addComponent(Concepto_s, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(Stock_s, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Actual_s))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Salida_panelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Salida)
                .addGap(121, 121, 121))
        );
        Salida_panelLayout.setVerticalGroup(
            Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Salida_panelLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Producto_s)
                    .addComponent(Stock_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Actual_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(21, 21, 21)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Fecha_s, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Concepto_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(Salida_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cantidad_s, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(Salida)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        add(Salida_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 250, -1, 380));

        Title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Inventario");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void Radio_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_prodActionPerformed
        Cargando.setVisible(true);
        jScrollPane1.setVisible(false);
        Inventarios.setVisible(false);
        limpiar();
        Enable(false, false);
        new Thread() {
            public void run() {
                Cargar_Inventario_Pro();
            }
        }.start();
    }//GEN-LAST:event_Radio_prodActionPerformed

    private void Radio_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Radio_matActionPerformed
        Cargando.setVisible(true);
        jScrollPane1.setVisible(false);
        Inventarios.setVisible(false);
        limpiar();
        Enable(false, false);
        new Thread() {
            public void run() {
                Cargar_Inventario_Mat();
            }
        }.start();
    }//GEN-LAST:event_Radio_matActionPerformed

    private void EntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradasActionPerformed
        if (Radio_prod.isSelected()) {
            Limpiar_Entradas();
            Enable(true, false);
            Producto_e.setText("Producto:");
        }
        if (Radio_mat.isSelected()) {
            Limpiar_Entradas();
            Enable(true, false);
            Producto_e.setText("Materia:");
        }
    }//GEN-LAST:event_EntradasActionPerformed

    private void Stock_eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Stock_eActionPerformed

    }//GEN-LAST:event_Stock_eActionPerformed

    private void SalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidasActionPerformed
        if (Radio_prod.isSelected()) {
            Enable(false, true);
            Limpiar_Salidas();
            Producto_s.setText("Producto:");
        }
        if (Radio_mat.isSelected()) {
            Enable(false, true);
            Limpiar_Salidas();
            Producto_s.setText("Materia:");
        }
    }//GEN-LAST:event_SalidasActionPerformed

    private void Stock_eItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Stock_eItemStateChanged
        if (Radio_mat.isSelected()) {
            if (Stock_e.getSelectedIndex() > 0) {
                if (evt.getStateChange() == ItemEvent.SELECTED && Stock_e.getSelectedIndex() > 0) {
                    for (String[] Mate : Materias) {
                        if (Mate[0].equals(Stock_e.getSelectedItem())) {
                            Actual_e.setText(Mate[1]);
                        }
                    }
                }
            } else {
                Actual_e.setText("");
            }
        }
        if (Radio_prod.isSelected()) {
            if (Stock_e.getSelectedIndex() > 0) {
                if (evt.getStateChange() == ItemEvent.SELECTED && Stock_e.getSelectedIndex() > 0) {
                    for (String[] Pro : Productos) {
                        if (Pro[0].equals(Stock_e.getSelectedItem())) {
                            Actual_e.setText(Pro[1]);
                        }
                    }
                }
            } else {
                Actual_e.setText("");
            }
        }
    }//GEN-LAST:event_Stock_eItemStateChanged

    private void EntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradaActionPerformed
        new Thread() {
            public void run() {
                boolean fact = false;
                int facts = 0;
                if (Radio_mat.isSelected()) {
                    for (String[] Mate : Materias) {
                        if (Mate[0].equals(Stock_e.getSelectedItem())) {
                            id_mat = Integer.parseInt(Mate[2]);
                        }
                    }
                }
                if (Radio_prod.isSelected()) {
                    for (String[] Pro : Productos) {
                        if (Pro[0].equals(Stock_e.getSelectedItem())) {
                            id_prod = Integer.parseInt(Pro[2]);
                        }
                    }
                }
                if (!Factura.getText().isEmpty()) {
                    facts = Integer.parseInt(Factura.getText());
                    fact = true;
                }
                int año = Fecha_e.getCalendar().get(Calendar.YEAR);
                int mes = Fecha_e.getCalendar().get(Calendar.MARCH);
                int dia = Fecha_e.getCalendar().get(Calendar.DAY_OF_MONTH);
                String fech = año + "-" + mes + "-" + dia;
                Date Fecha = Date.valueOf(fech);

                if (Radio_mat.isSelected()) {
                    Stock_Entrada se = new Stock_Entrada(id_mat,
                            facts,
                            Fecha,
                            Double.parseDouble(Cantidad_e.getText()),
                            Float.valueOf(Precio_e.getText()));
                    control_Stock cs = new control_Stock();
                    boolean status = cs.Entrada_Materia(se, fact);
                    if (status) {
                        JOptionPane.showMessageDialog(null, "Entrada actuaizada", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
                    }
                    Cargar_Inventario_Mat();
                    Limpiar_Entradas();
                }
                if (Radio_prod.isSelected()) {
                    Stock_Entrada se = new Stock_Entrada(id_prod,
                            facts,
                            Fecha,
                            Integer.parseInt(Cantidad_e.getText()),
                            Float.valueOf(Precio_e.getText()));
                    control_Stock cs = new control_Stock();
                    boolean status = cs.Entrada_Producto(se, fact);
                    if (status) {
                        JOptionPane.showMessageDialog(null, "Entrada actuaizada", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
                    }
                    Cargar_Inventario_Pro();
                    Limpiar_Entradas();
                }
            }
        }.start();
    }//GEN-LAST:event_EntradaActionPerformed

    private void SalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalidaActionPerformed
        new Thread() {
            @Override
            public void run() {
                if (valido == true) {
                    if (Radio_mat.isSelected()) {
                        for (String[] Mate : Materias) {
                            if (Mate[0].equals(Stock_s.getSelectedItem())) {
                                id_mat = Integer.parseInt(Mate[2]);
                            }
                        }
                    }
                    if (Radio_prod.isSelected()) {
                        for (String[] Pro : Productos) {
                            if (Pro[0].equals(Stock_s.getSelectedItem())) {
                                id_prod = Integer.parseInt(Pro[2]);
                            }
                        }
                    }

                    int año = Fecha_s.getCalendar().get(Calendar.YEAR);
                    int mes = Fecha_s.getCalendar().get(Calendar.MARCH);
                    int dia = Fecha_s.getCalendar().get(Calendar.DAY_OF_MONTH);
                    String fech = año + "-" + mes + "-" + dia;
                    Date Fecha = Date.valueOf(fech);

                    if (Radio_mat.isSelected()) {
                        Stock_Salida se = new Stock_Salida(id_mat,
                                Fecha,
                                Concepto_s.getText(),
                                Double.parseDouble(Cantidad_s.getText()));
                        control_Stock cs = new control_Stock();
                        boolean status = cs.Salida_Materia(se);
                        if (status) {
                            JOptionPane.showMessageDialog(null, "Salida actuaizada", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
                        }
                        Cargar_Inventario_Mat();
                        Limpiar_Salidas();
                    }
                    if (Radio_prod.isSelected()) {
                        Stock_Salida se = new Stock_Salida(id_prod,
                                Fecha,
                                Concepto_s.getText(),
                                Integer.parseInt(Cantidad_s.getText()));
                        control_Stock cs = new control_Stock();
                        boolean status = cs.Salida_Producto(se);
                        if (status) {
                            JOptionPane.showMessageDialog(null, "Salida actuaizada", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
                        }
                        Cargar_Inventario_Pro();
                        Limpiar_Salidas();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad negativa no valida", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }.start();
    }//GEN-LAST:event_SalidaActionPerformed

    private void Stock_sItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Stock_sItemStateChanged
        if (Radio_mat.isSelected()) {
            if (Stock_s.getSelectedIndex() > 0) {
                if (evt.getStateChange() == ItemEvent.SELECTED && Stock_s.getSelectedIndex() > 0) {
                    for (String[] Mate : Materias) {
                        if (Mate[0].equals(Stock_s.getSelectedItem())) {
                            Actual_s.setText(Mate[1]);
                        }
                    }
                }
            } else {
                Actual_s.setText("");
            }
        }
        if (Radio_prod.isSelected()) {
            if (Stock_s.getSelectedIndex() > 0) {
                if (evt.getStateChange() == ItemEvent.SELECTED && Stock_s.getSelectedIndex() > 0) {
                    for (String[] Pro : Productos) {
                        if (Pro[0].equals(Stock_s.getSelectedItem())) {
                            Actual_s.setText(Pro[1]);
                        }
                    }
                }
            } else {
                Actual_s.setText("");
            }
        }
    }//GEN-LAST:event_Stock_sItemStateChanged

    private void Cantidad_eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad_eKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_Cantidad_eKeyTyped

    private void Cantidad_sKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad_sKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_Cantidad_sKeyTyped

    private void Cantidad_sKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad_sKeyReleased
        if (!Cantidad_s.getText().isEmpty()) {
            int Act_e = Integer.parseInt(Actual_s.getText());
            int Cant_e = Integer.parseInt(Cantidad_s.getText());
            if (Act_e < Cant_e) {
                Cantidad_s.setForeground(Color.red);
            } else {
                Cantidad_s.setForeground(Color.BLACK);
                valido = true;
            }
        }
    }//GEN-LAST:event_Cantidad_sKeyReleased

    private void Cantidad_eKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Cantidad_eKeyReleased

    }//GEN-LAST:event_Cantidad_eKeyReleased

    private void Precio_eKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Precio_eKeyTyped
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
        boolean punto = key == 46;

        if (!numeros && !punto) {
            evt.consume();
        }
    }//GEN-LAST:event_Precio_eKeyTyped
    private void limpiar() {
        Inventarios.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
    }

    private void Limpiar_Entradas() {
        Stock_e.setSelectedIndex(0);
        Actual_e.setText("");
        Factura.setText("");
        Fecha_e.setCalendar(null);
        Cantidad_e.setText("");
        Precio_e.setText("");
    }

    private void Limpiar_Salidas() {
        Stock_s.setSelectedIndex(0);
        Actual_s.setText("");
        Fecha_s.setCalendar(null);
        Cantidad_s.setText("");
        Concepto_s.setText("");
    }

    private void Enable(boolean status_prod, boolean status_mat) {
        Stock_e.setEnabled(status_prod);
        Actual_e.setEnabled(status_prod);
        Factura.setEnabled(status_prod);
        Fecha_e.setEnabled(status_prod);
        Cantidad_e.setEnabled(status_prod);
        Precio_e.setEnabled(status_prod);

        Stock_s.setEnabled(status_mat);
        Actual_s.setEnabled(status_mat);
        Fecha_s.setEnabled(status_mat);
        Cantidad_s.setEnabled(status_mat);
        Concepto_s.setEnabled(status_mat);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Actual_e;
    private javax.swing.JTextField Actual_s;
    private javax.swing.JTextField Cantidad_e;
    private javax.swing.JTextField Cantidad_s;
    private javax.swing.JLabel Cargando;
    private javax.swing.JTextArea Concepto_s;
    private javax.swing.JButton Entrada;
    private javax.swing.JPanel Entrada_panel;
    private javax.swing.JButton Entradas;
    private javax.swing.JTextField Factura;
    private com.toedter.calendar.JDateChooser Fecha_e;
    private com.toedter.calendar.JDateChooser Fecha_s;
    public static javax.swing.JTable Inventarios;
    private javax.swing.JTextField Precio_e;
    private javax.swing.JLabel Producto_e;
    private javax.swing.JLabel Producto_s;
    private javax.swing.JRadioButton Radio_mat;
    private javax.swing.JRadioButton Radio_prod;
    private javax.swing.JButton Salida;
    private javax.swing.JPanel Salida_panel;
    private javax.swing.JButton Salidas;
    private javax.swing.JComboBox<String> Stock_e;
    private javax.swing.JComboBox<String> Stock_s;
    private javax.swing.JLabel Title;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void Cargar_Inventario_Mat() {
        control_Materia cm = new control_Materia();
        List<Inventario_Materia> lista = cm.Mostrar_Inventario_Materia();
        int tam = lista.size();
        Stock_e.removeAllItems();
        Stock_s.removeAllItems();
        Stock_e.addItem("Selecciona un producto");
        Stock_s.addItem("Selecciona un producto");
        Materias = new String[tam][3];
        String list[][] = new String[tam][5];
        if (tam > 0) {

            Entradas.setEnabled(true);
            Salidas.setEnabled(true);
            for (int i = 0; i < tam; i++) {
                Materias[i][0] = lista.get(i).getInv_name();
                Materias[i][1] = String.valueOf(lista.get(i).getInv_stock());
                Materias[i][2] = String.valueOf(lista.get(i).getInv_prod_codigo());
                Stock_e.addItem(lista.get(i).getInv_name());
                Stock_s.addItem(lista.get(i).getInv_name());
                list[i][0] = String.valueOf(lista.get(i).getInv_prod_codigo());
                list[i][1] = lista.get(i).getInv_name();
                list[i][2] = String.valueOf(lista.get(i).getInv_entradas());
                list[i][3] = String.valueOf(lista.get(i).getInv_salidas());
                list[i][4] = String.valueOf(lista.get(i).getInv_stock());
            }
            Inventarios.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Id", "Descripcion", "Entradas", "Salidas", "Stock"
                    }) {
                Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
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
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro algun registro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        jScrollPane1.setVisible(true);
        Inventarios.setVisible(true);
        Cargando.setVisible(false);
    }

    private void Cargar_Inventario_Pro() {
        control_Producto cp = new control_Producto();
        List<Inventario_Producto> lista = cp.Mostrar_Inventario_Productos();
        int tam = lista.size();
        Stock_e.removeAllItems();
        Stock_s.removeAllItems();
        Stock_e.addItem("Selecciona un producto");
        Stock_s.addItem("Selecciona un producto");
        Productos = new String[tam][3];
        String list[][] = new String[tam][5];

        if (tam > 0) {

            Entradas.setEnabled(true);
            Salidas.setEnabled(true);
            for (int i = 0; i < tam; i++) {
                Productos[i][0] = lista.get(i).getInv_name();
                Productos[i][1] = String.valueOf(lista.get(i).getInv_stock());
                Productos[i][2] = String.valueOf(lista.get(i).getInv_id_producto());
                Stock_e.addItem(lista.get(i).getInv_name());
                Stock_s.addItem(lista.get(i).getInv_name());
                list[i][0] = String.valueOf(lista.get(i).getInv_id_producto());
                list[i][1] = lista.get(i).getInv_name();
                list[i][2] = String.valueOf(lista.get(i).getInv_entradas());
                list[i][3] = String.valueOf(lista.get(i).getInv_salidas());
                list[i][4] = String.valueOf(lista.get(i).getInv_stock());
            }
            Inventarios.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Id", "Descripcion", "Entradas", "Salidas", "Stock"
                    }) {
                Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
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
        } else {
            JOptionPane.showMessageDialog(null, "No se encontro algun registro", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }
        jScrollPane1.setVisible(true);
        Inventarios.setVisible(true);
        Cargando.setVisible(false);
    }
}
