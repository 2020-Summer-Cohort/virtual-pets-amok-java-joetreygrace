package pets_amok;

public abstract class VirtualPet {
    protected int happinessLevel;
    protected int healthLevel;
    protected String virtualPetName;
    protected String virtualPetDescriptor;
    protected int boredomLevel;
    protected int hungerLevel;
    protected int thirstLevel;
    protected int maintenanceLevel;

    public VirtualPet(String virtualPetName, String virtualPetDescriptor) {
        this.virtualPetName = virtualPetName;
        this.virtualPetDescriptor = virtualPetDescriptor;
        this.boredomLevel = 15;
        this.healthLevel = 100;
        this.happinessLevel = 75;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public String getVirtualPetName() {
        return virtualPetName;
    }

    public String getVirtualPetDescriptor() {
        return virtualPetDescriptor;
    }

    public int getBoredomLevel() {
        return boredomLevel;
    }

    public abstract void tick();

    public abstract int playWithPet();

}

