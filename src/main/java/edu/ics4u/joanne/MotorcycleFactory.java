package edu.ics4u.joanne;
/**
 * Usine pour créer des motos.
 */

public class MotorcycleFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Motorcycle();
    }
}