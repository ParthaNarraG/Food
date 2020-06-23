package com.example.food.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ToggleButton;

import com.example.food.Adapters.HomeAdapter;
import com.example.food.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle toggle;
    Toolbar toolbar;
    RecyclerView recyclerView;
    HomeAdapter adapter;
    BottomNavigationView bottomNavigationView;
    ArrayList<String> mYear=new ArrayList<>();
    ArrayList<String> mDuration=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        drawerLayout = (DrawerLayout) findViewById(R.id.dl_home);
        navigationView = (NavigationView) findViewById(R.id.nm_home);
        bottomNavigationView=(BottomNavigationView)findViewById(R.id.bnv_home);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        toolbar.setTitle("Home");



        toggle = new ActionBarDrawerToggle(HomeActivity.this, drawerLayout, toolbar, R.string.app_name, R.string.app_name);
        toggle.setDrawerIndicatorEnabled(false);  //Removes Hamburger icon
        toggle.setHomeAsUpIndicator(R.drawable.ic_photo_size_select_actual_black_24dp);     //Set your own icon
        toggle.syncState();   //Toggle icon will sync to drawer listener
        drawerLayout.addDrawerListener(toggle);  //Adding toggle button for drawer listener

        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");
        mYear.add("2018");
        mDuration.add("Duration:150mins");   mYear.add("2018");
        mDuration.add("Duration:150mins");








        recycler();

    }

    private void recycler() {
        recyclerView=findViewById(R.id.rv_twitter);
        adapter=new HomeAdapter(this,mYear,mDuration);
        recyclerView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2,RecyclerView.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
    }
}
