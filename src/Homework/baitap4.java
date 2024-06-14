package Homework;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Math: ");
        float math = sc.nextFloat();
        System.out.println("English: ");
        float english = sc.nextFloat();
        System.out.println("Chemistry");
        float chemistry = sc.nextFloat();
        float average = (math + english + chemistry)/3;
        System.out.printf("Trung bình cộng là %.2f" , average);
    }
}
