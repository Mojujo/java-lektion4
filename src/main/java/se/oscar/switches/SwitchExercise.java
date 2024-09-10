package se.oscar.switches;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vilket klockslag är det?");
        switch (scan.nextInt()) {
            case 1:
                System.out.println("Klockan är 13:00");
                break;
            case 2:
                System.out.println("Klockan är 14:00");
                break;
            case 3:
                System.out.println("Klockan är 15:00");
                break;
            case 4:
                System.out.println("Klockan är 16:00");
                break;
            case 5:
                System.out.println("Klockan ör 17:00");
                break;
            case 6:
                System.out.println("Klockan är 18:00");
                break;
            default:
                System.out.println("Kan ej komputera");
                break;
        }
    }
}
