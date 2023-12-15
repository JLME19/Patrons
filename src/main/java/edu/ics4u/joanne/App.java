package edu.ics4u.joanne;

/**
 * Méthode principale de l'application.
 * Permet de tester le fonctionnement du patron en créant les instances d'objets
 * nécessaires(Usines)et appelle la méthode build sur chaque instance.
 */

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
