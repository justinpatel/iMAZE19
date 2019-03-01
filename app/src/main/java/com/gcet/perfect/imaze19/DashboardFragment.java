package com.gcet.perfect.imaze19;


import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class DashboardFragment extends Fragment {

    LinearLayout layout;
    AnimationDrawable animationDrawable;

    GridLayout gridLayout;

    public DashboardFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        layout = (LinearLayout) view.findViewById(R.id.layout);
        animationDrawable = (AnimationDrawable) layout.getBackground();
        animationDrawable.setEnterFadeDuration(2500);
        animationDrawable.setExitFadeDuration(2500);
        animationDrawable.start();

        gridLayout = (GridLayout) view.findViewById(R.id.dashboard_gridview);

        setSingleEvent(gridLayout);

        return view;
    }

    private void setSingleEvent(GridLayout gridLayout) {
        for(int i = 0;i<gridLayout.getChildCount();i++){
            CardView cardView = (CardView) gridLayout.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI == 0){
                        Intent intent = new Intent(getContext(),TechActivity.class);
                        startActivity(intent);
                    }else if (finalI == 1){
                        Intent intent = new Intent(getContext(),NonTechActivity.class);
                        startActivity(intent);
                    }else if (finalI == 2){
                        Intent intent = new Intent(getContext(),WorkshopActivity.class);
                        startActivity(intent);
                    }else if (finalI == 3){
                        Intent intent = new Intent(getContext(),TechEurekaActivity.class);
                        startActivity(intent);
                    }else if (finalI == 5){
                        Intent intent = new Intent(getContext(),NightsActivity.class);
                        startActivity(intent);
                    }else if (finalI == 6){
                        Intent intent = new Intent(getContext(),RobowarActivity.class);
                        startActivity(intent);
                    }else if (finalI == 7){
                        Intent intent = new Intent(getContext(),SocialActivity.class);
                        startActivity(intent);
                    }else if (finalI == 8){
                        Intent intent = new Intent(getContext(),MapsActivity.class);
                        startActivity(intent);
                    }else if (finalI == 9){
                        Intent intent = new Intent(getContext(),TeamActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }

}
