package com.bwie.fruitsstore.home.view.activity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bwie.fruitsstore.ApiConstans;
import com.bwie.fruitsstore.R;
import com.bwie.fruitsstore.base.BaseActivity;
import com.bwie.fruitsstore.home.model.bean.ClassifyDetailsResponse;
import com.bwie.fruitsstore.home.presenter.HomeDetailsPresent;
import com.bwie.fruitsstore.home.view.iview.IDetailsView;

import butterknife.BindView;

/**
 * 类用途 :
 * 作者 : 郁文涛
 * 时间 : 2017/8/17 9:43
 */

public class ClassifyDetailsActivity extends BaseActivity implements IDetailsView<ClassifyDetailsResponse> {

    @BindView(R.id.image_details)
    ImageView imageDetails;
    @BindView(R.id.shoppingcart)
    TextView shoppingcart;
    @BindView(R.id.textView_details_goodName)
    TextView textViewDetailsGoodName;
    @BindView(R.id.textView_details_price)
    TextView textViewDetailsPrice;
    @BindView(R.id.button_details_shopping)
    Button buttonDetailsShopping;
    @BindView(R.id.text_details_desc)
    TextView textDetailsDesc;
    @BindView(R.id.progressbar_classify_fragment)
    ProgressBar progressbarClassifyFragment;
    @BindView(R.id.layout_include_error)
    LinearLayout layoutIncludeError;
    @BindView(R.id.linear_details)
    LinearLayout linearDetails;
    private String goodId;

    @Override
    public int getLayoutID() {
        return R.layout.activity_classifydetails;
    }

    @Override
    public void initView() {
        Intent intent = getIntent();
        goodId = intent.getStringExtra(ApiConstans.Home.INTENT_CLASSIFY_DETAILS);
    }

    @Override
    public void initData() {
        HomeDetailsPresent present = new HomeDetailsPresent(ClassifyDetailsActivity.this, goodId);
        present.start();
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
        if (flag && layoutIncludeError != null) {
            linearDetails.setVisibility(View.GONE);
            layoutIncludeError.setVisibility(View.VISIBLE);
        } else {
            if (layoutIncludeError != null) {

                linearDetails.setVisibility(View.VISIBLE);
                layoutIncludeError.setVisibility(View.GONE);
            }
        }
    }

    @Override
    public void refreshView(ClassifyDetailsResponse classifyDetailsResponse) {
        Glide.with(ClassifyDetailsActivity.this).load(classifyDetailsResponse.thumb_url).into(imageDetails);
        textViewDetailsGoodName.setText(classifyDetailsResponse.goods_name);
        textViewDetailsPrice.setText("￥" + classifyDetailsResponse.min_group_price + "-" + classifyDetailsResponse.max_group_price);
        textDetailsDesc.setText(classifyDetailsResponse.goods_desc);
    }
}
