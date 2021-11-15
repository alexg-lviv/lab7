package facebook;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor@Getter@Setter
public class FacebookUser {
    private String email;
    private String userCountry;
    private String userActiveTime;

    public FacebookUser() {
    }
}
