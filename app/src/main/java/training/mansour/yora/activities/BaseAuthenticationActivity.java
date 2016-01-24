package training.mansour.yora.activities;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Mansour on 23/01/2016.
 * this will be a base class of all the other classes to
 * always perform check if the user login or not
 */
public abstract class BaseAuthenticationActivity extends BaseActivity {

    @Override
    protected final void onCreate(Bundle savedState) { // its final because not allowed to overridden by other child/subclasses class
        super.onCreate(savedState);

        if (!yoraApplication.getAuth().getUser().isLoggedIn()) {  // to check id the user is login or not, if not will fire the login class
            startActivity(new Intent(this, LogonActivity.class));
            finish();
            return;
        }
        onYoraCreate(savedState);
    }

    protected abstract void onYoraCreate(Bundle saveState); // this method will invoke only if the user is not login
}
