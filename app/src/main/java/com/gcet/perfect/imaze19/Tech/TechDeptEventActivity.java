package com.gcet.perfect.imaze19.Tech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TechDeptEventActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(com.gcet.perfect.imaze19.R.layout.activity_tech_dept_event);

        listView = (ListView) findViewById(com.gcet.perfect.imaze19.R.id.techDeptListView);

        Intent intent = getIntent();

        String dept = intent.getStringExtra("dept");

        if (dept.equals("CyberSorcerers")){
            Toast.makeText(TechDeptEventActivity.this,""+dept,Toast.LENGTH_SHORT).show();
            String[] items = new String[]{"Coders 007", "Tech-arena", "V R Coders"};
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapter);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent1 = new Intent(TechDeptEventActivity.this,TechEventDetailsActivity.class);
                    intent1.putExtra("eventname","Coders 007");
                    startActivity(intent1);
                }
            }
        });
    }
}
