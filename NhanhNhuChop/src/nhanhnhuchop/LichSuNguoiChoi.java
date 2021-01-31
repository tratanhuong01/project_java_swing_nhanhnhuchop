package nhanhnhuchop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class LichSuNguoiChoi extends javax.swing.JFrame {
    private String id;
    private String ten;
    private ConnectSQLSERVER connect;
    private Vector vTitle = null;
    private Vector vData = null;
    private DefaultTableModel tableMode;
    public LichSuNguoiChoi() {
        initComponents();
    }
    public LichSuNguoiChoi(String id,String ten) {
        initComponents();
        this.id = id;
        this.ten = ten;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lichSuNguoiDung = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1330, 820));
        setSize(new java.awt.Dimension(1330, 820));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton1.setText("LỊCH SỬ NGƯỜI DÙNG");
        getContentPane().add(jButton1);
        jButton1.setBounds(420, 20, 430, 70);

        jButton2.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton2.setText("Về Trang Chủ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(1080, 20, 220, 70);

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

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 120, 1330, 660);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1330, 820);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hienThi() {
        String query = "SELECT ROW_NUMBER() OVER (ORDER BY NgayGioChoi DESC) 'Số Thứ Tự',SoCauLienTiep,TongSoCau,SoCauDung,SoCauSai,"
                + "NgayGioChoi,TienThang,SoGiay FROM LichSuNguoiChoi WHERE IDNguoiChoi = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, id);
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
                    vData.add(rs.getString(3));
                    vData.add(rs.getString(4));
                    vData.add(rs.getString(5));
                    vData.add(rs.getString(6));
                    vData.add(rs.getString(7));
                    vData.add(rs.getInt(8));
                    tableMode.addRow(vData);
                }
                lichSuNguoiDung.setModel(tableMode);
        } catch (SQLException ex) {
            Logger.getLogger(LichSuNguoiChoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
        lichSuNguoiDung.setEnabled(false);
        lichSuNguoiDung.getTableHeader().setPreferredSize(new Dimension(WIDTH, 60));
        lichSuNguoiDung.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 14));
        hienThi();
        
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new TrangChu(this.id,this.ten).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LichSuNguoiChoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lichSuNguoiDung;
    // End of variables declaration//GEN-END:variables
}
