package WorkingWithAbstraction.CardSuit;

public enum CardSuit {

    CLUBS(0),
    DIAMONDS(1),
    HEARTS(2),
    SPADES(3);

    private final int value;

    CardSuit(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void printSuits(){

        System.out.println("Card Suits:");
        for (CardSuit cardSuit : CardSuit.values()){
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardSuit.getValue(),cardSuit);
        }



    }
}
