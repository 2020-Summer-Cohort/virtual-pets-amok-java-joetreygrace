package pets_amok;

public abstract class VirtualDog extends VirtualPet {
    public VirtualDog(String virtualPetName, String virtualPetDescription) {
        super(virtualPetName, virtualPetDescription);
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
