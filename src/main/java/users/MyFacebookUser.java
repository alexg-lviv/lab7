package users;

import facebook.FacebookUser;

public class MyFacebookUser implements User{
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail() {
        return this.facebookUser.getEmail();
    }

    @Override
    public String getCountry() {
        return this.facebookUser.getUserCountry();
    }

    @Override
    public String getLastActiveTime() {
        return this.facebookUser.getUserActiveTime();
    }
}
