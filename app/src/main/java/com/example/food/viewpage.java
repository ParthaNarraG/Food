package com.example.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.example.food.Adapters.Fragment;
import com.google.android.material.tabs.TabLayout;

public class viewpage extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabs;
    Button start;
    Animation btnAnimate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        btnAnimate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);
        start=(Button) findViewById(R.id.btn_start);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        tabs=(TabLayout)findViewById(R.id.tabs);
        viewPager.setAdapter(new Fragment(getSupportFragmentManager()));
        tabs.setupWithViewPager(viewPager);
        tabs.setSelectedTabIndicatorColor(Color.WHITE);
        tabs.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int pos=viewPager.getCurrentItem();
                if(tabs.getSelectedTabPosition()==2){
                    screenChange();
                }
                else{
                    tabs.setVisibility(View.VISIBLE);
                    start.setVisibility(View.GONE);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(viewpage.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void screenChange() {
        tabs.setVisibility(View.GONE);
        start.setVisibility(View.VISIBLE);
        start.setAnimation(btnAnimate);
    }
}
