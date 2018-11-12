package com.ivyzh.designpatterndemo.d1_singleton_pattern.activities;

import android.app.Activity;
import android.util.Log;

import java.util.Stack;

/**
 * Created by Ivy on 2018/11/12.
 */

public class ActivityManager {
    String TAG = "ActivityManager";
    private static volatile ActivityManager mInstance;
    private Stack<Activity> mActivities;

    private ActivityManager() {
        mActivities = new Stack<>();
    }

    public static ActivityManager getInstance() {
        if (mInstance == null) {
            synchronized (ActivityManager.class) {
                if (mInstance == null) {
                    mInstance = new ActivityManager();
                }
            }
        }
        return mInstance;
    }

    // 添加Activity
    public void attach(Activity activity) {
        Log.d(TAG, "attach " + activity);
        mActivities.add(activity);
    }

    // 移除Activity
    /*public void detach(Activity target) {
        for (Activity activity : mActivities) {
            if (activity == target) {
                Log.d(TAG, "detach " + activity);
                mActivities.remove(target);//todo 一边循环一边移除是有问题的
            }
        }
    }*/
    // 移除Activity-修改版
    public void detach(Activity target) {
        int size = mActivities.size();
        for (int i = 0; i < size; i++) {
            Activity activity = mActivities.get(i);
            if (activity == target) {
                mActivities.remove(i);
                i--;
                size--;
            }
        }
    }


    // 根据Activity关闭Activity
    /*public void finish(Activity target) {
        for (Activity activity : mActivities) {
            if (activity == target) {
                Log.d(TAG, "detach " + activity);
                mActivities.remove(target);//todo 一边循环一边移除是有问题的
                target.finish();
            }
        }
    }*/

    // 根据Activity关闭Activity-修改版
    public void finish(Activity target) {
        Log.d(TAG, "finish canonicalName:" + target.getClass().getCanonicalName());
        int size = mActivities.size();
        for (int i = 0; i < size; i++) {
            Activity activity = mActivities.get(i);
            if (activity == target) {
                mActivities.remove(i);
                target.finish();
                i--;
                size--;
            }
        }
    }

    // 根据Class关闭Activity
    /*public void finish(Class<? extends Activity> targetClass) {
        Log.d(TAG, "finish canonicalName:" + targetClass.getCanonicalName());
        //com.ivyzh.designpatterndemo.d1_singleton_pattern.activities.BMainActivity
        for (Activity activity : mActivities) {
            if (activity.getClass().getCanonicalName().equals(targetClass.getCanonicalName())) {
                mActivities.remove(activity);//todo 一边循环一边移除是有问题的
                activity.finish();
            }
        }
    }*/

    // 根据Class关闭Activity-修改版
    public void finish(Class<? extends Activity> targetClass) {
        Log.d(TAG, "finish canonicalName:" + targetClass.getCanonicalName());
        //com.ivyzh.designpatterndemo.d1_singleton_pattern.activities.BMainActivity
        int size = mActivities.size();
        for (int i = 0; i < size; i++) {
            Activity activity = mActivities.get(i);
            if (activity.getClass().getCanonicalName().equals(targetClass.getCanonicalName())) {
                mActivities.remove(activity);
                activity.finish();
                i--;
                size--;
            }
        }
    }

    // 退出整个应用
    public void exitApp() {
        int size = mActivities.size();
        for (int i = 0; i < size; i++) {
            Activity activity = mActivities.get(i);
            Log.d(TAG, "exitApp canonicalName:" + activity.getClass().getCanonicalName());
            mActivities.remove(i);
            activity.finish();
            i--;
            size--;
        }
    }

    // 获取当前的Activity，用于全局弹出Dialog
    public Activity currentActivity() {
        return mActivities.lastElement();
    }
}
