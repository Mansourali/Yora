package training.mansour.yora.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import training.mansour.yora.R;

/**
 * Created by Mansour on 23/01/2016.
 */
public class LogonActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_login);
    }

    public void doLogin(View view) {
        yoraApplication.getAuth().getUser().setLoggedIn(true);
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
