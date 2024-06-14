package Homework;

import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị các cạnh hình vuông");
        int x = sc.nextInt();
        System.out.println("Chu vi hình vuông :" +x*4+"cm");
        System.out.println("Diện tích hình vuông :" +x*x+"cm");
    }
}
