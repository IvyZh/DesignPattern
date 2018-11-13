package com.ivyzh.designpatterndemo.d4_decorator_pattern.simple2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.view.LayoutInflater;
import android.view.View;

import com.ivyzh.designpatterndemo.R;

import java.util.ArrayList;

/**
 * Created by Ivy on 2018/11/12.
 */

public class MainActivity2 extends AppCompatActivity {

    private WrapperRecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview2);

        ArrayList<String> datas = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            datas.add(" WrapperRecyclerView data " + i);
        }


        recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //设置布局管理器
        recyclerView.setLayoutManager(layoutManager);
        //设置为垂直布局，这也是默认的
        layoutManager.setOrientation(OrientationHelper.VERTICAL);
        //设置Adapter
        Adapter recycleAdapter = new Adapter(datas);
        //WrapperRecyclerAdapter adapter = new WrapperRecyclerAdapter(recycleAdapter);
        recyclerView.setAdapter(recycleAdapter);

        //View headerView = LayoutInflater.from(this).inflate(R.layout.header_view, null);//todo 这样写效果不对
        View headerView = LayoutInflater.from(this).inflate(R.layout.header_view, recyclerView, false);
        View footerView = LayoutInflater.from(this).inflate(R.layout.footer_view, recyclerView, false);

        recyclerView.addHeaderView(headerView);
        recyclerView.addFooterView(footerView);
        //设置分隔线
        //recyclerView.addItemDecoration(new DividerGridItemDecoration(this));
        //设置增加或删除条目的动画
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }


}
