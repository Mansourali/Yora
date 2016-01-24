package training.mansour.yora.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import training.mansour.yora.R;
import training.mansour.yora.fragments.LoginFragment;

/**
 * Created by Mansour on 23/01/2016.
 */
public class LogonActivity extends BaseActivity implements View.OnClickListener, LoginFragment.CallBacks {
    private final static int REQUEST_NARROW_LOGIN = 1;
    private static final int REQUEST_REGISTER = 2;
    private View loginButton;
    private View registerButton;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.YoraLogIn);
        registerButton = findViewById(R.id.YoraRegister);

        if (loginButton != null) { // if will throw exception in the case of fragment if this checking is not made
            loginButton.setOnClickListener(this);
        }
        if (registerButton != null) {
            registerButton.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        if (view == loginButton) {
            startActivityForResult(new Intent(this, LoginNarrowActivity.class), REQUEST_NARROW_LOGIN);
        } else if (view == registerButton) {
            startActivityForResult(new Intent(this, RegisterActivity.class), REQUEST_REGISTER);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != RESULT_OK)
            return;
        if (requestCode == REQUEST_NARROW_LOGIN || requestCode == REQUEST_REGISTER)
            finishLogin();
    }

    private void finishLogin() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void isLoginIn() {
        finishLogin();
    }
}
