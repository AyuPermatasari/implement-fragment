package com.example.vinzer.ootd.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vinzer.ootd.R;
import com.example.vinzer.ootd.data.AndroidImageAssets;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        if (savedInstanceState==null){
            FragmentManager fragmentManager = getSupportFragmentManager();

            BodyPartFragment bodyFragment = new BodyPartFragment();
            bodyFragment.setmImageIds(AndroidImageAssets.getBodies());
            bodyFragment.setmListIndex(0);
            fragmentManager.beginTransaction()
                    .add(R.id.body_container, bodyFragment)
                    .commit();

            BodyPartFragment legsFragment = new BodyPartFragment();
            legsFragment.setmImageIds(AndroidImageAssets.getLegs());
            legsFragment.setmListIndex(0);

            fragmentManager.beginTransaction()
                    .add(R.id.legs_container, legsFragment)
                    .commit();
        }
    }
}
