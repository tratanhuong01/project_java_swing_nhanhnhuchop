package nhanhnhuchop;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Win1 extends javax.swing.JFrame {
    private String id;
    private String ten;
    private int soCau;
    public Win1() {
        initComponents();
    }
    public Win1(String id, String ten,int soCau) {
        initComponents();
        this.id = id;
        this.ten = ten;
        this.soCau = soCau;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        soCauLienTiep = new javax.swing.JLabel();
        btnChoiLai = new javax.swing.JButton();
        btnVeTrangChu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1330, 820));
        setSize(new java.awt.Dimension(1330, 820));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/animated-congratulation-image-0092.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(407, 10, 540, 380);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Liên Tiếp");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(820, 400, 150, 70);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Bạn Đã Trả Lời Đúng ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 400, 344, 70);

        soCauLienTiep.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        soCauLienTiep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soCauLienTiep.setText("0");
        getContentPane().add(soCauLienTiep);
        soCauLienTiep.setBounds(720, 400, 80, 70);

        btnChoiLai.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnChoiLai.setText("Chơi Lại");
        btnChoiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoiLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnChoiLai);
        btnChoiLai.setBounds(360, 580, 180, 80);

        btnVeTrangChu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnVeTrangChu.setText("Về Trang Chủ");
        btnVeTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeTrangChuActionPerformed(evt);
            }
        });
        getContentPane().add(btnVeTrangChu);
        btnVeTrangChu.setBounds(790, 580, 180, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 10, 1330, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVeTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeTrangChuActionPerformed
        this.setVisible(false);
        new TrangChu(this.id, this.ten).setVisible(true);
    }//GEN-LAST:event_btnVeTrangChuActionPerformed

    private void btnChoiLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoiLaiActionPerformed
        this.setVisible(false);
        new GiaoDienChoi(this.id, this.ten).setVisible(true);
    }//GEN-LAST:event_btnChoiLaiActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        soCauLienTiep.setText(String.valueOf(soCau));
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChoiLai;
    private javax.swing.JButton btnVeTrangChu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel soCauLienTiep;
    // End of variables declaration//GEN-END:variables
}
