package training.mansour.yora.infrastructure;

import android.content.Context;

/**
 * Created by Mansour on 22/01/2016.
 */
public class Auth {
    private final Context context;  // later will be used to store information, context is as Yora application
    private User user;

    public Auth(Context context) {
        this.context = context;
        user = new User();
    }

    public User getUser() {
        return user;
    }


}
