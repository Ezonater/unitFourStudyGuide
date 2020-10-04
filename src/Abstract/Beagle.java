package Abstract;

public class Beagle extends Dog{

    public Beagle(String name, int age, double weight){
        super(name, age, weight);
    }

    @Override public void speak(){
        System.out.println("Howl!");
    }

    public void jump(){
        System.out.println(this.getName() + " jumped!");
    }

    /*@Override public void walk(){

    }*/ //can't override because it's a final method
}
