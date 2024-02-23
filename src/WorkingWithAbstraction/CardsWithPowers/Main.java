package WorkingWithAbstraction.CardsWithPowers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner kbInput = new Scanner(System.in);


        CardRank card = CardRank.valueOf(kbInput.nextLine());
        CardSuit suit = CardSuit.valueOf(kbInput.nextLine());

        int cardVal = card.getValue();
        int suitVal = suit.getValue();

        System.out.printf("Card name: %s of %s; Card power: %d%n",card,suit, cardVal + suitVal);
    }
}
