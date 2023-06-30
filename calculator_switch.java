import java.util.Scanner;

public class calculator_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_1, number_2;
        char operator;
        System.out.print("Enter the first number: ");
        number_1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        number_2 = scanner.nextInt();
        System.out.print("Enter the operation to perform: ");
        operator = scanner.next().charAt(0);
        switch (operator){
            case '+':
                System.out.print("Sum of the numbers = " + (number_1 + number_2));
                break;
            case '-':
                System.out.print("Difference of the numbers = " + (number_1 - number_2));
                break;
            case '*':
                System.out.print("Multiplication of the numbers = " + (number_1 * number_2));
                break;
            case '/':
                System.out.print("quotient of the numbers = " + (number_1 / number_2));
                break;
            default:
                System.out.print("This operator is not included yet");

        }

    }
}
