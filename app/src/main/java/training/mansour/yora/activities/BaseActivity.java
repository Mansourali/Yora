package training.mansour.yora.activities;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import training.mansour.yora.infrastructure.YoraApplication;

/**
 * Created by Mansour on 23/01/2016.
 */
public abstract class BaseActivity extends AppCompatActivity {
    protected YoraApplication yoraApplication;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        yoraApplication = (YoraApplication) getApplication();
    }
}
