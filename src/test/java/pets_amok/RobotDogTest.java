package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotDogTest {
    @Test
    public void createRobotDog(){
        VirtualDog underTest = new RobotDog("Spark");
    }

    @Test
    public void shouldRetrievePetDescription(){
        VirtualDog underTest = new RobotDog("Spark");
        assertEquals("Robot Dog",underTest.getVirtualPetDescriptor());
    }

    @Test
    public void shouldRetrievePetName(){
        VirtualDog underTest = new RobotDog("Spark");
        assertEquals("Spark",underTest.getVirtualPetName());
    }

    @Test
    public void robotDogShouldHaveMaintenanceLevel(){
        VirtualDog underTest = new RobotDog("Spark");
        assertEquals(25, ((RobotDog) underTest).getMaintenanceLevel());
    }

    @Test
    public void robotDogShouldHaveBoredom(){
        VirtualDog underTest = new RobotDog("Spark");
        assertEquals(15,underTest.getBoredomLevel());
    }

    @Test
    public void robotDogShouldHaveHealth(){
        VirtualDog underTest = new RobotDog("Spark");
        assertEquals(100,underTest.getHealthLevel());
    }

    @Test
    public void robotDogShouldHaveHappiness(){
        VirtualDog underTest = new RobotDog("Spark");
        assertEquals(75,underTest.getHappinessLevel());
    }

    @Test
    public void robotDogShouldBeWalked(){
        VirtualDog underTest = new RobotDog("Spark");
        underTest.walkTheDog();
        assertEquals(0,underTest.getBoredomLevel());
        assertEquals(85,underTest.getHappinessLevel());
    }

    @Test
    public void robotDogShouldGetOiled(){
        VirtualDog underTest = new RobotDog("Spark");
        ((RobotDog) underTest).oilRobotPet();
        assertEquals(10,((RobotDog) underTest).getMaintenanceLevel());
    }

    @Test
    public void robotDogShouldTick(){
        VirtualDog underTest = new RobotDog("Spark");
        underTest.tick();
        assertEquals(20,underTest.getBoredomLevel());
        assertEquals(30, ((RobotDog) underTest).getMaintenanceLevel());
    }
}
