package Vista;

import Controlador.control_Usuario;
import Modelo.Usuario;
import java.awt.*;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import javax.swing.border.AbstractBorder;

public class Login extends javax.swing.JFrame {
    int Xmouse, Ymouse;
    public Login() {
        initComponents();
        Exit_red.setBackground(Color.LIGHT_GRAY);
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        this.setSize(new Dimension(855, 500));
    }

    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/login.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title_login = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Exit_red = new javax.swing.JLabel();
        Movimiento = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        txtusuario = new javax.swing.JTextField(){
            @Override protected void paintComponent(Graphics g) {
                if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
                    g2.dispose();
                }
                super.paintComponent(g);
            }

            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);
                setBorder(new RoundedCornerBorder());
            }
        };
        ;
        User = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        Ttulo = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField(){
            @Override protected void paintComponent(Graphics g) {
                if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
                    g2.dispose();
                }
                super.paintComponent(g);
            }

            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);
                setBorder(new RoundedCornerBorder());
            }
        };
        Entrar = new javax.swing.JLabel(){
            @Override protected void paintComponent(Graphics g) {
                if (!isOpaque() && getBorder() instanceof RoundedCornerBorder) {
                    Graphics2D g2 = (Graphics2D) g.create();
                    g2.setPaint(getBackground());
                    g2.fill(((RoundedCornerBorder) getBorder()).getBorderShape(0, 0, getWidth() - 1, getHeight() - 1));
                    g2.dispose();
                }
                super.paintComponent(g);
            }

            @Override public void updateUI() {
                super.updateUI();
                setOpaque(false);
                setBorder(new RoundedCornerBorder());
            }
        };
        Imagen_Login = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImage(getIconImage());
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title_login.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        Title_login.setForeground(new java.awt.Color(0, 0, 0));
        Title_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_login.setText("Login");
        getContentPane().add(Title_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 30));

        Minimizar.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        Minimizar.setForeground(new java.awt.Color(0, 0, 0));
        Minimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-menos-30.png"))); // NOI18N
        Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        getContentPane().add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 30, 30));

        Exit_red.setBackground(new java.awt.Color(0, 0, 0));
        Exit_red.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Exit_red.setForeground(new java.awt.Color(255, 255, 255));
        Exit_red.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit_red.setText("X");
        Exit_red.setToolTipText("");
        Exit_red.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Exit_red.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Exit_redMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Exit_redMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Exit_redMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Exit_redMousePressed(evt);
            }
        });
        getContentPane().add(Exit_red, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 30, 30));

        Movimiento.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Movimiento.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MovimientoMouseDragged(evt);
            }
        });
        Movimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MovimientoMousePressed(evt);
            }
        });
        getContentPane().add(Movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 30));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo_essencial.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Panel.setBackground(new java.awt.Color(0, 166, 163));
        Panel.setForeground(new java.awt.Color(0, 0, 0));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtusuario.setBackground(new java.awt.Color(0, 166, 163));
        txtusuario.setForeground(new java.awt.Color(0, 0, 0));
        txtusuario.setText("Ingrese su nombre de usuario");
        txtusuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusuarioFocusLost(evt);
            }
        });
        Panel.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 270, 40));

        User.setForeground(new java.awt.Color(0, 0, 0));
        User.setText("Usuario:");
        Panel.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 100, -1));

        Password.setForeground(new java.awt.Color(0, 0, 0));
        Password.setText("Contraseña:");
        Panel.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 80, -1));

        Ttulo.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 14)); // NOI18N
        Ttulo.setForeground(new java.awt.Color(0, 0, 0));
        Ttulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ttulo.setText("INICIAR SESION");
        Panel.add(Ttulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 310, 30));

        txtpassword.setBackground(new java.awt.Color(0, 166, 163));
        txtpassword.setForeground(new java.awt.Color(0, 0, 0));
        txtpassword.setText("contraseña");
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpasswordKeyReleased(evt);
            }
        });
        Panel.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 270, 40));

        Entrar.setBackground(new java.awt.Color(255, 255, 255));
        Entrar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Entrar.setForeground(new java.awt.Color(0, 0, 0));
        Entrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Entrar.setText("Entrar");
        Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EntrarMouseExited(evt);
            }
        });
        Panel.add(Entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 130, 40));

        Imagen_Login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Imagen_Login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        Panel.add(Imagen_Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 160));

        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 0, 308, 508));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtusuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusGained
        if (txtusuario.getText().equals("Ingrese su nombre de usuario")) {
            txtusuario.setText("");
        }
    }//GEN-LAST:event_txtusuarioFocusGained

    private void txtusuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusuarioFocusLost
        if (txtusuario.getText().isEmpty()) {
            txtusuario.setText("Ingrese su nombre de usuario");
        }
    }//GEN-LAST:event_txtusuarioFocusLost

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        if (txtpassword.getText().equals("contraseña")) {
            txtpassword.setText("");
        }
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
        if (txtpassword.getText().isEmpty()) {
            txtpassword.setText("contraseña");
        }
    }//GEN-LAST:event_txtpasswordFocusLost

    private void txtpasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyReleased
        if (evt.getKeyCode() == 10) {
            Login();
        }
    }//GEN-LAST:event_txtpasswordKeyReleased

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_MinimizarMouseClicked

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
        Login();
    }//GEN-LAST:event_EntrarMouseClicked

    private void MovimientoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMousePressed
        Xmouse = evt.getX();
        Ymouse = evt.getY();
    }//GEN-LAST:event_MovimientoMousePressed

    private void MovimientoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MovimientoMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - Xmouse, y - Ymouse);
    }//GEN-LAST:event_MovimientoMouseDragged

    private void EntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseEntered
        Entrar.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_EntrarMouseEntered

    private void EntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseExited
        Entrar.setBackground(Color.WHITE);
    }//GEN-LAST:event_EntrarMouseExited

    private void Exit_redMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_redMousePressed

    }//GEN-LAST:event_Exit_redMousePressed

    private void Exit_redMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_redMouseExited
        Exit_red.setForeground(Color.white);
    }//GEN-LAST:event_Exit_redMouseExited

    private void Exit_redMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_redMouseEntered
        Exit_red.setForeground(Color.red);
    }//GEN-LAST:event_Exit_redMouseEntered

    private void Exit_redMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Exit_redMouseClicked
        System.exit(0);
    }//GEN-LAST:event_Exit_redMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Entrar;
    private javax.swing.JLabel Exit_red;
    private javax.swing.JLabel Imagen_Login;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Movimiento;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Title_login;
    private javax.swing.JLabel Ttulo;
    private javax.swing.JLabel User;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

    private void Login() {
        if (!txtusuario.getText().isEmpty() && !txtpassword.getText().isEmpty()
                && !txtusuario.getText().equals("Ingrese su nombre de usuario") && !txtpassword.getText().equals("contraseña")) {
            control_Usuario controlUsuario = new control_Usuario();
            Usuario usuario = new Usuario();
            usuario.setUsuario(txtusuario.getText().trim());
            usuario.setPassword(txtpassword.getText().trim());
            if (controlUsuario.loginUser(usuario)) {
                Menu_custom mc = new Menu_custom();
                mc.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o clave incorrectos", "Mensaje", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese los datos correspondientes", "Advertencia", JOptionPane.ERROR_MESSAGE);
            txtusuario.requestFocus();
        }
    }
}

class RoundedCornerBorder extends AbstractBorder {

    private static final Color ALPHA_ZERO = new Color(0x0, true);

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Shape border = getBorderShape(x, y, width - 1, height - 1);

        g2.setPaint(ALPHA_ZERO);
        Area corner = new Area(new Rectangle2D.Double(x, y, width, height));
        corner.subtract(new Area(border));
        g2.fill(corner);

        g2.setPaint(new Color(y));
        g2.draw(border);
        g2.dispose();
    }

    public Shape getBorderShape(int x, int y, int w, int h) {
        int r = h;
        return new RoundRectangle2D.Double(x, y, w, h, r, r);
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return new Insets(4, 8, 4, 8);
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        insets.set(4, 8, 4, 8);
        return insets;
    }
}
