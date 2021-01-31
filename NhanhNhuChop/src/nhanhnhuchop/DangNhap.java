package nhanhnhuchop;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import static java.util.regex.Pattern.matches;
import jdk.nashorn.internal.runtime.regexp.joni.Regex;

public class DangNhap extends javax.swing.JFrame {
    ConnectSQLSERVER connect;
    private String ID;
    private String ten;
    private String tenDangNhap;
    private String matKhau;
    public DangNhap() {
        initComponents();
    }
    public DangNhap(String tenDangNhap , String matKhau) {
        initComponents();
        this.tenDangNhap = tenDangNhap;
        this.matKhau = matKhau;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dangKi = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        loiTenDangNhap = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        loiMatKhau = new javax.swing.JLabel();
        quenMatKhau = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Nhập");
        setBackground(java.awt.Color.orange);
        setMaximumSize(new java.awt.Dimension(1330, 820));
        setMinimumSize(new java.awt.Dimension(1330, 820));
        setPreferredSize(new java.awt.Dimension(1330, 820));
        setSize(new java.awt.Dimension(1330, 820));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Tên Đăng Nhập");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 210, 130, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Mật Khẩu");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 320, 119, 22);

        btnDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangNhap);
        btnDangNhap.setBounds(180, 530, 172, 55);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setText("Nếu Bạn Chưa Có Tài Khoản ? ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 660, 280, 40);

        dangKi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dangKi.setText("Tạo Tài Khoản");
        dangKi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangKiMouseClicked(evt);
            }
        });
        jPanel1.add(dangKi);
        dangKi.setBounds(350, 660, 120, 40);

        txtTenDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenDangNhapKeyReleased(evt);
            }
        });
        jPanel1.add(txtTenDangNhap);
        txtTenDangNhap.setBounds(180, 190, 310, 53);

        loiTenDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiTenDangNhap.setForeground(java.awt.Color.red);
        loiTenDangNhap.setText(" ");
        jPanel1.add(loiTenDangNhap);
        loiTenDangNhap.setBounds(180, 260, 300, 22);

        txtMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtMatKhau);
        txtMatKhau.setBounds(180, 300, 310, 52);

        loiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiMatKhau.setForeground(java.awt.Color.red);
        loiMatKhau.setText(" ");
        jPanel1.add(loiMatKhau);
        loiMatKhau.setBounds(180, 370, 300, 22);

        quenMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        quenMatKhau.setText("Quên Mật Khẩu ?");
        quenMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quenMatKhauMouseClicked(evt);
            }
        });
        jPanel1.add(quenMatKhau);
        quenMatKhau.setBounds(350, 430, 159, 22);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/avatar.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 100));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 100));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(210, 50, 100, 100);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(400, 0, 510, 820);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setMaximumSize(new java.awt.Dimension(1330, 820));
        jLabel6.setMinimumSize(new java.awt.Dimension(1330, 820));
        jLabel6.setPreferredSize(new java.awt.Dimension(1330, 820));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 1330, 820);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private String getID() {
        String query = "SELECT IDNguoiChoi FROM TaiKhoanNguoiDung WHERE TenDangNhap = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, txtTenDangNhap.getText());
            ResultSet rs = ps.executeQuery();
            rs.next();
            this.ID = rs.getString(1);
        }
        catch (SQLException ex) {
            ex.toString();
        }
        return ID;
    }
    private String getTen() {
        getID();
        String query = "SELECT Ten FROM ThongTinCaNhan WHERE IDNguoiChoi = ? "; 
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            rs.next();
            this.ten = rs.getString(1);
        }
        catch (SQLException ex) {
            ex.toString();
        }
        return ten;
    }
    private boolean kiemTraTaiKhoan()
    {
        boolean b = true;
        getID();
        String query = "SELECT IDNguoiChoi FROM ThongTinCaNhan WHERE Ho is NOT NULL "
                + "and Ten is NOT NULL and DiaChi is NOT NULL  and Email is NOT NULL and "
                + "SoDienThoai is NOT NULL AND IDNguoiChoi = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, ID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                b = true;
            }
            else {
                b = false;
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        String query = "SELECT TenDangNhap , MatKhau FROM TaiKhoanNguoiDung WHERE TenDangNhap = ? AND MatKhau = ? ";
        if (txtTenDangNhap.getText().equals("") && txtMatKhau.getText().equals("")) {
            loiTenDangNhap.setText("Tên đăng nhập không được để trống");
            loiMatKhau.setText("Mật khẩu không được để trống");
        }
        else {
            try {
                getID();
                PreparedStatement ps = connect.conn.prepareStatement(query);
                ps.setString(1, txtTenDangNhap.getText());
                ps.setString(2, txtMatKhau.getText());
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    JOptionPane.showMessageDialog(rootPane, "Successed");
                    if (kiemTraTaiKhoan() == false) {
                        this.setVisible(false);
                        new CapNhatThongTin(this.ID).setVisible(true);
                    }
                    else {
                        getTen();
                        this.setVisible(false);
                        new TrangChu(this.ID,this.ten).setVisible(true);
                    }
                }
                else {
                    loiTenDangNhap.setText("");
                    loiMatKhau.setText("Tên đăng nhập hoặc mật khẩu sai");
                }
            } catch (SQLException ex) {
                Logger.getLogger(DangNhap.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
        txtTenDangNhap.setText(tenDangNhap);
        txtMatKhau.setText(matKhau);
    }//GEN-LAST:event_formWindowOpened

    private void dangKiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangKiMouseClicked
        this.setVisible(false);
        new DangKi().setVisible(true);
    }//GEN-LAST:event_dangKiMouseClicked

    private void quenMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quenMatKhauMouseClicked
        this.setVisible(false);
        new DoiMatKhau().setVisible(true);
    }//GEN-LAST:event_quenMatKhauMouseClicked

    private void txtTenDangNhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenDangNhapKeyReleased
        
    }//GEN-LAST:event_txtTenDangNhapKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel dangKi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loiMatKhau;
    private javax.swing.JLabel loiTenDangNhap;
    private javax.swing.JLabel quenMatKhau;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
