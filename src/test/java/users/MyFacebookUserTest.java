package users;

import facebook.FacebookUser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {

    @Test
    void getCountry() {
        FacebookUser faceuser = new FacebookUser();
        faceuser.setUserCountry("Utopia");
        User user = new MyFacebookUser(faceuser);
        assertEquals(user.getCountry(), faceuser.getUserCountry());
    }
}