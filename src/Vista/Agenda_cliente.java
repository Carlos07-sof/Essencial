package Vista;

import Controlador.control_Agenda;
import Controlador.control_Cliente;
import Modelo.Agenda;
import Modelo.Cliente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Agenda_cliente extends javax.swing.JPanel {

    int fila;
    int mes = 0;
    int id;
    int tam_cl;
    String[][] Clientes_s;
    String[][] Agenda_s;
    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre"};
    control_Agenda ca = new control_Agenda();

    public Agenda_cliente() {
        initComponents();
        Cargando.setVisible(false);
        Clientes.addItem("Selecciona una opcion");
        new Thread() {
            public void run() {
                Cargando.setVisible(true);
                Cargar_Agenda();
                Clientes_c();
                mes = ca.Extraer_mes();
                Mes_act.setText(meses[mes - 1]);
                Cargando.setVisible(false);
            }
        }.start();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Cargando = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Agenda = new javax.swing.JTable();
        Panel_Añadir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Clientes = new javax.swing.JComboBox<>();
        Lunes = new javax.swing.JCheckBox();
        Martes = new javax.swing.JCheckBox();
        Miercoles = new javax.swing.JCheckBox();
        Jueves = new javax.swing.JCheckBox();
        Viernes = new javax.swing.JCheckBox();
        Sabado = new javax.swing.JCheckBox();
        Guardar = new javax.swing.JButton();
        Lunes_can = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        Martes_can = new javax.swing.JSpinner();
        Miercoles_can = new javax.swing.JSpinner();
        Jueves_can = new javax.swing.JSpinner();
        Viernes_can = new javax.swing.JSpinner();
        Sabado_can = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        Mes_act = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cargando (1).gif"))); // NOI18N
        add(Cargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 580));

        Agenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Agenda);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 920, 580));

        Panel_Añadir.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Panel_Añadir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Agendar nuevo dia");
        Panel_Añadir.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 2, 357, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cliente:");
        Panel_Añadir.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 42, -1, -1));

        Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClientesActionPerformed(evt);
            }
        });
        Panel_Añadir.add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 40, 223, -1));

        Lunes.setText("Lunes");
        Lunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LunesActionPerformed(evt);
            }
        });
        Panel_Añadir.add(Lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 101, 84, -1));

        Martes.setText("Martes");
        Martes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MartesActionPerformed(evt);
            }
        });
        Panel_Añadir.add(Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 139, 84, -1));

        Miercoles.setText("Miercoles");
        Miercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiercolesActionPerformed(evt);
            }
        });
        Panel_Añadir.add(Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 177, -1, -1));

        Jueves.setText("Jueves");
        Jueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JuevesActionPerformed(evt);
            }
        });
        Panel_Añadir.add(Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 215, 84, -1));

        Viernes.setText("Viernes");
        Viernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViernesActionPerformed(evt);
            }
        });
        Panel_Añadir.add(Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 253, -1, -1));

        Sabado.setText("Sabado");
        Sabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabadoActionPerformed(evt);
            }
        });
        Panel_Añadir.add(Sabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 291, -1, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Panel_Añadir.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 328, -1, -1));

        Lunes_can.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        Lunes_can.setEnabled(false);
        Panel_Añadir.add(Lunes_can, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 100, -1, -1));

        jLabel3.setText("Cantidad:");
        Panel_Añadir.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 78, 63, -1));

        Martes_can.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        Martes_can.setEnabled(false);
        Panel_Añadir.add(Martes_can, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 138, -1, -1));

        Miercoles_can.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        Miercoles_can.setEnabled(false);
        Panel_Añadir.add(Miercoles_can, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 176, -1, -1));

        Jueves_can.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        Jueves_can.setEnabled(false);
        Panel_Añadir.add(Jueves_can, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 214, -1, -1));

        Viernes_can.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        Viernes_can.setEnabled(false);
        Panel_Añadir.add(Viernes_can, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 252, -1, -1));

        Sabado_can.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        Sabado_can.setEnabled(false);
        Panel_Añadir.add(Sabado_can, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 290, -1, -1));

        jLabel4.setText("Dias:");
        Panel_Añadir.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 76, -1, -1));

        add(Panel_Añadir, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 50, -1, 370));

        Mes_act.setBackground(new java.awt.Color(0, 153, 255));
        Mes_act.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Mes_act.setForeground(new java.awt.Color(255, 255, 255));
        Mes_act.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mes_act.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Mes_act.setOpaque(true);
        add(Mes_act, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 920, 30));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Agenda de clientes");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1370, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        int cl = 0;
        boolean status = false;

        if (Clientes.getSelectedIndex() > 0) {

            if (Lunes.isSelected() || Martes.isSelected() || Miercoles.isSelected()
                    || Jueves.isSelected() || Viernes.isSelected() || Sabado.isSelected()) {

                for (String[] Cl : Clientes_s) {
                    if (Cl[1].equals(Clientes.getSelectedItem())) {
                        cl = Integer.parseInt(Cl[0]);
                    }
                }

                int exist = ca.Existencia(cl);

                if (exist > 0) {

                    if (mes != 0) {

                        if (Lunes_can.getValue().toString().equals("0") && Martes_can.getValue().toString().equals("0")
                                && Miercoles_can.getValue().toString().equals("0") && Jueves_can.getValue().toString().equals("0")
                                && Viernes_can.getValue().toString().equals("0") && Sabado_can.getValue().toString().equals("0")) {

                        } else {

                            if (exist == mes) {

                                int agenda_id = 0;
                                String clc = String.valueOf(cl);

                                for (String[] Agenda_d : Agenda_s) {
                                    if (Agenda_d[1].equals(clc)) {
                                        agenda_id = Integer.parseInt(Agenda_d[0]);
                                    }
                                }

                                Agenda ag = new Agenda(agenda_id,
                                        Integer.parseInt(Lunes_can.getValue().toString()),
                                        Integer.parseInt(Martes_can.getValue().toString()),
                                        Integer.parseInt(Miercoles_can.getValue().toString()),
                                        Integer.parseInt(Jueves_can.getValue().toString()),
                                        Integer.parseInt(Viernes_can.getValue().toString()),
                                        Integer.parseInt(Sabado_can.getValue().toString()),
                                        mes, cl);

                                status = ca.Actualizar(ag);

                            } else {

                                Agenda ag = new Agenda(
                                        Integer.parseInt(Lunes_can.getValue().toString()),
                                        Integer.parseInt(Martes_can.getValue().toString()),
                                        Integer.parseInt(Miercoles_can.getValue().toString()),
                                        Integer.parseInt(Jueves_can.getValue().toString()),
                                        Integer.parseInt(Viernes_can.getValue().toString()),
                                        Integer.parseInt(Sabado_can.getValue().toString()),
                                        mes, cl);

                                status = ca.Insertar(ag);

                            }

                            if (status) {
                                JOptionPane.showMessageDialog(null, "Se actualizo la agenda", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
                                Cargar_Agenda();
                            }
                        }
                    }
                } else {
                    if (mes != 0) {

                        if (Lunes_can.getValue().toString().equals("0") && Martes_can.getValue().toString().equals("0")
                                && Miercoles_can.getValue().toString().equals("0") && Jueves_can.getValue().toString().equals("0")
                                && Viernes_can.getValue().toString().equals("0") && Sabado_can.getValue().toString().equals("0")) {

                        } else {

                            Agenda ag = new Agenda(
                                    Integer.parseInt(Lunes_can.getValue().toString()),
                                    Integer.parseInt(Martes_can.getValue().toString()),
                                    Integer.parseInt(Miercoles_can.getValue().toString()),
                                    Integer.parseInt(Jueves_can.getValue().toString()),
                                    Integer.parseInt(Viernes_can.getValue().toString()),
                                    Integer.parseInt(Sabado_can.getValue().toString()),
                                    mes, cl);

                            status = ca.Insertar(ag);

                            if (status) {
                                JOptionPane.showMessageDialog(null, "Se actualizo la agenda", "!Exito¡", JOptionPane.INFORMATION_MESSAGE);
                                Cargar_Agenda();
                            }
                        }
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Debe escoger al menos un dia", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe escoger el usuario", "Error", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_GuardarActionPerformed

    private void LunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LunesActionPerformed
        if (Lunes.isSelected()) {
            Lunes_can.setEnabled(true);
        }
        if (!Lunes.isSelected()) {
            Lunes_can.setValue(0);
            Lunes_can.setEnabled(false);
        }
    }//GEN-LAST:event_LunesActionPerformed

    private void MartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MartesActionPerformed
        if (Martes.isSelected()) {
            Martes_can.setEnabled(true);
        }
        if (!Martes.isSelected()) {
            Martes_can.setValue(0);
            Martes_can.setEnabled(false);
        }
    }//GEN-LAST:event_MartesActionPerformed

    private void MiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiercolesActionPerformed
        if (Miercoles.isSelected()) {
            Miercoles_can.setEnabled(true);
        }
        if (!Miercoles.isSelected()) {
            Miercoles_can.setValue(0);
            Miercoles_can.setEnabled(false);
        }
    }//GEN-LAST:event_MiercolesActionPerformed

    private void JuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JuevesActionPerformed
        if (Jueves.isSelected()) {
            Jueves_can.setEnabled(true);
        }
        if (!Jueves.isSelected()) {
            Jueves_can.setValue(0);
            Jueves_can.setEnabled(false);
        }
    }//GEN-LAST:event_JuevesActionPerformed

    private void ViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViernesActionPerformed
        if (Viernes.isSelected()) {
            Viernes_can.setEnabled(true);
        }
        if (!Viernes.isSelected()) {
            Viernes_can.setValue(0);
            Viernes_can.setEnabled(false);
        }
    }//GEN-LAST:event_ViernesActionPerformed

    private void SabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabadoActionPerformed
        if (Sabado.isSelected()) {
            Sabado_can.setEnabled(true);
        }
        if (!Sabado.isSelected()) {
            Sabado_can.setValue(0);
            Sabado_can.setEnabled(false);
        }
    }//GEN-LAST:event_SabadoActionPerformed

    private void ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClientesActionPerformed
        if (Clientes.getSelectedIndex() > 0) {

            Lunes.setSelected(false);
            Lunes_can.setValue(0);
            Lunes_can.setEnabled(false);
            Martes.setSelected(false);
            Martes_can.setValue(0);
            Martes_can.setEnabled(false);
            Miercoles.setSelected(false);
            Miercoles_can.setValue(0);
            Miercoles_can.setEnabled(false);
            Jueves.setSelected(false);
            Jueves_can.setValue(0);
            Jueves_can.setEnabled(false);
            Viernes.setSelected(false);
            Viernes_can.setValue(0);
            Viernes_can.setEnabled(false);
            Sabado.setSelected(false);
            Sabado_can.setValue(0);
            Sabado_can.setEnabled(false);

            int cl = 0;

            for (String[] Cl : Clientes_s) {
                if (Cl[1].equals(Clientes.getSelectedItem())) {
                    cl = Integer.parseInt(Cl[0]);
                }
            }

            int exist = ca.Existencia(cl);

            if (exist > 0) {
                List<Agenda> lista = ca.Agenda_ex(cl);
                int tam = lista.size();
                for (int i = 0; i < tam; i++) {
                    int lunes = lista.get(i).getLunes();
                    int martes = lista.get(i).getMartes();
                    int miercoles = lista.get(i).getMiercoles();
                    int jueves = lista.get(i).getJueves();
                    int viernes = lista.get(i).getViernes();
                    int sabado = lista.get(i).getSabado();
                    if (lunes > 0) {
                        Lunes.setSelected(true);
                        Lunes_can.setEnabled(true);
                        Lunes_can.setValue(lista.get(i).getLunes());
                    }
                    if (martes > 0) {
                        Martes.setSelected(true);
                        Martes_can.setEnabled(true);
                        Martes_can.setValue(lista.get(i).getMartes());
                    }
                    if (miercoles > 0) {
                        Miercoles.setSelected(true);
                        Miercoles_can.setEnabled(true);
                        Miercoles_can.setValue(lista.get(i).getMiercoles());
                    }
                    if (jueves > 0) {
                        Jueves.setSelected(true);
                        Jueves_can.setEnabled(true);
                        Jueves_can.setValue(lista.get(i).getJueves());
                    }
                    if (viernes > 0) {
                        Viernes.setSelected(true);
                        Viernes_can.setEnabled(true);
                        Viernes_can.setValue(lista.get(i).getViernes());
                    }
                    if (sabado > 0) {
                        Sabado.setSelected(true);
                        Sabado_can.setEnabled(true);
                        Sabado_can.setValue(lista.get(i).getSabado());
                    }
                }
            }
        }
    }//GEN-LAST:event_ClientesActionPerformed

    private void limpiar() {
        Agenda.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{}
        ));
    }

    private void Clientes_c() {
        control_Cliente cc = new control_Cliente();
        List<Cliente> lista = cc.Mostrar_Clientes();

        int tam = lista.size();
        if (tam > 0) {
            Clientes_s = new String[tam][2];
            for (int i = 0; i < tam; i++) {
                Clientes_s[i][0] = String.valueOf(lista.get(i).getIdCliente());
                Clientes_s[i][1] = lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m();
                Clientes.addItem(lista.get(i).getNombre() + " " + lista.get(i).getApellido_p() + " " + lista.get(i).getApellido_m());
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay clientes registrados aun", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    private void Cargar_Agenda() {

        control_Cliente cc = new control_Cliente();
        List<Cliente> Cliente = cc.Mostrar_Clientes_Agenda();

        tam_cl = Cliente.size();
        if (tam_cl > 0) {
            String list[][] = new String[tam_cl][2];
            for (int i = 0; i < tam_cl; i++) {
                list[i][0] = String.valueOf(Cliente.get(i).getIdCliente());
                list[i][1] = Cliente.get(i).getNombre() + " " + Cliente.get(i).getApellido_p() + " " + Cliente.get(i).getApellido_m();

            }

            Agenda.setModel(new javax.swing.table.DefaultTableModel(list, new String[]{
                "N°", "Cliente", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"
            }));

            if (Agenda.getColumnModel().getColumnCount() > 0) {
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                ((DefaultTableCellRenderer) Agenda.getTableHeader().getDefaultRenderer())
                        .setHorizontalAlignment(SwingConstants.CENTER);
                Agenda.getColumnModel().getColumn(0).setPreferredWidth(30);
                Agenda.getColumnModel().getColumn(0).setCellRenderer(tcr);
                Agenda.getColumnModel().getColumn(1).setPreferredWidth(200);
                Agenda.getColumnModel().getColumn(2).setPreferredWidth(50);
                Agenda.getColumnModel().getColumn(2).setCellRenderer(tcr);
                Agenda.getColumnModel().getColumn(3).setPreferredWidth(50);
                Agenda.getColumnModel().getColumn(3).setCellRenderer(tcr);
                Agenda.getColumnModel().getColumn(4).setPreferredWidth(50);
                Agenda.getColumnModel().getColumn(4).setCellRenderer(tcr);
                Agenda.getColumnModel().getColumn(5).setPreferredWidth(50);
                Agenda.getColumnModel().getColumn(5).setCellRenderer(tcr);
                Agenda.getColumnModel().getColumn(6).setPreferredWidth(50);
                Agenda.getColumnModel().getColumn(6).setCellRenderer(tcr);
                Agenda.getColumnModel().getColumn(7).setPreferredWidth(50);
                Agenda.getColumnModel().getColumn(7).setCellRenderer(tcr);
            }

            List<Agenda> listg = ca.Agenda_cl();
            int tamag = listg.size();
            Agenda_s = new String[tamag][2];
            for (int i = 0; i < tamag; i++) {
                for (int j = 0; j < Agenda.getRowCount(); j++) {
                    int folio_cte = listg.get(i).getId_cliente();
                    int agenda_cte = Integer.parseInt(Agenda.getValueAt(j, 0).toString());
                    if (folio_cte == agenda_cte) {
                        Agenda_s[i][0] = String.valueOf(listg.get(i).getId_agenda());
                        Agenda_s[i][1] = String.valueOf(listg.get(i).getId_cliente());
                        Agenda.setValueAt(listg.get(i).getLunes(), j, 2);
                        Agenda.setValueAt(listg.get(i).getMartes(), j, 3);
                        Agenda.setValueAt(listg.get(i).getMiercoles(), j, 4);
                        Agenda.setValueAt(listg.get(i).getJueves(), j, 5);
                        Agenda.setValueAt(listg.get(i).getViernes(), j, 6);
                        Agenda.setValueAt(listg.get(i).getSabado(), j, 7);
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay registros aun", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            Cargando.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Agenda;
    private javax.swing.JLabel Cargando;
    private javax.swing.JComboBox<String> Clientes;
    private javax.swing.JButton Guardar;
    private javax.swing.JCheckBox Jueves;
    private javax.swing.JSpinner Jueves_can;
    private javax.swing.JCheckBox Lunes;
    private javax.swing.JSpinner Lunes_can;
    private javax.swing.JCheckBox Martes;
    private javax.swing.JSpinner Martes_can;
    private javax.swing.JLabel Mes_act;
    private javax.swing.JCheckBox Miercoles;
    private javax.swing.JSpinner Miercoles_can;
    private javax.swing.JPanel Panel_Añadir;
    private javax.swing.JCheckBox Sabado;
    private javax.swing.JSpinner Sabado_can;
    private javax.swing.JCheckBox Viernes;
    private javax.swing.JSpinner Viernes_can;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
