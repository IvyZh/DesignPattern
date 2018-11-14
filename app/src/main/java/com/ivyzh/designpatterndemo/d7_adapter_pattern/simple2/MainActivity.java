package com.ivyzh.designpatterndemo.d7_adapter_pattern.simple2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ivyzh.designpatterndemo.R;

import java.util.ArrayList;

/**
 * Created by Ivy on 2018/11/12.
 */

public class MainActivity extends AppCompatActivity {


    MyListView mListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        mListView = findViewById(R.id.listview);

        /*for (int i = 0; i < 50; i++) {
            TextView textView = new TextView(this);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
            textView.setLayoutParams(params);
            textView.setGravity(Gravity.CENTER);
            textView.setText("data " + i);
            mListView.addView(textView);
        }*/

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            list.add("mylistview data " + i);

        }
        MyListAdapter<String> adapter = new MyListAdapter<>(this, list, R.layout.item_textview);
        mListView.setAdapter(adapter);
    }


}
