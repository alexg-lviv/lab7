package users;

import facebook.FacebookUser;
import twitter.TwitterUser;

public class MyTwitterUser implements User{
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser){
        this.twitterUser = twitterUser;
    }
    @Override
    public String getEmail() {
        return this.twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return this.twitterUser.getCountry();
    }

    @Override
    public String getLastActiveTime() {
        return this.twitterUser.getLastActiveTime();
    }
}
