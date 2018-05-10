package com.qun.test.toolbarslideanimdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StatusBarUtil.setStatusBarTransparent(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle("滑动改变Toolbar透明度");//设置主标题
        mToolbar.setSubtitle("子标题");//设置子标题
        mToolbar.getBackground().mutate().setAlpha(0);
        setSupportActionBar(mToolbar);
        MyScrollView scrollView = findViewById(R.id.scrollView);
        scrollView.setOnScrollListener(new MyScrollView.OnScrollListener() {
            @Override
            public void onScroll(ScrollView scrollView, int l, int t, int oldl, int oldt) {
                Log.e("weiqun12345", "l=" + l + ",t=" + t + ",oldl=" + oldl + ",oldt=" + oldt);
                if (t <= 255)
                    mToolbar.getBackground().setAlpha(t);
            }
        });
        Toolbar mToolbar2 = findViewById(R.id.toolbar2);
        mToolbar2.setTitle("滑动改变Toolbar透明度222222222");//设置主标题
    }
}
