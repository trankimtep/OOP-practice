package timoday.bai2.entity;

public class CanBo {
    public String hoTen;
    public String ngaySinh;
    public String gioiTinh;
    public String diaChi;

    public CanBo() {}

    public CanBo(String hoTen, String ngaySinh, String gioiTinh, String diaChi) {
        this. hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString(){
        return ("\nHo ten = " + hoTen + "\n"+
                "Ngay sinh = " + ngaySinh + "\n" +
                "Gioi tinh = " + gioiTinh + "\n" +
                "Dia chi = " + diaChi + "\n" + 
                "--------------------------\n");
    }
}
