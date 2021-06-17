package Menu;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class HRMenu {

    public void displayHRMenu() throws IOException, SQLException {
        MainMenu mainMenu = new MainMenu();
        System.out.println("---You have selected Menu.HR Menu! Type the appropriate number---");
        System.out.println("1) Add new Employee");
        System.out.println("2) Generate Report");
        System.out.println("3) Add Sales Employee");
        System.out.println("4) Back To Main");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Connection c = ConnectionToDb.getConnection();
         HR hr = new HR(c);

        switch (userInput) {
            case "1" :
                System.out.println("You have picked add new Employee!");
                break;
            case "2" :
                System.out.println("You have picked generate Report!");
                hr.getEmployeeReport(1);
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
