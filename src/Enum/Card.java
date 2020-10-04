package Enum;

public class Card {
    private int rank;
    //private String suit; not good because it suits are limited.
    private int suit; //better, but awkward because you are relating numbers to Strings.
    private static final String [] RANKS = { "Nil", "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    private static final String [] SUITS = { "CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
    @Override public String toString(){
        return this.RANKS[this.rank] + " of " + SUITS[this.suit];
    }

    public Card(int rank, int suit){
        this.rank = rank;
        this.suit = suit;
    }

    public static void main(String[] args) {
        Card c = new Card(5,3);
        System.out.println(c);
    }

    //ENUM SHOULD BE USED FOR A SPECIFIC SET OF ITEMS THAT IS NOT TOO BIG
}
