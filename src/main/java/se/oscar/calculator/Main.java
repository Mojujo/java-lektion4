package se.oscar.calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);

        System.out.println("Välkommen till kalkylatorn");
        System.out.println("**************************");
        System.out.println("Första tal: ");
        int temp1 = scan.nextInt();
        System.out.println("Andra tal: ");
        int temp2 = scan.nextInt();
        System.out.println("Vilken matematisk operator vill du använda?");
        System.out.println("1: Addition, 2:Subtraction, 3:Multiplication, 4:Division, 5: Avsluta");

        boolean isWrongAnswer;
        do {
            isWrongAnswer = false;
            switch(scan.nextInt()) {
                case 1:
                    System.out.println(calc.CalculatorAdd(temp1,temp2));
                    break;
                case 2:
                    System.out.println(calc.CalculatorSubtract(temp1,temp2));
                    break;
                case 3:
                    System.out.println(calc.CalculatorMultiply(temp1,temp2));
                    break;
                case 4:
                    System.out.println(calc.CalculatorDivide(temp1,temp2));
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Går ej att komputera, välj mellan 1-5");
                    isWrongAnswer = true;
            }
        } while (isWrongAnswer);
    }
}