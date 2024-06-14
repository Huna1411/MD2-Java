package Homework;

import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double  exchangeRate = 25000;
        System.out.println("Nhập số tiền để đổi");
        double USD = sc.nextDouble();
        double VND = USD * exchangeRate;
        System.out.println(USD + " USD = " + VND + "VND");
    }
}
