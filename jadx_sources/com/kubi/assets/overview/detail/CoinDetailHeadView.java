package com.kubi.assets.overview.detail;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.service.C10921d;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27017c;
import gf.C37885i;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p402kf.C41014a;
import p637ta.C44800k;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: CoinDetailHeadView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/assets/overview/detail/CoinDetailHeadView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetCoinDetailHeadViewBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetCoinDetailHeadViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setData", "", FirebaseAnalytics.Param.CURRENCY, "", "totalAmount", "Ljava/math/BigDecimal;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinDetailHeadView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinDetailHeadView.kt\ncom/kubi/assets/overview/detail/CoinDetailHeadView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,41:1\n52#2:42\n80#2,7:43\n*S KotlinDebug\n*F\n+ 1 CoinDetailHeadView.kt\ncom/kubi/assets/overview/detail/CoinDetailHeadView\n*L\n26#1:42\n26#1:43,7\n*E\n"})
public final class CoinDetailHeadView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f18329c = {Reflection.property1(new PropertyReference1Impl(CoinDetailHeadView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetCoinDetailHeadViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18330b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailHeadView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18330b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44800k>() { // from class: com.kubi.assets.overview.detail.CoinDetailHeadView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44800k invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44800k.m99119a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_coin_detail_head_view, this);
    }

    private final C44800k getBinding() {
        return (C44800k) this.f18330b.getValue(this, f18329c[0]);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: a */
    public final void m18623a(@NotNull String currency, @NotNull BigDecimal totalAmount) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(totalAmount, "totalAmount");
        C44800k binding = getBinding();
        if (binding != null && (baseTextView3 = binding.f100264b) != null) {
            baseTextView3.setText(C27017c.f54310a.m66516f(R$string.kc_overview_coin_detail_totalvalue, new Object[0]) + '(' + C10921d.m19190a(currency) + ')');
        }
        C44800k binding2 = getBinding();
        if (binding2 != null && (baseTextView2 = binding2.f100267e) != null) {
            baseTextView2.setText(C37885i.m85563b(totalAmount, currency, 0, 2, null));
        }
        C44800k binding3 = getBinding();
        if (binding3 == null || (baseTextView = binding3.f100266d) == null) {
            return;
        }
        baseTextView.setText(C41014a.m89933g(new BigDecimal(String.valueOf(C41014a.m89940n(totalAmount, currency))), null, null, 0, false, true, true, 15, null));
    }
}
