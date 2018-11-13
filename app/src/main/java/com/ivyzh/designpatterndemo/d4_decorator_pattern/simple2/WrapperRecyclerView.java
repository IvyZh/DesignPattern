package com.ivyzh.designpatterndemo.d4_decorator_pattern.simple2;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Ivy on 2018/11/13.
 */

public class WrapperRecyclerView extends RecyclerView {

    private WrapperRecyclerAdapter mWrapperRecyclerAdapter;

    public WrapperRecyclerView(Context context) {
        super(context);
    }

    public WrapperRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WrapperRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void setAdapter(Adapter adapter) {
        mWrapperRecyclerAdapter = new WrapperRecyclerAdapter(adapter);
        super.setAdapter(mWrapperRecyclerAdapter);
    }

    public void addHeaderView(View view) {
        if (mWrapperRecyclerAdapter != null) {
            mWrapperRecyclerAdapter.addHeaderView(view);
        }
    }

    public void removeHeaderView(View view) {
        if (mWrapperRecyclerAdapter != null) {
            mWrapperRecyclerAdapter.removeHeaderView(view);
        }
    }

    public void addFooterView(View view) {
        if (mWrapperRecyclerAdapter != null) {
            mWrapperRecyclerAdapter.addFooterView(view);
        }
    }

    public void removeFooterView(View view) {
        if (mWrapperRecyclerAdapter != null) {
            mWrapperRecyclerAdapter.removeFooterView(view);
        }
    }
}
