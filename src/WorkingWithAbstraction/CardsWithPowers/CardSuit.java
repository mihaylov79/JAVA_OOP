package WorkingWithAbstraction.CardsWithPowers;

public enum CardSuit {

    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

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
