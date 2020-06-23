package com.example.food.Adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.food.view_one;
import com.example.food.view_three;
import com.example.food.view_two;

public class Fragment extends FragmentPagerAdapter {
    public Fragment(@NonNull FragmentManager fm) {
        super(fm);
    }

    public Fragment(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public androidx.fragment.app.Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                return new view_one(); //ChildFragment1 at position 0
            case 1:
                return new view_two(); //ChildFragment2 at position 1
            case 2:
                return new view_three(); //ChildFragment3 at position 2
        }
        return null; //does not happen
    }

    @Override
    public int getCount() {
        return 3;
    }
}
