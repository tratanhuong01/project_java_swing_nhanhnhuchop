package nhanhnhuchop;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.DecimalFormat;

public class TrangChu extends javax.swing.JFrame {
    private String ten;
    private String id;
    private ConnectSQLSERVER connect;
    public TrangChu() {
        initComponents();
        this.setSize(1330, 820);
    }
    public TrangChu(String id,String ten) {
        initComponents();
        this.id = id;
        this.ten = ten;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTen = new javax.swing.JLabel();
        btnDangXuat = new javax.swing.JButton();
        btnBatDau = new javax.swing.JButton();
        btnThongTinCaNhan = new javax.swing.JButton();
        btnLichSuChoi = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtBangXepHang = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JLabel();
        txtSoCauGanDay = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTongCauDung = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1330, 820));
        setSize(new java.awt.Dimension(1330, 820));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Xin chào ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 16, 100, 50);

        txtTen.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtTen.setForeground(java.awt.Color.white);
        txtTen.setToolTipText("");
        getContentPane().add(txtTen);
        txtTen.setBounds(130, 10, 170, 60);

        btnDangXuat.setBackground(new java.awt.Color(204, 255, 204));
        btnDangXuat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        getContentPane().add(btnDangXuat);
        btnDangXuat.setBounds(530, 650, 280, 80);

        btnBatDau.setBackground(new java.awt.Color(204, 255, 204));
        btnBatDau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnBatDau.setText("Bắt Đầu");
        btnBatDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatDauActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatDau);
        btnBatDau.setBounds(530, 200, 280, 80);

        btnThongTinCaNhan.setBackground(new java.awt.Color(204, 255, 204));
        btnThongTinCaNhan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThongTinCaNhan.setText("Thông Tin Cá Nhân");
        btnThongTinCaNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinCaNhanActionPerformed(evt);
            }
        });
        getContentPane().add(btnThongTinCaNhan);
        btnThongTinCaNhan.setBounds(530, 310, 280, 80);

        btnLichSuChoi.setBackground(new java.awt.Color(204, 255, 204));
        btnLichSuChoi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLichSuChoi.setText("Lịch Sử Chơi");
        btnLichSuChoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLichSuChoiActionPerformed(evt);
            }
        });
        getContentPane().add(btnLichSuChoi);
        btnLichSuChoi.setBounds(530, 420, 280, 80);

        btnHuongDan.setBackground(new java.awt.Color(204, 255, 204));
        btnHuongDan.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        getContentPane().add(btnHuongDan);
        btnHuongDan.setBounds(530, 530, 280, 80);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/right.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(900, 130, 400, 530);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(50, 130, 400, 530);

        txtBangXepHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rankkkk.png"))); // NOI18N
        txtBangXepHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtBangXepHangMouseClicked(evt);
            }
        });
        getContentPane().add(txtBangXepHang);
        txtBangXepHang.setBounds(0, 580, 230, 210);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setForeground(java.awt.Color.white);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/quiz-png-8.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1100, 580, 220, 190);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/money.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 0, 111, 100);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tổng Tiền");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(520, 0, 192, 35);

        txtTongTien.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTongTien.setForeground(java.awt.Color.white);
        txtTongTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTongTien.setText("0");
        getContentPane().add(txtTongTien);
        txtTongTien.setBounds(520, 40, 192, 58);

        txtSoCauGanDay.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoCauGanDay.setForeground(java.awt.Color.white);
        txtSoCauGanDay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSoCauGanDay.setText("0");
        getContentPane().add(txtSoCauGanDay);
        txtSoCauGanDay.setBounds(820, 40, 179, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rank.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(710, 0, 100, 100);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Số Câu Gần Đây");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(820, 0, 179, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ketqua.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(1015, 0, 110, 100);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tổng Câu Liên Tiếp");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(1126, 0, 200, 35);

        txtTongCauDung.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTongCauDung.setForeground(java.awt.Color.white);
        txtTongCauDung.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTongCauDung.setText("0");
        getContentPane().add(txtTongCauDung);
        txtTongCauDung.setBounds(1128, 40, 200, 58);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        jLabel12.setMaximumSize(new java.awt.Dimension(1330, 820));
        jLabel12.setMinimumSize(new java.awt.Dimension(1330, 820));
        jLabel12.setPreferredSize(new java.awt.Dimension(1330, 820));
        jLabel12.setRequestFocusEnabled(false);
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 1330, 820);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void layKetQua() {
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        String query = "SELECT Tien , SoCauCaoNhat , SoCauDung FROM KetQua WHERE IDNguoiChoi = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                txtTongTien.setText(formatter.format(Long.parseLong(String.valueOf(rs.getInt(1)))) + "  VNĐ");
                txtSoCauGanDay.setText(String.valueOf(rs.getInt(2)) + "  Câu");
                txtTongCauDung.setText(String.valueOf(rs.getInt(3)) + "  Câu");
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrangChu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
        txtTen.setText(this.ten);
        layKetQua();
        
    }//GEN-LAST:event_formWindowOpened
    
    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
       this.setVisible(false);
       new DangNhap().setVisible(true);
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnThongTinCaNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinCaNhanActionPerformed
        this.setVisible(false);
        new ThongTinCaNhan(this.id,this.ten).setVisible(true);;
    }//GEN-LAST:event_btnThongTinCaNhanActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        this.setVisible(false);
        new HuongDan(this.id,this.ten).setVisible(true);
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnBatDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatDauActionPerformed
       this.setVisible(false);
       new GiaoDienChoi(this.id,this.ten).setVisible(true);
    }//GEN-LAST:event_btnBatDauActionPerformed

    private void btnLichSuChoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLichSuChoiActionPerformed
        this.setVisible(false);
        new LichSuNguoiChoi(this.id, this.ten).setVisible(true);
    }//GEN-LAST:event_btnLichSuChoiActionPerformed

    private void txtBangXepHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBangXepHangMouseClicked
        this.setVisible(false);
        new BangXepHang(this.id,this.ten).setVisible(true);
    }//GEN-LAST:event_txtBangXepHangMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatDau;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnLichSuChoi;
    private javax.swing.JButton btnThongTinCaNhan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel txtBangXepHang;
    private javax.swing.JLabel txtSoCauGanDay;
    private javax.swing.JLabel txtTen;
    private javax.swing.JLabel txtTongCauDung;
    private javax.swing.JLabel txtTongTien;
    // End of variables declaration//GEN-END:variables
}
