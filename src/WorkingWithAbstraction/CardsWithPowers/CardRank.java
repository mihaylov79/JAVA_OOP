package WorkingWithAbstraction.CardsWithPowers;

public enum CardRank {

    ACE(14),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11),
    QUEEN(12),
    KING(13);

    private final int value;

    CardRank(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void printRank(){
        System.out.println("Card Ranks:");
        for (CardRank cardRank:CardRank.values()){
            System.out.printf("Ordinal value: %d; Name value: %s%n",cardRank.ordinal(),cardRank);
        }
    }
}
