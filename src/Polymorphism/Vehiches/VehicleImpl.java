package Polymorphism.Vehiches;

import java.text.DecimalFormat;

public abstract class VehicleImpl implements Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public VehicleImpl(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public void driving(double distance) {
        DecimalFormat df = new DecimalFormat("#.##");

        double neededFuel = distance * this.fuelConsumption;

        if (neededFuel <= this.fuelQuantity){
            this.fuelQuantity -= neededFuel;

            System.out.printf("%s travelled %s km%n",getClass().getSimpleName(),df.format(distance));
        }else {
            System.out.printf("%s needs refueling%n",getClass().getSimpleName());
        }
    }

    @Override
    public void refueling(double liters) {
        double fuelToBeAdded = liters + this.fuelQuantity;

        if (liters <= 0){
            System.out.println("Fuel must be a positive number");
        } else if (fuelToBeAdded > this.tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
        }else {
            this.fuelQuantity += liters;
        }
        }

    @Override
    public String toString() {
        return String.format("%s: %.2f",
                getClass().getSimpleName(),
                this.fuelQuantity);
    }
}
