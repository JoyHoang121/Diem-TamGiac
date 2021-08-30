package entities;

import java.util.Scanner;

public class Diem {
    private int x, y;

    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < -10 || x > 10)
            return;
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < -10 || y > 10)
            return;
        this.y = y;
    }

    public Diem() {
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Diem {");
        sb.append("x=").append(x);
        sb.append(",y=").append(y);
        sb.append('}');
        return sb.toString();
    }

    public static Diem parseFromString(String str) {
        String[] parts = str.split(",");
        Diem ret = new Diem();
        ret.x = Integer.parseInt(parts[0]);
        ret.y = Integer.parseInt(parts[1]);
        return ret;
    }

    public static Diem generate() {
        final int max = 10;
        final int min = -10;
        int x = (int) Math.floor(Math.random() * (max - min)) + min;
        int y = (int) Math.floor(Math.random() * (max - min)) + min;
        Diem diem = new Diem(x, y);
        return diem;
    }

    //c1: tính khoảng cách giữa 2 điểm
    public double distanceArea(Diem other) {
        double a = Math.sqrt(Math.pow((other.x - this.x), 2) + Math.pow((other.y - this.y), 2));
        return a;
    }

    //c2:  tính khoảng cách giữa 2 điểm
    public double distance(Diem another) {
        double dx = another.x - this.x;
        double dy = another.y - this.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    //tìm điểm đối xứng qua tâm -> nó sẽ ra 1 điểm mới
    public Diem findCentralSymmetry() {
        Diem ret = new Diem();
        ret.x = -this.x;
        ret.y = -this.y;
        return ret;
    }

    //tìm điểm đối xứng qua trục hoành -> nó sẽ ra 1 điểm mới
    public Diem findXAxisSymmetry() {
        Diem ret = new Diem();
        ret.x = this.x;
        ret.y = -this.y;
        return ret;
    }

    //tìm điểm đối xứng qua trục tung -> nó sẽ ra 1 điểm mới
    public Diem findYAxisSymmetry() {
        Diem ret = new Diem();
        ret.x = -this.x;
        ret.y = this.y;
        return ret;
    }

}
