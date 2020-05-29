package pets_amok;

public class OrganicDog extends VirtualDog implements OrganicAnimal{
    private int hungerLevel;
    private int thirstLevel;

    public OrganicDog(String virtualPetName) {
        super(virtualPetName,"Organic Dog");
        this.hungerLevel = 15;
        this.thirstLevel = 15;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }


    public int getThirstLevel() {
        return thirstLevel;
    }

    @Override
    public void tick() {

    }
}
