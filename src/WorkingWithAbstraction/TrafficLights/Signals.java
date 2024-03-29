package WorkingWithAbstraction.TrafficLights;

public enum Signals {

    RED,
    GREEN,
    YELLOW;

    static void changeSignals(Signals[] signals){

        for (int i = 0; i < signals.length; i++) {

            switch (signals[i]){
                case RED:
                    signals[i] = Signals.GREEN;
                    break;
                case GREEN:
                    signals[i] = Signals.YELLOW;
                    break;
                case YELLOW:
                    signals[i] = Signals.RED;
                    break;
            }
        }
    }


    static void printSignals(Signals[] signals){

        for (Signals signal: signals){

            System.out.print(signal + " ");
        }
        System.out.println();
    }
}
