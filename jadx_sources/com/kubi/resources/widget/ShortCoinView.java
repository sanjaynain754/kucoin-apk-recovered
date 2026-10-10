package com.kubi.resources.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.google.android.material.navigation.NavigationBarView;
import com.kubi.resources.C22890g;
import com.kubi.sdk.res.R$color;
import com.kubi.sdk.res.R$mipmap;
import com.kubi.sdk.res.R$string;
import org.jetbrains.annotations.NotNull;
import p419l2.C42032f;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: ShortCoinView.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0014H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m90084d2 = {"Lcom/kubi/resources/widget/ShortCoinView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "displayImage", "Landroid/widget/ImageView;", "shortName", "Landroid/widget/TextView;", "descView", "bind", "", "bean", "Lcom/kubi/resources/widget/ShortCoinBean;", "showDesc", "", "dp2px", "", "Landroid/view/View;", "dpValue", "LComponent_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nShortCoinView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortCoinView.kt\ncom/kubi/resources/widget/ShortCoinView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,91:1\n1#2:92\n*E\n"})
public final class ShortCoinView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final ImageView f44048b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TextView f44049c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TextView f44050d;

    /* JADX INFO: renamed from: c */
    public final int m54777c(View view, int i11) {
        return (int) ((i11 * view.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortCoinView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setPadding(m54777c(this, 16), getPaddingTop(), m54777c(this, 16), getPaddingBottom());
        linearLayout.setGravity(16);
        CoinAvatarView coinAvatarView = new CoinAvatarView(context, null, 2, null);
        this.f44048b = coinAvatarView;
        coinAvatarView.setImageResource(R$mipmap.kucoin_icon_default_icon);
        linearLayout.addView(coinAvatarView, new LinearLayout.LayoutParams(m54777c(this, 20), m54777c(this, 20)));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        this.f44049c = appCompatTextView;
        appCompatTextView.setTextColor(getResources().getColor(R$color.c_text));
        appCompatTextView.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(m54777c(this, 6));
        Unit unit = Unit.INSTANCE;
        linearLayout.addView(appCompatTextView, layoutParams);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        this.f44050d = appCompatTextView2;
        appCompatTextView2.setTextSize(2, 10.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.setMarginStart(m54777c(this, 6));
        linearLayout.addView(appCompatTextView2, layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = NavigationBarView.ITEM_GRAVITY_START_CENTER;
        addView(linearLayout, layoutParams3);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m54775b(ShortCoinView shortCoinView, ShortCoinBean shortCoinBean, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        shortCoinView.m54776a(shortCoinBean, z11);
    }

    /* JADX INFO: renamed from: a */
    public final void m54776a(@NotNull ShortCoinBean bean, boolean z11) {
        Context context;
        int i11;
        Intrinsics.checkNotNullParameter(bean, "bean");
        this.f44049c.setText(bean.getShortName());
        if (z11) {
            this.f44050d.setVisibility(0);
            TextView textView = this.f44050d;
            if (bean.getIsLong()) {
                context = getContext();
                i11 = R$string.contract_long;
            } else {
                context = getContext();
                i11 = R$string.contract_short;
            }
            textView.setText(context.getString(i11));
            TextView textView2 = this.f44050d;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            textView2.setTextColor(C22890g.m54281f(context2, bean.getIsLong()));
        } else {
            this.f44050d.setVisibility(8);
        }
        ComponentCallbacks2C5309c.m6556t(getContext()).mo6634v(bean.getDisplayUrl()).mo6606a(new C42032f().mo6606a(C42032f.m92236t0()).mo92188b0(R$mipmap.kucoin_icon_default_icon)).m6594E0(this.f44048b);
    }
}
