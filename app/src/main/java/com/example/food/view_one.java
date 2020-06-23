package com.example.food;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link view_one#newInstance} factory method to
 * create an instance of this fragment.
 */
public class view_one extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public view_one() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment view_one.
     */
    // TODO: Rename and change types and number of parameters
    public static view_one newInstance(String param1, String param2) {
        view_one fragment = new view_one();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ImageView img;
        TextView txt;
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_view_one,container,false);
        img=view.findViewById(R.id.iv_viewPager);
        txt=view.findViewById(R.id.tv_viewPager);
        txt.setText(" After the tutorial there will be a few tips to avoid common errors and enhance the user experience " +
                "if your code does not work as expected. You can find the source code of this project");
        img.setImageResource(R.mipmap.ic_launcher);
        return view;
    }
}
