package CopyEquals;

public class Dog {
    private String name;
    private int age;
    private double weight;

    public Dog(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Dog(Dog other){
        this(other.name, other.age, other.weight);
    }

    public boolean equals(Dog other){
        return(this.name.equals(other.name) && this.age == other.age && this.weight == other.weight);
    }

}
