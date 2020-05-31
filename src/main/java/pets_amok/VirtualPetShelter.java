package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    private Map<String, VirtualPet> virtualPets = new HashMap<>();


    public Map<String, VirtualPet> getVirtualPets() {
        return virtualPets;
    }

    public Collection getVirtualPetCollection() {
        return virtualPets.keySet();
    }

    public VirtualPet returnSpecificPetGivenItsName(String petsName) {
        return virtualPets.get(petsName);
    }

    public void addPetToShelter(VirtualPet petToAdd) {
        virtualPets.put(petToAdd.getVirtualPetName(),petToAdd);
    }

    public void removePetFromShelter(VirtualPet petToRemove) {
        virtualPets.remove(petToRemove.getVirtualPetName());
    }

    public void walkAllDogsAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof VirtualDog){
                pets.playWithPet();
            }
        }
    }

    public void playWithAllCatsAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof VirtualCat){
                pets.playWithPet();
            }
        }
    }

    public void waterAllOrganicPetsAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof OrganicAnimal){
                ((OrganicAnimal) pets).giveOrganicPetWater();
            }
        }
    }

    public void feedAllOrganicPetsAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof OrganicAnimal){
                ((OrganicAnimal) pets).feedOrganicPet();
            }
        }
    }

    public void cleanAllOrganicDogCagesAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof OrganicDog){
                ((OrganicAnimal) pets).cleanOrganicDogCage();
            }
        }
    }

    public void oilALlRobotsAtOnce() {
        for (VirtualPet pets : virtualPets.values()){
            if (pets instanceof RobotAnimal){
                ((RobotAnimal) pets).oilRobotPet();
            }
        }
    }

    public void tickForAllPetsAtOnce() {
        for (VirtualPet pets : virtualPets.values()) {
            pets.tick();
        }
    }
}
