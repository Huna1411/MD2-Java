package Homework;

import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị ");
        float radius = sc.nextFloat();
        System.out.println("Bán Kính là:" + radius);
        System.out.printf("Chu vi hình tròn là %.2f\n" , radius * 2 * Math.PI);
        System.out.printf("Diện tích hình tròn là %.2f", radius * radius * Math.PI);
    }
}
