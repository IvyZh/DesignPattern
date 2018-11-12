package com.ivyzh.designpatterndemo.d2_builder_pattern.activities.navigationbar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import com.ivyzh.designpatterndemo.R;

/**
 * Created by Ivy on 2018/11/12.
 */

public class DefaultNavigationBar extends AbsNavigationBar<DefaultNavigationBar.Builder> {
    protected DefaultNavigationBar(Builder builder) {
        super(builder);
    }


    @Override
    public void bindParams() {
        super.bindParams();
        //findViewById(R.id.tv_left).setVisibility(getBuilder().mLeftVisible);//使用泛型解决报错问题
        findViewById(R.id.tv_left).setVisibility(getBuilder().mLeftVisible);
    }

    public static class Builder extends AbsNavigationBar.Builder<DefaultNavigationBar.Builder> {

        int mLeftVisible = View.VISIBLE;

        public Builder(Context context, ViewGroup parent) {
            super(context, R.layout.layout_default_title, parent);
        }

        @Override
        public AbsNavigationBar build() {
            return new DefaultNavigationBar(this);
        }

        public Builder setTitle(String title) {
            setText(R.id.tv_title, title);
            return this;
        }

        public Builder setLeftText(String title) {
            setText(R.id.tv_left, title);
            return this;
        }

        public Builder setRightText(String title) {
            setText(R.id.tv_right, title);
            return this;
        }

        public Builder setRightListener(View.OnClickListener listener) {
            setOnClickListener(R.id.tv_right, listener);
            return this;
        }

        public Builder hideLeftText() {
            mLeftVisible = View.INVISIBLE;
            return this;
        }
    }

}
