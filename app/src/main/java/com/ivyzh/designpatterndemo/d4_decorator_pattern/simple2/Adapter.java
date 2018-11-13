package com.ivyzh.designpatterndemo.d4_decorator_pattern.simple2;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ivyzh.designpatterndemo.R;

import java.util.List;

/**
 * Created by Ivy on 2018/11/12.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {


    private List<String> mDatas;

    public Adapter(List<String> data) {
        this.mDatas = data;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        Log.d("TAG", "onBindViewHolder:" + position);

        holder.mTextView.setText(mDatas.get(position));
        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "onClick :" + position);
                mDatas.remove(position);
                notifyDataSetChanged();
            }
        });

    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView mTextView;

        public ViewHolder(View v) {
            super(v);
            mTextView = v.findViewById(R.id.tv_title);
        }
    }
}
