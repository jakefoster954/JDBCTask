package Menu;

import java.io.IOException;
import java.util.Scanner;

public class SalesTeamMenu {
    public void displaySalesTeamMenu() throws IOException {
    MainMenu mainMenu = new MainMenu();
        System.out.println("---You have selected Sales Team Menu! Type the appropriate number---");
        System.out.println("1) Employee which has the highest total sales for this period");
        System.out.println("2) Back To Main");

    Scanner scanner = new Scanner(System.in);
    String userInput = scanner.nextLine();

        switch (userInput) {
        case "1" :
            System.out.println("You have picked add employee which has the highest total sales for this period!");
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
