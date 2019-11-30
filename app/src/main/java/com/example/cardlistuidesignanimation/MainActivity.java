package com.example.cardlistuidesignanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout first, second, third;
    Button continu, cancel;
    Animation fade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.first_item);
        second = findViewById(R.id.second_item);
        third = findViewById(R.id.third_item);
        continu = findViewById(R.id.btn_continue);
        cancel = findViewById(R.id.btn_cancel);

        first.setOnClickListener(this);
        second.setOnClickListener(this);
        third.setOnClickListener(this);

        continu.setAlpha(0);
        cancel.setAlpha(0);
        fade = AnimationUtils.loadAnimation(this , R.anim.anim1);

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setBackground(getDrawable(R.drawable.item));
                second.setBackground(getDrawable(R.drawable.item));
                third.setBackground(getDrawable(R.drawable.item));
                continu.setAlpha(0);
                cancel.setAlpha(0);
            }
        });
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.first_item :
                first.setBackground(getDrawable(R.drawable.item_clicked));
                second.setBackground(getDrawable(R.drawable.item));
                third.setBackground(getDrawable(R.drawable.item));
                continu.setAlpha(1);
                cancel.setAlpha(1);
                continu.startAnimation(fade);
                cancel.startAnimation(fade);
                break;

            case R.id.second_item :
                second.setBackground(getDrawable(R.drawable.item_clicked));
                first.setBackground(getDrawable(R.drawable.item));
                third.setBackground(getDrawable(R.drawable.item));
                continu.setAlpha(1);
                cancel.setAlpha(1);
                continu.startAnimation(fade);
                cancel.startAnimation(fade);
                break;

            case R.id.third_item :
                third.setBackground(getDrawable(R.drawable.item_clicked));
                second.setBackground(getDrawable(R.drawable.item));
                first.setBackground(getDrawable(R.drawable.item));
                continu.setAlpha(1);
                cancel.setAlpha(1);
                continu.startAnimation(fade);
                cancel.startAnimation(fade);
             default:
                 return;
        }
    }

}
