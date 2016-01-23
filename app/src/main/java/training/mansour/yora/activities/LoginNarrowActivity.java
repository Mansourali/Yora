package training.mansour.yora.activities;

import android.os.Bundle;

import training.mansour.yora.R;
import training.mansour.yora.fragments.LoginFragment;

/**
 * Created by Mansour on 23/01/2016.
 */
public class LoginNarrowActivity extends BaseActivity implements LoginFragment.CallBacks {

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_login_narraow);
    }

    @Override
    public void isLoginIn() {
        setResult(RESULT_OK);
        finish();
    }
}
