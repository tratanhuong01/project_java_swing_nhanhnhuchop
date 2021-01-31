package nhanhnhuchop;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.text.TableView;

public class BangXepHang extends javax.swing.JFrame {
    private ConnectSQLSERVER connect;
    private String id;
    private String ten;
    private Vector vTitle = null;
    private Vector vData = null;
    private DefaultTableModel tableMode;
    public BangXepHang() {
        initComponents();
    }
    public BangXepHang(String id, String ten) {
        initComponents();
        this.id = id;
        this.ten = ten;
    }
    private void hienThiCauDungNhieuNhat() {
        String query = "SELECT TOP 10 ROW_NUMBER() OVER (ORDER By KetQua.SoCauDung DESC)"
                + " N'Số Thứ Tự' ,TaiKhoanNguoiDung.TenDangNhap N'Tên Đăng Nhập' , KetQua.SoCauDung"
                + " N'Số Câu Đúng' FROM TaiKhoanNguoiDung " + "INNER JOIN KetQua ON TaiKhoanNguoiDung.IDNguoiChoi "
                + "= KetQua.IDNguoiChoi";
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
                lichSuNguoiDung.removeAll();
                while (rs.next()) {
                    vData = new Vector();
                    vData.add(rs.getString(1));
                    vData.add(rs.getString(2));
                    vData.add(rs.getInt(3));
                    tableMode.addRow(vData);
                }
                lichSuNguoiDung.setModel(tableMode);
        } catch (SQLException ex) {
            Logger.getLogger(LichSuNguoiChoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void hienThiTongTaiSan() {
        String query = "SELECT TOP 10 ROW_NUMBER() OVER (ORDER By KetQua.Tien DESC) N'Số Thứ Tự' , "
                + "TaiKhoanNguoiDung.TenDangNhap N'Tên Đăng Nhập' , KetQua.Tien N'Tiền' FROM TaiKhoanNguoiDung " 
                +"INNER JOIN KetQua ON TaiKhoanNguoiDung.IDNguoiChoi = KetQua.IDNguoiChoi";
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
                lichSuNguoiDung.removeAll();
                while (rs.next()) {
                    vData = new Vector();
                    vData.add(rs.getString(1));
                    vData.add(rs.getString(2));
                    vData.add(rs.getInt(3));
                    tableMode.addRow(vData);
                }
                lichSuNguoiDung.setModel(tableMode);
        } catch (SQLException ex) {
            Logger.getLogger(LichSuNguoiChoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVeTrangChu = new javax.swing.JButton();
        btnVeTrangChu_2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnNhanhNhat = new javax.swing.JButton();
        btnCauDungNhieuNhat = new javax.swing.JButton();
        btnTongTaiSan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lichSuNguoiDung = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1330, 820));
        setSize(new java.awt.Dimension(1330, 820));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        btnVeTrangChu.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnVeTrangChu.setText("Về Trang Chủ");
        btnVeTrangChu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVeTrangChuActionPerformed(evt);
            }
        });
        getContentPane().add(btnVeTrangChu);
        btnVeTrangChu.setBounds(1100, 10, 230, 70);

        btnVeTrangChu_2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnVeTrangChu_2.setText("Về Trang Chủ");
        getContentPane().add(btnVeTrangChu_2);
        btnVeTrangChu_2.setBounds(10, 10, 230, 70);

        jButton4.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        jButton4.setText("BẢNG XẾP HẠNG");
        getContentPane().add(jButton4);
        jButton4.setBounds(440, 10, 450, 70);

        btnNhanhNhat.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnNhanhNhat.setText("Nhanh Nhất");
        btnNhanhNhat.setMaximumSize(new java.awt.Dimension(25, 25));
        getContentPane().add(btnNhanhNhat);
        btnNhanhNhat.setBounds(890, 100, 440, 70);

        btnCauDungNhieuNhat.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnCauDungNhieuNhat.setText("Câu Đúng Nhiều Nhất");
        btnCauDungNhieuNhat.setMaximumSize(new java.awt.Dimension(25, 25));
        btnCauDungNhieuNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCauDungNhieuNhatActionPerformed(evt);
            }
        });
        getContentPane().add(btnCauDungNhieuNhat);
        btnCauDungNhieuNhat.setBounds(0, 100, 440, 70);

        btnTongTaiSan.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        btnTongTaiSan.setText("Tổng Tài Sản");
        btnTongTaiSan.setMaximumSize(new java.awt.Dimension(25, 25));
        btnTongTaiSan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongTaiSanActionPerformed(evt);
            }
        });
        getContentPane().add(btnTongTaiSan);
        btnTongTaiSan.setBounds(440, 100, 450, 70);

        lichSuNguoiDung.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lichSuNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        lichSuNguoiDung.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        lichSuNguoiDung.setRowHeight(50);
        lichSuNguoiDung.setRowMargin(20);
        jScrollPane1.setViewportView(lichSuNguoiDung);
        lichSuNguoiDung.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 180, 1330, 600);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1330, 820);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
        hienThiCauDungNhieuNhat();
        lichSuNguoiDung.getTableHeader().setPreferredSize(new Dimension(WIDTH, 60));
        lichSuNguoiDung.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
    }//GEN-LAST:event_formWindowOpened

    private void btnCauDungNhieuNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCauDungNhieuNhatActionPerformed
       hienThiCauDungNhieuNhat();
    }//GEN-LAST:event_btnCauDungNhieuNhatActionPerformed

    private void btnTongTaiSanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTongTaiSanActionPerformed
        hienThiTongTaiSan();
    }//GEN-LAST:event_btnTongTaiSanActionPerformed

    private void btnVeTrangChuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVeTrangChuActionPerformed
        this.setVisible(false);
        new TrangChu(this.id, this.ten).setVisible(true);
    }//GEN-LAST:event_btnVeTrangChuActionPerformed
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BangXepHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCauDungNhieuNhat;
    private javax.swing.JButton btnNhanhNhat;
    private javax.swing.JButton btnTongTaiSan;
    private javax.swing.JButton btnVeTrangChu;
    private javax.swing.JButton btnVeTrangChu_2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lichSuNguoiDung;
    // End of variables declaration//GEN-END:variables
}
