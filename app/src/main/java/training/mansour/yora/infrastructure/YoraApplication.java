package training.mansour.yora.infrastructure;

import android.app.Application;

/**
 * Created by Mansour on 22/01/2016.
 */
public class YoraApplication extends Application{
    private Auth auth;

    @Override
    public void onCreate() {
        super.onCreate();
        auth = new Auth(this);
    }
    public Auth getAuth() {
        return auth;
    }

}
