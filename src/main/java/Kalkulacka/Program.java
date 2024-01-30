package Kalkulacka;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in, "Windows-1250");

        System.out.println("Enter 1st number: ");
        calculator.a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter 2nd number: ");
        calculator.b = Double.parseDouble(scanner.nextLine());
        System.out.println("Sum: " + calculator.add());
        System.out.println("Substract: " + calculator.subtract());
        System.out.println("Multiply: " + calculator.multiply());
        System.out.println("Divide: " + calculator.divide());
    }
}
