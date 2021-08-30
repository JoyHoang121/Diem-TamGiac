import entities.Diem;
import entities.TamGiac;

import java.sql.SQLOutput;

public class Run {
    public static void main(String[] args) {
//        TamGiac tg = new TamGiac();
//        System.out.println(tg);
//
//        System.out.println("Chu vi tam giac: " + tg.chuViTamGiac());
//
//        System.out.println("Diện tích tam giác: "+ tg.dienTichTamGiac());

        Diem d1 = new Diem();
        System.out.println(d1);

        Diem d2 = new Diem();
        d2.setX(3);
        d2.setY(6);
        System.out.println(d2);


        Diem d3 = new Diem(-2, 4);
        System.out.println(d3);
        System.out.println(d3.findCentralSymmetry());
       // double a = d1.distanceArea(d2);
       // System.out.println(a);


    }
}
