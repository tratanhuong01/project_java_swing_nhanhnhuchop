package nhanhnhuchop;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DoiMatKhau extends javax.swing.JFrame {
    ConnectSQLSERVER connect;
    private String email;
    private String emailMaHoa;
    public DoiMatKhau() {
        this.setSize(988, 600);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnOK = new javax.swing.JButton();
        loiNhapEmail = new javax.swing.JLabel();
        txtNhapEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        loiTenDangNhap = new javax.swing.JLabel();
        btnChuyenSangDoi = new javax.swing.JButton();
        showEmail = new javax.swing.JLabel();
        panel_2 = new javax.swing.JPanel();
        btnDoiMatKhau = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loiNhapLaiMatKhau = new javax.swing.JLabel();
        loiMatKhau = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtNhapLaiMatKhau = new javax.swing.JPasswordField();
        txtMatKhau1 = new javax.swing.JPasswordField();
        btnThoat = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quên Mật Khẩu");
        setMinimumSize(new java.awt.Dimension(988, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(988, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.shadow"));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Email");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 240, 60, 50);

        btnOK.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });
        jPanel2.add(btnOK);
        btnOK.setBounds(200, 160, 100, 50);

        loiNhapEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiNhapEmail.setForeground(java.awt.Color.red);
        loiNhapEmail.setText(" ");
        jPanel2.add(loiNhapEmail);
        loiNhapEmail.setBounds(20, 430, 420, 22);

        txtNhapEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtNhapEmail.setEnabled(false);
        jPanel2.add(txtNhapEmail);
        txtNhapEmail.setBounds(20, 380, 420, 40);

        jLabel4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 70, 40, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Nhập Lại Email Để Đổi Mật Khẩu");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 330, 460, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Nhập Tên Đăng Nhập");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(0, 10, 460, 30);

        txtTenDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel2.add(txtTenDangNhap);
        txtTenDangNhap.setBounds(110, 70, 330, 40);

        loiTenDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiTenDangNhap.setForeground(java.awt.Color.red);
        loiTenDangNhap.setText(" ");
        jPanel2.add(loiTenDangNhap);
        loiTenDangNhap.setBounds(110, 120, 330, 22);

        btnChuyenSangDoi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnChuyenSangDoi.setText("Chuyển Sang Đổi ");
        btnChuyenSangDoi.setToolTipText("");
        btnChuyenSangDoi.setEnabled(false);
        btnChuyenSangDoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenSangDoiActionPerformed(evt);
            }
        });
        jPanel2.add(btnChuyenSangDoi);
        btnChuyenSangDoi.setBounds(130, 460, 210, 60);

        showEmail.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jPanel2.add(showEmail);
        showEmail.setBounds(130, 240, 290, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(20, 20, 460, 530);

        panel_2.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        panel_2.setLayout(null);

        btnDoiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDoiMatKhau.setText("Đổi Mật Khẩu");
        btnDoiMatKhau.setEnabled(false);
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });
        panel_2.add(btnDoiMatKhau);
        btnDoiMatKhau.setBounds(150, 330, 160, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel6.setText("jLabel3");
        jLabel6.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel6.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel6.setPreferredSize(new java.awt.Dimension(40, 40));
        panel_2.add(jLabel6);
        jLabel6.setBounds(50, 100, 40, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Đổi Mật Khẩu");
        panel_2.add(jLabel7);
        jLabel7.setBounds(0, 0, 460, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel8.setText("jLabel3");
        jLabel8.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel8.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel8.setPreferredSize(new java.awt.Dimension(40, 40));
        panel_2.add(jLabel8);
        jLabel8.setBounds(50, 230, 40, 40);

        loiNhapLaiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiNhapLaiMatKhau.setForeground(java.awt.Color.red);
        loiNhapLaiMatKhau.setText(" ");
        panel_2.add(loiNhapLaiMatKhau);
        loiNhapLaiMatKhau.setBounds(110, 280, 330, 22);

        loiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiMatKhau.setForeground(java.awt.Color.red);
        loiMatKhau.setText(" ");
        panel_2.add(loiMatKhau);
        loiMatKhau.setBounds(110, 150, 330, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Mật Khẩu");
        panel_2.add(jLabel2);
        jLabel2.setBounds(50, 60, 180, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Nhập Lại Mật Khẩu");
        panel_2.add(jLabel10);
        jLabel10.setBounds(50, 180, 180, 30);

        txtNhapLaiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtNhapLaiMatKhau.setEnabled(false);
        panel_2.add(txtNhapLaiMatKhau);
        txtNhapLaiMatKhau.setBounds(110, 220, 330, 50);

        txtMatKhau1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtMatKhau1.setEnabled(false);
        panel_2.add(txtMatKhau1);
        txtMatKhau1.setBounds(110, 90, 330, 50);

        jPanel1.add(panel_2);
        panel_2.setBounds(510, 20, 460, 410);

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        jPanel1.add(btnThoat);
        btnThoat.setBounds(650, 460, 160, 70);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 990, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 990, 590);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
        
    }//GEN-LAST:event_formWindowOpened

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.setVisible(false);
        new DangNhap().setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed
    
    private String getEmail() {
        String query = "SELECT Email FROM ThongTinCaNhan inner join TaiKhoanNguoiDung "
                + "ON ThongTinCaNhan.IDNguoiChoi = TaiKhoanNguoiDung.IDNguoiChoi "
                + "WHERE TenDangNhap = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, txtTenDangNhap.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                this.email = rs.getString(1);
            }
            else {
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
        return email;
    }
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        try {
            String query = "SELECT * FROM TaiKhoanNguoiDung WHERE TenDangNhap = ? ";
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1,txtTenDangNhap.getText());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                getEmail();
                String chuoiCon = this.email.substring(8);
                emailMaHoa = "********" + chuoiCon;
                showEmail.setText(emailMaHoa);
                loiTenDangNhap.setText("");
                txtNhapEmail.setEnabled(true);
                btnChuyenSangDoi.setEnabled(true);
            }
            else {
                txtNhapEmail.setEnabled(false);
                btnChuyenSangDoi.setEnabled(false);
                showEmail.setText("");
                loiTenDangNhap.setText("Tên đăng nhập không đúng");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnChuyenSangDoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenSangDoiActionPerformed
        getEmail();
        if (txtNhapEmail.getText().equals(email)) {
            txtNhapLaiMatKhau.setEnabled(true);
            txtNhapLaiMatKhau.setEnabled(true);
            loiNhapEmail.setText("");
        }
        else {
            loiNhapEmail.setText("Email không đúng , thử lại !");
            txtNhapLaiMatKhau.setEnabled(false);
            txtNhapLaiMatKhau.setEnabled(false);
        }
    }//GEN-LAST:event_btnChuyenSangDoiActionPerformed
    
    private void doiMatKhau() {
        String query = "UPDATE TaiKhoanNguoiDung SET MatKhau = ? WHERE TenDangNhap = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, txtNhapLaiMatKhau.getText());
            ps.setString(2, txtTenDangNhap.getText());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DoiMatKhau.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        if (txtNhapLaiMatKhau.getText().equals("") && txtNhapLaiMatKhau.getText().equals("")) {
            loiMatKhau.setText("Mật khẩu không được trống");
            loiNhapLaiMatKhau.setText("Mật khẩu không được trống");
        }
        else if (!txtNhapLaiMatKhau.getText().equals(txtNhapLaiMatKhau.getText())) {
            loiMatKhau.setText("");
            loiNhapLaiMatKhau.setText("Mật khẩu phải giống");
        }
        else {
            doiMatKhau();
            this.setVisible(false);
            new DangNhap().setVisible(true);
        }
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoiMatKhau().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenSangDoi;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnOK;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel loiMatKhau;
    private javax.swing.JLabel loiNhapEmail;
    private javax.swing.JLabel loiNhapLaiMatKhau;
    private javax.swing.JLabel loiTenDangNhap;
    private javax.swing.JPanel panel_2;
    private javax.swing.JLabel showEmail;
    private javax.swing.JPasswordField txtMatKhau1;
    private javax.swing.JTextField txtNhapEmail;
    private javax.swing.JPasswordField txtNhapLaiMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
