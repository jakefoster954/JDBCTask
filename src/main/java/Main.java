import Menu.MainMenu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        MainMenu mainMenu = new MainMenu();
        while (true) {
            mainMenu.displayMainMenu();
        }
    }
}
