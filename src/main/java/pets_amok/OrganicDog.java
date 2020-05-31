package pets_amok;

public class OrganicDog extends VirtualDog implements OrganicAnimal {
    protected int cageDirtiness;
    protected int likelihoodToSoilCage;

    public OrganicDog(String virtualPetName) {
        super(virtualPetName, "Organic Dog");
        this.hungerLevel = 15;
        this.thirstLevel = 15;
        this.cageDirtiness = 0;
        this.likelihoodToSoilCage = 25;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }


    public int getThirstLevel() {
        return thirstLevel;
    }

    @Override
    public int cleanOrganicDogCage() {
        cageDirtiness = 0;
        return cageDirtiness;
    }


    public int getCageDirtiness() {
        return cageDirtiness;
    }

    public int getLikelihoodToSoilCage() {
        return likelihoodToSoilCage;
    }

    @Override
    public int playWithPet() {
        boredomLevel = boredomLevel - 25;
        if (boredomLevel < 0) {
            boredomLevel = 0;
        }
        happinessLevel += 10;
        if (happinessLevel > 100) {
            happinessLevel = 100;
        }
        likelihoodToSoilCage -= 15;
        if (likelihoodToSoilCage < 0) {
            likelihoodToSoilCage = 0;
        }
        return boredomLevel;
    }

    @Override
    public void tick() {
        hungerLevel += 5;
        thirstLevel += 5;
        boredomLevel += 5;
        if (boredomLevel >= 50) {
            likelihoodToSoilCage += 5;
        }
        if (likelihoodToSoilCage >= 20) {
            cageDirtiness += 5;
        }
        if (happinessLevel <= 30) {
            healthLevel -= 5;
        }
        if (cageDirtiness >= 50) {
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

}
