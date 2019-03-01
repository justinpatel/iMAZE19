package com.gcet.perfect.imaze19;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.gcet.perfect.imaze19.Tech.TechDeptEventActivity;

public class TechActivity extends AppCompatActivity {

    ListView listView;
    String[] names = {"CyberSorcerers","Mechadruids","Chemo-Mavericks","Elecktrowizards","Circuityrants","ConcreteChiefs","Robosmics","Digienchanters"};
    int[] images = {R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list,R.drawable.list};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tech);

        listView = (ListView) findViewById(R.id.techListView);
        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(TechActivity.this,""+i,Toast.LENGTH_SHORT).show();

                if (i == 0){
                    Intent intent = new Intent(TechActivity.this,TechDeptEventActivity.class);
                    intent.putExtra("dept","CyberSorcerers");
                    startActivity(intent);
                }else if (i == 1){
                    Intent intent = new Intent(TechActivity.this,TechDeptEventActivity.class);
                    intent.putExtra("dept","Mechadruids");
                    startActivity(intent);
                }else if (i == 2){
                    Intent intent = new Intent(TechActivity.this,TechDeptEventActivity.class);
                    intent.putExtra("dept","Chemo-Mavericks");
                    startActivity(intent);

                }else if (i == 3){
                    Intent intent = new Intent(TechActivity.this,TechDeptEventActivity.class);
                    intent.putExtra("dept","Elecktrowizards");
                    startActivity(intent);

                }else if (i == 4){
                    Intent intent = new Intent(TechActivity.this,TechDeptEventActivity.class);
                    intent.putExtra("dept","Circuityrants");
                    startActivity(intent);

                }else if (i == 5){
                    Intent intent = new Intent(TechActivity.this,TechDeptEventActivity.class);
                    intent.putExtra("dept","ConcreteChiefs");
                    startActivity(intent);

                }else if (i == 6){
                    Intent intent = new Intent(TechActivity.this,TechDeptEventActivity.class);
                    intent.putExtra("dept","Robosmics");
                    startActivity(intent);

                }else if (i == 7){
                    Intent intent = new Intent(TechActivity.this,TechDeptEventActivity.class);
                    intent.putExtra("dept","Digienchanters");
                    startActivity(intent);

                }
            }
        });

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            convertView = getLayoutInflater().inflate(R.layout.custom_layout,parent,false);

            convertView.setBackgroundResource(R.drawable.customlistshap);

            ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
            TextView textView = (TextView) convertView.findViewById(R.id.textView);

            imageView.setImageResource(images[position]);
            textView.setText(names[position]);

            Animation animation = AnimationUtils.loadAnimation(TechActivity.this,R.anim.scale);
            convertView.startAnimation(animation);

            return convertView;
        }
    }
}
