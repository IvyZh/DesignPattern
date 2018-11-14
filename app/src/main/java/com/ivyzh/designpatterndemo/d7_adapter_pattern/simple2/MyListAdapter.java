package com.ivyzh.designpatterndemo.d7_adapter_pattern.simple2;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ivy on 2018/11/14.
 */

public class MyListAdapter<T> implements AdapterTarget {


    private List<T> mDatas;
    private Context mContext;
    private int mLayoutId;

    public MyListAdapter(Context context, List<T> datas, int layoutId) {
        this.mContext = context;
        mDatas = datas;
        mLayoutId = layoutId;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public View getView(int pos, ViewGroup parent) {
        TextView view = (TextView) LayoutInflater.from(mContext).inflate(mLayoutId, parent, false);
        String result = (String) mDatas.get(pos);
        view.setText(result);
        return view;
    }
}
