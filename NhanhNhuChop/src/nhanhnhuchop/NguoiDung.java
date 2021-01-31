package nhanhnhuchop;

import java.sql.Date;

public class NguoiDung {
    private String ho;
    private String ten;
    private String gioiTinh;
    private String ngaySinh;
    private String diaChi;
    private String email;
    private String soDienThoai;

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
    public static void main(String args[]) {
        String s = "Xin chào các bạn đã đến với trò chơi Nhanh Như Chớp. Đến với trò chơi các bạn có thể có nhiều trãi nghiệm thú vị hãy đến với Nhanh Như Chớp để chơi giải trí và nhận những tiền ảo để xả stress . Nhanh Như Chớp gồm có các luật lệ và cách thức chơi như sau :  \\n  - Thứ 1 :  Tiền trên chỉ là tiền ảo và không có thể quy đổi ra tiền mặt .  \\n - Thứ 2 : Không khuyến khích các trường hợp cheat hack để chơi . \\n  - Thứ 3 : Thông tin người dùng nhập vào sẽ không được tiết lộ ra ngoài nên người dùng yên tâm . \\n  -Thứ 4 :  Game này tạo ra với mục đích để xả stress tuy nhiên có nhưng câu hỏi khiến bạn khó chịu hoặc tiêu cực thì bình tỉnh nhé . \\n  + Về phần cách thức chơi : \\n  -- Cứ mỗi câu bạn trả lời đúng thì số tiền sẽ tăng theo từng bậc . \\n -- Nếu bạn trả lời sai ở bất kì câu nào thì bạn sẽ trở về với câu đầu tiên và bắt đầu chinh phục lại cho đến khi hết giờ . \\n  -- Nếu bạn đúng câu thứ 10 thì xin chúc mừng bạn chính là người mà chúng tôi đang truy tìm . Bạn chính là Thánh Tia Chớp tại game chúng tôi . Xin chúc mừng.";
        System.out.println(s);
    }

    void setNgaySinh(java.util.Date currentTime) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
