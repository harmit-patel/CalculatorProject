import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mul);
        if (num2 != 0) {
            System.out.println("Division: " + div);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
        sc.close();
    }
}
