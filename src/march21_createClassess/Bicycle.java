package march21_createClassess;

public class Bicycle {
    protected int gear;
    protected int speed;
    public Bicycle (int gear, int speed){
        this.gear=gear;
        this.speed=speed;
    }
    public void speedUp(){
        this.speed++;
    }
    public void slowDown(){
        this.speed--;
    }
}
