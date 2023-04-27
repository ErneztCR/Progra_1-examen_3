package ErnestoVargasExamen3;

import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ervargas
 */
public class formulario extends javax.swing.JFrame {

    ClsEncuesta encuesta = new ClsEncuesta();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    boolean estaactivo = false;

    public formulario() {
        initComponents();
        String[] columnas = new String[]{"CODIGO:", "DESCRIPCION:", "CANTIDAD:", "TiPO", "ACTIVO:","PRECIO:"};
        modeloTabla.setColumnIdentifiers(columnas);
        TablaEncuesta.setModel(modeloTabla);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tcantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tcodigo = new javax.swing.JTextField();
        rsi = new javax.swing.JRadioButton();
        rno = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tdescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        breporte = new javax.swing.JButton();
        bborrar = new javax.swing.JButton();
        bmodificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEncuesta = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        tprecio = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lno = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lsi = new javax.swing.JLabel();
        lnumero = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(880, 630));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        jLabel1.setText("ACTIVO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(330, 130, 90, 40);

        jLabel2.setText("Cantidad:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 100, 90, 40);
        jPanel1.add(tcantidad);
        tcantidad.setBounds(150, 110, 80, 24);

        jLabel3.setText("Codigo:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 60, 90, 40);
        jPanel1.add(tcodigo);
        tcodigo.setBounds(150, 70, 80, 24);

        buttonGroup1.add(rsi);
        rsi.setSelected(true);
        rsi.setText("Si");
        jPanel1.add(rsi);
        rsi.setBounds(290, 170, 60, 28);

        buttonGroup1.add(rno);
        rno.setText("No");
        jPanel1.add(rno);
        rno.setBounds(360, 170, 60, 28);

        jButton1.setText("Agregar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 370, 130, 40);

        jLabel4.setText("Descripcion:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 60, 90, 40);
        jPanel1.add(tdescripcion);
        tdescripcion.setBounds(360, 70, 180, 24);

        jLabel5.setText("CONTROL DE INVENTARIOS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 20, 170, 30);

        breporte.setText("Reporte");
        breporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                breporteActionPerformed(evt);
            }
        });
        jPanel1.add(breporte);
        breporte.setBounds(470, 370, 100, 40);

        bborrar.setText("Borrar");
        bborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bborrarActionPerformed(evt);
            }
        });
        jPanel1.add(bborrar);
        bborrar.setBounds(200, 370, 100, 40);

