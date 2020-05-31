package pets_amok;

public class RobotDog extends VirtualDog implements RobotAnimal {


    public RobotDog(String virtualPetName) {
        super(virtualPetName, "Robot Dog");
        this.maintenanceLevel = 25;
    }

    @Override
    public void tick() {
        maintenanceLevel += 5;
        boredomLevel += 5;
        if (happinessLevel <= 30) {
            healthLevel -= 5;
        }
        if (maintenanceLevel >= 50) {
            healthLevel -= 5;
        }
        if (happinessLevel >= 75) {
            healthLevel += 5;
        }
        if (healthLevel > 100) {
            healthLevel = 100;
        }
        if (healthLevel < 0) {
            healthLevel = 0;
        }
    }

    @Override
    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    @Override
    public int oilRobotPet() {
        maintenanceLevel -= 15;
        if (maintenanceLevel < 0) {
            maintenanceLevel = 0;
        }
        return maintenanceLevel;
    }
}
