package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotCatTest {
    @Test
    public void createRobotCatClass() {
        VirtualPet underTest = new RobotCat("Sue");
    }

    @Test
    public void shouldRetrievePetDescription() {
        VirtualPet underTest = new RobotCat("Sue");
        assertEquals("Robot Cat", underTest.getVirtualPetDescriptor());
    }

    @Test
    public void shouldRetrievePetName() {
        VirtualPet underTest = new RobotCat("Sue");
        assertEquals("Sue", underTest.getVirtualPetName());
    }

    @Test
    public void robotCatShouldHaveMaintenanceLevel() {
        VirtualPet underTest = new RobotCat("Sue");
        assertEquals(25, ((RobotCat) underTest).getMaintenanceLevel());
    }

    @Test
    public void robotCatShouldHaveBoredom() {
        VirtualPet underTest = new RobotCat("Sue");
        assertEquals(15, underTest.getBoredomLevel());
    }

    @Test
    public void robotCatShouldHaveHealth() {
        VirtualPet underTest = new RobotCat("Sue");
        assertEquals(100, underTest.getHealthLevel());
    }

    @Test
    public void robotCatShouldHaveHappiness() {
        VirtualPet underTest = new RobotCat("Sue");
        assertEquals(75, underTest.getHappinessLevel());
    }

    @Test
    public void robotCatShouldBeWalked() {
        VirtualPet underTest = new RobotCat("Sue");
        underTest.playWithPet();
        assertEquals(0, underTest.getBoredomLevel());
        assertEquals(85, underTest.getHappinessLevel());
    }

    @Test
    public void robotCatShouldGetOiled() {
        VirtualPet underTest = new RobotCat("Sue");
        ((RobotCat) underTest).oilRobotPet();
        assertEquals(0, ((RobotCat) underTest).getMaintenanceLevel());
    }

    @Test
    public void robotCatShouldTick() {
        VirtualPet underTest = new RobotCat("Sue");
        underTest.tick();
        assertEquals(20, underTest.getBoredomLevel());
        assertEquals(30, ((RobotCat) underTest).getMaintenanceLevel());
    }
}
