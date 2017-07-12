import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer between 1 and 100: ");
        double num = scan.nextDouble();

        // If the integer entered is odd and less than 60
        if (num % 2 + 1 !=0 && num < 60) {
            System.out.println(num + " and Odd.");
        }

        if (num % 2 == 0 && num < 2 && num > 25) {
            System.out.println("Even and less than 25.");
        }

        if (num % 2 == 0 && num < 25 && num < 60) {
            System.out.println("Even.");
        }

        if (num % 2 == 0 && num > 60) {
            System.out.println(num + "Even.");
        }

        if (num % 2 + 1 == 0 && num > 60) {
            System.out.println("Odd and over 60");
        }


    }

    }


