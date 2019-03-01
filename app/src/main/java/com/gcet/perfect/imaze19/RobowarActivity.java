package com.gcet.perfect.imaze19;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.gcet.perfect.imaze19.Robowar.RobowarContactFragment;
import com.gcet.perfect.imaze19.Robowar.RobowarDetailFragment;
import com.gcet.perfect.imaze19.Robowar.RobowarRulesFragment;
import com.gcet.perfect.imaze19.Robowar.RobowarSpecFragment;

public class RobowarActivity extends AppCompatActivity {

    Button detail,spec,rules,contact;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robowar);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        detail = (Button) findViewById(R.id.robowar_detail_btn);
        spec = (Button) findViewById(R.id.robowar_spec_btn);
        rules = (Button) findViewById(R.id.robowar_rules_btn);
        contact = (Button) findViewById(R.id.robowar_contact_btn);

        final RobowarDetailFragment robowarDetailFragment = new RobowarDetailFragment();
        final RobowarSpecFragment robowarSpecFragment = new RobowarSpecFragment();
        final RobowarRulesFragment robowarRulesFragment = new RobowarRulesFragment();
        final RobowarContactFragment robowarContactFragment = new RobowarContactFragment();

        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(robowarDetailFragment);
            }
        });

        spec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(robowarSpecFragment);
            }
        });

        rules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(robowarRulesFragment);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setFragment(robowarContactFragment);
            }
        });
        setFragment(robowarDetailFragment);
    }

    private void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment);
        fragmentTransaction.commit();
    }
}
