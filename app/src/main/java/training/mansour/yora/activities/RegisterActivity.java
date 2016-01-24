package training.mansour.yora.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import training.mansour.yora.R;

/**
 * Created by Mansour on 23/01/2016.
 */
public class RegisterActivity extends BaseActivity implements View.OnClickListener {
    private EditText userName;
    private EditText email;
    private EditText passWord;
    private Button register;
    private View progressBar;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_register);

        userName = (EditText) findViewById(R.id.RegisterUserNameEdit);
        email = (EditText) findViewById(R.id.RegisterEmailEdit);
        passWord = (EditText) findViewById(R.id.RegisterPasswordEdit);
        register = (Button) findViewById(R.id.registerButton);
        progressBar = findViewById(R.id.RegisterProgressBar);

        register.setOnClickListener(this);
        progressBar.setVisibility(View.GONE);

    }

    @Override
    public void onClick(View view) {
        if (view == register) {
            yoraApplication.getAuth().getUser().setLoggedIn(true);
            setResult(RESULT_OK);
            finish();
        }
    }
}
