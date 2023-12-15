package edu.ics4u.joanne;
/**
 * Classe représentant une voiture, implémente l'interface MotorVehicle.
 */
  public class Car implements MotorVehicle {
    @Override
    public void build() {
        System.out.println("Build Car");
    }
}
