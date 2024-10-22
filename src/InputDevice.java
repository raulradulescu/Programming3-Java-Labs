import java.util.Random;

public class InputDevice {

    static Random rand = new Random();     //using the Random class

    static String getType() {
        return "random";
    }

    int nextInt() {
        return rand.nextInt(100);
    }

    public static int[] getNumbers(int N){
        int[] array = new int [N];
        for (int i = 0; i < N; i++) {
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    public static String getLine(){
        return ("The quick brown fox jumps over the lazy dog.");
    }
}
