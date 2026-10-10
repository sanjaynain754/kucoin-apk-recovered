package com.kubi.sdk.widget.loading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import com.kubi.sdk.R$drawable;
import com.kubi.sdk.R$id;
import com.kubi.sdk.R$layout;
import com.kubi.sdk.util.C24277v;
import k10.InterfaceC40863a;

/* JADX INFO: loaded from: classes12.dex */
@Keep
@SuppressLint({"ViewConstructor"})
public class WrapperLoadingView extends FrameLayout implements InterfaceC40863a {
    private View mContentView;
    private View mEmptyView;
    private View mErrorView;
    private View mLoadingView;
    private static int LOADING_LAYOUT = R$layout.view_loading;
    private static int ERROR_LAYOUT = R$layout.view_fail;
    private static int EMPTY_LAYOUT = R$layout.view_empty;

    @Override // k10.InterfaceC40863a
    public void showEmpty(@StringRes int i11, @DrawableRes int i12, View.OnClickListener onClickListener) {
        showEmpty(i11 != 0 ? getResources().getString(i11) : null, i12, onClickListener);
    }

    @Override // k10.InterfaceC40863a
    public void showError(@StringRes int i11, View.OnClickListener onClickListener) {
        if (i11 != 0) {
            showError(getResources().getString(i11), onClickListener);
        } else {
            showError((CharSequence) null, onClickListener);
        }
    }

    @Override // k10.InterfaceC40863a
    public void showLoading() {
        showLoading(17);
    }

    public View getEmptyView() {
        return this.mEmptyView;
    }

    public int getStatus() {
        if (this.mLoadingView.getVisibility() == 0) {
            return 0;
        }
        if (this.mContentView.getVisibility() == 0) {
            return 1;
        }
        if (this.mEmptyView.getVisibility() == 0) {
            return 2;
        }
        return this.mErrorView.getVisibility() == 0 ? 3 : 1;
    }

    @Override // k10.InterfaceC40863a
    public void showContent() {
        this.mContentView.setVisibility(0);
        this.mLoadingView.setVisibility(8);
        View viewFindViewById = this.mLoadingView.findViewById(R$id.iv_loading);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.mErrorView.setVisibility(8);
        this.mEmptyView.setVisibility(8);
    }

    @Override // k10.InterfaceC40863a
    public void showEmpty(CharSequence charSequence, @DrawableRes int i11, View.OnClickListener onClickListener) {
        View view = this.mEmptyView;
        int i12 = R$id.empty_icon;
        view.findViewById(i12).setOnClickListener(onClickListener);
        View view2 = this.mEmptyView;
        int i13 = R$id.empty_tips;
        view2.findViewById(i13).setOnClickListener(onClickListener);
        TextView textView = (TextView) this.mEmptyView.findViewById(i13);
        if (charSequence != null) {
            textView.setText(charSequence);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(4);
        }
        ImageView imageView = (ImageView) this.mEmptyView.findViewById(i12);
        if (i11 != 0) {
            imageView.setImageResource(i11);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        this.mContentView.setVisibility(8);
        this.mLoadingView.setVisibility(8);
        this.mLoadingView.findViewById(R$id.iv_loading).setVisibility(8);
        this.mErrorView.setVisibility(8);
        this.mEmptyView.setVisibility(0);
    }

    public void showLoading(int i11) {
        showLoading(i11, 0);
    }

    public WrapperLoadingView(@NonNull Context context, View view) {
        super(context);
        if (view.getLayoutParams() != null) {
            setLayoutParams(view.getLayoutParams());
        }
        this.mContentView = view;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.mLoadingView = layoutInflaterFrom.inflate(LOADING_LAYOUT, (ViewGroup) null);
        this.mErrorView = layoutInflaterFrom.inflate(ERROR_LAYOUT, (ViewGroup) null);
        this.mEmptyView = layoutInflaterFrom.inflate(EMPTY_LAYOUT, (ViewGroup) null);
        addView(this.mLoadingView);
        addView(this.mErrorView);
        addView(this.mEmptyView);
        addView(this.mContentView, new FrameLayout.LayoutParams(-1, -1));
        showContent();
    }

    public static WrapperLoadingView injectView(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(view);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            viewGroup.removeView(view);
            WrapperLoadingView wrapperLoadingView = new WrapperLoadingView(view.getContext(), view);
            viewGroup.addView(wrapperLoadingView, iIndexOfChild, layoutParams);
            return wrapperLoadingView;
        }
        throw new RuntimeException("targetView must be child of viewGroup");
    }

    public void showError(CharSequence charSequence, View.OnClickListener onClickListener) {
        showError(charSequence, 0, onClickListener);
    }

    public void showLoading(int i11, int i12) {
        View view = this.mLoadingView;
        if (view instanceof LinearLayout) {
            ((LinearLayout) view).setGravity(i11);
        }
        this.mContentView.setVisibility(8);
        this.mLoadingView.setBackgroundColor(i12);
        this.mLoadingView.setVisibility(0);
        View view2 = this.mLoadingView;
        int i13 = R$id.iv_loading;
        view2.findViewById(i13).setVisibility(0);
        C24277v.m58539d(getContext(), R$drawable.kc_loading, (ImageView) this.mLoadingView.findViewById(i13));
        this.mErrorView.setVisibility(8);
        this.mEmptyView.setVisibility(8);
    }

    public void showError(CharSequence charSequence, int i11, View.OnClickListener onClickListener) {
        TextView textView = (TextView) this.mErrorView.findViewById(R$id.fail_tips);
        if (!TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
        } else {
            textView.setVisibility(4);
        }
        if (i11 != 0) {
            textView.setTextColor(i11);
        }
        this.mContentView.setVisibility(8);
        this.mLoadingView.setVisibility(8);
        this.mLoadingView.findViewById(R$id.iv_loading).setVisibility(8);
        this.mEmptyView.setVisibility(8);
        this.mErrorView.setVisibility(0);
        this.mErrorView.setOnClickListener(onClickListener);
    }
}
