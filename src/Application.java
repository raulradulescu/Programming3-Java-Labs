public class Application {

    private final InputDevice inputDevice;
    private final OutputDevice outputDevice;

    public Application(InputDevice input, OutputDevice output) {
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


}
