package pets_amok;

public class OrganicCat extends VirtualCat implements OrganicAnimal {
    public OrganicCat(String virtualPetName) {
        super(virtualPetName, "Organic Cat");
        this.hungerLevel = 15;
        this.thirstLevel = 15;
    }

    @Override
    public int feedOrganicPet() {
        hungerLevel = hungerLevel - 15;
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
        return hungerLevel;
    }

    @Override
    public int giveOrganicPetWater() {
        thirstLevel = thirstLevel - 15;
        if (thirstLevel < 0) {
            thirstLevel = 0;
        }
        return thirstLevel;
    }

    @Override
    public int getHungerLevel() {
        return hungerLevel;
    }

    @Override
    public int getThirstLevel() {
        return thirstLevel;
    }

    @Override
    public int cleanOrganicDogCage() {
        return 0;
    }

    @Override
    public void tick() {
        hungerLevel += 5;
        thirstLevel += 5;
        boredomLevel += 5;
        if (happinessLevel <= 30) {
            healthLevel -= 5;
        }
        if (hungerLevel >= 50) {
            healthLevel -= 5;
        }
        if (thirstLevel >= 50) {
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

}
