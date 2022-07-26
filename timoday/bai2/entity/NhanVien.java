package timoday.bai2.entity;

public class NhanVien extends CanBo{
    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    private String congViec;
    
    public NhanVien() {}

    public NhanVien(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String congViec) {
        this. hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.congViec = congViec;
    }

    @Override
    public String toString(){
        return ("Ho ten = " + hoTen + "\n"+
                "Ngay sinh = " + ngaySinh + "\n" +
                "Gioi tinh = " + gioiTinh + "\n" +
                "Dia chi = " + diaChi + "\n" + 
                "Cong viec = " + congViec + "\n" +
                "--------------------------\n");
    }

}
