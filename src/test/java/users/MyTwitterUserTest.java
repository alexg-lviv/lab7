package users;

import org.junit.jupiter.api.Test;
import twitter.TwitterUser;

import static org.junit.jupiter.api.Assertions.*;

class MyTwitterUserTest {

    @Test
    void getCountry() {
        TwitterUser twitterUser = new TwitterUser();
        twitterUser.setCountry("Utopia");
        User user = new MyTwitterUser(twitterUser);
        assertEquals(twitterUser.getCountry(), user.getCountry());
    }
}