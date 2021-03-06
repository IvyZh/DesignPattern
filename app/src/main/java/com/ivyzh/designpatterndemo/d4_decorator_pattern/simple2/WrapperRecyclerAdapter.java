package com.ivyzh.designpatterndemo.d4_decorator_pattern.simple2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Ivy on 2018/11/12.
 */

public class WrapperRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private RecyclerView.Adapter mRecyclerAdapter;//原始的Adapter，不具有添加header和footer
    ArrayList<View> mHeaderViews;
    ArrayList<View> mFooterViews;

    public WrapperRecyclerAdapter(RecyclerView.Adapter adapter) {
        this.mRecyclerAdapter = adapter;
        mHeaderViews = new ArrayList<>();
        mFooterViews = new ArrayList<>();
        mRecyclerAdapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            @Override
            public void onChanged() {
                notifyDataSetChanged();
            }
        });
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int postion) {
        Log.e("TAG", "onCreateViewHolder " + postion);
        if (postion < mHeaderViews.size()) {
            Log.e("TAG", "add header view");
            View headerView = mHeaderViews.get(postion);
            return createHeaderView(headerView);
        }

        int itemCount = mRecyclerAdapter.getItemCount();
        int adjPos = postion - mHeaderViews.size();
        if (adjPos < itemCount) {
            Log.e("TAG", "add item view");
            return mRecyclerAdapter.onCreateViewHolder(parent, mRecyclerAdapter.getItemViewType(adjPos));
        }
        Log.e("TAG", "add footer view");
        // footerview
        View footerView = mFooterViews.get(postion - itemCount - mHeaderViews.size());
        return createHeaderView(footerView);
    }

    private RecyclerView.ViewHolder createHeaderView(View view) {
        return new RecyclerView.ViewHolder(view) {
        };
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Log.d("TAG", "Wrapper RecyclerAdapter onBindViewHolder:" + position);

        if (position < mHeaderViews.size()) {
            return;
        }

        int adjPos = position - mHeaderViews.size();
        if (adjPos < mRecyclerAdapter.getItemCount()) {
            mRecyclerAdapter.onBindViewHolder(holder, adjPos);
            //mRecyclerAdapter.onBindViewHolder(holder, adjPos);
        } else {
            Log.d("TAG", "adjPos getItemCount." + adjPos + "  " + mRecyclerAdapter.getItemCount());
            //fix footer view.

        }


    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mRecyclerAdapter.getItemCount() + mHeaderViews.size() + mFooterViews.size();
    }

    // 添加头部
    public void addHeaderView(View v) {
        if (!mHeaderViews.contains(v)) {
            mHeaderViews.add(v);
            notifyDataSetChanged();
        }
    }

    public void removeHeaderView(View v) {
        if (mHeaderViews.contains(v)) {
            mHeaderViews.remove(v);
            notifyDataSetChanged();
        }
    }

    // 添加尾部
    public void addFooterView(View v) {
        if (!mFooterViews.contains(v)) {
            mFooterViews.add(v);
            notifyDataSetChanged();
        }
    }

    public void removeFooterView(View v) {
        if (mFooterViews.contains(v)) {
            mFooterViews.remove(v);
            notifyDataSetChanged();
        }
    }
}
