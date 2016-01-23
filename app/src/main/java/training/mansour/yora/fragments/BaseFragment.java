package training.mansour.yora.fragments;

import android.app.Fragment;
import android.os.Bundle;

import training.mansour.yora.infrastructure.YoraApplication;

/**
 * Created by Mansour on 23/01/2016.
 */
public abstract class BaseFragment extends Fragment {
    protected YoraApplication yoraApplication;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        yoraApplication = (YoraApplication) getActivity().getApplication();
    }
}
