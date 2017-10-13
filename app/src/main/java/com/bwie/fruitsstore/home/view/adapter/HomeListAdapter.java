package com.bwie.fruitsstore.home.view.adapter;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.home.model.bean.HomeBean;

import java.util.ArrayList;
import java.util.List;


/**
 * 作者：王兵洋  2017/8/10 08:07
 * 类的用途：
 */
public class HomeListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context mContext;
    private List<HomeBean> homeList;
    private List<HomeBean.FirstBean> firstBeen;
    private List<HomeBean.SecondBean> secondBeen;
    private List<HomeBean.ThirdBean> thirdBean;
    public List<Integer> viewTypeList = new ArrayList();
    public int itemCount = 0;
//    //分类title.
//    public static final int TYPE_INPUT = 1;
    //最上方的图片
    public static final int TYPE_BANNER = 1;
    //热带水果狂欢
    public static final int TYPE_FIRST = 2;
    //当季时令爆款
    public static final int TYPE_SECOND = 3;
    //
    public static final int TYPE_THIRD = 4;

    public HomeListAdapter(Context mContext, List<HomeBean.FirstBean> firstBeen, List<HomeBean.SecondBean> secondBeen, List<HomeBean> homeList, List<HomeBean.ThirdBean> thirdBean) {
        this.mContext = mContext;
        this.firstBeen = firstBeen;
        this.secondBeen = secondBeen;
        this.homeList = homeList;
        this.thirdBean = thirdBean;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = null;
        RecyclerView.ViewHolder viewHolder = null;
        //根据viewType生成viewHolder
        switch (viewType) {
//            case TYPE_INPUT:
//                     viewHolder = new ViewHolderInput(view);
//                break;
            case TYPE_BANNER:
                view = View.inflate(mContext, R.layout.item_home, null);
                viewHolder = new ViewHolderBanner(view);
                break;
            case TYPE_FIRST:
                view = View.inflate(mContext, R.layout.item1_home, null);
                viewHolder = new ViewHolderFirst(view);
                break;

            case TYPE_SECOND:
                view = View.inflate(mContext, R.layout.item2_home, null);
                viewHolder = new ViewHolderSecond(view);
                break;
            case TYPE_THIRD:
                view = View.inflate(mContext, R.layout.item3_home, null);
                viewHolder = new ViewHolderThird(view);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //根据条目的类型给holder中的控件填充数据
        switch (viewTypeList.get(position)) {
//            case TYPE_INPUT:
//                ViewHolderInput holderInput = (ViewHolderInput) holder;
//                holderInput.editTextTitle.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View view) {
//                        ToastUtils.show("你点击了搜索");
//                    }
//                });
//                break;
            case TYPE_BANNER:
                ViewHolderBanner holderBanner = (ViewHolderBanner) holder;
                holderBanner.banner.setImageResource(homeList.get(0).banImage);
                break;
            case TYPE_FIRST:
                ViewHolderFirst holderFirst = (ViewHolderFirst) holder;
                GridLayoutManager gridLayoutFirstManager = new GridLayoutManager(mContext, 4);
                holderFirst.itemImageFirst.setImageResource(R.drawable.redai);
                holderFirst.itemRecyclerFirst.setLayoutManager(gridLayoutFirstManager);
                holderFirst.itemRecyclerFirst.setAdapter(new ItemFirstRecyclerAdapter(mContext, firstBeen));
                break;
            case TYPE_SECOND:
                ViewHolderSecond holderSecond = (ViewHolderSecond) holder;
                GridLayoutManager gridLayoutSecondManager = new GridLayoutManager(mContext, 3);
                holderSecond.itemImageSecond.setImageResource(R.drawable.dangjishiling);
                holderSecond.itemRecyclerSecond.setLayoutManager(gridLayoutSecondManager);
                holderSecond.itemRecyclerSecond.setAdapter(new ItemSecondRecyclerAdapter(mContext, secondBeen));
                break;
            case TYPE_THIRD:
                ViewHolderThird holderThird = (ViewHolderThird) holder;
                LinearLayoutManager linearLayoutThirdManager = new LinearLayoutManager(mContext);
                holderThird.itemImageThird.setImageResource(R.drawable.jingpin);
                holderThird.itemRecyclerThird.setLayoutManager(linearLayoutThirdManager);
                holderThird.itemRecyclerThird.setAdapter(new ItemThirdRecyclerAdapter(mContext, thirdBean));
                break;
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    @Override
    public int getItemViewType(int position) {
        return viewTypeList.get(position);
    }
//
//    class ViewHolderInput extends RecyclerView.ViewHolder {
//
//        private final EditText editTextTitle;
//        private View item;
//
//        public ViewHolderInput(View itemView) {
//            super(itemView);
//            item = itemView;
//            editTextTitle = (EditText) itemView.findViewById(R.id.edittext_include_title);
//        }
//    }

    class ViewHolderBanner extends RecyclerView.ViewHolder {

        private final ImageView banner;
        private View item;

        public ViewHolderBanner(View itemView) {
            super(itemView);
            item = itemView;
            banner = (ImageView) itemView.findViewById(R.id.img_banner);
        }
    }

    class ViewHolderFirst extends RecyclerView.ViewHolder {
        private final ImageView itemImageFirst;
        private final RecyclerView itemRecyclerFirst;
        private View item;

        public ViewHolderFirst(View itemView) {
            super(itemView);
            item = itemView;
            itemImageFirst = itemView.findViewById(R.id.item_image_first);
            itemRecyclerFirst = itemView.findViewById(R.id.item_recycler_first);
        }
    }

    class ViewHolderSecond extends RecyclerView.ViewHolder {

        private final ImageView itemImageSecond;
        private final RecyclerView itemRecyclerSecond;
        private View item;

        public ViewHolderSecond(View itemView) {
            super(itemView);
            item = itemView;
            itemImageSecond = itemView.findViewById(R.id.item_image_second);
            itemRecyclerSecond = itemView.findViewById(R.id.item_recycler_second);
        }
    }

    class ViewHolderThird extends RecyclerView.ViewHolder {
        private final RecyclerView itemRecyclerThird;
        private View item;
        private final ImageView itemImageThird;

        public ViewHolderThird(View itemView) {
            super(itemView);
            item = itemView;
            itemImageThird = itemView.findViewById(R.id.item_image_third);
            itemRecyclerThird = itemView.findViewById(R.id.item_recycler_third);
        }
    }
}
