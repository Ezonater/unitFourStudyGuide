package Final;

/*final*/ public class Cat { //cannot be final because Kitty extends from it
    String name;
    int beans;

    public Cat(String name, int beans){
        this.name = name;
        this.beans = beans;
    }

    public Cat(String name){
        this(name, 2);
    }

    public Cat(){
        this("Unknown", 3013);
    }

    final public void stretch(){
        System.out.printf("%s dids a stretch.", name);
    }

    public String getName() {
        return name;
    }
}
