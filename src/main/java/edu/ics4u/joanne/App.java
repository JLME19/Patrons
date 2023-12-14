package edu.ics4u.joanne;

public class App {

    public static void main(String[] args) {
        // Utilisation de la fabrique de voiture
        MotorVehicleFactory carFactory = new CarFactory();
        carFactory.create();

        // Utilisation de la fabrique de moto
        MotorVehicleFactory motorcycleFactory = new MotorcycleFactory();
        motorcycleFactory.create();
    }
}

