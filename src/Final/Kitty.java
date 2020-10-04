package Final;

public class Kitty extends Cat{
    public Kitty(String name, int beans){
        super(name, beans);
    }

    /* @Override public void stretch(){
        System.out.printf("%s dids a big stretch", this.getName());
    }*/ // CANNOT be overridden because the super method is final!
}
