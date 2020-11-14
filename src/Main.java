import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput1 = new Scanner(System.in);
        System.out.print("insert a number");
        int number1 = userInput1.nextInt();

        Scanner userInput2 = new Scanner(System.in);
        System.out.print("insert a sign (+, -, *, /)");
        String op = userInput2.next();

        Scanner userInput3 = new Scanner(System.in);
        System.out.print("insert another number");
        int number2 = userInput3.nextInt();

        System.out.println(solution(number1, op, number2));
    }

    public static int solution(int num1, String op, int num2) {
        if (op.equals("+"))
            return num1 + num2;
        if (op.equals("-"))
            return num1 - num2;
        if (op.equals("*"))
            return num1 * num2;
        if (op.equals("/"))
            return num1 / num2;
        return 0;
    }
}