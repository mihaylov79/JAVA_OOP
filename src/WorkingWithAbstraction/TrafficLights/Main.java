package WorkingWithAbstraction.TrafficLights;

import java.util.Arrays;
import java.util.Scanner;

import static WorkingWithAbstraction.TrafficLights.Signals.changeSignals;
import static WorkingWithAbstraction.TrafficLights.Signals.printSignals;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        Signals[] signals = Arrays.stream(kbInput.nextLine().split("\\s+"))
                            .map(Signals::valueOf).toArray(Signals[]::new);
        int signalChanges = Integer.parseInt(kbInput.nextLine());

        for (int i = 0; i < signalChanges; i++) {

            changeSignals(signals);
            printSignals(signals);


        }



    }
}
