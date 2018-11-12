package com.ivyzh.designpatterndemo.d2_builder_pattern.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.ivyzh.designpatterndemo.R;
import com.ivyzh.designpatterndemo.d2_builder_pattern.activities.navigationbar.DefaultNavigationBar;
import com.ivyzh.designpatterndemo.d2_builder_pattern.activities.navigationbar.MyNavigationBar;

/**
 * Created by Ivy on 2018/11/12.
 */

public class MainActivity extends AppCompatActivity {
    ViewGroup rootView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_builder);
        rootView = findViewById(R.id.ll_root);

        // 用作演示的NavigationBar
        new MyNavigationBar.Builder(this, R.layout.layout_title, rootView)
                .setText(R.id.tv_title, "首页")
                .setOnClickListener(R.id.tv_left, new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "返回", Toast.LENGTH_LONG).show();
                    }
                })
                .build();

        //默认的NavigationBar
        new DefaultNavigationBar.Builder(this, rootView)
                .setTitle("这是默认标题")
                .setLeftText("返回")
                .setRightText("确认")
                .hideLeftText()
                .setRightListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "确认", Toast.LENGTH_LONG).show();
                    }
                })
                .build();

    }


}
