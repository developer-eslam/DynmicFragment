package com.serverproject.facedetection.dynmicfragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    FragmentOne fragmentOne;
    FragmentTwo fragmentTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getsupportfragmentmanger
        //getfragmentmanager
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        int displaymode = getResources().getConfiguration().orientation;
        if(displaymode==1){

            //portirat
            fragmentOne = new FragmentOne();
            fragmentTransaction.replace(android.R.id.content,fragmentOne);
        }else{
            //landscape
            fragmentTwo = new FragmentTwo();
            fragmentTransaction.replace(android.R.id.content,fragmentTwo);
        }

        fragmentTransaction.commit();

    }
}
