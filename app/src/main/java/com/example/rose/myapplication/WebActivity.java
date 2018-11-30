package com.example.rose.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class WebActivity extends AppCompatActivity {

    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        initView();
        iv.setScaleType(ImageView.ScaleType.FIT_XY);
        //两秒钟进入主界面
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(WebActivity.this, MainActivity.class));
                finish();
            }
        }, 4000);
    }

    private void initView() {
        iv = (ImageView) findViewById(R.id.iv);
    }
}
