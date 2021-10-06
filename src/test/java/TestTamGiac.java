import entities.Diem;
import entities.TamGiac;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Class Tam Giac")
 class TestTamGiac {

    TamGiac tg = new TamGiac();

    @Test
    @DisplayName("Nên là tam giác vuông cân")
     void tamGiacVuong() {
        Diem d1 = new Diem(0, 0);
        Diem d2 = new Diem(0, 3);
        Diem d3 = new Diem(4, 0);
        tg = new TamGiac(d1, d2, d3);

        double expectedResult = 12;
        double actualResult = tg.chuViTamGiac();
        assertEquals(expectedResult, actualResult);

    }

    @Test
    @DisplayName("Tính chu vu tam giac vuông cân")
     void chuViTamGiacVuongCan() {
        Diem d1 = new Diem(0, 0);
        Diem d2 = new Diem(0, 1);
        Diem d3 = new Diem(1, 0);
        tg = new TamGiac(d1, d2, d3);

        double expectedResult = 3.4;
        double actualResult = Math.round(tg.chuViTamGiac() * 10) / 10.0;
        assertEquals(expectedResult, actualResult);

    }
}
