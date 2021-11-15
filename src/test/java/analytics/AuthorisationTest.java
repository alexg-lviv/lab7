package analytics;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class AuthorisationTest {

    @Test
    void testAuthorise() {
        DataBase db = new DataBase();
        Authorisation auth = new Authorisation();
        assertEquals(true, auth.authorise(db));
        assertEquals(true, auth.авторизуватися(db));
    }



}