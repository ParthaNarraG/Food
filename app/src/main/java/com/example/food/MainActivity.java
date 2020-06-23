package com.example.food;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation logo;
    ImageView profileLogo;
    TextView register,fPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profileLogo=(ImageView)findViewById(R.id.iv_profileLogo);
        logo= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move_up);
        profileLogo.setAnimation(logo);
        register=(TextView)findViewById(R.id.tv_register);
        fPassword=(TextView)findViewById(R.id.tv_forgot);
        String text="Don't have an account? Register";
        Spannable span=new SpannableString(text);
        span.setSpan(new ForegroundColorSpan(this.getResources().getColor(R.color.colorCream)),
               23,31, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        ClickableSpan spans=new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent=new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        };
        span.setSpan(spans,23,31, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        register.setText(span);
        register.setMovementMethod(LinkMovementMethod.getInstance());
        fPassword.setPaintFlags(fPassword.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        fPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ForgotPassword.class);
                startActivity(intent);
            }
        });
    }
}
