package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDogTest {
    @Test
    public void shouldCreateOrganicDog() {
        VirtualPet underTest = new OrganicDog("Sam");
    }

    @Test
    public void shouldRetrievePetDescription() {
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals("Organic Dog", underTest.getVirtualPetDescriptor());
    }

    @Test
    public void shouldRetrievePetName() {
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals("Sam", underTest.getVirtualPetName());
    }

    @Test
    public void organicDogShouldHaveHunger() {
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals(15, ((OrganicDog) underTest).getHungerLevel());
    }

    @Test
    public void organicDogShouldHaveThirst() {
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals(15, ((OrganicDog) underTest).getThirstLevel());
    }

    @Test
    public void organicDogShouldHaveBoredom() {
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals(15, underTest.getBoredomLevel());
    }

    @Test
    public void organicDogShouldHaveHealth(){
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals(100,underTest.getHealthLevel());
    }

    @Test
    public void organicDogShouldHaveHappiness(){
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals(75,underTest.getHappinessLevel());
    }

    @Test
    public void organicDogShouldHaveCageDirtiness(){
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals(0, ((OrganicDog) underTest).getCageDirtiness());
    }

    @Test
    public void organicDogShouldHaveLikelihoodToSoilCage(){
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals(25, ((OrganicDog) underTest).getLikelihoodToSoilCage());
    }

    @Test
    public void organicDogShouldBeWalked(){
        VirtualPet underTest = new OrganicDog("Sam");
        underTest.playWithPet();
        assertEquals(0,underTest.getBoredomLevel());
        assertEquals(85,underTest.getHappinessLevel());
        assertEquals(10, ((OrganicDog) underTest).getLikelihoodToSoilCage());
    }

    @Test
    public void organicDogShouldGetFed(){
        VirtualPet underTest = new OrganicDog("Sam");
        ((OrganicDog) underTest).feedOrganicPet();
        assertEquals(0, ((OrganicDog) underTest).getHungerLevel());
    }

    @Test
    public void organicDogShouldGetWater(){
        VirtualPet underTest = new OrganicDog("Sam");
        ((OrganicDog) underTest).giveOrganicPetWater();
        assertEquals(0, ((OrganicDog) underTest).getThirstLevel());
    }

    @Test
    public void shouldCleanOrganicDogCages(){
        VirtualPet underTest = new OrganicDog("Sam");
        ((OrganicDog) underTest).cleanOrganicDogCage();
        assertEquals(0,((OrganicDog) underTest).getCageDirtiness());
    }

    @Test
    public void organicDogShouldTick(){
        VirtualPet underTest = new OrganicDog("Sam");
        underTest.tick();
        assertEquals(20,underTest.getBoredomLevel());
        assertEquals(20, ((OrganicDog) underTest).getThirstLevel());
        assertEquals(20,((OrganicDog) underTest).getHungerLevel());
    }
}
