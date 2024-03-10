package Polymorphism.Vehiches;

public class Truck extends VehicleImpl{


    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + 1.6, tankCapacity);
    }

    //    @Override
//    public void driving(double distance) {
//        double neededFuel = distance * (this.fuelConsumption + AC_FUEL_CONSUMPTION);
//
//        if (neededFuel <= this.fuelQuantity){
//            this.fuelQuantity -= neededFuel;
//
//            System.out.printf("Truck travelled %.2f%n",distance);
//        }else {
//            System.out.println("Truck needs refueling");
//        }
//    }
//
    @Override
    public void refueling(double liters) {
        super.refueling(liters * 0.95);
    }
}
