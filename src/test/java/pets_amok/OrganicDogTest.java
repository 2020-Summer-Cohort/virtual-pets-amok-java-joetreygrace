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
}
