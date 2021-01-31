package nhanhnhuchop;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class Win2 extends javax.swing.JFrame {
    private String id;
    private String ten;
    public Win2() {
        initComponents();
    }
    public Win2(String id, String ten) {
        initComponents();
        this.id = id;
        this.ten = ten;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnChoiLai = new javax.swing.JButton();
        btnVeTrangChu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1330, 820));
        setSize(new java.awt.Dimension(1330, 820));
        getContentPane().setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/animated-congratulation-image-0092.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(407, 10, 540, 380);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Xin Chúc Mừng Bạn Là Thánh Tia Chớp");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 470, 650, 70);

        btnChoiLai.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnChoiLai.setText("Chơi Lại");
        btnChoiLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoiLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnChoiLai);
        btnChoiLai.setBounds(360, 600, 180, 80);

        btnVeTrangChu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnVeTrangChu.setText("Về Trang Chủ");
        btnVeTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeTrangChuActionPerformed(evt);
            }
        });
        getContentPane().add(btnVeTrangChu);
        btnVeTrangChu.setBounds(790, 600, 180, 80);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel4.setText("Bạn Đã Trả Lời Đúng Tất Cả Câu Hỏi Của Nhanh Như Chớp ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 400, 960, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1330, 820);

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

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Win2().setVisible(true);
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
    // End of variables declaration//GEN-END:variables
}
