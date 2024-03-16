package Tickets;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kbInput = new Scanner(System.in);

        String input = kbInput.nextLine();

        while (!"end".equalsIgnoreCase(input)){
           // Tickets ticket = Tickets.getRandom();
            System.out.println(Tickets.getRandom().getTicket());

            input = kbInput.nextLine();
        }



    }
}