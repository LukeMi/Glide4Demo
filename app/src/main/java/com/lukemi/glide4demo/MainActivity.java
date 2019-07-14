package com.lukemi.glide4demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private String url1 = "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/topnav/bdbri_72.png";

    private ImageView mIv;

    private ImageView mIvRound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIv = findViewById(R.id.iv);
        mIvRound = findViewById(R.id.iv_round);
        findViewById(R.id.btn_load).setOnClickListener(this::onClick);
        findViewById(R.id.btn_dont_animation).setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_load:
                GlideUtil.load(this, url1, mIv);
                break;
            case R.id.btn_dont_animation:
                GlideUtil.load(this, url1, mIvRound);
                break;
            default:
                break;
        }
    }

}
