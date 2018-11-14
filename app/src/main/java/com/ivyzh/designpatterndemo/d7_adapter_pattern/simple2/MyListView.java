package com.ivyzh.designpatterndemo.d7_adapter_pattern.simple2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * 自己写一个Listview
 */

public class MyListView extends ScrollView {

    LinearLayout mContainer;
    private MyListAdapter mAdapter;

    public MyListView(Context context) {
        this(context, null);
    }

    public MyListView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        mContainer = new LinearLayout(context);
        mContainer.setOrientation(LinearLayout.VERTICAL);
        addView(mContainer, 0);
    }

    @Override
    public void addView(View child) {
        mContainer.addView(child);
    }

    public <T> void setAdapter(MyListAdapter<T> adapter) {
        mAdapter = adapter;
        for (int i = 0; i < mAdapter.getCount(); i++) {
            View view = mAdapter.getView(i, mContainer);
            addView(view);
        }
    }
}
