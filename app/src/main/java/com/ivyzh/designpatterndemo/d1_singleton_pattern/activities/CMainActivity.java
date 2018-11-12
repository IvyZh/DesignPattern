package com.ivyzh.designpatterndemo.d1_singleton_pattern.activities;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.ivyzh.designpatterndemo.R;

public class CMainActivity extends BaseActivity {
    @Override
    protected int getContentView() {
        return R.layout.activity_cmain;
    }

    public void click(View v) {
        ActivityManager.getInstance().finish(this);
        ActivityManager.getInstance().finish(BMainActivity.class);
    }

    public void exit(View v) {
        ActivityManager.getInstance().exitApp();
    }
}
