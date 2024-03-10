package Polymorphism.Vehiches;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kbInput = new Scanner(System.in);

        String[] CarInput = kbInput.nextLine().split("\\s+");
        String[] TruckInput = kbInput.nextLine().split("\\s+");
        String[] BusInput = kbInput.nextLine().split("\\s+");
        int commands = Integer.parseInt(kbInput.nextLine());

        VehicleImpl car = new Car(Double.parseDouble(CarInput[1]),
                                  Double.parseDouble(CarInput[2]),
                                  Double.parseDouble(CarInput[3]));

        VehicleImpl truck = new Truck(Double.parseDouble(TruckInput[1]),
                                Double.parseDouble(TruckInput[2]),
                                Double.parseDouble(TruckInput[3]));

        VehicleImpl bus = new Bus(Double.parseDouble(BusInput[1]),
                                  Double.parseDouble(BusInput[2]),
                                  Double.parseDouble(BusInput[3]));

        for (int i = 0; i < commands; i++) {

            String[] commandInput = kbInput.nextLine().split("\\s+");
            String command = commandInput[0];
            String type = commandInput[1];
            double value = Double.parseDouble(commandInput[2]);

            switch (command){

                case "Drive":
                    if ("Car".equalsIgnoreCase(type)) {
                        car.driving(value);
                    }else if ("Truck".equalsIgnoreCase(type)) {
                        truck.driving(value);
                    }else {
                        bus.setFuelConsumption(bus.getFuelConsumption() + 1.4);
                        bus.driving(value);
                        bus.setFuelConsumption(bus.getFuelConsumption() - 1.4);
                    }
                    break;
                case "DriveEmpty":
                    bus.driving(value);
                    break;
                case "Refuel":
                    if ("Car".equalsIgnoreCase(type)) {
                        car.refueling(value);
                    }else {
                        truck.refueling(value);
                    }
                    break;

            }

        }
        System.out.println(car);
        System.out.println(truck);
        System.out.println(bus);
    }
}
