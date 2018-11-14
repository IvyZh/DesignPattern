package com.ivyzh.designpatterndemo.d7_adapter_pattern.simple2;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Ivy on 2018/11/14.
 */

public interface AdapterTarget {
    int getCount();

    View getView(int pos, ViewGroup parent);
}
