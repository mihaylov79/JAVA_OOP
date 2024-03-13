package Tickets;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();

        while ("1".equalsIgnoreCase(input)){
            Tickets ticket = Tickets.getRandom();
            System.out.println(ticket.getTicket());

            input = kbInput.nextLine();
        }



    }
}