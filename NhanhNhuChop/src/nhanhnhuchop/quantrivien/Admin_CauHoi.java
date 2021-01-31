package nhanhnhuchop.quantrivien;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import nhanhnhuchop.LichSuNguoiChoi;

public class Admin_CauHoi extends javax.swing.JFrame {
    private ConnectSQLSERVER connect;
    private Vector vTitle = null;
    private Vector vData = null;
    private DefaultTableModel tableMode;
    private int num1;
    private int num2;
    private int num3;
    public Admin_CauHoi() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTaiKhoanChuaCapNhatThongTin = new javax.swing.JLabel();
        txtTaiKhoanDaTao = new javax.swing.JLabel();
        txtTaiKhoanDaThamGiaChoi = new javax.swing.JLabel();
        btnTienThuong = new javax.swing.JButton();
        btnNguoiDung = new javax.swing.JButton();
        btnCauHoi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtIDCauHoi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDapAn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDoKho = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCauHoi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDapAn_A = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDapAn_C = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDapAn_B = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtDapAn_D = new javax.swing.JTextField();
        btnNhapFile = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnNhapLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1440, 860));
        setMinimumSize(new java.awt.Dimension(1440, 860));
        setPreferredSize(new java.awt.Dimension(1440, 860));
        setSize(new java.awt.Dimension(1440, 860));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Tài Khoản Đã Tạo");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 0, 145, 22);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Tài Khoản Chưa Cập Nhật Thông Tin");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(720, 0, 297, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Tài Khoản Đã Tham Gia Chơi");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(340, 0, 236, 22);

        txtTaiKhoanChuaCapNhatThongTin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtTaiKhoanChuaCapNhatThongTin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTaiKhoanChuaCapNhatThongTin.setText("0");
        jPanel1.add(txtTaiKhoanChuaCapNhatThongTin);
        txtTaiKhoanChuaCapNhatThongTin.setBounds(640, 40, 460, 60);

        txtTaiKhoanDaTao.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtTaiKhoanDaTao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTaiKhoanDaTao.setText("0");
        jPanel1.add(txtTaiKhoanDaTao);
        txtTaiKhoanDaTao.setBounds(0, 40, 300, 60);

        txtTaiKhoanDaThamGiaChoi.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtTaiKhoanDaThamGiaChoi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTaiKhoanDaThamGiaChoi.setText("0");
        jPanel1.add(txtTaiKhoanDaThamGiaChoi);
        txtTaiKhoanDaThamGiaChoi.setBounds(310, 40, 300, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(340, 0, 1100, 100);

        btnTienThuong.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnTienThuong.setText("Tiền Thưởng");
        btnTienThuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienThuongActionPerformed(evt);
            }
        });
        getContentPane().add(btnTienThuong);
        btnTienThuong.setBounds(630, 110, 280, 70);

        btnNguoiDung.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNguoiDung.setText("Người Dùng");
        btnNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiDungActionPerformed(evt);
            }
        });
        getContentPane().add(btnNguoiDung);
        btnNguoiDung.setBounds(30, 110, 300, 70);

        btnCauHoi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCauHoi.setText("Câu Hỏi");
        btnCauHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCauHoiActionPerformed(evt);
            }
        });
        getContentPane().add(btnCauHoi);
        btnCauHoi.setBounds(330, 110, 300, 70);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(1000, 470, 440, 350);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(1000, 110, 430, 350);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(1000, 110, 430, 350);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 470, 990, 330);

        jLabel4.setText("ID Câu Hỏi");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 200, 60, 30);
        getContentPane().add(txtIDCauHoi);
        txtIDCauHoi.setBounds(110, 200, 120, 30);

        jLabel5.setText("Đáp Án");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(250, 200, 60, 30);
        getContentPane().add(txtDapAn);
        txtDapAn.setBounds(310, 200, 400, 30);

        jLabel7.setText("Độ Khó");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(740, 200, 41, 30);
        getContentPane().add(txtDoKho);
        txtDoKho.setBounds(800, 200, 100, 30);

        jLabel8.setText("Câu Hỏi");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 260, 44, 30);
        getContentPane().add(txtCauHoi);
        txtCauHoi.setBounds(110, 260, 790, 30);

        jLabel9.setText("Lựa Chọn A");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 310, 70, 30);

        txtDapAn_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDapAn_AActionPerformed(evt);
            }
        });
        getContentPane().add(txtDapAn_A);
        txtDapAn_A.setBounds(110, 310, 340, 30);

        jLabel10.setText("Lựa Chọn C");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 310, 70, 30);
        getContentPane().add(txtDapAn_C);
        txtDapAn_C.setBounds(540, 310, 360, 30);

        jLabel11.setText("Lựa Chọn B");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 360, 70, 30);
        getContentPane().add(txtDapAn_B);
        txtDapAn_B.setBounds(110, 360, 340, 30);

        jLabel12.setText("Lựa Chọn D");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(460, 360, 70, 30);
        getContentPane().add(txtDapAn_D);
        txtDapAn_D.setBounds(540, 360, 360, 30);

        btnNhapFile.setText("Nhập FILE");
        getContentPane().add(btnNhapFile);
        btnNhapFile.setBounds(760, 420, 120, 40);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        getContentPane().add(btnThem);
        btnThem.setBounds(60, 420, 120, 40);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSua);
        btnSua.setBounds(230, 420, 120, 40);

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        getContentPane().add(btnXoa);
        btnXoa.setBounds(400, 420, 120, 40);

        btnNhapLai.setText("Nhập Lại");
        btnNhapLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnNhapLai);
        btnNhapLai.setBounds(580, 420, 120, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void themCauHoi() {
        String query = "INSERT INTO DanhSachCauHoi(IDCauHoi,CauHoi,A,B,C,D,DapAn,DoKho)VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, txtIDCauHoi.getText());
            ps.setString(2, txtCauHoi.getText());
            ps.setString(3, txtDapAn_A.getText());
            ps.setString(4, txtDapAn_B.getText());
            ps.setString(5, txtDapAn_C.getText());
            ps.setString(6, txtDapAn_D.getText());
            ps.setString(7, txtDapAn.getText());
            ps.setInt(8, Integer.parseInt(txtDoKho.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Thêm Thành Công");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Trùng ID Câu Hỏi");
        }
    }
    private void suaCauHoi() {
        String query = "UPDATE DanhSachCauHoi SET CauHoi = ? ,A = ?, B = ? ,C = ?"
                + ",D = ? ,DapAn = ? , DoKho = ? WHERE IDCauHoi = ?";
        try {
            PreparedStatement ps =  connect.conn.prepareStatement(query);
            ps.setString(1, txtCauHoi.getText());
            ps.setString(2, txtDapAn_A.getText());
            ps.setString(3, txtDapAn_B.getText());
            ps.setString(4, txtDapAn_C.getText());
            ps.setString(5, txtDapAn_D.getText());
            ps.setString(6, txtDapAn.getText());
            ps.setInt(7, Integer.parseInt(txtDoKho.getText()));
            ps.setString(8, txtIDCauHoi.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Sửa Thành Công");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Sửa Thất Bại");
            Logger.getLogger(Admin_CauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void xoaCauHoi() {
        String query = "DELETE FROM DanhSachCauHoi WHERE IDCauHoi = ? ";
        try {
            PreparedStatement ps  = connect.conn.prepareStatement(query);
            ps.setString(1, txtIDCauHoi.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(rootPane, "Xóa Thành Công");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Xóa Thất Bại");
            Logger.getLogger(Admin_CauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
        hienThi();
        txtTaiKhoanDaTao.setText(String.valueOf(LaySoTaiKhoanDaTao()));
        txtTaiKhoanDaThamGiaChoi.setText(String.valueOf(LaySoTaiKhoanDaThamGiaChoi()));
        txtTaiKhoanChuaCapNhatThongTin.setText(String.valueOf(LaySoTaiKhoanChuaCapNhatThongTin()));
        hienThiNguoiChoi();
    }//GEN-LAST:event_formWindowOpened
    private int LaySoTaiKhoanDaTao()
    {
            String query = "SELECT COUNT(*) FROM TaiKhoanNguoiDung ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                num1 = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_CauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
            return num1;
    }
    private int LaySoTaiKhoanDaThamGiaChoi()
    {
            String query = "SELECT DISTINCT LichSuNguoiChoi.IDNguoiChoi FROM LichSuNguoiChoi INNER JOIN  TaiKhoanNguoiDung " +
            " ON TaiKhoanNguoiDung.IDNguoiChoi = TaiKhoanNguoiDung.IDNguoiChoi WHERE LichSuNguoiChoi.IDNguoiChoi = TaiKhoanNguoiDung.IDNguoiChoi";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                num2++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_CauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
            return num2;
    }
    private int LaySoTaiKhoanChuaCapNhatThongTin()
    {
            String query = "SELECT IDNguoiChoi FROM ThongTinCaNhan WHERE Ho IS NULL AND Ten IS NULL AND GioiTinh IS NULL " +
        " AND NgaySinh IS NULL AND DiaChi IS NULL AND Email IS NULL AND SoDienThoai IS NULL ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                num3++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_CauHoi.class.getName()).log(Level.SEVERE, null, ex);
        }
            return num3;
    }
    private void hienThi() {
        String query = "SELECT * FROM DanhSachCauHoi";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
                int soCot = rsm.getColumnCount();
                vTitle = new Vector(soCot);
                for (int i = 1; i <= soCot; i++) {
                    vTitle.add(rsm.getColumnLabel(i));
                }
                tableMode = new DefaultTableModel(vTitle, 0);
                jTable1.removeAll();
                while (rs.next()) {
                    vData = new Vector();
                    vData.add(rs.getString(1));
                    vData.add(rs.getString(2));
                    vData.add(rs.getString(3));
                    vData.add(rs.getString(4));
                    vData.add(rs.getString(5));
                    vData.add(rs.getString(6));
                    vData.add(rs.getString(7));
                    vData.add(rs.getInt(8));
                    tableMode.addRow(vData);
                }
                jTable1.setModel(tableMode);
        } catch (SQLException ex) {
            Logger.getLogger(LichSuNguoiChoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void hienThiNguoiChoi()
    {
        String query = "SELECT CONCAT(TaiKhoanNguoiDung.TenDangNhap , N'  Đã Chơi Lúc ' "
                + ",CONVERT(NVARCHAR, NgayGioChoi, 20)) N'Lịch Sử Người Chơi' FROM LichSuNguoiChoi " 
                +" INNER JOIN TaiKhoanNguoiDung ON TaiKhoanNguoiDung.IDNguoiChoi = LichSuNguoiChoi.IDNguoiChoi"
                + " ORDER BY NgayGioChoi DESC";
        try {
            PreparedStatement ps =  connect.conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            ResultSetMetaData rsm = rs.getMetaData();
                int soCot = rsm.getColumnCount();
                vTitle = new Vector(soCot);
                for (int i = 1; i <= soCot; i++) {
                    vTitle.add(rsm.getColumnLabel(i));
                }
                tableMode = new DefaultTableModel(vTitle, 0);
                jTable3.removeAll();
                while (rs.next()) {
                    vData = new Vector();
                    vData.add(rs.getString(1));
                    tableMode.addRow(vData);
                }
                jTable3.setModel(tableMode);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_NguoiDung.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiDungActionPerformed
        this.setVisible(false);
        new Admin_NguoiDung().setVisible(true);
    }//GEN-LAST:event_btnNguoiDungActionPerformed

    private void btnCauHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCauHoiActionPerformed

    }//GEN-LAST:event_btnCauHoiActionPerformed

    private void btnTienThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienThuongActionPerformed
        this.setVisible(false);
        new Admin_TienThuong().setVisible(true);
    }//GEN-LAST:event_btnTienThuongActionPerformed

    private void txtDapAn_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDapAn_AActionPerformed
        
    }//GEN-LAST:event_txtDapAn_AActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        themCauHoi();
        hienThi();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        suaCauHoi();
        hienThi();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        xoaCauHoi();
        hienThi();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnNhapLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapLaiActionPerformed
        txtIDCauHoi.setText("");
        txtCauHoi.setText("");
        txtDapAn_A.setText("");
        txtDapAn_B.setText("");
        txtDapAn_C.setText("");
        txtDapAn_D.setText("");
        txtDapAn.setText("");
        txtDoKho.setText("");
    }//GEN-LAST:event_btnNhapLaiActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        txtIDCauHoi.setText(jTable1.getModel().getValueAt(row, 0).toString());
        txtCauHoi.setText(jTable1.getModel().getValueAt(row, 1).toString());
        txtDapAn_A.setText(jTable1.getModel().getValueAt(row, 2).toString());
        txtDapAn_B.setText(jTable1.getModel().getValueAt(row, 3).toString());
        txtDapAn_C.setText(jTable1.getModel().getValueAt(row, 4).toString());
        txtDapAn_D.setText(jTable1.getModel().getValueAt(row, 5).toString());
        txtDapAn.setText(jTable1.getModel().getValueAt(row, 6).toString());
        txtDoKho.setText(jTable1.getModel().getValueAt(row, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_CauHoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCauHoi;
    private javax.swing.JButton btnNguoiDung;
    private javax.swing.JButton btnNhapFile;
    private javax.swing.JButton btnNhapLai;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTienThuong;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField txtCauHoi;
    private javax.swing.JTextField txtDapAn;
    private javax.swing.JTextField txtDapAn_A;
    private javax.swing.JTextField txtDapAn_B;
    private javax.swing.JTextField txtDapAn_C;
    private javax.swing.JTextField txtDapAn_D;
    private javax.swing.JTextField txtDoKho;
    private javax.swing.JTextField txtIDCauHoi;
    private javax.swing.JLabel txtTaiKhoanChuaCapNhatThongTin;
    private javax.swing.JLabel txtTaiKhoanDaTao;
    private javax.swing.JLabel txtTaiKhoanDaThamGiaChoi;
    // End of variables declaration//GEN-END:variables
}
