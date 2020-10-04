package CopyEquals;

public class Tester {
    public static void main(String[] args) {
        Dog d = new Dog("Luna",9,38.5);
        Dog e = d;
        Dog f = new Dog(d);
        Dog g = new Dog("Luna",9,38.5);

        System.out.println(d.equals(e));
        System.out.println(d.equals(f));
    }
}
