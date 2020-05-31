package pets_amok;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        VirtualPet petOne = new OrganicDog("Sam");
        VirtualPet petTwo = new OrganicDog("Max");
        VirtualPet petThree = new RobotDog("Sparky");
        VirtualPet petFour = new RobotDog("Flash");
        VirtualPet petFive = new OrganicCat("Sue");
        VirtualPet petSix = new OrganicCat("Kip");
        VirtualPet petSeven = new RobotCat("Smith");
        VirtualPet petEight = new RobotCat("Missy");
        VirtualPetShelter petShelter = new VirtualPetShelter();
        petShelter.addPetToShelter(petOne);
        petShelter.addPetToShelter(petTwo);
        petShelter.addPetToShelter(petThree);
        petShelter.addPetToShelter(petFour);
        petShelter.addPetToShelter(petFive);
        petShelter.addPetToShelter(petSix);
        petShelter.addPetToShelter(petSeven);
        petShelter.addPetToShelter(petEight);
        System.out.println("Welcome to the Pet Shelter gone Amok!");
        while (true) {
            System.out.println("Current Status of all Pets in Shelter:");
            System.out.println("Name\t\t\t|Description  |Health\t\t |Happiness\t\t|Hunger\t\t   |Thirst\t\t  |Boredom\t\t |Cage Dirtiness");
            System.out.println("---------------|--------------|--------------|--------------|--------------|--------------|--------------|--------------|");
            for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                if (virtualPet instanceof OrganicDog) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t\t\t" + virtualPet.getVirtualPetDescriptor() + "\t\t\t" + virtualPet.getHealthLevel() + "\t\t\t " +
                            virtualPet.getHappinessLevel() + "\t\t\t\t " + ((OrganicDog) virtualPet).getHungerLevel() + "\t\t\t " + ((OrganicDog) virtualPet).getThirstLevel() + "\t\t\t\t" +
                            virtualPet.getBoredomLevel() + "\t\t\t\t" + ((OrganicDog) virtualPet).cageDirtiness);
                }
            }
            System.out.println("Name\t\t\t|Description  |Health\t\t |Happiness\t\t|Maintenance\t|Boredom");
            System.out.println("---------------|--------------|--------------|--------------|--------------|--------------|");
            for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                if (virtualPet instanceof RobotDog) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t\t" + virtualPet.getVirtualPetDescriptor() + "\t\t\t" + virtualPet.getHealthLevel() + "\t\t\t " +
                            virtualPet.getHappinessLevel() + "\t\t\t\t " + ((RobotDog) virtualPet).getMaintenanceLevel() + "\t\t\t " +
                            virtualPet.getBoredomLevel());
                }
            }
            System.out.println("Name\t\t\t|Description  |Health\t\t |Happiness\t\t|Hunger\t\t   |Thirst\t\t  |Boredom\t\t");
            System.out.println("---------------|--------------|--------------|--------------|--------------|--------------|--------------|");
            for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                if (virtualPet instanceof OrganicCat) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t\t\t" + virtualPet.getVirtualPetDescriptor() + "\t\t\t" + virtualPet.getHealthLevel() + "\t\t\t " +
                            virtualPet.getHappinessLevel() + "\t\t\t\t " + ((OrganicCat) virtualPet).getHungerLevel() + "\t\t\t " + ((OrganicCat) virtualPet).getThirstLevel() + "\t\t\t\t" +
                            virtualPet.getBoredomLevel());
                }
            }
            System.out.println("Name\t\t\t|Description  |Health\t\t |Happiness\t\t|Maintenance\t|Boredom");
            System.out.println("---------------|--------------|--------------|--------------|--------------|--------------|");
            for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                if (virtualPet instanceof RobotCat) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t\t" + virtualPet.getVirtualPetDescriptor() + "\t\t\t" + virtualPet.getHealthLevel() + "\t\t\t " +
                            virtualPet.getHappinessLevel() + "\t\t\t\t " + ((RobotCat) virtualPet).getMaintenanceLevel() + "\t\t\t " +
                            virtualPet.getBoredomLevel());
                }
            }
            System.out.println("\nWhat would you like to do with the pets?\n");
            System.out.println("1: Feed all Organic Pets in Shelter.");
            System.out.println("2: Give Water to all Organic Pets in Shelter.");
            System.out.println("3: Oil(Maintenance) all Robot Pets in Shelter.");
            System.out.println("4: Play with all Cats in the Shelter.");
            System.out.println("5: Walk all Dogs in the Shelter.");
            System.out.println("6: Clean all Organic Dogs' Cages.");
            System.out.println("7: Adopt a pet.");
            System.out.println("8: Admit a pet to the Shelter.");
            System.out.println("9: Quit.");
            int userChoice = input.nextInt();
            if (userChoice == 1) {
                petShelter.feedAllOrganicPetsAtOnce();
            }
            if (userChoice == 2) {
                petShelter.waterAllOrganicPetsAtOnce();
            }
            if (userChoice == 3) {
                petShelter.oilALlRobotsAtOnce();
            }
            if (userChoice == 4) {
                petShelter.playWithAllCatsAtOnce();
            }
            if (userChoice == 5) {
                petShelter.walkAllDogsAtOnce();
            }
            if (userChoice == 6) {
                petShelter.cleanAllOrganicDogCagesAtOnce();
            }
            if (userChoice == 7) {
                System.out.println("\nYou would like to adopt a pet out of the shelter.\nThese are the pets eligible:");
                for (VirtualPet virtualPet : petShelter.getVirtualPets().values()) {
                    System.out.println(virtualPet.getVirtualPetName() + "\t\t|" + virtualPet.getVirtualPetDescriptor());
                }
                System.out.println("Please type in which pet to adopt:");
                String userAdoptionChoice = input.next();
                petShelter.removePetFromShelter(petShelter.returnSpecificPetGivenItsName(userAdoptionChoice));
                System.out.println(userAdoptionChoice + " has found a happy home!");
            }
            if (userChoice == 8) {
                System.out.println("\nYou would like to add a pet to the Shelter.\nPlease type in the name of the pet:");
                String userPetToAddName = input.next();
                input.nextLine();
                System.out.println("Please indicate what kind of Pet " + userPetToAddName + " is:");
                System.out.println("1: Organic Dog.");
                System.out.println("2: Robot Dog.");
                System.out.println("3: Organic Cat.");
                System.out.println("4: Robot Cat.");
                int userAdoptChoice = input.nextInt();
                if (userAdoptChoice == 1) {
                    VirtualPet userPetToAdd = new OrganicDog(userPetToAddName);
                    petShelter.addPetToShelter(userPetToAdd);
                }
                if (userAdoptChoice == 2) {
                    VirtualPet userPetToAdd = new RobotDog(userPetToAddName);
                    petShelter.addPetToShelter(userPetToAdd);
                }
                if (userAdoptChoice == 3) {
                    VirtualPet userPetToAdd = new OrganicCat(userPetToAddName);
                    petShelter.addPetToShelter(userPetToAdd);
                }
                if (userAdoptChoice == 4) {
                    VirtualPet userPetToAdd = new RobotCat(userPetToAddName);
                    petShelter.addPetToShelter(userPetToAdd);
                }
            }
            if (userChoice == 9) {
                System.out.println("\nThanks for helping at the Shelter! Bye!");
                break;
            }
            petShelter.tickForAllPetsAtOnce();
        }
    }

}
