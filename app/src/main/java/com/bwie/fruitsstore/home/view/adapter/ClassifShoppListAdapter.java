package com.bwie.fruitsstore.home.view.adapter;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.home.model.bean.ClassifShoppBean;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ${hujiqiang} on 2017/08/09.
 */

public class ClassifShoppListAdapter extends BaseAdapter {
    private List<ClassifShoppBean> list;
    private static HashMap<Integer, Boolean> isChecked;
    private Context context;

    public ClassifShoppListAdapter(List<ClassifShoppBean> list, Context context) {
        this.list = list;
        this.context = context;
        isChecked = new HashMap<Integer, Boolean>();
        initDate();
    }

    // 初始化isSelected的数据
    private void initDate() {
        for (int i = 0; i < list.size(); i++) {
            getIsChecked().put(i, false);
        }
    }

    @Override
    public int getCount() {
        return list != null ? list.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return list != null ? list.get(i) : null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        viewHolder holder = null;
        if (view == null) {
            holder = new viewHolder();
            view = View.inflate(context, R.layout.fragment_shopping_item, null);
            holder.tv_intro = view.findViewById(R.id.tv_intro);
            holder.tv_price = view.findViewById(R.id.tv_price);
            holder.check_box = view.findViewById(R.id.check_box);
            view.setTag(holder);
        } else {
            holder = (viewHolder) view.getTag();
        }
        holder.tv_intro.setText(list.get(i).getName());
        holder.tv_price.setText(list.get(i).getPrice());
        holder.check_box.setChecked(getIsChecked().get(i));
        return view;
    }

    public static HashMap<Integer, Boolean> getIsChecked() {
        return isChecked;
    }

    public static void setIsSelected(HashMap<Integer, Boolean> isChecked) {
        ClassifShoppListAdapter.isChecked = isChecked;
    }

    public static class viewHolder {
        TextView tv_intro;
        TextView tv_price;
        public CheckBox check_box;
    }
}
