package training.mansour.yora.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import org.xmlpull.v1.XmlPullParser;

import java.util.zip.Inflater;

import training.mansour.yora.R;

/**
 * Created by Mansour on 23/01/2016.
 */
public class LoginFragment extends BaseFragment implements View.OnClickListener {
    private Button loginButton;
    private CallBacks callBacks;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //container is the root view that the fragment view will attach on, used to give the layout specification such as size
        //the false last parameter means that don't attach this layout to root, it will do any way (useless)
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        loginButton = (Button) view.findViewById(R.id.FragmentLoginButton);
        loginButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        if (view == loginButton) {
            yoraApplication.getAuth().getUser().setLoggedIn(true);
            callBacks.onLoginIn();
        }
    }

/*    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        callBacks = (CallBacks) activity;
    }*/

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        callBacks = (CallBacks) getActivity();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        callBacks = null;
    }

    public interface CallBacks {
        void onLoginIn();
    }
}
