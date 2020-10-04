package Enum;

public class Yankees {
    private enum YANKEE{

        MANTLE(7), RUTH(3), DIMAGGIO(5);

        private int jerseyNumber;

        private YANKEE(int jerseyNumber){
            this.jerseyNumber = jerseyNumber;
        }

        public int getJerseyNumber(){
            return this.jerseyNumber;
        }


        @Override public String toString(){
            return this.name() + ", Jersey Number: " + this.jerseyNumber;
        }

    }
    public static void main(String[] args) {
        System.out.println(YANKEE.MANTLE); //prints MANTLE
        System.out.println(YANKEE.MANTLE.ordinal()); //prints MANTLE's index [0]
        System.out.println(YANKEE.DIMAGGIO.ordinal()); //prints DIMAGGIO's index [2]
        System.out.println(YANKEE.values()[1]); //creates an array and returns the value at index 1
        System.out.println("\n");
        for (int i = 0; i < YANKEE.values().length; i++) { //parses through enum
            System.out.println(YANKEE.values()[i]);
        }
        System.out.println("\n");
        for(YANKEE name : YANKEE.values()){ //parses through enum
            System.out.println(name);
        }
    }
}
