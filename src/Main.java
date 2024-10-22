import java.util.Arrays;

public class Main {

    public static void main (String[] args){
        InputDevice inputDevice = new InputDevice();
        OutputDevice outputDevice = new OutputDevice();
        Application application = new Application(inputDevice, outputDevice);


        for (int i = 0; i<args.length; i++){
            if (args[0].equals("words")){
                application.wordSizeHistogram(inputDevice.getLine());
                outputDevice.writeMessage(Arrays.toString(args));
            }
            if (args[0].equals("numbers")){
                application.run();
                application.randomArraySort();
            }
            if (args[0].equals("play")){
                int number = Integer.parseInt(args[1]);
                for (int ii=0; ii<number;ii++) {
                    application.run();
                }
            }
            if (args[0].equals("function1")){
                application.function1();
            }
            if (args[0].equals("function2")){
                application.function2();
            }
        }
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.
//TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
// for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.