package DesignPatterns.Singleton;

public class HashcodeDemo {

    public static void main(String[] args) {
        Hashcode instance = Hashcode.getInstance("Gruh");
        Hashcode newInstance = Hashcode.getInstance("KMC");

        System.out.println(instance.getPoint().hashCode());
        System.out.println(newInstance.getPoint().hashCode());

        System.out.println("Gruh".hashCode());
        System.out.println("KMC".hashCode());
    }


}
