package twitter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor@Getter@Setter
public class TwitterUser {
    private String userMail;
    private String country;
    private String lastActiveTime;

    public TwitterUser() {

    }
}
