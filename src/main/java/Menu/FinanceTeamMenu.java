package Menu;

import java.io.IOException;
import java.util.Scanner;

public class FinanceTeamMenu {
    public void displayFinanceMenu() throws IOException {
        MainMenu mainMenu = new MainMenu();
        System.out.println("---You have selected Finance Menu! Type the appropriate number---");
        System.out.println("1) Generate employee gross pay");
        System.out.println("2) Back To Main");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        switch (userInput) {
            case "1" :
                System.out.println("Generate employee gross pay");
                break;
            case "2" :
                System.out.println("You have picked back to main!");
                mainMenu.displayMainMenu();
                break;
            default:
                System.out.println("Invalid Type");
        }
    }
}
