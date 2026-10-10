package com.kubi.resources.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.C5275i0;
import com.kubi.sdk.res.R$id;
import com.kubi.sdk.res.R$layout;
import k00.C40850n;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Deprecated
public class NavigationBar extends RelativeLayout {

    /* JADX INFO: renamed from: b */
    public C40850n f43947b;

    /* JADX INFO: renamed from: c */
    public TextView f43948c;

    /* JADX INFO: renamed from: d */
    public TextView f43949d;

    /* JADX INFO: renamed from: e */
    public View.OnClickListener f43950e;

    /* JADX INFO: renamed from: f */
    public View.OnClickListener f43951f;

    public NavigationBar(Context context) {
        super(context);
        m54693d();
    }

    /* JADX INFO: renamed from: j */
    public void m54699j() {
        setVisibility(0);
    }

    public void setMainColor(String str) {
        this.f43947b.f90795k.setVisibility(8);
        this.f43947b.f90794j.setVisibility(0);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f43947b.f90794j.setTextColor(Color.parseColor(str));
        } catch (Exception unused) {
        }
    }

    public void setRightText(int i11) {
        setRightText(getContext().getString(i11));
    }

    /* JADX INFO: renamed from: c */
    public void m54692c() {
        setVisibility(8);
    }

    /* JADX INFO: renamed from: g */
    public void m54696g(@DrawableRes int i11, View.OnClickListener onClickListener) {
        this.f43947b.f90787c.setVisibility(0);
        this.f43947b.f90787c.setImageResource(i11);
        this.f43947b.f90787c.setOnClickListener(onClickListener);
        this.f43947b.f90793i.setVisibility(8);
    }

    public ImageView getLeftBg() {
        return this.f43947b.f90791g;
    }

    @NonNull
    public ImageView getLeftIcon() {
        return this.f43947b.f90790f;
    }

    public ImageView getRightOne() {
        return this.f43947b.f90787c;
    }

    public TextView getRightText() {
        return this.f43947b.f90793i;
    }

    public ImageView getRightThree() {
        return this.f43947b.f90788d;
    }

    public ImageView getRightTwo() {
        return this.f43947b.f90789e;
    }

    public String getTitleText() {
        return this.f43947b.f90794j.getText().toString();
    }

    public TextView getTvLeft() {
        return this.f43947b.f90792h;
    }

    public TextView getTvNavigationTitle() {
        return this.f43947b.f90794j;
    }

    @LayoutRes
    public int getViewStubLayoutId() {
        return R$layout.view_navigationbar_subtitle;
    }

    /* JADX INFO: renamed from: i */
    public void m54698i(String str, @ColorRes int i11) {
        this.f43947b.f90793i.setVisibility(0);
        this.f43947b.f90793i.setText(str);
        this.f43947b.f90787c.setVisibility(8);
        this.f43947b.f90789e.setVisibility(8);
        this.f43947b.f90793i.setTextColor(getResources().getColor(i11));
    }

    public void setCenterSubtitle(String str) {
        if (this.f43949d == null) {
            View viewInflate = this.f43947b.f90795k.inflate();
            this.f43948c = (TextView) viewInflate.findViewById(R$id.m_tv_center_title);
            this.f43949d = (TextView) viewInflate.findViewById(R$id.m_tv_center_sub_title);
            this.f43947b.f90795k.setVisibility(0);
            this.f43947b.f90794j.setVisibility(8);
        }
        this.f43949d.setText(str);
    }

    public void setCenterSubtitleColor(@ColorRes int i11) {
        if (this.f43949d == null) {
            View viewInflate = this.f43947b.f90795k.inflate();
            this.f43948c = (TextView) viewInflate.findViewById(R$id.m_tv_center_title);
            this.f43949d = (TextView) viewInflate.findViewById(R$id.m_tv_center_sub_title);
            this.f43947b.f90795k.setVisibility(0);
            this.f43947b.f90794j.setVisibility(8);
        }
        this.f43949d.setTextColor(getResources().getColor(i11));
    }

    public void setCenterTitle(String str) {
        if (this.f43948c == null) {
            View viewInflate = this.f43947b.f90795k.inflate();
            this.f43948c = (TextView) viewInflate.findViewById(R$id.m_tv_center_title);
            this.f43949d = (TextView) viewInflate.findViewById(R$id.m_tv_center_sub_title);
            this.f43947b.f90795k.setVisibility(0);
            this.f43947b.f90794j.setVisibility(8);
        }
        this.f43948c.setText(str);
    }

    public void setLeftBg(@DrawableRes int i11) {
        this.f43947b.f90791g.setImageResource(i11);
    }

    public void setLeftIcon(@DrawableRes int i11) {
        this.f43947b.f90790f.setImageResource(i11);
    }

    public void setLeftOnclickListener(View.OnClickListener onClickListener) {
        this.f43950e = onClickListener;
    }

    public void setMainTitle(String str) {
        this.f43947b.f90794j.setText(str);
        this.f43947b.f90795k.setVisibility(8);
        this.f43947b.f90794j.setVisibility(0);
    }

    public void setRightOneImage(int i11) {
        this.f43947b.f90787c.setVisibility(0);
        this.f43947b.f90787c.setImageResource(i11);
        this.f43947b.f90793i.setVisibility(8);
    }

    public void setRightTextOnclickListener(View.OnClickListener onClickListener) {
        this.f43951f = onClickListener;
    }

    public NavigationBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m54693d();
    }

    /* JADX INFO: renamed from: d */
    public void m54693d() {
        C40850n c40850nM89399b = C40850n.m89399b(LayoutInflater.from(getContext()), this);
        this.f43947b = c40850nM89399b;
        View root = c40850nM89399b.getRoot();
        setLayoutParams(new ViewGroup.LayoutParams(-1, C5275i0.m6236a(44.0f)));
        this.f43947b.f90795k.setLayoutResource(getViewStubLayoutId());
        this.f43947b.f90795k.setOnInflateListener(new ViewStub.OnInflateListener() { // from class: com.kubi.resources.widget.q1
            @Override // android.view.ViewStub.OnInflateListener
            public final void onInflate(ViewStub viewStub, View view) {
                this.f45023a.m54694e(view);
            }
        });
        root.findViewById(R$id.fl_back).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45031b.m54695f(view);
            }
        });
        root.findViewById(R$id.m_iv_navigation_back).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45031b.m54695f(view);
            }
        });
        root.findViewById(R$id.m_tv_navigation_right_text).setOnClickListener(new View.OnClickListener() { // from class: com.kubi.resources.widget.r1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f45031b.m54695f(view);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final void m54695f(View view) {
        View.OnClickListener onClickListener;
        int id2 = view.getId();
        if (id2 != R$id.m_iv_navigation_back && id2 != R$id.fl_back) {
            if (id2 == R$id.m_tv_navigation_right_text && (onClickListener = this.f43951f) != null) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        View.OnClickListener onClickListener2 = this.f43950e;
        if (onClickListener2 != null) {
            onClickListener2.onClick(view);
        }
    }

    @Nullable
    public ImageView getRightOneIcon() {
        return getRightOne();
    }

    @Nullable
    public ImageView getRightThreeIcon() {
        return getRightThree();
    }

    @Nullable
    public ImageView getRightTwoIcon() {
        return getRightTwo();
    }

    /* JADX INFO: renamed from: h */
    public void m54697h(int i11, @ColorRes int i12) {
        m54698i(getContext().getString(i11), i12);
    }

    public void setBackGroundColor(int i11) {
        setBackgroundColor(i11);
    }

    public void setLeftTint(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f43947b.f90790f.setColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_IN);
            } else {
                this.f43947b.f90790f.clearColorFilter();
            }
        } catch (Exception unused) {
            this.f43947b.f90790f.clearColorFilter();
        }
    }

    public void setRightText(String str) {
        this.f43947b.f90793i.setVisibility(0);
        this.f43947b.f90793i.setText(str);
        this.f43947b.f90787c.setVisibility(8);
        this.f43947b.f90789e.setVisibility(8);
    }

    public void setRightTint(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f43947b.f90788d.setColorFilter(Color.parseColor(str), PorterDuff.Mode.SRC_IN);
            } else {
                this.f43947b.f90788d.clearColorFilter();
            }
        } catch (Exception unused) {
            this.f43947b.f90788d.clearColorFilter();
        }
    }

    public void setTitle(String str) {
        setMainTitle(str);
    }

    public void setTitleTextColor(@NotNull String str) {
        setMainColor(str);
    }

    public NavigationBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m54693d();
    }

    public void setMainColor(int i11) {
        this.f43947b.f90795k.setVisibility(8);
        this.f43947b.f90794j.setVisibility(0);
        try {
            this.f43947b.f90794j.setTextColor(ContextCompat.getColor(getContext(), i11));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: e */
    public void m54694e(View view) {
    }
}
