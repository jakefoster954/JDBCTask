package Menu;

import java.util.Scanner;

public class HRMenu {

    public void displayHRMenu() {
        MainMenu mainMenu = new MainMenu();
        System.out.println("---You have selected HR Menu! Type the appropriate number---");
        System.out.println("1) Add new Employee");
        System.out.println("2) Generate Report");
        System.out.println("3) Add Sales Employee");
        System.out.println("4) Back To Main");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1" :
                System.out.println("You have picked add new Employee!");
                break;
            case "2" :
                System.out.println("You have picked generate Report!");
                break;
            case "3" :
                System.out.println("You have picked sales Employee!");
                break;
            case "4" :
                System.out.println("You have picked back to main!");
                mainMenu.displayMainMenu();
                break;
            default:
                System.out.println("Invalid Type");
        }
    }
}
