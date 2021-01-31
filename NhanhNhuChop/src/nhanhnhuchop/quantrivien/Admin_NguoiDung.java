package nhanhnhuchop.quantrivien;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import nhanhnhuchop.LichSuNguoiChoi;

public class Admin_NguoiDung extends javax.swing.JFrame {
    private ConnectSQLSERVER connect;
    private Vector vTitle = null;
    private Vector vData = null;
    private DefaultTableModel tableMode;
    private int num1;
    private int num2;
    private int num3;
    public Admin_NguoiDung() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1440, 820));
        setMinimumSize(new java.awt.Dimension(1440, 820));
        setPreferredSize(new java.awt.Dimension(1440, 820));
        setSize(new java.awt.Dimension(1440, 820));
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
        btnTienThuong.setBounds(650, 110, 280, 70);

        btnNguoiDung.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNguoiDung.setText("Người Dùng");
        btnNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiDungActionPerformed(evt);
            }
        });
        getContentPane().add(btnNguoiDung);
        btnNguoiDung.setBounds(50, 110, 300, 70);

        btnCauHoi.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCauHoi.setText("Câu Hỏi");
        btnCauHoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCauHoiActionPerformed(evt);
            }
        });
        getContentPane().add(btnCauHoi);
        btnCauHoi.setBounds(350, 110, 300, 70);

        jTable3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
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
        jTable3.setRowHeight(40);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
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
        jTable1.setRowHeight(40);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 470, 990, 350);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
        hienThi();
        txtTaiKhoanDaTao.setText(String.valueOf(LaySoTaiKhoanDaTao()));
        txtTaiKhoanDaThamGiaChoi.setText(String.valueOf(LaySoTaiKhoanDaThamGiaChoi()));
        txtTaiKhoanChuaCapNhatThongTin.setText(String.valueOf(LaySoTaiKhoanChuaCapNhatThongTin()));
        hienThiNguoiChoi();
    }//GEN-LAST:event_formWindowOpened

    private void hienThi() {
        String query = "SELECT * FROM ThongTinCaNhan INNER JOIN TaiKhoanNguoiDung " +
            " ON TaiKhoanNguoiDung.IDNguoiChoi = ThongTinCaNhan.IDNguoiChoi";
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
                    vData.add(rs.getString(8));
                    vData.add(rs.getString(9));
                    vData.add(rs.getString(10));
                    vData.add(rs.getString(11));
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

    }//GEN-LAST:event_btnNguoiDungActionPerformed

    private void btnCauHoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCauHoiActionPerformed
        this.setVisible(false);
        new Admin_CauHoi().setVisible(true);
    }//GEN-LAST:event_btnCauHoiActionPerformed

    private void btnTienThuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienThuongActionPerformed
        this.setVisible(false);
        new Admin_TienThuong().setVisible(true);
    }//GEN-LAST:event_btnTienThuongActionPerformed
    public static void main(String args[]) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_NguoiDung().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCauHoi;
    private javax.swing.JButton btnNguoiDung;
    private javax.swing.JButton btnTienThuong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JLabel txtTaiKhoanChuaCapNhatThongTin;
    private javax.swing.JLabel txtTaiKhoanDaTao;
    private javax.swing.JLabel txtTaiKhoanDaThamGiaChoi;
    // End of variables declaration//GEN-END:variables
}
