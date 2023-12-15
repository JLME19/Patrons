package edu.ics4u.joanne;

/**
 * Usine pour créer des voitures.
 */
public class CarFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Car();
    }
}
