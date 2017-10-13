package com.bwie.fruitsstore.home.view.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.home.model.bean.ClassifShoppBean;
import com.bwie.fruitsstore.home.view.activity.LoginActivity;
import com.bwie.fruitsstore.home.view.adapter.ClassifShoppListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：胡计强  2017/8/5 13:41
 * 类的用途：购物车
 */
public class ShoppingFragment extends Fragment {

    private TextView edit;//编辑控件
    private CheckBox checkBox;//全选按钮
    private Button button;//结算按钮
    private ListView listView;
    private ImageView imageView_waitup;
    private List<ClassifShoppBean> list;
    private ClassifShoppListAdapter adapter;//适配器
    private int checkNum;//结算商品总数
    private View view;
    private TextView shoppingcart;
    private int CountPrice;//选中商品总价格
    private TextView price;//选中价格控件
    private boolean state = true;
    private boolean flag = false;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = View.inflate(getContext(), R.layout.fragment_shopping, null);
        list = new ArrayList<>();
        initData();
        initView();
        if (list.size() == 0) {
            imageView_waitup.setVisibility(View.VISIBLE);
            listView.setVisibility(View.GONE);
        } else {
            //   imageView_waitup.setVisibility(View.GONE);
            listView.setVisibility(View.VISIBLE);
        }
        return view;
    }

    private void initView() {
        //寻找控件
        shoppingcart = view.findViewById(R.id.shoppingcart);
        edit = view.findViewById(R.id.edit);
        price = view.findViewById(R.id.price);
        listView = view.findViewById(R.id.shopping_listview);
        checkBox = view.findViewById(R.id.check_all);
        button = view.findViewById(R.id.settleaccounts);
        imageView_waitup = view.findViewById(R.id.wait);
        //寻找适配器设置给listview
        adapter = new ClassifShoppListAdapter(list, getActivity());
        listView.setAdapter(adapter);
        //标题实现购物车总商品数量
        shoppingcart.setText("购物车(" + list.size() + ")");
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iIntent();
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                iIntent();
            }
        });
        //点击全选
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    CountPrice = 0;
                    checkNum = list.size();
                    for (int i = 0; i < list.size(); i++) {
                        CountPrice += Integer.parseInt(list.get(i).getPrice());
                        ClassifShoppListAdapter.getIsChecked().put(i, true);
                    }
                    flag = true;
                    checkNum = list.size();
                } else {
                    CountPrice = 0;
                    checkNum = 0;
                    for (int i = 0; i < list.size(); i++) {
                        ClassifShoppListAdapter.getIsChecked().put(i, false);
                    }
                    flag = false;
                }
                dataChanged();
            }
        });
        // 绑定listView的监听器
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                    long arg3) {
                // 取得ViewHolder对象，这样就省去了通过层层的findViewById去实例化我们需要的cb实例的步骤
                ClassifShoppListAdapter.viewHolder holder = (ClassifShoppListAdapter.viewHolder) arg1.getTag();
                // 改变CheckBox的状态
                holder.check_box.toggle();
                // 将CheckBox的选中状况记录下来
                ClassifShoppListAdapter.getIsChecked().put(arg2, holder.check_box.isChecked());
                // 调整选定条目
                if (holder.check_box.isChecked() == true) {
                    CountPrice += Integer.parseInt(list.get(arg2).getPrice());
                    checkNum++;
                } else {
                    CountPrice -= Integer.parseInt(list.get(arg2).getPrice());
                    checkNum--;
                }
                if (checkNum == list.size() - 1 && flag) {
                    state = false;
                    // checkBox.setChecked(false);
                    flag = false;
                } else if (checkNum == list.size() && !flag) {
                    state = true;
                    checkBox.setChecked(true);
                    flag = true;
                }
                // state = true;
                // 用TextView显示
                price.setText(CountPrice + "");
                button.setText("结算(" + checkNum + ")");
            }
        });
    }

    private void dataChanged() {
        // 通知listView刷新
        adapter.notifyDataSetChanged();
        // TextView显示最新的选中数目
        button.setText("结算(" + checkNum + ")");
        price.setText(CountPrice + "");
    }

    private void initData() {
        for (int i = 0; i < 15; i++) {
            ClassifShoppBean bean = new ClassifShoppBean();
            bean.setName("物品" + i);
            bean.setPrice("1" + i);
            list.add(bean);
        }
    }

    public void iIntent() {
        //跳转登录界面
        startActivity(new Intent(getActivity(), LoginActivity.class));
    }
}
