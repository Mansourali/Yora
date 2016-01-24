package training.mansour.yora.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import training.mansour.yora.R;
import training.mansour.yora.fragments.LoginFragment;

/**
 * Created by Mansour on 23/01/2016.
 */
public class LogonActivity extends BaseActivity implements  LoginFragment.CallBacks, View.OnClickListener {
    private final static int REQUEST_NARROW_LOGIN = 1;
    private static final int REQUEST_REGISTER = 2;
    private static final int REQUEST_EXTERNAL_LOGIN = 3;
    private Button loginButton;
    private Button registerButton;
    private View facebookButton;
    private View googleButton;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_login);

        loginButton = (Button) findViewById(R.id.Activity_login_YoraLogIn);
        registerButton = (Button) findViewById(R.id.Activity_login_YoraRegister);
        googleButton = findViewById(R.id.Activity_login_FacebookLogIn);
        facebookButton = findViewById(R.id.Activity_login_FacebookLogIn);

        if (loginButton != null)
            loginButton.setOnClickListener(this);
        registerButton.setOnClickListener(this);
        facebookButton.setOnClickListener(this);
        googleButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view == loginButton) {
            startActivityForResult(new Intent(this, LoginNarrowActivity.class), REQUEST_NARROW_LOGIN);
        } else if (view == registerButton) {
            startActivityForResult(new Intent(this, RegisterActivity.class), REQUEST_REGISTER);
        } else if (view == facebookButton){
            doExternalLogin("Facebook");
        } else if (view == googleButton) {
            doExternalLogin("Google");
        }
    }

    private void doExternalLogin(String request) {
        Intent intent = new Intent(this, ExternalLoginActivity.class);
        intent.putExtra(ExternalLoginActivity.EXTRA_EXTERNAL_SERVICE, request);
        startActivityForResult(intent, REQUEST_EXTERNAL_LOGIN);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != RESULT_OK)
            return;
        if (requestCode == REQUEST_NARROW_LOGIN ||
                requestCode == REQUEST_REGISTER ||
                requestCode == REQUEST_EXTERNAL_LOGIN)
            finishLogin();
    }

    private void finishLogin() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onLoginIn() {
        finishLogin();
    }
}
