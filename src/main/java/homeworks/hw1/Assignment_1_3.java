package homeworks.hw1;

import java.util.Scanner;

public class Assignment_1_3 {
    public static void calculateVectorLength (double x, double y, double z) {
        double vectorLength = Math.sqrt(x*x+y*y+z*z);
        System.out.println(vectorLength);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.print("Введите координату X:");
        double x = sc.nextDouble();
        System.out.print("Введите координату Y:");
        double y = sc.nextDouble();
        System.out.print("Введите координату Z:");
        double z = sc.nextDouble();
        System.out.print("Длина вектора (X, Y, Z) составляет: " );
        calculateVectorLength(x,y,z);
    }
}
