import users.User;

public class MessageSender {
    public String send(String text, User user, String country){
        if (user.getCountry() == country && user.getLastActiveTime() == "1h"){
            return text;
        }
        return "there is no one to send text to";
    }
}
