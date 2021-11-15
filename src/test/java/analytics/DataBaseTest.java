package analytics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataBaseTest {

    @Test
    void getUserData() {
        DataBase db = new DataBase();
        assertEquals(db.getUserData(), db.отриматиДаніКористувача());
    }

    @Test
    void getStatisticData() {
        DataBase db = new DataBase();
        assertEquals(db.getStatisticData(), db.отриматиСтатистичніДані());
    }
}