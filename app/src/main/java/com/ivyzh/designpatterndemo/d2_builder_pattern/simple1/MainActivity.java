package com.ivyzh.designpatterndemo.d2_builder_pattern.simple1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by Ivy on 2018/11/12.
 */

public class MainActivity extends AppCompatActivity {
    ImageView mImageView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Builder设计模式应用场景1：Glide
        String url = "";
        Glide.with(this)
                .load(url)

                .into(mImageView);

        // Builder设计模式应用场景2：Dialog
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setTitle("标题")
                .setMessage("内容")
                .setNegativeButton("确定", null)
                .setPositiveButton("取消", null)
                .create();
        dialog.show();

    }
}
