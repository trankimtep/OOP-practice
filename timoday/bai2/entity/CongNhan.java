package timoday.bai2.entity;

public class CongNhan extends CanBo{
    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    private int bac;

    public CongNhan(String hoTen, String ngaySinh, String gioiTinh, String diaChi, int bac) {
        this. hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.bac = bac;
    }


    @Override
    public String toString(){
        return ("Ho ten = " + hoTen + "\n"+
                "Ngay sinh = " + ngaySinh + "\n" +
                "Gioi tinh = " + gioiTinh + "\n" +
                "Dia chi = " + diaChi + "\n" + 
                "Bac luong = " + bac + "\n" + 
                "--------------------------\n");
    }
}
