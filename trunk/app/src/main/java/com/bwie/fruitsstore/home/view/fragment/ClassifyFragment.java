package com.bwie.fruitsstore.home.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.RecyclerViewDivider;
import com.bwie.fruitsstore.home.model.bean.ClassifyFirstResponse;
import com.bwie.fruitsstore.home.presenter.HomePresenter;
import com.bwie.fruitsstore.home.view.adapter.ClassifyFirstListAdapter;
import com.bwie.fruitsstore.home.view.adapter.ClassifySecondListAdapter;
import com.bwie.fruitsstore.home.view.iview.IClassifySecond;
import com.bwie.fruitsstore.home.view.iview.IConfigView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * 分类fragment
 * 作者：王兵洋  2017/8/5 13:41
 * 类的用途：
 */
public class ClassifyFragment extends Fragment implements IConfigView<ClassifyFirstResponse>, IClassifySecond<ClassifyFirstResponse> {

    @BindView(R.id.recyclerview_classify_first)
    RecyclerView recyclerviewClassifyFirst;
    Unbinder unbinder;
    @BindView(R.id.progressbar_classify_fragment)
    ProgressBar progressbarClassifyFragment;
    @BindView(R.id.recyclerview_classify_second)
    RecyclerView recyclerviewClassifySecond;
    private HomePresenter homePresenter;
    private ClassifyFirstListAdapter adapter;
    private ClassifySecondListAdapter secondAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = View.inflate(getContext(), R.layout.fragment_classify, null);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initView();
        initData();
    }

    private void initView() {
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        LinearLayoutManager managers = new LinearLayoutManager(getActivity());
        recyclerviewClassifyFirst.setLayoutManager(manager);
        recyclerviewClassifySecond.setLayoutManager(managers);

        recyclerviewClassifyFirst.addItemDecoration(new RecyclerViewDivider
                (getActivity(), LinearLayoutManager.HORIZONTAL, 4,
                        ContextCompat.getColor(getActivity(), R.color.gray_cc)));
        recyclerviewClassifySecond.addItemDecoration(new RecyclerViewDivider
                (getActivity(), LinearLayoutManager.HORIZONTAL, 4,
                        ContextCompat.getColor(getActivity(), R.color.white)));
    }

    private void initData() {
        homePresenter = new HomePresenter(this, 1, 1, 20, 0);
        homePresenter.start();
    }

    @Override
    public void showOrHidePregress(boolean flag) {
        if (flag && progressbarClassifyFragment != null) {
            progressbarClassifyFragment.setVisibility(View.VISIBLE);
        } else {
            if (progressbarClassifyFragment != null) {
                progressbarClassifyFragment.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void showOrHideErrorView(boolean flag) {

    }

    @Override
    public void refreshView(final ClassifyFirstResponse classifyFirstResponse) {
        if (adapter == null) {
            adapter = new ClassifyFirstListAdapter(getActivity(), classifyFirstResponse.opt_infos);
            recyclerviewClassifyFirst.setAdapter(adapter);
        } else {
            adapter.notifyDataSetChanged();
        }
        loadData(classifyFirstResponse.opt_infos.get(0).id);
        //一级列表点击展示二级列表数据
        adapter.setOnItemClickListener(new ClassifyFirstListAdapter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                if (position == 0) {
//                    loadData(classifyFirstResponse.opt_infos.get(8).id);
                }
                if (position == 10) {
                    loadData(classifyFirstResponse.opt_infos.get(17).id);
                }
                if (position == 18) {
                    loadData(classifyFirstResponse.opt_infos.get(11).id);
                } else {
                    loadData(classifyFirstResponse.opt_infos.get(position).id);
                }
            }
        });
    }

    private void loadData(int id) {
        homePresenter = new HomePresenter(this);
        homePresenter.initDatas(1, id, 20, 0);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
        if (homePresenter != null) {
            homePresenter.detachView();
        }
    }

    @Override
    public void refreshViews(ClassifyFirstResponse classifyFirstResponse) {
        classifyFirstResponse.toString();
        if (classifyFirstResponse != null) {

            secondAdapter = new ClassifySecondListAdapter(getActivity(), classifyFirstResponse.goods_list);
            recyclerviewClassifySecond.setAdapter(secondAdapter);

        }
    }
}
