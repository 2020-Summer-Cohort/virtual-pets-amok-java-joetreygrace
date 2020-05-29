package pets_amok;

public abstract class VirtualDog extends VirtualPet {
    public VirtualDog(String virtualPetName, String virtualPetDescription) {
        super(virtualPetName,virtualPetDescription);
    }

    public int walkTheDog(){
        boredomLevel = boredomLevel - 25;
        if (boredomLevel < 0) {
            boredomLevel = 0;
        }
        return boredomLevel;
    }
}
