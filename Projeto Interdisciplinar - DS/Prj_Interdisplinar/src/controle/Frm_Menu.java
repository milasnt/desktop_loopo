/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package controle;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author milaw
 */
public class Frm_Menu extends javax.swing.JDialog {

    /**
     * Creates new form Frm_Menu
     */
    public Frm_Menu() {
        setModalityType(ModalityType.APPLICATION_MODAL);
        initComponents();
        jToolBar1.setFloatable(false); 
        
        ImageIcon icon = new ImageIcon("src/controle/loopo.png");
        setIconImage(icon.getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        toolVestuario = new javax.swing.JButton();
        toolCliente = new javax.swing.JButton();
        toolDesapego = new javax.swing.JButton();
        toolFila = new javax.swing.JButton();
        toolTipo = new javax.swing.JButton();
        toolPedido = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        toolPedido1 = new javax.swing.JButton();
        toolSair = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuCliente = new javax.swing.JMenuItem();
        menuVest = new javax.swing.JMenuItem();
        menuDesapego = new javax.swing.JMenuItem();
        menuTipo = new javax.swing.JMenuItem();
        menuDesenv = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();

        jMenu6.setText("File");
        jMenuBar2.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar2.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("LOOPO");
        setBackground(new java.awt.Color(245, 238, 233));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jToolBar1.setBackground(new java.awt.Color(81, 4, 4));
        jToolBar1.setRollover(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("    Tabelas:             ");
        jLabel1.setToolTipText("");
        jToolBar1.add(jLabel1);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 247, 242));
        jLabel3.setText("|                ");
        jLabel3.setToolTipText("");
        jToolBar1.add(jLabel3);

        toolVestuario.setBackground(new java.awt.Color(81, 4, 4));
        toolVestuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toolVestuario.setForeground(new java.awt.Color(255, 255, 255));
        toolVestuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tshirt-4231.png"))); // NOI18N
        toolVestuario.setToolTipText("");
        toolVestuario.setFocusable(false);
        toolVestuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolVestuario.setIconTextGap(10);
        toolVestuario.setMargin(new java.awt.Insets(2, 80, 3, 70));
        toolVestuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolVestuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolVestuarioActionPerformed(evt);
            }
        });
        jToolBar1.add(toolVestuario);

        toolCliente.setBackground(new java.awt.Color(81, 4, 4));
        toolCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toolCliente.setForeground(new java.awt.Color(255, 255, 255));
        toolCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cliente.png"))); // NOI18N
        toolCliente.setFocusable(false);
        toolCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolCliente.setMargin(new java.awt.Insets(2, 50, 3, 70));
        toolCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(toolCliente);

        toolDesapego.setBackground(new java.awt.Color(81, 4, 4));
        toolDesapego.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toolDesapego.setForeground(new java.awt.Color(255, 255, 255));
        toolDesapego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/desapego.png"))); // NOI18N
        toolDesapego.setToolTipText("");
        toolDesapego.setFocusable(false);
        toolDesapego.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolDesapego.setMargin(new java.awt.Insets(2, 30, 3, 70));
        toolDesapego.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolDesapego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolDesapegoActionPerformed(evt);
            }
        });
        jToolBar1.add(toolDesapego);

        toolFila.setBackground(new java.awt.Color(81, 4, 4));
        toolFila.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toolFila.setForeground(new java.awt.Color(255, 255, 255));
        toolFila.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fila.png"))); // NOI18N
        toolFila.setToolTipText("");
        toolFila.setFocusable(false);
        toolFila.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolFila.setMargin(new java.awt.Insets(2, 34, 3, 70));
        toolFila.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolFilaActionPerformed(evt);
            }
        });
        jToolBar1.add(toolFila);

        toolTipo.setBackground(new java.awt.Color(81, 4, 4));
        toolTipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toolTipo.setForeground(new java.awt.Color(255, 255, 255));
        toolTipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/color-palette-and-brush-10822.png"))); // NOI18N
        toolTipo.setToolTipText("");
        toolTipo.setFocusable(false);
        toolTipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolTipo.setMargin(new java.awt.Insets(2, 34, 3, 70));
        toolTipo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolTipoActionPerformed(evt);
            }
        });
        jToolBar1.add(toolTipo);

        toolPedido.setBackground(new java.awt.Color(81, 4, 4));
        toolPedido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toolPedido.setForeground(new java.awt.Color(255, 255, 255));
        toolPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add-to-cart-3046.png"))); // NOI18N
        toolPedido.setToolTipText("");
        toolPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolPedido.setMargin(new java.awt.Insets(2, 34, 3, 120));
        toolPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolPedidoActionPerformed(evt);
            }
        });
        jToolBar1.add(toolPedido);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 247, 242));
        jLabel4.setText("|                       ");
        jLabel4.setToolTipText(" ");
        jToolBar1.add(jLabel4);

        toolPedido1.setBackground(new java.awt.Color(81, 4, 4));
        toolPedido1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toolPedido1.setForeground(new java.awt.Color(255, 255, 255));
        toolPedido1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users-267.png"))); // NOI18N
        toolPedido1.setToolTipText("");
        toolPedido1.setFocusable(false);
        toolPedido1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolPedido1.setMargin(new java.awt.Insets(2, 40, 3, 40));
        toolPedido1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolPedido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolPedido1ActionPerformed(evt);
            }
        });
        jToolBar1.add(toolPedido1);

        toolSair.setBackground(new java.awt.Color(81, 4, 4));
        toolSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        toolSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/exit-logout-2857 (2).png"))); // NOI18N
        toolSair.setFocusable(false);
        toolSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        toolSair.setMargin(new java.awt.Insets(2, 20, 3, 14));
        toolSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toolSairActionPerformed(evt);
            }
        });
        jToolBar1.add(toolSair);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconizer-70_logos_de_monos_y_gorilas__Diseño_de_logotipos-removebg-preview.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(493, 493, 493)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 340, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(325, 325, 325))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jMenu1.setBackground(new java.awt.Color(81, 4, 4));
        jMenu1.setForeground(new java.awt.Color(81, 4, 4));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/open-menu-6208 (1).png"))); // NOI18N

        menuCliente.setText("Clientes");
        menuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteActionPerformed(evt);
            }
        });
        jMenu1.add(menuCliente);

        menuVest.setText("Vestuário");
        menuVest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVestActionPerformed(evt);
            }
        });
        jMenu1.add(menuVest);

        menuDesapego.setText("Desapego");
        menuDesapego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDesapegoActionPerformed(evt);
            }
        });
        jMenu1.add(menuDesapego);

        menuTipo.setText("Tipo ");
        menuTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuTipoActionPerformed(evt);
            }
        });
        jMenu1.add(menuTipo);

        menuDesenv.setText("Desenvolvedores");
        menuDesenv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDesenvActionPerformed(evt);
            }
        });
        jMenu1.add(menuDesenv);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1391, 825));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja sair do programa?","Sair",JOptionPane.YES_NO_OPTION);
        if(escolha == JOptionPane.YES_NO_OPTION) 
        {
            System.exit(0);
        }     
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuDesenvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDesenvActionPerformed
        frmDesenvolvedores frm = new frmDesenvolvedores();
        frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        frm.setVisible(true); 
    }//GEN-LAST:event_menuDesenvActionPerformed

    private void menuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteActionPerformed
       frmCliente frm = new frmCliente();
       frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       frm.setVisible(true); 
    }//GEN-LAST:event_menuClienteActionPerformed

    private void toolSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolSairActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Deseja sair do programa?","Sair",JOptionPane.YES_NO_OPTION);
        if(escolha == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_toolSairActionPerformed

    private void toolTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolTipoActionPerformed
        frmTipo frm = new frmTipo();
        frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frm.setVisible(true);
    }//GEN-LAST:event_toolTipoActionPerformed

    private void toolFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolFilaActionPerformed
       frmFila frm = new frmFila();
       frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       frm.setVisible(true); 
    }//GEN-LAST:event_toolFilaActionPerformed

    private void toolDesapegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolDesapegoActionPerformed
       frmDesapego frm = new frmDesapego();
       frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       frm.setVisible(true); 
    }//GEN-LAST:event_toolDesapegoActionPerformed

    private void toolClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolClienteActionPerformed
       frmCliente frm = new frmCliente();
       frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       frm.setVisible(true); 
    }//GEN-LAST:event_toolClienteActionPerformed

    private void toolVestuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolVestuarioActionPerformed
       frmVestuario frm = new frmVestuario();
      frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       frm.setVisible(true); 
    }//GEN-LAST:event_toolVestuarioActionPerformed

    private void toolPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolPedidoActionPerformed
       frmPedido frm = new frmPedido();
       frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       frm.setVisible(true);
    }//GEN-LAST:event_toolPedidoActionPerformed

    private void toolPedido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toolPedido1ActionPerformed
        frmDesenvolvedores frm = new frmDesenvolvedores();
       frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frm.setVisible(true); 
    }//GEN-LAST:event_toolPedido1ActionPerformed

    private void menuVestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVestActionPerformed
       frmVestuario frm = new frmVestuario();
       frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       frm.setVisible(true); 
    }//GEN-LAST:event_menuVestActionPerformed

    private void menuDesapegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDesapegoActionPerformed
       frmDesapego frm = new frmDesapego();
       frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
       frm.setVisible(true);
    }//GEN-LAST:event_menuDesapegoActionPerformed

    private void menuTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuTipoActionPerformed
        frmTipo frm = new frmTipo();
        frm.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        frm.setVisible(true);
    }//GEN-LAST:event_menuTipoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuItem menuCliente;
    private javax.swing.JMenuItem menuDesapego;
    private javax.swing.JMenuItem menuDesenv;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuTipo;
    private javax.swing.JMenuItem menuVest;
    private javax.swing.JButton toolCliente;
    private javax.swing.JButton toolDesapego;
    private javax.swing.JButton toolFila;
    private javax.swing.JButton toolPedido;
    private javax.swing.JButton toolPedido1;
    private javax.swing.JButton toolSair;
    private javax.swing.JButton toolTipo;
    private javax.swing.JButton toolVestuario;
    // End of variables declaration//GEN-END:variables
}
