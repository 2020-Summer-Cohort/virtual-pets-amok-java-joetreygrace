package pets_amok;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {
    @Test
    public void createVirtualPetShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
    }

    @Test
    public void shouldBeAbleToAddAPetToTheShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet1 = new OrganicDog("Sam");
        VirtualPet testPet2 = new RobotDog("Max");
        VirtualPet testPet3 = new OrganicCat("Sue");
        VirtualPet testPet4 = new RobotCat("Spark");
        underTest.addPetToShelter(testPet1);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        Map<String, VirtualPet> virtualPets = underTest.getVirtualPets();
        assertTrue(virtualPets.containsValue(testPet1));
        assertTrue(virtualPets.containsValue(testPet2));
        assertTrue(virtualPets.containsValue(testPet3));
        assertTrue(virtualPets.containsValue(testPet4));
    }

    @Test
    public void shouldReturnSpecificPetGivenItsName() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Sam");
        underTest.addPetToShelter(testPet);
        String test = "Sam";
        assertEquals(testPet, underTest.returnSpecificPetGivenItsName(test));
    }

    @Test
    public void shouldBeAbleToRemoveAPetFromShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Sam");
        VirtualPet testPet2 = new RobotCat("Zoey");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        Map<String, VirtualPet> virtualPets = underTest.getVirtualPets();
        assertTrue(virtualPets.containsValue(testPet));
        assertTrue(virtualPets.containsValue(testPet2));
        underTest.removePetFromShelter(testPet2);
        assertFalse(virtualPets.containsValue(testPet2));
    }

    @Test
    public void collectionShouldReturnAllPetsInShelter() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Sam");
        VirtualPet testPet2 = new RobotCat("Zoey");
        VirtualPet testPet3 = new RobotDog("Marshall");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        Collection<VirtualPet> petCollection = underTest.getVirtualPetCollection();
        assertTrue(petCollection.contains("Sam"));
        assertTrue(petCollection.contains("Zoey"));
        assertFalse(petCollection.contains("Marshall"));
    }

    @Test
    public void walkAllDogsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Sam");
        VirtualPet testPet2 = new RobotDog("Max");
        VirtualPet testPet3 = new OrganicCat("Sue");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.walkAllDogsAtOnce();
        assertEquals(0, testPet.getBoredomLevel());
        assertEquals(0, testPet2.getBoredomLevel());
        assertEquals(15, testPet3.getBoredomLevel());
    }

    @Test
    public void playAllCatsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Sam");
        VirtualPet testPet2 = new RobotDog("Max");
        VirtualPet testPet3 = new OrganicCat("Sue");
        VirtualPet testPet4 = new RobotCat("Spark");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        underTest.playWithAllCatsAtOnce();
        assertEquals(15, testPet.getBoredomLevel());
        assertEquals(15, testPet2.getBoredomLevel());
        assertEquals(0, testPet3.getBoredomLevel());
        assertEquals(0, testPet4.getBoredomLevel());
    }

    @Test
    public void waterShouldWaterAllOrganicPetsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Sam");
        VirtualPet testPet2 = new RobotDog("Max");
        VirtualPet testPet3 = new OrganicCat("Sue");
        VirtualPet testPet4 = new RobotCat("Spark");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        underTest.waterAllOrganicPetsAtOnce();
        assertEquals(0, ((OrganicDog) testPet).getThirstLevel());
        assertEquals(0, ((OrganicCat) testPet3).getThirstLevel());
    }

    @Test
    public void feedAllOrganicPetsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Sam");
        VirtualPet testPet2 = new RobotDog("Max");
        VirtualPet testPet3 = new OrganicCat("Sue");
        VirtualPet testPet4 = new RobotCat("Spark");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        underTest.feedAllOrganicPetsAtOnce();
        assertEquals(0, ((OrganicDog) testPet).getHungerLevel());
        assertEquals(0, ((OrganicCat) testPet3).getHungerLevel());
    }

    @Test
    public void cleanAllOrganicDogCagesAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Sam");
        VirtualPet testPet2 = new RobotDog("Max");
        VirtualPet testPet3 = new OrganicCat("Sue");
        VirtualPet testPet4 = new RobotCat("Spark");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        ((OrganicDog) testPet).cageDirtiness = 30;
        underTest.cleanAllOrganicDogCagesAtOnce();
        assertEquals(0, ((OrganicDog) testPet).getCageDirtiness());
    }

    @Test
    public void oilAllRobotAnimalsAtOnce() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new OrganicDog("Sam");
        VirtualPet testPet2 = new RobotDog("Max");
        VirtualPet testPet3 = new OrganicCat("Sue");
        VirtualPet testPet4 = new RobotCat("Spark");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.addPetToShelter(testPet3);
        underTest.addPetToShelter(testPet4);
        testPet2.maintenanceLevel = 50;
        testPet4.maintenanceLevel = 50;
        underTest.oilALlRobotsAtOnce();
        assertEquals(15, ((RobotDog) testPet2).getMaintenanceLevel());
        assertEquals(15, ((RobotCat) testPet4).getMaintenanceLevel());
    }

    @Test
    public void tickShouldTickForAllPets() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        VirtualPet testPet = new RobotDog("Sam");
        VirtualPet testPet2 = new OrganicCat("Zoey");
        underTest.addPetToShelter(testPet);
        underTest.addPetToShelter(testPet2);
        underTest.tickForAllPetsAtOnce();
        assertEquals(20, testPet.getBoredomLevel());
        assertEquals(30, ((RobotDog) testPet).getMaintenanceLevel());
        assertEquals(20, ((OrganicCat) testPet2).getThirstLevel());
        assertEquals(20, ((OrganicCat) testPet2).getHungerLevel());
        assertEquals(20, testPet2.getBoredomLevel());
    }
}
