package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double total = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + total);
    }
}
