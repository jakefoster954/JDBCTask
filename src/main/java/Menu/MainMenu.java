package Menu;

import java.util.Scanner;

public class MainMenu {

    public void displayMainMenu() {
        System.out.println("---Welcome please select what type of employee you are? Type the appropriate number---");
        System.out.println("1) HR Employee");
        System.out.println("2) Finance Team");
        System.out.println("3) Sales Team");
        System.out.println("4) Talent Manager");
        System.out.println("5) Quit");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1" :
                System.out.println("You have picked 1");
                break;
            case "2" :
                System.out.println("You have picked 2");
                break;
            case "3" :
                System.out.println("You have picked 3");
                break;
            case "4" :
                System.out.println("You have picked 4");
                break;
            case "5" :
                System.out.println("Quitting Application");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid Type");
        }

        System.out.println(userInput);



    }
}