        bmodificar.setText("Modifcar");
        bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarActionPerformed(evt);
            }
        });
        jPanel1.add(bmodificar);
        bmodificar.setBounds(330, 370, 110, 40);

        TablaEncuesta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(TablaEncuesta);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 230, 630, 90);

        jLabel9.setText("Precio:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(520, 120, 60, 30);

        tprecio.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(tprecio);
        tprecio.setBounds(500, 170, 74, 24);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 650, 490);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jPanel2);
        jPanel2.setBounds(690, 60, 140, 160);

        jLabel8.setText("Logo");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(690, 20, 50, 30);

        lno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lno);
        lno.setBounds(750, 510, 50, 40);

        jLabel6.setText("No Tienen Carro");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(720, 480, 110, 16);

        lsi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lsi);
        lsi.setBounds(740, 420, 60, 40);

        lnumero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lnumero.setForeground(new java.awt.Color(255, 0, 0));
        lnumero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lnumero);
        lnumero.setBounds(730, 320, 90, 60);

        jLabel7.setText("Tienen Carro");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(730, 390, 80, 16);

        jMenu2.setText("Inicio");

        jMenuItem1.setText("Reportes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowActivated

        this.show();
        lnumero.setText(String.valueOf(encuesta.getConsecutivo()));
    }// GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

        if (!tcantidad.getText().equals("") && !tcodigo.getText().equals("") && !tdescripcion.getText().equals("")) {

            if ((Integer.parseInt(tcantidad.getText()) < 18) || (Integer.parseInt(tcantidad.getText()) > 50)) {
                JOptionPane.showMessageDialog(null, "La edad no es permitida");
            } else {
                ConsultaDeActivo();
                Insertar();

                encuesta.SetSalvarDatos(tcodigo.getText(), tdescripcion.getText(), Integer.parseInt(tcantidad.getText()), tcodigo.getText(), estaactivo, tprecio.getText());
                lnumero.setText(String.valueOf(ClsEncuesta.getConsecutivo()));
                encuesta.setConsecutivo();
                lsi.setText(String.valueOf(ClsEncuesta.getActivo()));
                lno.setText(String.valueOf(ClsEncuesta.getInactivo()));
            }
                
            GuardarEncuesta();
            tcodigo.setText("");
            tcantidad.setText("");
            tdescripcion.setText("");
            rsi.setSelected(true);
        } else {
            JOptionPane.showMessageDialog(null, "Los campos estan en blanco");

        }

    }// GEN-LAST:event_jButton1ActionPerformed

    public void ConsultaDeActivo() {
        if (rsi.isSelected()) {
            estaactivo = true;
            encuesta.setActivo();
        } else if (rno.isSelected()) {
            estaactivo = false;
            encuesta.setInactivo();
        }
    }

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseEntered

    }// GEN-LAST:event_jButton1MouseEntered

    public void Modificar() {
        String mensaje = "";
        int fila = TablaEncuesta.getSelectedRow();
        modeloTabla.setValueAt(tcodigo.getText(), fila, 0);
        modeloTabla.setValueAt(tcantidad.getText(), fila, 1);
        modeloTabla.setValueAt(tdescripcion.getText(), fila, 2);

        if (rsi.isSelected()) {
            mensaje = "Si";
        } else if (rno.isSelected()) {
            mensaje = "No";
        }
        modeloTabla.setValueAt(mensaje, fila, 3);

    }

    public void Borrar() {
        int fila = TablaEncuesta.getSelectedRow();
        modeloTabla.removeRow(fila);
    }

    public void GuardarEncuesta() {

        FileWriter archivo = null;
        PrintWriter pw = null;

        try {
            archivo = new FileWriter("C:/temp/articulo/" + tcodigo.getText() + ".txt");
            pw = new PrintWriter(archivo);
            pw.println("Codigo: " + tcodigo.getText());
            pw.println("Descipcion: " + tdescripcion.getText());
            pw.println("Cantidad: " + tcantidad.getText());
            
           

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != archivo) {
                    archivo.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();

            }
        }

    }

    public void Insertar() {
        String mensaje = "";
        if (estaactivo == true) {
            mensaje = rsi.getText();
        } else {
            mensaje = rno.getText();
        }

        modeloTabla.addRow(new Object[]{tcodigo.getText(), tcantidad.getText(), tdescripcion.getText(), mensaje});
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmReporte reporte = new FrmReporte();
        reporte.setSize(700, 500);
        reporte.setVisible(true);

    }// GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }// GEN-LAST:event_jMenuItem2ActionPerformed

    private void breporteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bagregarActionPerformed
        Insertar();
        FrmReporte reporte = new FrmReporte();
        reporte.setSize(700, 500);
        reporte.setVisible(true);
    }// GEN-LAST:event_bagregarActionPerformed

    private void bmodificarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bmodificarActionPerformed
        Modificar();
    }// GEN-LAST:event_bmodificarActionPerformed

    private void bborrarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bborrarActionPerformed
        Borrar();
    }// GEN-LAST:event_bborrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaEncuesta;
    private javax.swing.JButton bborrar;
    private javax.swing.JButton bmodificar;
    private javax.swing.JButton breporte;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lno;
    private javax.swing.JLabel lnumero;
    private javax.swing.JLabel lsi;
    private javax.swing.JRadioButton rno;
    private javax.swing.JRadioButton rsi;
    private javax.swing.JTextField tcantidad;
    private javax.swing.JTextField tcodigo;
    private javax.swing.JTextField tdescripcion;
    private javax.swing.JTextField tprecio;
    // End of variables declaration//GEN-END:variables
}
