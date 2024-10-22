import java.util.Arrays;

public class Application {

    private final InputDevice inputDevice;
    private final OutputDevice outputDevice;

    public Application(InputDevice input, OutputDevice output /*String mode*/) {
        this.outputDevice = output;
        this.inputDevice = input;
    }

    public void run(){
        //this.outputDevice.writeMessage("Application started");
        //this.outputDevice.writeMessage("Today's lucky numbers are: " + inputDevice.nextInt() + " and " + inputDevice.nextInt());
        int pointsS = 0, pointsH = 0;
        int S, H;
        while(pointsS <= 5 && pointsH <= 5){
            S = inputDevice.nextInt();
            H = inputDevice.nextInt();
            this.outputDevice.writeMessage("S chose the number " + S + " and H chose " + H);
            if (H > S){
                pointsH++;
            }
            else if (H < S && H%S == 0 && S >= 10){
                pointsS++;
            }
            else if (S == H){
                pointsH++;
                pointsS++;
                pointsH++;
                pointsS++;
            }
        }
        if (pointsS > pointsH){
            this.outputDevice.writeMessage("S won the game!");
        }
        else if (pointsH > pointsS){
            this.outputDevice.writeMessage("H won the game!");
        }
        else {
            this.outputDevice.writeMessage("There is a tie between S and H!");
        }
    }

    public void sortNumbers(int[] arr) {
        Arrays.sort(arr);
    }

    public void randomArraySort (){
        int N = inputDevice.nextInt();
        this.outputDevice.writeMessage("The computer chose the length of the array to be sorted to be: " + N + ".");
        int[] randomArray = InputDevice.getNumbers(N);
        for (int i = 0; i < N; i++) {
            outputDevice.writeMessage("Element " + i + " of the old array is " + randomArray[i] + ".");
        }
        sortNumbers(randomArray);
        for (int i = 0; i < N; i++) {
            outputDevice.writeMessage("Element " + i + " of the sorted array is "+ randomArray[i] + ".");
        }

    }

    public void wordSizeHistogram(String sentence) {
        // Split sentence into words
        String[] myArray = sentence.split("\\s+");

        // Find the maximum word length
        int maxWordLength = 0;
        for (int i = 0; i < myArray.length; i++) {
            maxWordLength = Math.max(maxWordLength, myArray[i].length());
        }

        // Create a histogram array to store word length frequencies
        int[] histogram = new int[maxWordLength + 1]; // +1 to account for index 0

        // Populate the histogram with word lengths
        for (int i = 0; i < myArray.length; i++) {
            int wordLength = myArray[i].length();
            histogram[wordLength]++;
        }

        // Output the histogram
        for (int i = 0; i < histogram.length; i++) {
            outputDevice.writeMessage("Element " + i + " of the histogram is " + histogram[i] + ".");
        }
    }

    public void function1() {
        A a = new A("Sample text");
        C[] cArray = { new C(10), new C(20), new C(30) };
        B b = new B(a, cArray);


        outputDevice.writeMessage("Class B has a member A with text: " + b.getMemberA().getText());
        for (int i = 0; i < b.getArrayC().length; i++) {
            outputDevice.writeMessage("Array C element " + i + " has value: " + b.getArrayC()[i].getValue());
        }
    } //function that outputs the results of creating and printing an object B

    public void function2() {
        C[] cArray = {new C(15), new C(5), new C(25)};

        Arrays.sort(cArray, (c1, c2) -> Float.compare(c1.getValue(), c2.getValue()));

        for (int i = 0; i < cArray.length; i++) {
            outputDevice.writeMessage("Sorted array C element " + i + " has value: " + cArray[i].getValue());
        }
    } //function that creates and sorts an array of C objects
}
