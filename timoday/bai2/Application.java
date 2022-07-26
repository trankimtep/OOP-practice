package timoday.bai2;

import timoday.bai2.entity.KySu;
import timoday.bai2.service.Qlcb;

public class Application {
    public static void main(String[] args) {
        Qlcb qlcb = new Qlcb();

        KySu kySu = new KySu();
        qlcb.addCanBo(kySu);

        System.out.println(qlcb.canBos);        

        qlcb.findCanBo("Nguyen Van A");
    }
}   
