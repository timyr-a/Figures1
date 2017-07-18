package com.company;

import com.company.model.Triangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Ввведите стороны треугольника: ");
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle(
                scanner.nextDouble(),
                scanner.nextDouble(), scanner.nextDouble()
        );
        System.out.printf("Периметр треугольника: %.2f\n", triangle.getPerimeter());
        System.out.printf("Площадь треугольника: %.2f", triangle.getSquare());
    }
}
