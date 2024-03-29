package DesignPatterns.Singleton;

public class Hashcode {


    private String point;
    private static Hashcode instance;

    private Hashcode(String point){

        this.point = point;
    }

    public String getPoint() {
        return point;
    }

    public static Hashcode getInstance(String point){

        if (null == instance){
            instance = new Hashcode(point);
        }
        return instance;
    }

}
