package Menu;

import java.sql.Connection;

public abstract class User {
    Connection c;

    public User(Connection c) {
        this.c = c;
    }
}
