package com.bwie.fruitsstore.home.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.home.model.bean.HomeBean;

import java.util.List;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/11 14:33
 */

public class ItemSecondRecyclerAdapter extends RecyclerView.Adapter implements View.OnClickListener, View.OnLongClickListener {

    private Context context;
    private List<HomeBean.SecondBean> list;
    public OnRecyclerViewItemClickListener mOnItemClickListener = null;//点击
    public OnRecyclerViewLongItemClickListener mOnLongItemClickListener = null;//长按

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public void setOnLongItemClickListener(OnRecyclerViewLongItemClickListener listener) {
        this.mOnLongItemClickListener = listener;
    }

    public ItemSecondRecyclerAdapter(Context context, List<HomeBean.SecondBean> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(v, (Integer) v.getTag());
        }
    }

    @Override
    public boolean onLongClick(View v) {
        if (mOnLongItemClickListener != null) {
            mOnLongItemClickListener.onLongItemClick(v, (Integer) v.getTag());
        }
        return true;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private final TextView textView;
        private final TextView textView2;
        private final ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.second_adapter_text1);
            textView2 = (TextView) itemView.findViewById(R.id.second_adapter_text2);
            imageView = (ImageView) itemView.findViewById(R.id.second_adapter_image);
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = View.inflate(context, R.layout.item_second_recycler_adapter, null);
        MyViewHolder holder = new MyViewHolder(inflate);
        inflate.setOnClickListener(this);
        inflate.setOnLongClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MyViewHolder vh = (MyViewHolder) holder;
        vh.textView.setText(list.get(position).secondName);
        vh.textView2.setText(list.get(position).secondPrice);
        vh.imageView.setImageResource(list.get(position).secondImage);
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
       return list != null ? list.size() : 0;
    }

    public interface OnRecyclerViewLongItemClickListener {
        void onLongItemClick(View view, int position);
    }

    public interface OnRecyclerViewItemClickListener {
        void onItemClick(View view, int position);
    }
}
