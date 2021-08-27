import entities.DonThuc;
import entities.TamGiac;

public class Run {
    public static void main(String[] args) {
        TamGiac tg=new TamGiac();
        tg.input();
        tg.print();

        int cv = tg.chuViTamGiac();
        System.out.println("Chu vi tam giac: " + cv);

        int s = tg.dienTichTamGiac();
        System.out.println("Diện tích tam giác: "+ s);

        DonThuc dt = new DonThuc();
        dt.input();
        dt.print();
    }
}
