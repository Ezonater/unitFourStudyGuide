package Enum;
//cannot make enums PUBLIC outside of a class
public class EnumDemo {
    enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES };

    public static void main(String[] args) {
        Suit s = Suit.HEARTS;
        Suit t;
        t = Suit.CLUBS;

        //TEST CASES
        System.out.println(s); // prints HEARTS
        System.out.println(t); // prints CLUBS
        System.out.println(s == t); // prints false
        System.out.println(s == Suit.CLUBS); // prints false
        System.out.println(s.ordinal()); // prints 2
        s = t; // DOES NOT WORK LIKE STRINGS, SHALLOW COPY.
        System.out.println(s == t); // prints true
        System.out.println(s == Suit.CLUBS); // prints true
        System.out.println(s.ordinal()); // prints 0
        System.out.println(Suit.values()[1]);

        // at this point s = CLUBS

        switch (s){
            case CLUBS:
                System.out.println("The lowest suit");
                break;
            case DIAMONDS:
                System.out.println("The second lowest suit");
                break;
            case HEARTS:
                System.out.println("The second highest suit");
                break;
            case SPADES:
                System.out.println("The highest suit");
                break;
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
