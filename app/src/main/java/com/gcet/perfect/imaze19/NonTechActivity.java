package com.gcet.perfect.imaze19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NonTechActivity extends AppCompatActivity {

    String[] names = {"CyberSorcerers","Mechadruids","Chemo-Mavericks","Elecktrowizards","Circuityrants","ConcreteChiefs","Robosmics","Digienchanters"};
    int[] images = {R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_tech);
    }
}
