package Tickets;

import java.util.Random;

public enum Tickets {
    TICKET1 ("Coffee is always a good idea"),
    TICKET2 ("Never underestimate the importance of being properly CAFFEINATED!"),
    TICKET3 ("COME TO THE DARKSIDE WE HAVE BLACK COFFEE"),
    TICKET4 ("Coffee keeps me going until it`s acceptable TO DRINK VODKA!"),
    TICKET5 ("The problem with COFFEE is trying to MAKE IT when you haven`t had any yet"),
    TICKET6 ("GIVEN ENOUGH COFFEE, I COULD RULE THE WORLD"),
    TICKET7 ("Life is SHORT ENJOY your COFFEE!"),
    TICKET8 ("Everybody should believe in something. I believe I`ll have another COFFEE"),
    TICKET9 ("Behind every successful person is a substantial amount of Coffee!"),
    TICKET10 ("RULE #1 - COFFEE ALWAYS COMES FIRST!"),
    TICKET11 ("COFFEE - PEACE and JUSTICE for all!"),
    TICKET12 ("COFFEINATING ...... Please wait!");

    private final String ticket;

    Tickets(String ticket) {
        this.ticket = ticket;
    }

    public String getTicket() {
        return ticket;
    }

    private static final Random random = new Random();

    public static Tickets getRandom(){
        return values()[random.nextInt(values().length)];
    }
}
