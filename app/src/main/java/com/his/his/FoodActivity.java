package com.his.his;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.support.v4.app.FragmentTransaction;


public class FoodActivity extends AppCompatActivity {


    Fragment fragment = null;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_food );

        fragment = new FoodFragment();
        switchFragment(fragment);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.main_nav);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.nav_food:
                    fragment = new FoodFragment();
                    switchFragment(fragment);
                    return true;

                case R.id.nav_attractions:
                    fragment = new AttractionsFragment();
                    switchFragment(fragment);
                    return true;

                case R.id.nav_itinerary:
                    fragment = new ItineraryFragment();
                    switchFragment(fragment);
                    return true;

                case R.id.nav_prayer:
                    fragment = new ParyerFragment();
                    switchFragment(fragment);
                    return true;

                default:
                    return false;

            }
        }


    };

    private void switchFragment(Fragment fragment) {
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.icon50);
    }


}
