package PRODIGY_SD_TASKS;

import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("     TEMPERATURE CONVERTER");
        System.out.println("=================================");

        System.out.print("Enter temperature: ");
        double temperature = sc.nextDouble();

        System.out.println("\nSelect the original unit:");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");

        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        double celsius;
        double fahrenheit;
        double kelvin;

        switch (choice) {

            case 1:
                celsius = temperature;
                fahrenheit = (celsius * 9 / 5) + 32;
                kelvin = celsius + 273.15;
                break;

            case 2:
                fahrenheit = temperature;
                celsius = (fahrenheit - 32) * 5 / 9;
                kelvin = celsius + 273.15;
                break;

            case 3:
                kelvin = temperature;
                celsius = kelvin - 273.15;
                fahrenheit = (celsius * 9 / 5) + 32;
                break;

            default:
                System.out.println("\nInvalid choice! Please select 1, 2, or 3.");
                sc.close();
                return;
        }

        System.out.println("\n=================================");
        System.out.println("             RESULT");
        System.out.println("=================================");

        System.out.printf("Celsius    : %.2f °C%n", celsius);
        System.out.printf("Fahrenheit : %.2f °F%n", fahrenheit);
        System.out.printf("Kelvin     : %.2f K%n", kelvin);

        System.out.println("=================================");

        sc.close();
    }
}
