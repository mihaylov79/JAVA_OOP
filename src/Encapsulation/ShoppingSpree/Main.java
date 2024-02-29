package Encapsulation.ShoppingSpree;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        Map<String,Person> people  = new LinkedHashMap<>();
        Map<String,Product> products = new LinkedHashMap<>();

        try {

        Arrays.stream(kbInput.nextLine().split(";")).forEach(p-> {
            String[] info = p.split("=");
            Person person = new Person(info[0], Double.parseDouble(info[1]));
            people.put(person.getName(), person);
        });

        Arrays.stream(kbInput.nextLine().split(";")).forEach(pr-> {
            String[]productInfo = pr.split("=");
            Product product = new Product(productInfo[0], Double.parseDouble(productInfo[1]));
            products.put(product.getName(),product);
        });

        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            return;
        }

        String commandInput = kbInput.nextLine();

        while (!"END".equalsIgnoreCase(commandInput)){

            String personName = commandInput.split("\\s+")[0];
            String productToBuy = commandInput.split("\\s")[1];

            Person person = people.get(personName);
            Product product = products.get(productToBuy);
            try {
                person.buyProduct(product);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }

            commandInput = kbInput.nextLine();
        }

        people.values().forEach(person -> {
            System.out.printf("%s - ",person.getName());
            if (person.getProducts().isEmpty()){
                System.out.println("Nothing bought");
            }else {
                String productsName = person.getProducts().stream().map(Product::getName).collect(Collectors.joining(","));

                System.out.println(productsName);
            }
        });

    }
}
