package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest {
    @Test
    public void createOrganicCatClass() {
        VirtualPet underTest = new OrganicCat("Polly");
    }

    @Test
    public void shouldRetrievePetDescription() {
        VirtualPet underTest = new OrganicCat("Polly");
        assertEquals("Organic Cat", underTest.getVirtualPetDescriptor());
    }

    @Test
    public void shouldRetrievePetName() {
        VirtualPet underTest = new OrganicCat("Polly");
        assertEquals("Polly", underTest.getVirtualPetName());
    }

    @Test
    public void organicCatShouldHaveHunger() {
        VirtualPet underTest = new OrganicCat("Polly");
        assertEquals(15, ((OrganicCat) underTest).getHungerLevel());
    }

    @Test
    public void organicCatShouldHaveThirst() {
        VirtualPet underTest = new OrganicCat("Polly");
        assertEquals(15, ((OrganicCat) underTest).getThirstLevel());
    }

    @Test
    public void organicCatShouldHaveBoredom() {
        VirtualPet underTest = new OrganicCat("Polly");
        assertEquals(15, underTest.getBoredomLevel());
    }

    @Test
    public void organicCatShouldHaveHealth() {
        VirtualPet underTest = new OrganicCat("Polly");
        assertEquals(100, underTest.getHealthLevel());
    }

    @Test
    public void organicCatShouldHaveHappiness() {
        VirtualPet underTest = new OrganicCat("Polly");
        assertEquals(75, underTest.getHappinessLevel());
    }

    @Test
    public void organicCatShouldBePlayedWith() {
        VirtualPet underTest = new OrganicCat("Polly");
        underTest.playWithPet();
        assertEquals(0, underTest.getBoredomLevel());
        assertEquals(85, underTest.getHappinessLevel());
    }

    @Test
    public void organicCatShouldBeFed() {
        VirtualPet underTest = new OrganicCat("Polly");
        ((OrganicCat) underTest).feedOrganicPet();
        assertEquals(0, ((OrganicCat) underTest).getHungerLevel());
    }

    @Test
    public void organicCatShouldGetWater() {
        VirtualPet underTest = new OrganicCat("Polly");
        ((OrganicCat) underTest).giveOrganicPetWater();
        assertEquals(0, ((OrganicCat) underTest).getThirstLevel());
    }

    @Test
    public void organicCatShouldTick() {
        VirtualPet underTest = new OrganicCat("Polly");
        underTest.tick();
        assertEquals(20, underTest.getBoredomLevel());
        assertEquals(20, ((OrganicCat) underTest).getThirstLevel());
        assertEquals(20, ((OrganicCat) underTest).getHungerLevel());
    }
}
