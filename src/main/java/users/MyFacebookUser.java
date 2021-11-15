package users;

import facebook.FacebookUser;

public class MyFacebookUser implements User{
    private FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser){
        this.facebookUser = facebookUser;
    }

    @Override
    public String GetEmail() {
        return this.facebookUser.getEmail();
    }

    @Override
    public String GetCountry() {
        return this.facebookUser.getUserCountry();
    }

    @Override
    public String GetLastActiveTime() {
        return this.facebookUser.getUserActiveTime();
    }
}
