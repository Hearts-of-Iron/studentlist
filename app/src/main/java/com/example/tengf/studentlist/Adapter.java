package com.example.tengf.studentlist;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
/**
 * Created by tengf on 2016/12/2.
 */

class Adapter extends RecyclerView.Adapter<Adapter.MyHolder> {

    private int count;

    Adapter(int count) {
        this.count = count;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.mTextView.setText(String.valueOf(position));
    }

    @Override
    public int getItemCount() {
        return count;
    }

    class MyHolder extends RecyclerView.ViewHolder {

        TextView mTextView;

        MyHolder(View itemView) {
            super(itemView);
            mTextView = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
