/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorqr;

import com.barcodelib.barcode.QRCode;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jack
 */
public class InicioQR extends javax.swing.JFrame {

    int udm=0, resol=72, rot=0;
    float mi=0.000f, md=0.000f, ms=0.000f, min=0.000f, tam=5.00f;
    
    public InicioQR() {
        initComponents();
    }

    public void generarQr(String dato, String ruta){
        try {
            
            QRCode c=new QRCode();
            c.setData(dato);
            c.setDataMode(QRCode.MODE_BYTE);
            c.setUOM(udm);
            c.setLeftMargin(mi);
            c.setRightMargin(md);
            c.setTopMargin(ms);
            c.setBottomMargin(min);
            c.setResolution(resol);
            c.setRotate(rot);
            c.setModuleSize(tam);
            
            String archivo = ruta+"/"+dato+".gif";
            
            //String archivo = System.getProperty("user.home")+"/Documents/GitHub/GeneradorQR/GeneradorQR 1.0/ImagensQR/"+dato+".gif";
                                   
            c.renderBarcode(archivo);
            
            
            Desktop d=Desktop.getDesktop();
            d.open(new File(archivo));
            
            
        } catch (Exception e) {
            System.out.println("Error "+e);
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlg = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        txtCampo = new javax.swing.JTextField();
        btnGenerador = new javax.swing.JButton();
        txtRuta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        dlg.setTitle("Seleccionar Carpeta");
        dlg.setMinimumSize(new java.awt.Dimension(565, 370));
        dlg.setName(""); // NOI18N
        dlg.setSize(new java.awt.Dimension(600, 300));

        jFileChooser1.setCurrentDirectory(new java.io.File("C:\\Users\\Jack\\Desktop"));
        jFileChooser1.setMaximumSize(new java.awt.Dimension(500, 326));
        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgLayout = new javax.swing.GroupLayout(dlg.getContentPane());
        dlg.getContentPane().setLayout(dlgLayout);
        dlgLayout.setHorizontalGroup(
            dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dlgLayout.setVerticalGroup(
            dlgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jFileChooser1.getAccessibleContext().setAccessibleName("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generador QR");
        setMaximumSize(new java.awt.Dimension(600, 300));
        setMinimumSize(new java.awt.Dimension(500, 200));
        setPreferredSize(new java.awt.Dimension(500, 200));

        jPanel1.setMaximumSize(new java.awt.Dimension(600, 300));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 200));

        btnGenerador.setText("Generar QR");
        btnGenerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneradorActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtRuta)
                    .addComponent(txtCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGenerador)
                    .addComponent(jButton1))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRuta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerador)
                    .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneradorActionPerformed
        String campo= txtCampo.getText();
        String ruta= txtRuta.getText();
        generarQr(campo,ruta);
    }//GEN-LAST:event_btnGeneradorActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        
        /*
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int response = fc.showOpenDialog(this);
        if (response == JFileChooser.APPROVE_SELECTION) {
            JOptionPane.showMessageDialog(this, "Ruta:"+
                    "\n Archivo:"+fc.getName());
        } else{
            JOptionPane.showMessageDialog(this, "Seleccione un archivo.");
        }*/
        
        
        JFileChooser SelectorDirectorio = (JFileChooser) evt.getSource();
        String command = evt.getActionCommand();
        if(command.equals(JFileChooser.APPROVE_SELECTION)){
            File DirectorioSeleccionado = SelectorDirectorio.getCurrentDirectory();
            
            txtRuta.setText(DirectorioSeleccionado.getAbsolutePath());
            
            //JOptionPane.showMessageDialog(this, "Ruta:"+DirectorioSeleccionado.getAbsolutePath());
        }else if (command.equals(JFileChooser.CANCEL_SELECTION)) {
            JOptionPane.showMessageDialog(this, "Seleccione un archivo.");
        }
        
        /*
        JFileChooser selectorArchivo = (JFileChooser) evt.getSource();
        String command = evt.getActionCommand();
        if (command.equals(JFileChooser.APPROVE_SELECTION)){
            File archivoSeleccionado = selectorArchivo.getSelectedFile();
            JOptionPane.showMessageDialog(this, "Ruta:"+archivoSeleccionado.getAbsolutePath()+
                    "\n Archivo:"+archivoSeleccionado.getName());
                    
        }else if(command.equals(JFileChooser.CANCEL_SELECTION)){
            JOptionPane.showMessageDialog(this, "Seleccione un archivo.");
        }
        */
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dlg.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioQR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioQR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerador;
    private javax.swing.JDialog dlg;
    private javax.swing.JButton jButton1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}
