import users.User;

public class MessageSender {
    public String send(String text, User user, String country){
        if (user.GetCountry() == country && user.GetLastActiveTime() == "1h"){
            return text;
        }
        return "there is no one to send text to";
    }
}
