package com.subodh.rathaur.custom_textview_android_master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvFirst, tvSecond, tvThird, tvFourth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvFirst=findViewById(R.id.tv_first);
        tvSecond=findViewById(R.id.tv_second);
        tvThird=findViewById(R.id.tv_third);
        tvFourth=findViewById(R.id.tv_fourth);

        setFontType(tvFirst,tvSecond,tvThird,tvFourth);
    }

    private void setFontType(TextView tvFirst, TextView tvSecond, TextView tvThird, TextView tvFourth) {


    }
}
