package FormattedPrint;

public class Tester {
    public static void main(String[] args) {
        String name = "Joe";
        int age = 21;
        double bank = 3284.23;

        System.out.printf("Hello %s! You are %d years old! You have %.2f in your bank account", name, age, bank);

        System.out.println("\n");

        System.out.printf("Hello %s!", name); //%s = Strings

        System.out.println("\n");

        System.out.printf("You are %d years old", age); //%d = ints

        System.out.println("\n");

        System.out.printf("You have %.2f in your bank account", bank); // %f = floating/decimal, .2 = how many decimal places

        System.out.println("\n");
    }
}
