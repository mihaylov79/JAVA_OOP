package IntefacesAndAbstraction.Telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        List<String>numz=Arrays.stream(kbInput.nextLine().split("\\s+")).collect(Collectors.toList());
        List<String>urlz=Arrays.stream(kbInput.nextLine().split("\\s+")).collect(Collectors.toList());

        Smartphone smartphone = new Smartphone(numz,urlz);

        System.out.println(smartphone.call());
        System.out.println(smartphone.browse());
    }
}
