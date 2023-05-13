package Vista;

import Controlador.control_Personal;
import Controlador.control_Servicio;
import Controlador.control_ventas;
import Modelo.Cat_Servicio;
import Modelo.Personal;
import Modelo.Ventas;
import java.awt.Color;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;

public class Registrar_ventas extends javax.swing.JPanel {

    String[][] Servicio;
    String[][] Personal;
    String[][] Ventas;
    int id_servicio, id_personal;
    double tarifa;

    public Registrar_ventas() {
        initComponents();
        jScrollPane1.setVisible(false);
        Ventas_t.setVisible(false);
        Cargando.setVisible(true);
        new Thread() {
            public void run() {
                Personal();
                Servicios();
                Cargar_Ventas();
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoRadio = new javax.swing.ButtonGroup();
        ventas = new javax.swing.JPanel();
        personal = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Registrar = new javax.swing.JButton();
        total_cantidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        cantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        servicio = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        importe = new javax.swing.JTextField();
        titulo = new javax.swing.JLabel();
        Cargando = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ventas_t = new javax.swing.JTable();

        setBackground(new java.awt.Color(102, 102, 102));
        setMinimumSize(new java.awt.Dimension(1371, 640));
        setPreferredSize(new java.awt.Dimension(1371, 640));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ventas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        personal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        personal.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                personalItemStateChanged(evt);
            }
        });
        personal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personalActionPerformed(evt);
            }
        });
        ventas.add(personal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 230, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registro");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventas.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, 80, 30));

        Registrar.setBackground(new java.awt.Color(0, 204, 204));
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        ventas.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 490, 110, 30));

        total_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_cantidadActionPerformed(evt);
            }
        });
        total_cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                total_cantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                total_cantidadKeyTyped(evt);
            }
        });
        ventas.add(total_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 150, 30));

        jLabel6.setText("Personal: ");
        ventas.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Pago:");
        ventas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 60, 30));

        jLabel9.setText("Cambio:");
        ventas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 50, 30));

        total.setEditable(false);
        total.setText("$0");
        ventas.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 150, 30));

        cantidad.setText("Cantidad a pagar");
        cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cantidadFocusLost(evt);
            }
        });
        cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cantidadMouseEntered(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cantidadKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });
        ventas.add(cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 150, 30));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Cantidad:");
        ventas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 70, 30));

        servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una opción" }));
        servicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                servicioItemStateChanged(evt);
            }
        });
        servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servicioActionPerformed(evt);
            }
        });
        ventas.add(servicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 230, 30));

        jLabel4.setText("Tipo de Servicio:");
        ventas.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, 30));

        jLabel11.setText("Importe: ");
        ventas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 50, 30));

        importe.setEditable(false);
        importe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importeActionPerformed(evt);
            }
        });
        importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                importeKeyReleased(evt);
            }
        });
        ventas.add(importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 150, 30));

        add(ventas, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 450, 560));

        titulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        titulo.setForeground(new java.awt.Color(255, 255, 255));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Registrar Ventas");
        titulo.setFocusable(false);
        titulo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1370, 40));

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 830, 250));

        Ventas_t.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Ventas_t);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 830, 250));
    }// </editor-fold>//GEN-END:initComponents

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed

        if (servicio.getSelectedItem().equals("Seleccione una opción")) {
            MensajeError("Campo vacio: Tipo de Servicio", servicio);
            if (personal.getSelectedItem().equals("Seleccione una opción")) {
                MensajeError("Campo Vacio: Personal", personal);
                if (cantidad.getText().equals("Cantidad a pagar") || cantidad.getText().isEmpty()) {
                    MensajeError("Campo vacio: Cantidad a pagar", cantidad);
                    if (total_cantidad.getText().isEmpty()) {
                        MensajeError("Campo vacio: Cantidad", cantidad);
                    } else {
                        InsertarVentas(Integer.parseInt(total_cantidad.getText()),Float.parseFloat(importe.getText()),Float.parseFloat(cantidad.getText()),Float.parseFloat(total.getText()), id_servicio, id_personal);
                    }
                }

            }
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
    }//GEN-LAST:event_cantidadKeyTyped

    private void servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servicioActionPerformed


    }//GEN-LAST:event_servicioActionPerformed

    private void personalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personalActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_personalActionPerformed

    private void total_cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_cantidadKeyReleased
        int pago = Integer.parseInt(total_cantidad.getText());

        double total_importe = pago * tarifa;
        System.out.println("tarifa " + tarifa);
        System.out.println("Total: " + total_importe);
        importe.setText(Double.toString(total_importe));


    }//GEN-LAST:event_total_cantidadKeyReleased

    private void total_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_cantidadActionPerformed

    }//GEN-LAST:event_total_cantidadActionPerformed

    private void servicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_servicioItemStateChanged
        // TODO add your handling code here:
        if (servicio.getSelectedIndex() > 0) {
            for (String[] servicios : Servicio) {
                if (servicios[1].equals(servicio.getSelectedItem())) {
                    id_servicio = Integer.parseInt(servicios[0]);
                    tarifa = Double.parseDouble(servicios[2]);
                }
            }

        } else {
            id_servicio = 0;
        }
    }//GEN-LAST:event_servicioItemStateChanged


    private void personalItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_personalItemStateChanged
        // TODO add your handling code here:
        if (personal.getSelectedIndex() > 0) {
            for (String[] personal_1 : Personal) {
                if (personal_1[0].equals(personal.getSelectedItem())) {
                    id_personal = Integer.parseInt(personal_1[0]);
                }
            }
        } else {
            id_personal = 0;
        }
    }//GEN-LAST:event_personalItemStateChanged

    private void cantidadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadMouseEntered

    private void cantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadFocusGained
        // TODO add your handling code here:
        if (cantidad.getText().equals("Cantidad a pagar")) {
            cantidad.setText("");
        }
    }//GEN-LAST:event_cantidadFocusGained

    private void cantidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadFocusLost
        // TODO add your handling code here:
        if (cantidad.getText().isEmpty()) {
            cantidad.setText("Cantidad a pagar");
        }
    }//GEN-LAST:event_cantidadFocusLost

    private void importeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importeActionPerformed

    private void importeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_importeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_importeKeyReleased

    private void total_cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_cantidadKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }

    }//GEN-LAST:event_total_cantidadKeyTyped

    private void cantidadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyReleased
        // TODO add your handling code here:
        Cambio_pago();
    }//GEN-LAST:event_cantidadKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cargando;
    private javax.swing.ButtonGroup GrupoRadio;
    private javax.swing.JButton Registrar;
    private javax.swing.JTable Ventas_t;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField importe;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> personal;
    private javax.swing.JComboBox<String> servicio;
    private javax.swing.JLabel titulo;
    private javax.swing.JTextField total;
    private javax.swing.JTextField total_cantidad;
    private javax.swing.JPanel ventas;
    // End of variables declaration//GEN-END:variables

    private void Limpiar_Insertar() {
        cantidad.setText("");
        total_cantidad.setText("");
        total.setText("$0");
        personal.setSelectedIndex(0);
    }

    private void Personal() {
        control_Personal cp = new control_Personal();
        List<Personal> lista = cp.Mostrar_Personal();
        int tam = lista.size();
        Personal = new String[tam][2];
        for (int i = 0; i < tam; i++) {
            Personal[i][0] = String.valueOf(lista.get(i).getId_personal());
            Personal[i][1] = lista.get(i).getRol();
            personal.addItem(lista.get(i).getRol());
        }
    }

    private void Servicios() {
        control_Servicio cp = new control_Servicio();
        List<Cat_Servicio> lista = cp.Mostrar_Servicio();
        int tam = lista.size();
        Servicio = new String[tam][3];
        for (int i = 0; i < tam; i++) {
            Servicio[i][0] = String.valueOf(lista.get(i).getId_servicio());
            Servicio[i][1] = lista.get(i).getTipo_servicio();
            Servicio[i][2] = String.valueOf(lista.get(i).getTarifa());
            servicio.addItem(lista.get(i).getTipo_servicio());
        }
    }

    private void Cargar_Ventas() {
        control_ventas cv = new control_ventas();
        List<Ventas> lista = cv.Mostrar_Ventas();
        int tam = lista.size();
        String list[][] = new String[tam][4];
        if (tam > 0) {

            for (int i = 0; i < tam; i++) {

                list[i][0] = String.valueOf(lista.get(i).getId_venta());
                list[i][1] = String.valueOf(lista.get(i).getCantidad());
                list[i][2] = String.valueOf(lista.get(i).getId_servicio());
                list[i][3] = String.valueOf(lista.get(i).getId_personal());
            }
            Ventas_t.setModel(new javax.swing.table.DefaultTableModel(
                    list,
                    new String[]{
                        "Id", "Cantidad", "Servico", "Personal"
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
        Ventas_t.setVisible(true);
        Cargando.setVisible(false);
    }

    private void Cambio_pago() {
        if (!cantidad.getText().isEmpty() && !cantidad.getText().equals("Cantidad a pagar")) {
            double pagado_c = Double.parseDouble(cantidad.getText().trim());
            double pago = Double.parseDouble(importe.getText().trim());
            if (pago < pagado_c) {
                double cambio = pagado_c - pago;
                total.setForeground(Color.black);
                total.setText("$" + String.valueOf(cambio));
            } else if (pago == pagado_c) {
                double cambio = pagado_c - pago;
                total.setForeground(Color.black);
                total.setText("$" + String.valueOf(cambio));

            } else {
                total.setForeground(Color.red);
                total.setText("$0");
            }
        } else {
            total.setText("$0");
        }
    }

    private void InsertarVentas(Integer Cantidad, Float importe, Float Pago, Float cambio, Integer id_servicio, Integer Personal) {
        control_ventas cv = new control_ventas();

        Ventas V = new Ventas(Cantidad, importe, Pago, cambio, id_servicio, id_personal);
        boolean status = cv.Insertar_Ventas(V);

        if (status) {
            JOptionPane.showMessageDialog(null, "Ventas Registrada", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
            Limpiar_Insertar();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la venta", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void MensajeError(String campo_e, Component campo) {
        JOptionPane.showMessageDialog(null, campo_e, " AVISO", JOptionPane.INFORMATION_MESSAGE);
        campo.requestFocus();
    }

}
