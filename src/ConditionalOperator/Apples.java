package ConditionalOperator;

public class Apples {
    public static void main(String[] args) {
        int age = 21;

        System.out.println(age > 50 ? "You are old." : "You are young");

        age = 50;

        System.out.println(age > 50 ? "You are old." : "You are young");

        age = 51;

        System.out.println(age > 50 ? "You are old." : "You are young");
    }
}
