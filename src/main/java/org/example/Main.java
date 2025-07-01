package org.example;
import java.util.Scanner;

import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float temperatureCelsius = scanner.nextFloat();
        float temperatureFahrenheit = (float) (temperatureCelsius * ((float) 9 / 5) + 32);
        System.out.printf("Temperature in Fahrenheit: %.2f", temperatureFahrenheit);

        scanner.close();
    }
}