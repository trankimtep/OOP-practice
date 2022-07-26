package timoday.bai2.service;

import java.util.ArrayList;

import timoday.bai2.entity.CanBo;

public class Qlcb {
    public static ArrayList<CanBo> canBos = new ArrayList<CanBo>();

    static{
        canBos.add(new CanBo("Nguyen Van A", "1/1/2001", "Nam", "Ha Noi"));
        canBos.add(new CanBo("Nguyen Thi B", "2/2/2001", "Nu", "Ha Noi"));
        canBos.add(new CanBo("Nguyen Van C", "3/3/2001", "Nam", "Ha Noi"));
        canBos.add(new CanBo("Nguyen Thi D", "4/4/2001", "Nu", "Ha Noi"));
        canBos.add(new CanBo("Nguyen Van E", "5/5/2001", "Nu", "Ha Noi"));
    }

    public void addCanBo(CanBo canBo) {
        canBos.add(canBo);
    }

    public void findCanBo(String hoTen) {
        for(CanBo canBo : canBos){
            if (canBo.getHoTen() == hoTen){
                System.out.println(canBo);
                return;                
            }
        }
    }
}
