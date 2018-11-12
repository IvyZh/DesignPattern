package com.ivyzh.designpatterndemo.d2_builder_pattern.activities.navigationbar;

import android.content.Context;
import android.view.ViewGroup;

/**
 * Created by Ivy on 2018/11/12.
 */

public class MyNavigationBar extends AbsNavigationBar {

    protected MyNavigationBar(AbsNavigationBar.Builder builder) {
        super(builder);
    }

    public static class Builder extends AbsNavigationBar.Builder<MyNavigationBar.Builder> {

        public Builder(Context context, int layoutId, ViewGroup parent) {
            super(context, layoutId, parent);
        }

        @Override
        public AbsNavigationBar build() {
            return new MyNavigationBar(this);
        }
    }

}
