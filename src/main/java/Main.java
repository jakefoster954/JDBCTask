import Menu.MainMenu;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws IOException, SQLException {
        MainMenu mainMenu = new MainMenu();
        while (true) {
            mainMenu.displayMainMenu();
        }
    }
}
