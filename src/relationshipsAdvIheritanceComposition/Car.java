package relationshipsAdvIheritanceComposition;

public class Car {
// Methods implementation and class members

    private String color;
    private int maxSpeed;

    public void carInfo() {
        System.out.println("Car color: " + color + "Max Speed: " + maxSpeed);

    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

}
