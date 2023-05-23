package View;
import Controller.ControllerRental;
import Model.ModelRental;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;

public class ViewRental extends javax.swing.JFrame {
    public Object Kolom[]={"Id Trx", "Nama Peminjam", "Tgl Peminjaman", "Jenis", 
            "No. Pol", "Biaya / hari", "Lama Sewa", "Total Biaya", "STATUS"};
    /**
     * Creates new form ViewRental
     */
    public ViewRental() {
        initComponents();
        new ControllerRental(new ModelRental(), this);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        juduldata = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        bTrx = new javax.swing.JButton();
        bPeminjam = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        bHapus = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        fSaldo = new javax.swing.JTextField();
        labelbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(985, 591));
        setPreferredSize(new java.awt.Dimension(985, 630));
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        juduldata.setBackground(new java.awt.Color(255, 255, 204));
        juduldata.setFont(new java.awt.Font("Perpetua", 1, 36)); // NOI18N
        juduldata.setForeground(new java.awt.Color(255, 255, 204));
        juduldata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        juduldata.setText("DATA RENTAL MOBIL");
        juduldata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 5));
        getContentPane().add(juduldata, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 0, 590, 121));

        jPanel1.setBackground(new java.awt.Color(50, 22, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0), 6));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo.png"))); // NOI18N

        bTrx.setBackground(new java.awt.Color(50, 22, 0));
        bTrx.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        bTrx.setForeground(new java.awt.Color(255, 255, 255));
        bTrx.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/add.png"))); // NOI18N
        bTrx.setText("TAMBAH TRANSAKSI");
        bTrx.setBorder(null);
        bTrx.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bTrx.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        bTrx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTrxActionPerformed(evt);
            }
        });

        bPeminjam.setBackground(new java.awt.Color(50, 22, 0));
        bPeminjam.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        bPeminjam.setForeground(new java.awt.Color(255, 255, 255));
        bPeminjam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/list.png"))); // NOI18N
        bPeminjam.setText("DAFTAR PEMINJAM");
        bPeminjam.setBorder(null);
        bPeminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPeminjamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bTrx, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(bPeminjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(bTrx, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(bPeminjam, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 590));

        tabel.setBackground(new java.awt.Color(51, 51, 0));
        tabel.setFont(new java.awt.Font("Perpetua", 0, 16)); // NOI18N
        tabel.setForeground(new java.awt.Color(255, 255, 255));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Trx", "Nama Peminjam", "Tgl Peminjaman", "Jenis", "No. Pol", "Biaya / hari", "Lama Sewa", "Total Biaya", "STATUS"
            }
        ));
        tabel.setGridColor(new java.awt.Color(102, 102, 0));
        tabel.setSelectionBackground(new java.awt.Color(204, 153, 0));
        tabel.setSelectionForeground(new java.awt.Color(102, 102, 0));
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 181, 580, 410));

        bHapus.setBackground(new java.awt.Color(50, 22, 0));
        bHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/delete.png"))); // NOI18N
        bHapus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0), 2));
        bHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bHapusActionPerformed(evt);
            }
        });
        getContentPane().add(bHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(842, 133, 45, -1));

        bUpdate.setBackground(new java.awt.Color(50, 22, 0));
        bUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/update.png"))); // NOI18N
        bUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 0), 2));
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(bUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(899, 133, 47, -1));

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("TOTAL PENDAPATAN : ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 142, -1, -1));

        fSaldo.setBackground(new java.awt.Color(102, 102, 0));
        fSaldo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fSaldo.setForeground(new java.awt.Color(255, 255, 204));
        fSaldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 204)));
        fSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fSaldoActionPerformed(evt);
            }
        });
        getContentPane().add(fSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 155, -1));

        labelbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/bg.jpg"))); // NOI18N
        getContentPane().add(labelbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bTrxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTrxActionPerformed
        new ViewInput().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bTrxActionPerformed

    private void bHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bHapusActionPerformed

    private void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bUpdateActionPerformed

    private void bPeminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPeminjamActionPerformed
        new ViewPeminjam().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bPeminjamActionPerformed

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_formPropertyChange

    private void fSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fSaldoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fSaldoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRental().setVisible(true);
            }
        });
    }

    public JTable getTabel() {
        return tabel;
    }

    public void setfSaldo(String fSaldo) {
        this.fSaldo.setText(fSaldo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton bHapus;
    private javax.swing.JButton bPeminjam;
    private javax.swing.JButton bTrx;
    public javax.swing.JButton bUpdate;
    public javax.swing.JTextField fSaldo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel juduldata;
    private javax.swing.JLabel labelbg;
    private javax.swing.JLabel logo;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables

}
