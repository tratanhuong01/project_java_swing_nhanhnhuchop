package nhanhnhuchop;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DangKi extends javax.swing.JFrame {
    ConnectSQLSERVER connect;
    private int countID;
    
    public DangKi() {
        initComponents();
        
        this.setSize(1330, 820);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        checkDongY = new javax.swing.JCheckBox();
        btnDangKi = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dangKi = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        txtNhapLaiMatKhau = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        loiNhapLaiMatKhau = new javax.swing.JLabel();
        loiTenDangNhap = new javax.swing.JLabel();
        loiMatKhau = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng Kí");
        setBackground(java.awt.Color.orange);
        setMinimumSize(new java.awt.Dimension(1330, 820));
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
        jLabel1.setBounds(20, 190, 150, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Mật Khẩu");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 300, 119, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Nhập Lại Mật Khẩu");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 410, 166, 22);

        checkDongY.setBackground(java.awt.Color.white);
        checkDongY.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        checkDongY.setText("Tôi Đồng Ý Với Chính Sách Bảo Mật Và Điều Khoản");
        jPanel1.add(checkDongY);
        checkDongY.setBounds(50, 520, 450, 31);

        btnDangKi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDangKi.setText("Đăng Kí");
        btnDangKi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKiActionPerformed(evt);
            }
        });
        jPanel1.add(btnDangKi);
        btnDangKi.setBounds(190, 590, 172, 55);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Nếu Bạn Đã Có Tài Khoản ? ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(80, 720, 248, 22);

        dangKi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dangKi.setText("Đăng Nhập");
        dangKi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangKiMouseClicked(evt);
            }
        });
        jPanel1.add(dangKi);
        dangKi.setBounds(340, 720, 99, 22);

        txtTenDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtTenDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenDangNhapKeyReleased(evt);
            }
        });
        jPanel1.add(txtTenDangNhap);
        txtTenDangNhap.setBounds(180, 170, 330, 53);

        txtMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(txtMatKhau);
        txtMatKhau.setBounds(180, 280, 330, 52);

        txtNhapLaiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtNhapLaiMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNhapLaiMatKhauKeyReleased(evt);
            }
        });
        jPanel1.add(txtNhapLaiMatKhau);
        txtNhapLaiMatKhau.setBounds(180, 390, 330, 52);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/createacc.png"))); // NOI18N
        jLabel6.setName(""); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(210, 20, 100, 100);

        loiNhapLaiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiNhapLaiMatKhau.setForeground(java.awt.Color.red);
        loiNhapLaiMatKhau.setText(" ");
        jPanel1.add(loiNhapLaiMatKhau);
        loiNhapLaiMatKhau.setBounds(180, 450, 330, 30);

        loiTenDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiTenDangNhap.setForeground(java.awt.Color.red);
        loiTenDangNhap.setText(" ");
        jPanel1.add(loiTenDangNhap);
        loiTenDangNhap.setBounds(180, 230, 330, 30);

        loiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiMatKhau.setForeground(java.awt.Color.red);
        loiMatKhau.setText(" ");
        jPanel1.add(loiMatKhau);
        loiMatKhau.setBounds(180, 338, 330, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(410, 0, 530, 820);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.setMaximumSize(new java.awt.Dimension(1330, 820));
        jLabel7.setMinimumSize(new java.awt.Dimension(1330, 820));
        jLabel7.setPreferredSize(new java.awt.Dimension(1330, 820));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 1330, 820);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private int demDong() {
        String query = "SELECT COUNT(*) FROM TaiKhoanNguoiDung";
        try {
            Statement sta = connect.conn.createStatement();
            ResultSet rs = sta.executeQuery(query);
            rs.next();
            countID = rs.getInt(1);
        } catch (SQLException ex) {
            Logger.getLogger(DangKi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return countID;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
    }//GEN-LAST:event_formWindowOpened
    private void themIDNguoiChoi() {
        String ID = "NNC000" + String.valueOf(countID + 1);
        String query = "INSERT INTO ThongTinCaNhan(IDNguoiChoi)VALUES(?)";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, ID);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DangKi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private boolean kiemTraTonTai(String tenDangNhap) {
        String query = "SELECT TenDangNhap FROM TaiKhoanNguoiDung WHERE TenDangNhap = ? ";
        boolean test = true;
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, tenDangNhap);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                test = true;
            }
            else {
                test = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DangKi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return test;
    }
    private void themIDSangKetQua() {
        String ID = "NNC000" + String.valueOf(countID + 1);
        String query = "INSERT INTO KetQua(IDNguoiChoi,Tien,SoCauCaoNhat,SoCauDung)VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, ID);
            ps.setInt(2, 0);
            ps.setInt(3, 0);
            ps.setInt(4, 0);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DangKi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnDangKiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKiActionPerformed
        demDong();
        
        if (txtTenDangNhap.getText().equals("") && txtMatKhau.getText().equals("") && txtNhapLaiMatKhau.getText().equals("")) {
            loiTenDangNhap.setText("Tên đăng nhập không được để trống");
            loiMatKhau.setText("Mật khẩu không được để trống");
            loiNhapLaiMatKhau.setText("Mật khẩu phải giống");
        }
        else if (kiemTraTonTai(txtTenDangNhap.getText()) == true) {
            loiTenDangNhap.setText("Tên đăng nhập đã tồn tại");
        }
        else if (!txtMatKhau.getText().equals(txtNhapLaiMatKhau.getText()))
        {
            loiTenDangNhap.setText("");
            loiMatKhau.setText("");
            loiNhapLaiMatKhau.setText("Mật khẩu phải giống");
        }
        else if (txtTenDangNhap.getText().equals(txtMatKhau.getText()))
        {
            loiTenDangNhap.setText("");
            loiMatKhau.setText("Tên đăng nhập mật khẩu không được giống");
        }
        else if (checkDongY.isSelected() == false)
        {
            loiNhapLaiMatKhau.setText("Vui lòng tick vào ô dưới");
        }
        else {
            loiTenDangNhap.setText("");
            loiMatKhau.setText("");
            loiNhapLaiMatKhau.setText("");
            JOptionPane.showMessageDialog(rootPane, "Login Thành Công");
            String ID = "NNC000" + String.valueOf(countID + 1);
            try {
                String query = "INSERT INTO TaiKhoanNguoiDung(IDNguoiChoi,TenDangNhap,MatKhau)VALUES ('"
            + ID + "','" + txtTenDangNhap.getText() +"','" + txtMatKhau.getText() + "')";
                Statement sta = connect.conn.createStatement();
                sta.executeUpdate(query);
                this.setVisible(false);
                new DangNhap().setVisible(true);
                themIDNguoiChoi();
                themIDSangKetQua();
            } catch (SQLException ex) {
                Logger.getLogger(DangKi.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }//GEN-LAST:event_btnDangKiActionPerformed

    private void dangKiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangKiMouseClicked
        this.setVisible(false);
        new DangNhap().setVisible(true);
    }//GEN-LAST:event_dangKiMouseClicked

    private void txtTenDangNhapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenDangNhapKeyReleased
        String regex = "^[a-zA-Z0-9]*$";
        boolean b = txtTenDangNhap.getText().matches(regex);
        if (b == true) {
            loiTenDangNhap.setText("");
        }
        else {
            loiTenDangNhap.setText("Tên đăng nhập không đúng định dạng");
        }
    }//GEN-LAST:event_txtTenDangNhapKeyReleased

    private void txtNhapLaiMatKhauKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNhapLaiMatKhauKeyReleased
        if (txtNhapLaiMatKhau.getText().equals(txtMatKhau.getText())) {
            loiNhapLaiMatKhau.setText("");
        }
        else {
            loiNhapLaiMatKhau.setText("Mật khẩu phải giống");
        }
    }//GEN-LAST:event_txtNhapLaiMatKhauKeyReleased

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKi;
    private javax.swing.JCheckBox checkDongY;
    private javax.swing.JLabel dangKi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loiMatKhau;
    private javax.swing.JLabel loiNhapLaiMatKhau;
    private javax.swing.JLabel loiTenDangNhap;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtNhapLaiMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
