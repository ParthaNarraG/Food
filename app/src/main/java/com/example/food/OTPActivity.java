package com.example.food;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class OTPActivity extends AppCompatActivity {

    Button otpAct;
    TextView resend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_o_t_p);
        resend = (TextView) findViewById(R.id.tv_resend);
        resend.setPaintFlags(resend.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

            }
        }, 60000);

        otpAct = (Button) findViewById(R.id.btn_register);
        otpAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v, "OTP", Snackbar.LENGTH_LONG);
                snackbar.show();
//                Intent intent=new Intent(OTPActivity.this,SetupActivity.class);
//                startActivity(intent);
            }
        });
    }
}
