package nhanhnhuchop;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThongTinCaNhan extends javax.swing.JFrame {
    private String ten;
    private String id;
    private ConnectSQLSERVER connect;
    private NguoiDung nd;
    private String tenDangNhap;
    private String matKhauCu;
    CapNhatThongTin cntt = new CapNhatThongTin();
    public ThongTinCaNhan() {
        initComponents();
    }
    public ThongTinCaNhan(String id , String ten) {
        initComponents();
        this.id = id;
        this.ten = ten;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtHo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        gioiTinh = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        gioiTinh1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtSoDienThoai = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtTenDangNhap = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMatKhauCu = new javax.swing.JPasswordField();
        txtNhapLaiMatKhauMoi = new javax.swing.JPasswordField();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnHuy = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        btnCapNhat = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        loiNhapLaiMatKhauMoi = new javax.swing.JLabel();
        loiMatKhauCu = new javax.swing.JLabel();
        loiMatKhauMoi = new javax.swing.JLabel();
        ngaySinh = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1330, 820));
        setSize(new java.awt.Dimension(1330, 820));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setEnabled(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Thông Tin Tài Khoản");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(540, 0, 540, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thông Tin Cá Nhân");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 540, 50);

        txtHo.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtHo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHoKeyReleased(evt);
            }
        });
        jPanel1.add(txtHo);
        txtHo.setBounds(70, 100, 110, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel10.setText("jLabel3");
        jLabel10.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel10.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel10.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 100, 40, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Họ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 60, 60, 24);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Tên Đăng Nhập");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(640, 60, 170, 24);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel4.setText("jLabel3");
        jLabel4.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 100, 40, 40);

        txtTen.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtTen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTenKeyReleased(evt);
            }
        });
        jPanel1.add(txtTen);
        txtTen.setBounds(250, 100, 270, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Giới Tính");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 160, 100, 24);

        gioiTinh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        gioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        jPanel1.add(gioiTinh);
        gioiTinh.setBounds(20, 200, 140, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Giới Tính");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 160, 100, 24);

        gioiTinh1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        gioiTinh1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ", "Khác" }));
        jPanel1.add(gioiTinh1);
        gioiTinh1.setBounds(20, 200, 140, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Ngày Sinh");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(20, 260, 100, 24);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Địa Chỉ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 360, 90, 24);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel12.setText("jLabel3");
        jLabel12.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel12.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(20, 400, 40, 40);

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtDiaChi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDiaChiKeyReleased(evt);
            }
        });
        jPanel1.add(txtDiaChi);
        txtDiaChi.setBounds(70, 400, 450, 40);

        txtEmail.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail);
        txtEmail.setBounds(70, 500, 450, 40);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setText("Email");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(20, 460, 120, 24);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel14.setText("jLabel3");
        jLabel14.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel14.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel14.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel14);
        jLabel14.setBounds(20, 500, 40, 40);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("Số Điện Thoại");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(20, 560, 150, 24);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel16.setText("jLabel3");
        jLabel16.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel16.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel16.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel16);
        jLabel16.setBounds(20, 600, 40, 40);

        txtSoDienThoai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtSoDienThoai.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSoDienThoaiKeyReleased(evt);
            }
        });
        jPanel1.add(txtSoDienThoai);
        txtSoDienThoai.setBounds(70, 600, 450, 40);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setText("Nhập Lại Mật Khẩu Mới");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(640, 450, 230, 24);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel18.setText("jLabel3");
        jLabel18.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel18.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel18.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel18);
        jLabel18.setBounds(640, 500, 40, 40);

        txtTenDangNhap.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtTenDangNhap.setText("jLabel3");
        txtTenDangNhap.setEnabled(false);
        jPanel1.add(txtTenDangNhap);
        txtTenDangNhap.setBounds(710, 90, 340, 50);

        jLabel19.setText("--------------------------------------------------------------------------------");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(640, 150, 410, 16);
        jPanel1.add(txtMatKhauCu);
        txtMatKhauCu.setBounds(710, 220, 330, 52);
        jPanel1.add(txtNhapLaiMatKhauMoi);
        txtNhapLaiMatKhauMoi.setBounds(710, 490, 330, 52);
        jPanel1.add(txtMatKhauMoi);
        txtMatKhauMoi.setBounds(710, 350, 330, 52);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel20.setText("jLabel3");
        jLabel20.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel20.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel20.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel20);
        jLabel20.setBounds(640, 100, 40, 40);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel21.setText("jLabel3");
        jLabel21.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel21.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel21.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel21);
        jLabel21.setBounds(640, 230, 40, 40);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/User_Circle.png"))); // NOI18N
        jLabel22.setText("jLabel3");
        jLabel22.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel22.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel22.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel1.add(jLabel22);
        jLabel22.setBounds(640, 360, 40, 40);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel23.setText("Tên");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(200, 60, 60, 24);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel24.setText("Mật Khẩu Cũ");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(640, 180, 150, 24);

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel25.setText("Mật Khẩu Mới");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(640, 310, 180, 24);

        btnHuy.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });
        jPanel1.add(btnHuy);
        btnHuy.setBounds(620, 700, 210, 60);

        btnDoiMatKhau.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDoiMatKhau.setText("Đổi Mật Khẩu");
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoiMatKhau);
        btnDoiMatKhau.setBounds(750, 600, 210, 70);

        btnCapNhat.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });
        jPanel1.add(btnCapNhat);
        btnCapNhat.setBounds(260, 700, 210, 60);

        btnLuu.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });
        jPanel1.add(btnLuu);
        btnLuu.setBounds(260, 700, 210, 60);

        loiNhapLaiMatKhauMoi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiNhapLaiMatKhauMoi.setForeground(java.awt.Color.red);
        loiNhapLaiMatKhauMoi.setText(" ");
        jPanel1.add(loiNhapLaiMatKhauMoi);
        loiNhapLaiMatKhauMoi.setBounds(710, 550, 330, 22);

        loiMatKhauCu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiMatKhauCu.setForeground(java.awt.Color.red);
        loiMatKhauCu.setText(" ");
        jPanel1.add(loiMatKhauCu);
        loiMatKhauCu.setBounds(710, 280, 330, 22);

        loiMatKhauMoi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        loiMatKhauMoi.setForeground(java.awt.Color.red);
        loiMatKhauMoi.setText(" ");
        jPanel1.add(loiMatKhauMoi);
        loiMatKhauMoi.setBounds(710, 410, 330, 22);

        ngaySinh.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        ngaySinh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ngaySinhKeyReleased(evt);
            }
        });
        jPanel1.add(ngaySinh);
        ngaySinh.setBounds(20, 300, 140, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(130, 0, 1080, 820);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1330, 820);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void hienThiThongTin() {
        String query = "SELECT Ho,Ten,GioiTinh,CONVERT (varchar(10), NgaySinh, 103),DiaChi,Email,SoDienThoai FROM ThongTinCaNhan WHERE IDNguoiChoi = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            nd = new NguoiDung();
            nd.setHo(rs.getString(1));
            nd.setTen(rs.getString(2)); 
            nd.setGioiTinh(rs.getString(3));
            nd.setNgaySinh(rs.getString(4));
            nd.setDiaChi(rs.getString(5));
            nd.setEmail(rs.getString(6));
            nd.setSoDienThoai(rs.getString(7));
            
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinCaNhan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void luuThongTinCaNhan() {
        String query = "UPDATE ThongTinCaNhan SET Ho = ? , Ten = ? , GioiTinh = ? , NgaySinh = ? , DiaChi = ? , Email = ? , SoDienThoai = ? WHERE IDNguoiChoi = ?";
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
            
        } catch (SQLException ex) {
            Logger.getLogger(CapNhatThongTin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private String layTenDangNhap() {
        String query = "SELECT TenDangNhap FROM TaiKhoanNguoiDung WHERE IDNguoiChoi = ?";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            this.tenDangNhap = rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinCaNhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tenDangNhap;
    }
    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        this.setVisible(false);
        new TrangChu(this.id,this.ten).setVisible(true);
    }//GEN-LAST:event_btnHuyActionPerformed
    private String layMatKhauCu() {
        String query = "SELECT MatKhau FROM TaiKhoanNguoiDung WHERE IDNguoiChoi = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            this.matKhauCu = rs.getString(1);
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinCaNhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return matKhauCu;
    }
    private void doiMatKhau() {
        layMatKhauCu();
        if (txtMatKhauCu.getText().equals("") && txtMatKhauMoi.getText().equals("") && txtNhapLaiMatKhauMoi.getText().equals("")) {
            loiMatKhauCu.setText("Mật khẩu không được để trống");
            loiMatKhauMoi.setText("Mật khẩu không được để trống");
            loiNhapLaiMatKhauMoi.setText("Mật khẩu không được để trống");
        }
        else if (!txtMatKhauCu.getText().equals(matKhauCu)) {
            loiMatKhauCu.setText("Mật Khẩu Không Đúng");
        }
        else if (txtMatKhauMoi.getText().equals(matKhauCu)) {
            loiMatKhauCu.setText("");
            loiNhapLaiMatKhauMoi.setText("");
            loiMatKhauMoi.setText("Mật Khẩu Cũ Và Mới Không Được Trùng");
        }
        else if (!txtMatKhauMoi.getText().equals(txtNhapLaiMatKhauMoi.getText())) {
            loiMatKhauCu.setText("");
            loiMatKhauMoi.setText("");
            loiNhapLaiMatKhauMoi.setText("Mật Khẩu Phải Giống");
        }
        else {
            String query = "UPDATE TaiKhoanNguoiDung SET MatKhau = ? WHERE IDNguoiChoi = ?";
            try {
                PreparedStatement ps = connect.conn.prepareStatement(query);
                ps.setString(1, txtMatKhauMoi.getText());
                ps.setString(2, id);
                ps.executeUpdate();
                this.setVisible(false);
                new DangNhap().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ThongTinCaNhan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
        btnLuu.setVisible(false);
        txtHo.setEditable(false);
        txtTen.setEditable(false);
        txtDiaChi.setEditable(false);
        gioiTinh.setEditable(false);
        txtDiaChi.setEditable(false);
        txtEmail.setEditable(false);
        txtSoDienThoai.setEditable(false);
        gioiTinh.setEditable(false);
        ngaySinh.setEditable(false);
        hienThiThongTin();
        txtHo.setText(nd.getHo());
        txtTen.setText(nd.getTen());
        gioiTinh.setSelectedItem(nd.getGioiTinh());
        ngaySinh.setText(nd.getNgaySinh());
        txtDiaChi.setText(nd.getDiaChi());
        txtEmail.setText(nd.getEmail());
        txtSoDienThoai.setText(nd.getSoDienThoai());
        layTenDangNhap();
        txtTenDangNhap.setText(this.tenDangNhap);
        
    }//GEN-LAST:event_formWindowOpened

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        doiMatKhau();
        
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        txtHo.setEditable(true);
        txtTen.setEditable(true);
        txtDiaChi.setEditable(true);
        gioiTinh.setEditable(true);
        ngaySinh.setEditable(true);
        txtDiaChi.setEditable(true);
        txtEmail.setEditable(true);
        txtSoDienThoai.setEditable(true);
        btnLuu.setVisible(true);
        btnCapNhat.setVisible(false);
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        btnLuu.setVisible(false);
        btnCapNhat.setVisible(true);
        txtHo.setEditable(false);
        txtTen.setEditable(false);
        gioiTinh.setEditable(false);
        txtDiaChi.setEditable(false);
        ngaySinh.setEditable(false);
        gioiTinh.setEditable(false);
        txtDiaChi.setEditable(false);
        txtEmail.setEditable(false);
        txtSoDienThoai.setEditable(false);
        luuThongTinCaNhan();
               
    }//GEN-LAST:event_btnLuuActionPerformed

    private void txtHoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHoKeyReleased
        if (cntt.kiemTra(txtHo.getText()) == true) {
            txtHo.setForeground(Color.BLACK);
        }
        else {
            txtHo.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtHoKeyReleased

    private void txtTenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTenKeyReleased
        if (cntt.kiemTra(txtTen.getText()) == true) {
            txtTen.setForeground(Color.BLACK);
        }
        else {
            txtTen.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtTenKeyReleased

    private void ngaySinhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ngaySinhKeyReleased
        if (cntt.kiemTraNgaySinh(ngaySinh.getText()) == true) {
            ngaySinh.setForeground(Color.BLACK);
        }
        else {
            ngaySinh.setForeground(Color.RED);
        }
    }//GEN-LAST:event_ngaySinhKeyReleased

    private void txtDiaChiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiaChiKeyReleased
        if (cntt.kiemTra(txtDiaChi.getText()) == true) {
            txtDiaChi.setForeground(Color.BLACK);
        }
        else {
            txtDiaChi.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtDiaChiKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        if (cntt.kiemTraEmail(txtEmail.getText()) == true) {
            txtEmail.setForeground(Color.BLACK);
        }
        else {
            txtEmail.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtSoDienThoaiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSoDienThoaiKeyReleased
        if (cntt.kiemTraSoDienThoai(txtSoDienThoai.getText()) == true) {
            txtSoDienThoai.setForeground(Color.BLACK);
        }
        else {
            txtSoDienThoai.setForeground(Color.RED);
        }
    }//GEN-LAST:event_txtSoDienThoaiKeyReleased
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinCaNhan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JComboBox<String> gioiTinh;
    private javax.swing.JComboBox<String> gioiTinh1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loiMatKhauCu;
    private javax.swing.JLabel loiMatKhauMoi;
    private javax.swing.JLabel loiNhapLaiMatKhauMoi;
    private javax.swing.JTextField ngaySinh;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHo;
    private javax.swing.JPasswordField txtMatKhauCu;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtNhapLaiMatKhauMoi;
    private javax.swing.JTextField txtSoDienThoai;
    private javax.swing.JTextField txtTen;
    private javax.swing.JLabel txtTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
