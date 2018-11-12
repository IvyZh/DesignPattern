package com.ivyzh.designpatterndemo.d1_singleton_pattern.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ivyzh.designpatterndemo.R;

public class AMainActivity extends BaseActivity {


    @Override
    protected int getContentView() {
        return R.layout.activity_amain;
    }

    public void click(View v) {
        Intent intent = new Intent(this, BMainActivity.class);
        startActivity(intent);
    }
}
