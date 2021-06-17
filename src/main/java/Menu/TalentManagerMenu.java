package Menu;

import java.io.IOException;
import java.util.Scanner;

public class TalentManagerMenu {

    public void displayTalentTeamMenu() throws IOException {
        MainMenu mainMenu = new MainMenu();
        System.out.println("---You have selected Talent Manager Menu! Type the appropriate number---");
        System.out.println("1)Create Project!");
        System.out.println("2)Assign to project");
        System.out.println("3)Get bench employees");
        System.out.println("4)Get unassigned projects");
        System.out.println("5)See which employees are assigned to each project");
        System.out.println("6)Back To Main");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1":
                System.out.println("Create Project!");
                break;
            case "2":
                System.out.println("Assign to project");
                break;
            case "3":
                System.out.println("Get bench employees");
                break;
            case "4":
                System.out.println("Get unassigned projects");
                mainMenu.displayMainMenu();
                break;
            case "5":
                System.out.println("See which employees are assigned to each project");
                break;
            case "6":
                System.out.println("Back to Main Menu");
                mainMenu.displayMainMenu();
                break;
            default:
                System.out.println("Invalid Type");
        }
    }


}
