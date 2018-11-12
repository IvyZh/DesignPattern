package com.ivyzh.designpatterndemo.d2_builder_pattern.activities.navigationbar;

/**
 * Created by Ivy on 2018/11/12.
 */

public interface INavigation {

    void inflateView();

    void addToRootView();

    void bindParams();
}
