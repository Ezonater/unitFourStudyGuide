package Interfaces;

public class SamsungMotorcycle implements Motorcycle{
    private int speed;

    public int brake(int y){
       return this.speed -= y;
    }

    public int accelerate(int y){
        return this.speed += y;
    }

    public String startMotor(){
        return "vroom vroom";
    }
}
