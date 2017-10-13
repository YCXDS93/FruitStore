package com.bwie.fruitsstore.home.view.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.home.model.bean.HomeBean;
import com.bwie.fruitsstore.home.view.adapter.HomeListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：王兵洋  2017/8/5 13:41
 * 类的用途：
 */
public class HomeFragment extends Fragment {

    private RecyclerView mRcy;
    private HomeListAdapter mAdapter;
    private LinearLayoutManager linearLayoutManager;
    private List<HomeBean> homeList = new ArrayList<>();

    //热带水果狂欢
    private List<HomeBean.FirstBean> firstBeen = new ArrayList<>();
    private int[] firstImage = new int[]{R.drawable.lanmei, R.drawable.mangguo, R.drawable.mihoutao,
            R.drawable.boluo, R.drawable.xiyou, R.drawable.liulian, R.drawable.huolongguo, R.drawable.xibeihongti};
    private String[] firstName = new String[]{"蓝莓", "芒果", "猕猴桃", "菠萝", "西柚", "榴莲", "火龙果", "宝石红提"};
    //当季时令爆款
    private List<HomeBean.SecondBean> secondBeen = new ArrayList<>();
    private int[] secondImage = new int[]{R.drawable.shandongdapingguo, R.drawable.taiwanfengli, R.drawable.baxiniuyouguo,
            R.drawable.xibeihongti, R.drawable.baoshihongti, R.drawable.lanmei};
    private String[] secondName = new String[]{"山东大苹果", "台湾凤梨", "巴西牛油果", "宝石红提", "东南亚蜜桔", "蓝莓"};
    //精品为你推荐
    private List<HomeBean.ThirdBean> thirdBeen = new ArrayList<>();
    private int[] thirdImage = new int[]{R.drawable.shandongdapingguo, R.drawable.taiwanfengli, R.drawable.baxiniuyouguo,
            R.drawable.xibeihongti, R.drawable.baoshihongti, R.drawable.lanmei};
    private String[] thirdName = new String[]{"山东大苹果", "台湾凤梨", "巴西牛油果", "宝石红提", "东南亚蜜桔", "蓝莓"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_home, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
    }

    private void initView() {
        linearLayoutManager = new LinearLayoutManager(getActivity());
        mRcy = (RecyclerView) getView().findViewById(R.id.rcy);
        mRcy.setLayoutManager(linearLayoutManager);

        HomeBean homeBean = new HomeBean();
        homeBean.setBanImage(R.drawable.banner);
        homeList.add(homeBean);
        for (int i = 0; i < firstImage.length; i++) {
            HomeBean.FirstBean first = new HomeBean.FirstBean();
            first.setFirstImage(firstImage[i]);
            first.setFirstName(firstName[i]);
            firstBeen.add(first);
        }
        for (int i = 0; i < secondImage.length; i++) {
            HomeBean.SecondBean second = new HomeBean.SecondBean();
            second.setSecondImage(secondImage[i]);
            second.setSecondName(secondName[i]);
            second.setSecondPrice("￥10.8/kg");
            secondBeen.add(second);
        }
        for (int i = 0; i < thirdImage.length; i++) {
            HomeBean.ThirdBean third = new HomeBean.ThirdBean();
            third.setThirdImage(thirdImage[i]);
            third.setThirdName(thirdName[i]);
            thirdBeen.add(third);
        }

        mAdapter = new HomeListAdapter(getActivity(), firstBeen, secondBeen, homeList, thirdBeen);
        mRcy.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();
    }

    private void initData() {
        int itemCount = 0;
        if (homeList != null) {
//            ++itemCount;
//            mAdapter.viewTypeList.add(HomeListAdapter.TYPE_INPUT);
            if (homeList != null && homeList.size() > 0) {
                ++itemCount;
                mAdapter.viewTypeList.add(HomeListAdapter.TYPE_BANNER);
            }
            if (firstBeen != null && firstBeen.size() > 0) {
                ++itemCount;
                mAdapter.viewTypeList.add(HomeListAdapter.TYPE_FIRST);
            }
            if (secondBeen != null && secondBeen.size() > 0) {
                ++itemCount;
                mAdapter.viewTypeList.add(HomeListAdapter.TYPE_SECOND);
            }
            if (thirdBeen != null && thirdBeen.size() > 0) {
                ++itemCount;
                mAdapter.viewTypeList.add(HomeListAdapter.TYPE_THIRD);
            }
        }

    }
}