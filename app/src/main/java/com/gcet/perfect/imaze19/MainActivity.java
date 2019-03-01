package com.gcet.perfect.imaze19;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        final BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);

        final HomeFragment homeFragment = new HomeFragment();
        final DashboardFragment dashboardFragment = new DashboardFragment();
        final ContactFragment contactFragment = new ContactFragment();

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener(){

            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        setFragment(homeFragment);
                        return true;
                    case R.id.navigation_dashboard:
                        setFragment(dashboardFragment);
                        return true;
                    case R.id.navigation_contact:
                        setFragment(contactFragment);
                        return true;
                }
                return false;
            }
        });

        navigation.setItemIconTintList(null);
        navigation.setSelectedItemId(R.id.navigation_home);
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }

}
