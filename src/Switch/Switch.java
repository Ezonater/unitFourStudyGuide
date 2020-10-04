package Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number!");
        int number = sc.nextInt();

        switch(number) {
            case 8:
            case 10:
                // prints if number is either 8 or 10
                System.out.println("Help me");
                break;
            case 49:
                System.out.println("How did I get here");
                // no break so it also prints default
            default:
                System.out.println("This is normal");
                // when all else fails
        }
    }
}
