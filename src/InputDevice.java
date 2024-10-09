import java.util.Random;

public class InputDevice {
    Random rand = new Random();     //using the Random class

    static String getType() {
        return "random";
    }
    int nextInt() {
        return rand.nextInt(100);
    }
}
