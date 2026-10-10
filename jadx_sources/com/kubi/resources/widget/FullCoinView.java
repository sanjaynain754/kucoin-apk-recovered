package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.res.ResourcesCompat;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$font;
import com.kubi.sdk.res.R$mipmap;
import org.jetbrains.annotations.NotNull;
import p419l2.C42032f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: FullCoinView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0014\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0012H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/resources/widget/FullCoinView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "displayImage", "Landroid/widget/ImageView;", "shortName", "Landroid/widget/TextView;", "fullName", "bind", "", "bean", "Lcom/kubi/resources/widget/FullCoinBean;", "dp2px", "", "Landroid/view/View;", "dpValue", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class FullCoinView extends LinearLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ImageView f43818b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TextView f43819c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TextView f43820d;

    /* JADX INFO: renamed from: b */
    public final int m54518b(View view, int i11) {
        return (int) ((i11 * view.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FullCoinView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setOrientation(0);
        setGravity(16);
        CoinAvatarView coinAvatarView = new CoinAvatarView(context, null, 2, null);
        this.f43818b = coinAvatarView;
        coinAvatarView.setImageResource(R$mipmap.kucoin_icon_default_icon);
        addView(coinAvatarView, new LinearLayout.LayoutParams(m54518b(this, 20), m54518b(this, 20)));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.f43819c = appCompatTextView;
        appCompatTextView.setTextColor(getResources().getColor(R$color.c_text));
        appCompatTextView.setTypeface(ResourcesCompat.getFont(context, R$font.medium));
        appCompatTextView.setTextSize(0, m54518b(this, 16));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(m54518b(this, 6));
        Unit unit = Unit.INSTANCE;
        addView(appCompatTextView, layoutParams);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        this.f43820d = appCompatTextView2;
        appCompatTextView2.setTextColor(getResources().getColor(R$color.c_text40));
        appCompatTextView2.setTypeface(ResourcesCompat.getFont(context, R$font.regular));
        appCompatTextView2.setTextSize(0, m54518b(this, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(m54518b(this, 4));
        addView(appCompatTextView2, layoutParams2);
    }

    /* JADX INFO: renamed from: a */
    public final void m54517a(@NotNull FullCoinBean bean) {
        Intrinsics.checkNotNullParameter(bean, "bean");
        this.f43819c.setText(bean.getShortName());
        this.f43820d.setText(bean.getFullName());
        ComponentCallbacks2C5309c.m6556t(getContext()).mo6634v(bean.getDisplayUrl()).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0(this.f43818b);
    }
}
