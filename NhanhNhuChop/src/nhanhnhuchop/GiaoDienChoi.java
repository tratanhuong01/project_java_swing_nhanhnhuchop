package nhanhnhuchop;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class GiaoDienChoi extends javax.swing.JFrame {
    private ConnectSQLSERVER connect;
    private String id;
    private String ten;
    private JButton[] btn;
    private JLabel[] lb;
    private int[] tienThuong;
    private Vector vTitle;
    private Vector vData;
    private DefaultTableModel tableMode = new DefaultTableModel(vTitle,vData);
    private CauHoi ch;
    private String dapAn;
    private int soCau = 0;
    private int dem = 0;
    private int demTongCau = 0;
    private int demSoCauDung = 0;
    private int demSoCauSai = 0;
    private int tien = 0;
    private Timer demGiayChoi;
    int giay = 60;
    private int layTien;
    private int laySoCau;
    private int xuLiDungLai = 0;
    public GiaoDienChoi() {
        initComponents();
    }
    public GiaoDienChoi(String id , String ten) {
        initComponents();
        this.id = id;
        this.ten = ten;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        demGiay = new javax.swing.JLabel();
        pic3 = new javax.swing.JLabel();
        pic1 = new javax.swing.JLabel();
        pic2 = new javax.swing.JLabel();
        pic6 = new javax.swing.JLabel();
        pic4 = new javax.swing.JLabel();
        pic5 = new javax.swing.JLabel();
        pic10 = new javax.swing.JLabel();
        pic7 = new javax.swing.JLabel();
        pic8 = new javax.swing.JLabel();
        pic9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtTien = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btnDapAn_B = new javax.swing.JButton();
        btnDapAn_A = new javax.swing.JButton();
        btnDapAn_D = new javax.swing.JButton();
        btnDapAn_C = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txtCauHoi = new javax.swing.JLabel();
        btnDungLai = new javax.swing.JButton();
        btnSanSang = new javax.swing.JButton();
        btnTiepTuc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        danhSachCauHoi = new javax.swing.JTable();
        idcauhoi = new javax.swing.JLabel();
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

        btn1.setBackground(java.awt.Color.white);
        btn1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn1.setText("1");
        getContentPane().add(btn1);
        btn1.setBounds(120, 570, 80, 50);

        btn2.setBackground(java.awt.Color.white);
        btn2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn2.setText("2");
        getContentPane().add(btn2);
        btn2.setBounds(120, 510, 80, 50);

        btn6.setBackground(java.awt.Color.white);
        btn6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn6.setText("6");
        getContentPane().add(btn6);
        btn6.setBounds(120, 270, 80, 50);

        btn4.setBackground(java.awt.Color.white);
        btn4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn4.setText("4");
        getContentPane().add(btn4);
        btn4.setBounds(120, 390, 80, 50);

        btn7.setBackground(java.awt.Color.white);
        btn7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn7.setText("7");
        getContentPane().add(btn7);
        btn7.setBounds(120, 210, 80, 50);

        btn8.setBackground(java.awt.Color.white);
        btn8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn8.setText("8");
        getContentPane().add(btn8);
        btn8.setBounds(120, 150, 80, 50);

        btn3.setBackground(java.awt.Color.white);
        btn3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn3.setText("3");
        getContentPane().add(btn3);
        btn3.setBounds(120, 450, 80, 50);

        btn5.setBackground(java.awt.Color.white);
        btn5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn5.setText("5");
        getContentPane().add(btn5);
        btn5.setBounds(120, 330, 80, 50);

        btn9.setBackground(java.awt.Color.white);
        btn9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn9.setText("9");
        getContentPane().add(btn9);
        btn9.setBounds(120, 90, 80, 50);

        btn10.setBackground(java.awt.Color.white);
        btn10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn10.setText("10");
        getContentPane().add(btn10);
        btn10.setBounds(120, 30, 80, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-png-21493.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 600, 160, 200);

        demGiay.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        demGiay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        demGiay.setText("60");
        getContentPane().add(demGiay);
        demGiay.setBounds(80, 670, 90, 60);

        pic3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-avatar-png-6.png"))); // NOI18N
        getContentPane().add(pic3);
        pic3.setBounds(60, 460, 50, 40);

        pic1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-avatar-png-6.png"))); // NOI18N
        getContentPane().add(pic1);
        pic1.setBounds(60, 580, 50, 40);

        pic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-avatar-png-6.png"))); // NOI18N
        getContentPane().add(pic2);
        pic2.setBounds(60, 520, 50, 40);

        pic6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-avatar-png-6.png"))); // NOI18N
        getContentPane().add(pic6);
        pic6.setBounds(60, 280, 50, 40);

        pic4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-avatar-png-6.png"))); // NOI18N
        getContentPane().add(pic4);
        pic4.setBounds(60, 400, 50, 40);

        pic5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-avatar-png-6.png"))); // NOI18N
        getContentPane().add(pic5);
        pic5.setBounds(60, 340, 50, 40);

        pic10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-avatar-png-6.png"))); // NOI18N
        getContentPane().add(pic10);
        pic10.setBounds(60, 40, 50, 40);

        pic7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-avatar-png-6.png"))); // NOI18N
        getContentPane().add(pic7);
        pic7.setBounds(60, 220, 50, 40);

        pic8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-avatar-png-6.png"))); // NOI18N
        getContentPane().add(pic8);
        pic8.setBounds(60, 160, 50, 40);

        pic9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/circle-avatar-png-6.png"))); // NOI18N
        getContentPane().add(pic9);
        pic9.setBounds(60, 100, 50, 40);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/right-gd.png"))); // NOI18N
        getContentPane().add(jLabel13);
        jLabel13.setBounds(1130, 0, 200, 250);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left-gd.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(360, 0, 200, 250);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/6702094_preview.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(560, 0, 550, 180);

        txtTien.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtTien.setForeground(java.awt.Color.white);
        txtTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtTien.setText("0");
        getContentPane().add(txtTien);
        txtTien.setBounds(710, 180, 350, 50);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setForeground(java.awt.Color.white);
        jLabel16.setText("Số Tiền");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(590, 180, 100, 50);

        btnDapAn_B.setBackground(java.awt.Color.white);
        btnDapAn_B.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDapAn_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDapAn_BActionPerformed(evt);
            }
        });
        getContentPane().add(btnDapAn_B);
        btnDapAn_B.setBounds(950, 290, 350, 110);

        btnDapAn_A.setBackground(java.awt.Color.white);
        btnDapAn_A.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDapAn_A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDapAn_AActionPerformed(evt);
            }
        });
        getContentPane().add(btnDapAn_A);
        btnDapAn_A.setBounds(340, 290, 350, 110);

        btnDapAn_D.setBackground(java.awt.Color.white);
        btnDapAn_D.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDapAn_D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDapAn_DActionPerformed(evt);
            }
        });
        getContentPane().add(btnDapAn_D);
        btnDapAn_D.setBounds(950, 440, 350, 110);

        btnDapAn_C.setBackground(java.awt.Color.white);
        btnDapAn_C.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDapAn_C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDapAn_CActionPerformed(evt);
            }
        });
        getContentPane().add(btnDapAn_C);
        btnDapAn_C.setBounds(340, 440, 350, 110);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(null);

        txtCauHoi.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        txtCauHoi.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCauHoi.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(txtCauHoi);
        txtCauHoi.setBounds(0, 0, 960, 170);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(340, 590, 960, 170);

        btnDungLai.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnDungLai.setText("Dừng Lại");
        btnDungLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDungLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnDungLai);
        btnDungLai.setBounds(740, 490, 160, 50);

        btnSanSang.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnSanSang.setText("Sẵn Sàng");
        btnSanSang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanSangActionPerformed(evt);
            }
        });
        getContentPane().add(btnSanSang);
        btnSanSang.setBounds(740, 290, 160, 50);

        btnTiepTuc.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        btnTiepTuc.setText("Tiếp Theo");
        btnTiepTuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTiepTucActionPerformed(evt);
            }
        });
        getContentPane().add(btnTiepTuc);
        btnTiepTuc.setBounds(740, 390, 160, 50);

        danhSachCauHoi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(danhSachCauHoi);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1040, 20, 90, 20);
        getContentPane().add(idcauhoi);
        idcauhoi.setBounds(1090, 90, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1340, 820);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private JButton[] danhSachJButton() {
        JButton btn0 = new JButton();
        btn = new JButton[]{btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10};
        return btn;
    }
    private JLabel[] danhSanhJLabel() {
        JLabel pic0 = new JLabel();
        lb = new JLabel[] {pic0,pic1,pic2,pic3,pic4,pic5,pic6,pic7,pic8,pic9,pic10};
        return lb;
    }
    private int[] danhSachTienThuong() {
        tienThuong = new int[11];
        String query = "SELECT Tien FROM TienThuong";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            int i = 0;
            while (rs.next()) {
                tienThuong[i] = Integer.parseInt(rs.getString(1));
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienChoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tienThuong;
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        connect = new ConnectSQLSERVER();
        connect.connectSQL();
        danhSachJButton();
        danhSanhJLabel();
        danhSachTienThuong();
        for (int i = 0 ; i < lb.length ; i++) {
            lb[i].setVisible(false);
        }
        btnDapAn_A.setVisible(false);
        btnDapAn_B.setVisible(false);
        btnDapAn_C.setVisible(false);
        btnDapAn_D.setVisible(false);
        btnTiepTuc.setVisible(false);
    }//GEN-LAST:event_formWindowOpened
    private void hienThiCauHoiLenTable(int x) {
        String query = "SELECT * FROM DanhSachCauHoi WHERE DoKho = ? ";
        try {
            ResultSet rs;
            try (PreparedStatement ps = ConnectSQLSERVER.conn.prepareStatement(query)) {
                ps.setInt(1, x);
                rs = ps.executeQuery();
                ResultSetMetaData rsm = rs.getMetaData();
                int soCot = rsm.getColumnCount();
                vTitle = new Vector(soCot);
                for (int i = 1; i <= soCot; i++) {
                    vTitle.add(rsm.getColumnLabel(i));
                }
                tableMode = new DefaultTableModel(vTitle, 0);
                danhSachCauHoi.removeAll();
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
                danhSachCauHoi.setModel(tableMode);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienChoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private int demSoCauHoiTheoDoKho(int x) {
        String query = "SELECT COUNT(*) FROM DanhSachCauHoi WHERE DoKho = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setInt(1, x);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soCau = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienChoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return soCau;
    }
    private CauHoi listCauHoi() {
        hienThiCauHoiLenTable(dem);
        demSoCauHoiTheoDoKho(dem);
        ch = new CauHoi();
        Random random = new Random();
        int soRandom = random.nextInt(soCau);
        ch.setIdCauHoi((String)(tableMode.getValueAt(soRandom,0)));
        ch.setCauHoi((String)(tableMode.getValueAt(soRandom,1)));
        ch.setA((String)(tableMode.getValueAt(soRandom,2)));
        ch.setB((String)(tableMode.getValueAt(soRandom,3)));
        ch.setC((String)(tableMode.getValueAt(soRandom,4)));
        ch.setD((String)(tableMode.getValueAt(soRandom,5)));
        ch.setDapAn(String.valueOf((tableMode.getValueAt(soRandom,6))));
        return ch;
    }
    private void hienThiCauHoi() {
        CauHoi cauhoi = new CauHoi();
        cauhoi = listCauHoi();
        idcauhoi.setText(cauhoi.getIdCauHoi());
        txtCauHoi.setText(cauhoi.getCauHoi());
        btnDapAn_A.setText(cauhoi.getA());
        btnDapAn_B.setText(cauhoi.getB());
        btnDapAn_C.setText(cauhoi.getC());
        btnDapAn_D.setText(cauhoi.getD());
        dapAn = cauhoi.getDapAn();
    }
    
    private void btnDungLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDungLaiActionPerformed
        if (xuLiDungLai == 0) {
            this.setVisible(false);
            new TrangChu(this.id,this.ten).setVisible(true);
        }
        else {
            capNhatKetQua();
            themLichSuNguoiChoi();
            demGiayChoi.stop();
            this.setVisible(false);
            new TrangChu(this.id,this.ten).setVisible(true);
        }
    }//GEN-LAST:event_btnDungLaiActionPerformed

    private void btnSanSangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanSangActionPerformed
        xuLiDungLai = 1;
        btnSanSang.setVisible(false);
        listCauHoi();
        hienThiCauHoi();
        btnDapAn_A.setVisible(true);
        btnDapAn_B.setVisible(true);
        btnDapAn_C.setVisible(true);
        btnDapAn_D.setVisible(true);
        demGiayChoi = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                giay--;
                demGiay.setText(String.valueOf(giay));
                if (giay == 0) {
                    demGiayChoi.stop();
                    capNhatKetQua();
                    themLichSuNguoiChoi();
                    dongApp();
                }
            }
        });
        demGiayChoi.start();
    }//GEN-LAST:event_btnSanSangActionPerformed

    public void dongApp() {
        this.setVisible(false);
        new Win1(this.id,this.ten,dem).setVisible(true);
    }
    private void btnDapAn_AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDapAn_AActionPerformed
        demTongCau++;
        if (btnDapAn_A.getText().equals(dapAn)) {
            demSoCauDung++;
            dem++;
            btnDapAn_A.setBackground(Color.YELLOW);
        }
        else {
            demSoCauSai++;
            dem = 0;
            btnDapAn_A.setBackground(Color.RED);
        }
        btnTiepTuc.setVisible(true);
        btnDapAn_B.setEnabled(false);
        btnDapAn_C.setEnabled(false);
        btnDapAn_D.setEnabled(false);
    }//GEN-LAST:event_btnDapAn_AActionPerformed

    private void btnDapAn_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDapAn_BActionPerformed
        demTongCau++;
        if (btnDapAn_B.getText().equals(dapAn)) {
            demSoCauDung++;
            dem++;
            btnDapAn_B.setBackground(Color.YELLOW);
        }
        else {
            demSoCauSai++;
            dem = 0;
            btnDapAn_B.setBackground(Color.RED);
        }
        btnTiepTuc.setVisible(true);
        btnDapAn_A.setEnabled(false);
        btnDapAn_C.setEnabled(false);
        btnDapAn_D.setEnabled(false);
    }//GEN-LAST:event_btnDapAn_BActionPerformed

    private void btnDapAn_CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDapAn_CActionPerformed
        demTongCau++;
        if (btnDapAn_C.getText().equals(dapAn)) {
            demSoCauDung++;
            dem++;
            btnDapAn_C.setBackground(Color.YELLOW);
        }
        else {
            demSoCauSai++;
            dem = 0;
            btnDapAn_C.setBackground(Color.RED);
        }
        btnTiepTuc.setVisible(true);
        btnDapAn_A.setEnabled(false);
        btnDapAn_B.setEnabled(false);
        btnDapAn_D.setEnabled(false);
    }//GEN-LAST:event_btnDapAn_CActionPerformed

    private void btnDapAn_DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDapAn_DActionPerformed
        demTongCau++;
        if (btnDapAn_D.getText().equals(dapAn)) {
            dem++;
            demSoCauDung++;
            btnDapAn_D.setBackground(Color.YELLOW);
        }
        else {
            demSoCauSai++;
            dem = 0;
            btnDapAn_D.setBackground(Color.RED);
        }
        btnTiepTuc.setVisible(true);
        btnDapAn_B.setEnabled(false);
        btnDapAn_C.setEnabled(false);
        btnDapAn_A.setEnabled(false);
    }//GEN-LAST:event_btnDapAn_DActionPerformed

    private String taoIDLichSu() {
        int soID = 0;
        String query = "SELECT COUNT(*) FROM LichSuNguoiChoi";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                soID = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienChoi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "LSNCNNC0" + String.valueOf(soID + 1);
    }
    private void themLichSuNguoiChoi() {
        String idLichSu = taoIDLichSu();
        String query = "INSERT INTO LichSuNguoiChoi(IDNguoiChoi,IDLichSu,SoCauLienTiep,TongSoCau,SoCauDung,SoCauSai,"
                + "NgayGioChoi,TienThang,SoGiay)VALUES "
                + "(?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, id);
            ps.setString(2, idLichSu);
            ps.setInt(3, dem);
            ps.setInt(4, demTongCau);
            ps.setInt(5, demSoCauDung);
            ps.setInt(6, demSoCauSai);
            Calendar calendar = Calendar.getInstance();
            java.util.Date currentTime = calendar.getTime();
            long time = currentTime.getTime();
            ps.setTimestamp(7, new Timestamp(time));
            ps.setInt(8, tien);
            ps.setInt(9, 60 - giay);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienChoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void layKetQua() {
        String query = "SELECT Tien , SoCauDung FROM KetQua WHERE IDNguoiChoi = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                layTien = rs.getInt(1);
                laySoCau = rs.getInt(2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienChoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void capNhatKetQua() {
        layKetQua();
        String query = "UPDATE KetQua SET Tien = ? , SoCauCaoNhat = ? , SoCauDung = ? WHERE IDNguoiChoi = ? ";
        try {
            PreparedStatement ps = connect.conn.prepareStatement(query);
            layTien += tien;
            laySoCau += dem;
            ps.setInt(1, layTien);
            ps.setInt(2, dem);
            ps.setInt(3, laySoCau);
            ps.setString(4, id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDienChoi.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    private void btnTiepTucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTiepTucActionPerformed
        btnTiepTuc.setVisible(false);
        btnDapAn_A.setEnabled(true);
        btnDapAn_B.setEnabled(true);
        btnDapAn_C.setEnabled(true);
        btnDapAn_D.setEnabled(true);
        btnDapAn_A.setBackground(Color.WHITE);
        btnDapAn_B.setBackground(Color.WHITE);
        btnDapAn_C.setBackground(Color.WHITE);
        btnDapAn_D.setBackground(Color.WHITE);
        xuLiKetQua(dem);
        hienThiCauHoi();
    }//GEN-LAST:event_btnTiepTucActionPerformed
    private void xuLiKetQua(int x) {
        tien += tienThuong[x];
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        txtTien.setText(formatter.format(Long.parseLong(String.valueOf(tien))) + "  VNĐ");
        if (x <= 0) {
            tien = 0;
            x = 0;
            for (int j = 0; j < 10; j++)
            {
                lb[j].setVisible(false);
                btn[j].setBackground(Color.WHITE);
            }
        }
        if (x == 10) {
            demGiayChoi.stop();
            capNhatKetQua();
            themLichSuNguoiChoi();
            this.setVisible(false);
            new Win2(this.id,this.ten).setVisible(true);
        }
        if (x >= 1 && x < 10) {
            lb[x].setVisible(true);
            lb[x - 1].setVisible(false);
            btn[x].setBackground(Color.YELLOW);
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GiaoDienChoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnDapAn_A;
    private javax.swing.JButton btnDapAn_B;
    private javax.swing.JButton btnDapAn_C;
    private javax.swing.JButton btnDapAn_D;
    private javax.swing.JButton btnDungLai;
    private javax.swing.JButton btnSanSang;
    private javax.swing.JButton btnTiepTuc;
    private javax.swing.JTable danhSachCauHoi;
    private javax.swing.JLabel demGiay;
    private javax.swing.JLabel idcauhoi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel pic1;
    private javax.swing.JLabel pic10;
    private javax.swing.JLabel pic2;
    private javax.swing.JLabel pic3;
    private javax.swing.JLabel pic4;
    private javax.swing.JLabel pic5;
    private javax.swing.JLabel pic6;
    private javax.swing.JLabel pic7;
    private javax.swing.JLabel pic8;
    private javax.swing.JLabel pic9;
    private javax.swing.JLabel txtCauHoi;
    private javax.swing.JLabel txtTien;
    // End of variables declaration//GEN-END:variables
}
