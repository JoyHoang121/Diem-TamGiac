package entities;

import java.util.Scanner;

public class TamGiac {

    private int a;
    private int b;
    private int c;
    private int h;


    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập cạnh a: ");
        this.a = sc.nextInt();
        System.out.print("Mời nhập cạnh b: ");
        this.b = sc.nextInt();
        System.out.print("Mời nhập cạnh c: ");
        this.c = sc.nextInt();
        System.out.print("Mời nhập chiều cao h: ");
        this.h = sc.nextInt();
    }

    public void print() {
        System.out.println("Các cạnh tam giác");
        System.out.format("%5d%5d%5d \n", this.a, this.b, this.c);
    }

    public int chuViTamGiac() {
        int p = this.a + this.b + this.c;
        return p;
    }

    public int dienTichTamGiac() {
        int s = (this.h * this.a) / 2;
        return s;
    }
}
