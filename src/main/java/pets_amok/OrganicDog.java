package pets_amok;

public class OrganicDog extends VirtualDog implements OrganicAnimal {

    public OrganicDog(String virtualPetName) {
        super(virtualPetName, "Organic Dog");
        this.hungerLevel = 15;
        this.thirstLevel = 15;
        this.cageDirtiness = 0;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }


    public int getThirstLevel() {
        return thirstLevel;
    }


    public int getCageDirtiness() {
        return cageDirtiness;
    }

    @Override
    public void tick() {

    }
}
