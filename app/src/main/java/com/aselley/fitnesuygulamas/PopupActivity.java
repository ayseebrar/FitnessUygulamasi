package com.aselley.fitnesuygulamas;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.aselley.fitnesuygulamas.fragment.PopupFragment;
import com.aselley.fitnesuygulamas.recyclerview.FitnessPictureAdapter;
public class PopupActivity  extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popup_activity);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.popup_activity_framelayout);

        if (fragment == null) {
            fragment = PopupFragment.newInstance();
            fragmentManager.beginTransaction().add(R.id.popup_activity_framelayout,fragment).commit();

        }

    }


    public static Intent newIntent(Context context, FitnesMove fitnessMove) {
        Intent intent = new Intent(context,PopupActivity.class);
        intent.putExtra("INFO",fitnessMove);
        return intent;
    }
}

