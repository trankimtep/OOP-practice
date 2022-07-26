package timoday.bai2.entity;

public class KySu extends CanBo{
    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    private String nganhDaoTao;

    public KySu() {}

    public KySu(String hoTen, String ngaySinh, String gioiTinh, String diaChi, String nganhDaoTao) {
        this. hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.nganhDaoTao = nganhDaoTao;
    }



    @Override
    public String toString(){
        return ("Ho ten = " + hoTen + "\n"+
                "Ngay sinh = " + ngaySinh + "\n" +
                "Gioi tinh = " + gioiTinh + "\n" +
                "Dia chi = " + diaChi + "\n" + 
                "Nganh dao tao = " + nganhDaoTao + "\n" +
                "--------------------------\n");
    }
}
