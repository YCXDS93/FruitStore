package com.bwie.fruitsstore.home.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.home.model.bean.ClassifyFirstResponse;

import java.util.List;

/**
 * 类用途 :分类二级列表适配展示数据
 * 作者 : 郁文涛
 * 时间 : 2017/8/8 15:15
 */

public class ClassifySecondListAdapter extends RecyclerView.Adapter implements View.OnLongClickListener, View.OnClickListener {
    private Context context;
    private List<ClassifyFirstResponse.GoodsListBean> list;
    public OnRecyclerViewItemClickListener mOnItemClickListener = null;//点击
    public OnRecyclerViewLongItemClickListener mOnLongItemClickListener = null;//长按

    public void setOnItemClickListener(OnRecyclerViewItemClickListener listener) {
        this.mOnItemClickListener = listener;
    }

    public void setOnLongItemClickListener(OnRecyclerViewLongItemClickListener listener) {
        this.mOnLongItemClickListener = listener;
    }

    public ClassifySecondListAdapter(Context context, List<ClassifyFirstResponse.GoodsListBean> list) {
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

        private final TextView textName;
        private final TextView textPrice;
        private final ImageView imageThumb;

        public MyViewHolder(View itemView) {
            super(itemView);
            textName = (TextView) itemView.findViewById(R.id.text_item_classify_secondlist_goodsname);
            textPrice = (TextView) itemView.findViewById(R.id.text_item_classify_secondlist_price);
            imageThumb = (ImageView) itemView.findViewById(R.id.image_item_classify_secondlist);
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = parent.inflate(context, R.layout.item_recyclerview_classifysecond, null);
        MyViewHolder holder = new MyViewHolder(inflate);
        inflate.setOnClickListener(this);
        inflate.setOnLongClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {
        MyViewHolder vh = (MyViewHolder) holder;
        vh.textName.setText(list.get(position).goods_name);
        vh.textPrice.setText("￥" + list.get(position).market_price);
        Glide.with(context).load(list.get(position).thumb_url).into(vh.imageThumb);
        holder.itemView.setTag(position);
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : list.size();
    }

    //条目长按监听
    public interface OnRecyclerViewLongItemClickListener {
        void onLongItemClick(View view, int position);
    }

    //条目点击事件
    public interface OnRecyclerViewItemClickListener {
        void onItemClick(View view, int position);
    }
}
