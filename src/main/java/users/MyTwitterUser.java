package users;

import facebook.FacebookUser;
import twitter.TwitterUser;

public class MyTwitterUser implements User{
    private TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser){
        this.twitterUser = twitterUser;
    }
    @Override
    public String GetEmail() {
        return this.twitterUser.getUserMail();
    }

    @Override
    public String GetCountry() {
        return this.twitterUser.getCountry();
    }

    @Override
    public String GetLastActiveTime() {
        return this.twitterUser.getLastActiveTime();
    }
}
