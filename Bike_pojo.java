package Casting;

public class Bike_pojo {
    private String color;
    private String maxSpeed;
    public void bikeInfo(){
        System.out.println("Bike color= "+color+","+"Max Speed ="+maxSpeed);
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(String maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
