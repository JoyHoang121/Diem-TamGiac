package entities;

import java.util.Scanner;

public class DonThuc {
    private int heSo;
    private String bienso;
    private int bacDonThuc;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập hệ số: \n");
        this.heSo = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Mời nhập biến số: \n");
        this.bienso = sc1.nextLine();

    }

    public void print(){
        System.out.format("%d%s%d \n", this.heSo, this.bienso, this.bacDonThuc);
    }



}
