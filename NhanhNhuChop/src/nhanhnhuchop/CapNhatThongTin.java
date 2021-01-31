package nhanhnhuchop;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import nhanhnhuchop.common.Common;


public class CapNhatThongTin extends javax.swing.JFrame {
    private String id;
    private String ten;
    private ConnectSQLSERVER connect;
    
    public CapNhatThongTin() {
        initComponents();
        this.setSize(1330, 820);
    }
    public CapNhatThongTin(String id) {
        initComponents();
        this.id = id;
    }
    public CapNhatThongTin(String id,String ten) {
        initComponents();
        this.id = id;
        this.ten = ten;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        gioiTinh = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        btnLuuThongTin = new javax.swing.JButton();
        loiSoDienThoai = new javax.swing.JLabel();
        loiHo = new javax.swing.JLabel();
        loiTen = new javax.swing.JLabel();
        loiEmail = new javax.swing.JLabel();
        loiNgaySinh = new javax.swing.JLabel();
        loiDiaChi = new javax.swing.JLabel();
        ngaySinh = new javax.swing.JTextField();
        loiNgaySinh_1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1330, 820));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 730));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel1.setText("Nhập Đầy Đủ Thông Tin");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 10, 370, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 370, 40, 40);

        txtHo.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtHo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoKeyReleased(evt);
            }
        });
        jPanel1.add(txtHo);
        txtHo.setBounds(80, 80, 150, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 80, 40, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Tên");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(260, 50, 60, 24);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiaChiKeyReleased(evt);
            }
        });
        jPanel1.add(txtDiaChi);
        txtDiaChi.setBounds(80, 360, 550, 50);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Họ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 50, 60, 24);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Địa Chỉ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 330, 100, 24);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Giới Tính");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 160, 100, 24);

        gioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        gioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        jPanel1.add(gioiTinh);
        gioiTinh.setBounds(20, 190, 140, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Ngày Sinh");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 240, 100, 24);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel10.setText("jLabel3");
        jLabel10.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel10.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel10.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 80, 40, 40);

        txtTen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenKeyReleased(evt);
            }
        });
        jPanel1.add(txtTen);
        txtTen.setBounds(320, 80, 330, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Email");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 450, 100, 24);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel12.setText("jLabel3");
        jLabel12.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel12.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 490, 40, 40);

        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(80, 480, 550, 50);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setText("Số Điện Thoại");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 570, 140, 24);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel14.setText("jLabel3");
        jLabel14.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel14.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel14.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 610, 40, 40);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDienThoai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoDienThoaiKeyReleased(evt);
            }
        });
        jPanel1.add(txtSoDienThoai);
        txtSoDienThoai.setBounds(80, 610, 550, 50);

        btnLuuThongTin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLuuThongTin.setText("Lưu Thông Tin");
        btnLuuThongTin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuThongTinActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuuThongTin);
        btnLuuThongTin.setBounds(250, 710, 180, 60);

        loiSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiSoDienThoai.setForeground(java.awt.Color.red);
        loiSoDienThoai.setText(" ");
        jPanel1.add(loiSoDienThoai);
        loiSoDienThoai.setBounds(90, 670, 550, 22);

        loiHo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiHo.setForeground(java.awt.Color.red);
        loiHo.setText(" ");
        jPanel1.add(loiHo);
        loiHo.setBounds(80, 130, 200, 22);

        loiTen.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiTen.setForeground(java.awt.Color.red);
        loiTen.setText(" ");
        jPanel1.add(loiTen);
        loiTen.setBounds(320, 130, 330, 22);

        loiEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiEmail.setForeground(java.awt.Color.red);
        loiEmail.setText(" ");
        jPanel1.add(loiEmail);
        loiEmail.setBounds(90, 540, 550, 22);

        loiNgaySinh.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiNgaySinh.setForeground(java.awt.Color.red);
        jPanel1.add(loiNgaySinh);
        loiNgaySinh.setBounds(290, 290, 350, 0);

        loiDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiDiaChi.setForeground(java.awt.Color.red);
        loiDiaChi.setText(" ");
        jPanel1.add(loiDiaChi);
        loiDiaChi.setBounds(90, 420, 550, 22);

        ngaySinh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        ngaySinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ngaySinhKeyReleased(evt);
            }
        });
        jPanel1.add(ngaySinh);
        ngaySinh.setBounds(20, 280, 140, 40);

        loiNgaySinh_1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiNgaySinh_1.setForeground(java.awt.Color.red);
        loiNgaySinh_1.setText(" ");
        jPanel1.add(loiNgaySinh_1);
        loiNgaySinh_1.setBounds(200, 290, 410, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(310, 0, 660, 820);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1330, 820));
        jLabel2.setMinimumSize(new java.awt.Dimension(1330, 820));
        jLabel2.setPreferredSize(new java.awt.Dimension(1330, 820));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1330, 820);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public boolean kiemTraNgaySinh(String s) {
        String regex = "^([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/([0-9][0-9])?[0-9][0-9]$";
        return s.matches(regex);
    }
    public boolean kiemTraEmail(String s)
    {
        String regexName = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        return s.matches(regexName);
    }
    public boolean kiemTraSoDienThoai(String s)
    {
        String regexName = "^\\+?(?:0|84)(?:\\d){9}$";
        return s.matches(regexName);
    }
    public boolean kiemTra(String s)
    {
        String regexName = "^[a-zA-Z_ÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚĂĐĨŨƠàáâãèéêìíòóôõùúăđĩũơƯĂẠẢẤẦẨẪẬẮẰẲẴẶ" +
        "ẸẺẼỀỀỂưăạảấầẩẫậắằẳẵặẹẻẽềềểỄỆỈỊỌỎỐỒỔỖỘỚỜỞỠỢỤỦỨỪễệỉịọỏốồổỗộớờởỡợ" +
        "ụủứừỬỮỰỲỴÝỶỸửữựỳỵỷỹ\\s]+$";
        return s.matches(regexName);
    }
    
    private void btnLuuThongTinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuThongTinActionPerformed
        if (txtHo.getText().equals("") && txtTen.getText().equals("") && txtDiaChi.getText().equals("") 
                && txtEmail.getText().equals("") && txtSoDienThoai.getText().equals("")) 
        {
            loiHo.setText("Họ không được để trống");
            loiTen.setText("Tên không được để trống");
            loiDiaChi.setText("Địa Chỉ không được để trống");
            loiEmail.setText("Email không được để trống");
            loiSoDienThoai.setText("Số điện thoại không được để trống");  
        }

        else {
            loiHo.setText("");
            loiTen.setText("");
            loiDiaChi.setText("");
            loiEmail.setText("");
            loiSoDienThoai.setText(""); 
            String query = "UPDATE ThongTinCaNhan SET Ho = ? , Ten = ? , GioiTinh = ? ,NgaySinh = ? , DiaChi = ? , Email = ? , SoDienThoai = ? WHERE IDNguoiChoi = ?";
            try {
                PreparedStatement ps = connect.conn.prepareStatement(query);
                ps.setString(1, txtHo.getText());
                ps.setString(2, txtTen.getText());
                ps.setString(3, (String) gioiTinh.getSelectedItem());
                SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
                java.util.Date currentTime;
                try {
                    currentTime = dateformat.parse(ngaySinh.getText());
                    long time = currentTime.getTime();
                    ps.setTimestamp(4, new Timestamp(time));
                } catch (ParseException ex) {
                    Logger.getLogger(CapNhatThongTin.class.getName()).log(Level.SEVERE, null, ex);
                }
                ps.setString(5, txtDiaChi.getText());
                ps.setString(6, txtEmail.getText());
                ps.setString(7, txtSoDienThoai.getText());
                ps.setString(8, this.id);
                ps.executeUpdate();
                this.setVisible(false);
                new TrangChu(this.id,txtTen.getText()).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(CapNhatThongTin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnLuuThongTinActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
        
    }//GEN-LAST:event_formWindowOpened

    private void txtHoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoKeyReleased
        if (kiemTra(txtHo.getText()) == true) {
            loiHo.setText("");
        }
        else {
            loiHo.setText("Sai định dạng");
        }
    }//GEN-LAST:event_txtHoKeyReleased

    private void txtTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyReleased
        if (kiemTra(txtTen.getText()) == true) {
            loiTen.setText("");
        }
        else {
            loiTen.setText("Sai định dạng");
        }
    }//GEN-LAST:event_txtTenKeyReleased

    private void txtDiaChiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaChiKeyReleased
        if (kiemTra(txtDiaChi.getText()) == true) {
            loiDiaChi.setText("");
        }
        else {
            loiDiaChi.setText("Sai định dạng");
        }
    }//GEN-LAST:event_txtDiaChiKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if (kiemTraEmail(txtEmail.getText()) == true) {
            loiEmail.setText("");
        }
        else {
            loiEmail.setText("Sai định dạng");
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtSoDienThoaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoDienThoaiKeyReleased
        if (kiemTraSoDienThoai(txtSoDienThoai.getText()) == true) {
            loiSoDienThoai.setText("");
        }
        else {
            loiSoDienThoai.setText("Sai định dạng");
        }
    }//GEN-LAST:event_txtSoDienThoaiKeyReleased

    private void ngaySinhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ngaySinhKeyReleased
        if (kiemTraNgaySinh(ngaySinh.getText()) == true) {
            loiNgaySinh_1.setText("");
        }
        else {
            loiNgaySinh_1.setText("Sai định dạng");
        }
    }//GEN-LAST:event_ngaySinhKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CapNhatThongTin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuuThongTin;
    private javax.swing.JComboBox<String> gioiTinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loiDiaChi;
    private javax.swing.JLabel loiEmail;
    private javax.swing.JLabel loiHo;
    private javax.swing.JLabel loiNgaySinh;
    private javax.swing.JLabel loiNgaySinh_1;
    private javax.swing.JLabel loiSoDienThoai;
    private javax.swing.JLabel loiTen;
    private javax.swing.JTextField ngaySinh;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHo;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
