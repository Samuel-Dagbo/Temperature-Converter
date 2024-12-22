import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    System.out.println("Hello Welcome User");
    System.out.println("This is a temperature converter");
    System.out.println("Please choose an option:");
    System.out.println("1. Convert Celcius to Fahrenheit");
    System.out.println("2. Convert Fahrenheits to Celcius");

    int choice = 0;

    if (scan.hasNextInt()) {
        choice = scan.nextInt();
        if (choice == 1 || choice == 2) {
        System.out.println("Your input has been noted");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2");
            scan.next() ;
        }
    }

    double temperature = 0.0;
    System.out.println("Enter the temperature value:");
    if (scan.hasNextDouble()) {
        temperature = scan.nextDouble();
        System.out.println("Your input has been noted");
    }else{
        System.out.println("Invalid temperature value. Please enter 1 or 2");
        scan.next() ;
    }

    double celcius = (temperature - 32) * 5/9;
    double fahrenheit = (temperature * 9/5) + 32;

    if (choice == 1) {
        System.out.println("The temperature in celsius is equivalent to: " + fahrenheit + "F");
    } else {
        System.out.println("The temperature in fahrenheit is equivalent to: " + celcius + "Cs");
    }
    }
}