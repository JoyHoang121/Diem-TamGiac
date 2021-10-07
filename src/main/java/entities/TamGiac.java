package entities;

import java.util.Scanner;

public class TamGiac {
    private Diem d1, d2, d3;

    public TamGiac(Diem d1, Diem d2, Diem d3) {
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    public TamGiac() {
        this.d1 = Diem.generate();
        this.d2 = Diem.generate();
        this.d3 = Diem.generate();
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TamGiac{\n");
        sb
                .append(" d1 = ").append("{").append(d1.getX()).append(",").append(d1.getY()).append("}").append("\n")
                .append(" d2 = ").append("{").append(d2.getX()).append(",").append(d1.getY()).append("}").append("\n")
                .append(" d3 = ").append("{").append(d3.getX()).append(",").append(d1.getY()).append("}").append("\n")
                .append('}');
        return sb.toString();
    }

    public double chuViTamGiac() {
        double a = this.d1.distanceArea(d2);
        double b = this.d1.distanceArea(d3);
        double c = this.d2.distanceArea(d3);
        return a + b + c;
    }

    public double dienTichTamGiac() {
        double a = this.d1.distance(d2);
        double b = this.d1.distance(d3);
        double c = this.d2.distance(d3);
        double p = a + b + c;
        return Math.sqrt(p *(p-a)*(p-b)*(p-c));
    }



}
