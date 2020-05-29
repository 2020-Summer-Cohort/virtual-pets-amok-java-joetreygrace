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
        assertEquals(15, underTest.getHungerLevel());
    }

    @Test
    public void organicDogShouldHaveThirst() {
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals(15, underTest.getThirstLevel());
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
        assertEquals(100,underTest.getHappinessLevel());
    }

    @Test
    public void organicDogShouldHaveCageDirtiness(){
        VirtualPet underTest = new OrganicDog("Sam");
        assertEquals(0,underTest.getCageDirtiness());
    }

    @Test
    public void organicDogShouldBeWalked(){
        VirtualPet underTest = new OrganicDog("Sam");
        underTest.walkTheDog();
        assertEquals(0,underTest.getBoredomLevel());
    }
}
