package Char;

public class charTester {
    public static void main(String[] args) {
        int[] data = new int[256];
        char c = 'a';
        char d = 'd';
        String s = "a";
        String t = "ABCDEFG";
        String u = c + ""; //adding "" converts char to String

        char e = t.charAt(0); //converts 1 index from String t to char

        System.out.println( c );
        System.out.println( d );
        System.out.println(s);
        System.out.println((int)c); //prints ASCII
        System.out.println(c + 5); //prints ASCII + 5
        System.out.println( data['a']); //prints 0 at index a
        System.out.println( data[c]); //same as above
        System.out.println(s.equals(c)); //prints false because one is char & one is String

        for(int i = 0; i<t.length(); i++){
            System.out.println(t.charAt(i));
        }

        System.out.println(c < d); //prints true b/c 97 < 100
        System.out.println( s + t ); //combines Strings
        System.out.println( c + d ); //prints the sum
        System.out.println( s + c ); //combines String and char (not #)
        System.out.println(c + d + "abc" + c + d); //197abcad

        String fontText = "The quick, brown fox jumps over the lazy dog.";

        char[] foxArray = new char[256];
        for(int i = 0; i < fontText.length(); i++){
            foxArray[fontText.charAt(i)] += fontText.charAt(i);
        }
        for(int i = 0; i < foxArray.length; i++){
            if(foxArray[i] != 0){
                System.out.println((char)i + ": " + (foxArray[i]/i));
            }
        }
    }
}
