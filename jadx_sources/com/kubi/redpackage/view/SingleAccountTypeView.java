package com.kubi.redpackage.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.redpackage.R$color;
import com.kubi.redpackage.R$id;
import com.kubi.redpackage.R$layout;
import com.kubi.redpackage.R$styleable;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import gf.C37885i;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.jvm.JvmOverloads;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SingleAccountTypeView.kt */
/* JADX INFO: loaded from: classes38.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J.\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/redpackage/view/SingleAccountTypeView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "tvViewAccountType", "Landroid/widget/TextView;", "tvViewAccountPrice", "tvViewAccountCurrency", "tvViewAccountNotEnough", "setEnabled", "", "enabled", "", "setData", "totalCoinSize", "", "mainAsset", "Ljava/math/BigDecimal;", FirebaseAnalytics.Param.CURRENCY, "", "currencyName", "RedpackageLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SingleAccountTypeView extends FrameLayout {

    /* JADX INFO: renamed from: b */
    @NotNull
    public final TextView f43400b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public final TextView f43401c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public final TextView f43402d;

    /* JADX INFO: renamed from: e */
    @NotNull
    public final TextView f43403e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleAccountTypeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SingleAccountTypeView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleAccountTypeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.kucoin_SingleAccountTypeView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_SingleAccountTypeView_kucoin_stv_name);
        String string2 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_SingleAccountTypeView_kucoin_stv_price);
        String string3 = typedArrayObtainStyledAttributes.getString(R$styleable.kucoin_SingleAccountTypeView_kucoin_stv_currency);
        typedArrayObtainStyledAttributes.recycle();
        View viewInflate = LayoutInflater.from(context).inflate(R$layout.bredpackage_view_account_choose, (ViewGroup) null);
        View viewFindViewById = viewInflate.findViewById(R$id.tv_view_account_type);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f43400b = textView;
        View viewFindViewById2 = viewInflate.findViewById(R$id.tv_view_account_price);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.f43401c = textView2;
        View viewFindViewById3 = viewInflate.findViewById(R$id.tv_view_account_currency);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        TextView textView3 = (TextView) viewFindViewById3;
        this.f43402d = textView3;
        View viewFindViewById4 = viewInflate.findViewById(R$id.tv_view_account_not_enough);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.f43403e = (TextView) viewFindViewById4;
        textView.setText(string);
        textView2.setText(string2);
        textView3.setText(string3);
        addView(viewInflate);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: a */
    public final void m54103a(double d11, @Nullable BigDecimal bigDecimal, @Nullable String str, @Nullable String str2) {
        boolean z11;
        String strM85570i;
        if (d11 <= C27039d.m66647g(bigDecimal)) {
            z11 = true;
        } else {
            z11 = false;
        }
        setEnabled(z11);
        TextView textView = this.f43401c;
        StringBuilder sb2 = new StringBuilder();
        String strM89948v = null;
        if (bigDecimal == null) {
            strM85570i = null;
        } else {
            strM85570i = C37885i.m85570i(bigDecimal, str, (254 & 2) != 0 ? RoundingMode.DOWN : null, (254 & 4) != 0 ? 8 : 0, (254 & 8) != 0 ? false : false, (254 & 16) != 0 ? false : false, (254 & 32) == 0 ? false : false, (254 & 64) != 0, (254 & 128) != 0 ? "0.00" : null);
        }
        sb2.append(C27041f.m66669i(strM85570i, "- -"));
        sb2.append(' ');
        sb2.append(str2);
        textView.setText(sb2.toString());
        TextView textView2 = this.f43402d;
        if (bigDecimal != null) {
            strM89948v = C41014a.m89948v(C41014a.m89940n(bigDecimal, str), null, null, 0, false, true, false, 47, null);
        }
        textView2.setText(C27041f.m66669i(strM89948v, "- -"));
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        int i11;
        int i12;
        int i13;
        int i14;
        super.setEnabled(enabled);
        TextView textView = this.f43400b;
        Resources resources = getResources();
        if (enabled) {
            i11 = R$color.c_text;
        } else {
            i11 = R$color.c_text40;
        }
        textView.setTextColor(resources.getColor(i11));
        TextView textView2 = this.f43401c;
        Resources resources2 = getResources();
        if (enabled) {
            i12 = R$color.c_text;
        } else {
            i12 = R$color.c_text40;
        }
        textView2.setTextColor(resources2.getColor(i12));
        TextView textView3 = this.f43402d;
        Resources resources3 = getResources();
        if (enabled) {
            i13 = R$color.c_text;
        } else {
            i13 = R$color.c_text40;
        }
        textView3.setTextColor(resources3.getColor(i13));
        TextView textView4 = this.f43403e;
        if (enabled) {
            i14 = 8;
        } else {
            i14 = 0;
        }
        textView4.setVisibility(i14);
    }
}
