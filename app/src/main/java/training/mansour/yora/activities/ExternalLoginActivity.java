package training.mansour.yora.activities;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

import training.mansour.yora.R;
import training.mansour.yora.infrastructure.YoraApplication;

/**
 * Created by Mansour on 23/01/2016.
 */
public class ExternalLoginActivity extends BaseActivity implements View.OnClickListener {

    public final static String EXTRA_EXTERNAL_SERVICE = "EXTERA_EXTERNAL_SERVICE";

    private Button testButton;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_external_login);

        testButton = (Button) findViewById(R.id.activity_external_buttonlogin);
        webView = (WebView) findViewById(R.id.activity_external_webview);

        testButton.setOnClickListener(this);
        testButton.setText("Login in with: " + getIntent().getStringExtra(EXTRA_EXTERNAL_SERVICE));
    }

    @Override
    public void onClick(View view) {
        if (view == testButton) {
            setResult(RESULT_OK);
            yoraApplication.getAuth().getUser().setLoggedIn(true);
            finish();
        }

    }
}
