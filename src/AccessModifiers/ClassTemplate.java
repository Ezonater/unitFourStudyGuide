package AccessModifiers;

public class ClassTemplate { // only public or default
    //Access modifiers determines what classes can access a method, variable, or class

    int day = 1; // Visible to package. DEFAULT
    public int week = 7; // Visible to everyone! PUBLIC
    protected int month = 31; // Visible to the package and all subclasses. PROTECTED
    private int year = 365; // Visible to the class only. PRIVATE

    public int printWeek(){
        return week + day + month + year;
    }

    private class InnerClass{
        public void doInnerStuff(){
            System.out.println("Wow I'm inside another class...");
        }
    }

    public void displayInnerClass(){
        InnerClass i = new InnerClass();
        i.doInnerStuff();
    }
}
