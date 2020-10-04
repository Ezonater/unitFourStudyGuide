package Abstract;

public class Tester {
    public static void main(String[] args) {
        /*Dog d = new Dog("Luna",9,30.4); //Cannot create dogs because they're abstract
        d.speak();*/

        Beagle b = new Beagle("Snoopy", 4, 204.5);
        b.speak(); //prints Howl!
        b.walk();

        Dog c = new Beagle("Droopy", 6, 293.49);
        c.speak(); //also prints Howl! [it is a dog method, but it has been overridden.
        c.walk();

        //!!!!
        //c.jump(); //not a dog method, therefore, does not work!
        //!!!!
    }
}
