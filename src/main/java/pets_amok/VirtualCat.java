package pets_amok;

public abstract class VirtualCat extends VirtualPet {
    public VirtualCat(String virtualPetName, String virtualPetDescriptor) {
        super(virtualPetName, virtualPetDescriptor);
    }

    public int playWithPet() {
        boredomLevel = 0;
        happinessLevel += 10;
        if (happinessLevel > 100) {
            happinessLevel = 100;
        }
        return boredomLevel;
    }

}
