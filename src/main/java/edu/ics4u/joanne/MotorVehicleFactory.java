package edu.ics4u.joanne;

/**
 * Classe abstraite représentant une usine de véhicules à moteur.
 * Dont les sous-classes doivent implémenter la méthode createMotorVehicle.
 */
public abstract class MotorVehicleFactory {
    /**
     * Méthode pour créer un véhicule en utilisant la fabrique.
     * Cette méthode utilise la méthode createMotorVehicle pour obtenir
     * une instance spécifique de MotorVehicle et appelle ensuite la méthode build.
     *
     * @return Une instance de MotorVehicle.
     */

    public MotorVehicle create() {
        MotorVehicle vehicle = createMotorVehicle();
        vehicle.build();
        return vehicle;
    }

    /**
     * Méthode abstraite que les sous-classes doivent implémenter
     * pour créer une instance spécifique de MotorVehicle.
     *
     * @return Une instance de MotorVehicle.
     */
    protected abstract MotorVehicle createMotorVehicle();
}