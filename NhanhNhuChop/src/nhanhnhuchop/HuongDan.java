package nhanhnhuchop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;

public class HuongDan extends javax.swing.JFrame {
    Timer timer;
    private int count = 0;
    private String ten;
    private String id;
    public HuongDan() {
        initComponents();
        this.setSize(1330, 820);
    }
    public HuongDan(String id , String ten) {
        initComponents();
        this.id = id;
        this.ten = ten;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHuongDan = new javax.swing.JTextPane();
        textDemo = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/right.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(990, 50, 340, 731);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/left.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 290, 731);

        txtHuongDan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txtHuongDan.setToolTipText("");
        txtHuongDan.setMaximumSize(new java.awt.Dimension(600, 600));
        txtHuongDan.setMinimumSize(new java.awt.Dimension(600, 600));
        jScrollPane2.setViewportView(txtHuongDan);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(290, 40, 730, 610);

        textDemo.setBackground(java.awt.Color.white);
        textDemo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        textDemo.setText("Xin chào các bạn đã đến với trò chơi Nhanh Như Chớp. Đến với trò chơi các bạn có thể có nhiều trãi nghiệm thú vị hãy đến với Nhanh Như Chớp để chơi giải trí và nhận những tiền ảo để xả stress . Nhanh Như Chớp gồm có các luật lệ và cách thức chơi như sau :\n- Thứ 1 :  Tiền trên chỉ là tiền ảo và không có thể quy đổi ra tiền mặt .\n- Thứ 2 : Không khuyến khích các trường hợp cheat hack để chơi .\n- Thứ 3 : Thông tin người dùng nhập vào sẽ không được tiết lộ ra ngoài nên người dùng yên tâm .\n-Thứ 4 :  Game này tạo ra với mục đích để xả stress tuy nhiên có nhưng câu hỏi khiến bạn khó chịu hoặc tiêu cực thì bình tỉnh nhé .\n+ Về phần cách thức chơi : \n -- Cứ mỗi câu bạn trả lời đúng thì số tiền sẽ tăng theo từng bậc .\n -- Nếu bạn trả lời sai ở bất kì câu nào thì bạn sẽ trở về với câu đầu tiên và bắt đầu chinh phục lại cho đến khi hết giờ .\n -- Nếu bạn đúng câu thứ 10 thì xin chúc mừng bạn chính là người mà chúng tôi đang truy tìm . Bạn chính là Thánh Tia Chớp tại game chúng tôi . Xin chúc mừng.");
        getContentPane().add(textDemo);
        textDemo.setBounds(310, 30, 130, 90);

        btnThoat.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnThoat.setText("Về Trang Chủ");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat);
        btnThoat.setBounds(560, 660, 180, 70);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.PNG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 1330, 820);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void dem() {
        timer = new Timer(80, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                String s = textDemo.getText();
                String[] s1 = s.split(" ");
                String s2 = "";
                if (count > s1.length) {
                    timer.stop();
                } else {
                    textDemo.setVisible(false);
                    txtHuongDan.setEditable(false);
                    s2 += s1[count - 1] + " ";
                    String s3 = txtHuongDan.getText();
                    s3 += s2;
                    
                    txtHuongDan.setText(s3);
                }
            }
        });
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        dem();
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.setVisible(false);
        new TrangChu(this.id,this.ten).setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HuongDan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel textDemo;
    private javax.swing.JTextPane txtHuongDan;
    // End of variables declaration//GEN-END:variables
}
