package relationshipsAdvIheritanceComposition;

public class Main {
    public static void main(String[] args) {

        Maruti myMaruti = new Maruti();
        myMaruti.setColor("GREY ");
        myMaruti.setMaxSpeed(280);
        myMaruti.carInfo();
        myMaruti.MarutiStartDemo();

        Engine engine = new Engine();
        engine.start();
        engine.stop();
    }
}
