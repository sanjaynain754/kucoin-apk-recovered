package com.kubi.assets.overview.detail;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.kubi.assets.AssetApiRemoteConfig;
import com.kubi.assets.R$color;
import com.kubi.assets.R$layout;
import com.kubi.assets.R$string;
import com.kubi.assets.entity.AssetCoinDetailEntity;
import com.kubi.assets.entity.CurrencyOverallCostInfoResponse;
import com.kubi.assets.entity.CurrencySpotTradingInfoResponse;
import com.kubi.resources.C22890g;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.resources.widget.DashTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.C27017c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import java.math.BigDecimal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38184b;
import p311hf.C38185c;
import p429lf.C42180b;
import p637ta.C44815m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: CoinDetailPerformanceView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0007J\f\u0010\u001f\u001a\u00020 *\u00020!H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014¨\u0006\""}, m90084d2 = {"Lcom/kubi/assets/overview/detail/CoinDetailPerformanceView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/assets/databinding/AssetCoinDetailPerformanceViewBinding;", "getBinding", "()Lcom/kubi/assets/databinding/AssetCoinDetailPerformanceViewBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onCostPriceTitleClick", "Lkotlin/Function0;", "", "getOnCostPriceTitleClick", "()Lkotlin/jvm/functions/Function0;", "setOnCostPriceTitleClick", "(Lkotlin/jvm/functions/Function0;)V", "onEditCostClick", "getOnEditCostClick", "setOnEditCostClick", "setSpotTradingInfo", "assetCoinDetailEntity", "Lcom/kubi/assets/entity/AssetCoinDetailEntity;", "code", "", "costEditEnable", "", "formatAsPercentage", "Landroid/text/SpannableString;", "Ljava/math/BigDecimal;", "AssetsCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCoinDetailPerformanceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoinDetailPerformanceView.kt\ncom/kubi/assets/overview/detail/CoinDetailPerformanceView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,123:1\n52#2:124\n80#2,7:125\n*S KotlinDebug\n*F\n+ 1 CoinDetailPerformanceView.kt\ncom/kubi/assets/overview/detail/CoinDetailPerformanceView\n*L\n36#1:124\n36#1:125,7\n*E\n"})
public final class CoinDetailPerformanceView extends FrameLayout {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ KProperty<Object>[] f18331e = {Reflection.property1(new PropertyReference1Impl(CoinDetailPerformanceView.class, "binding", "getBinding()Lcom/kubi/assets/databinding/AssetCoinDetailPerformanceViewBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f18332b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public Function0<Unit> f18333c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public Function0<Unit> f18334d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoinDetailPerformanceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f18332b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44815m>() { // from class: com.kubi.assets.overview.detail.CoinDetailPerformanceView$special$$inlined$customViewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44815m invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44815m.m99151a(C45682f.m100800a(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.asset_coin_detail_performance_view, this);
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m18627f(CoinDetailPerformanceView coinDetailPerformanceView) {
        Function0<Unit> function0 = coinDetailPerformanceView.f18333c;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m18628g(boolean z11, CoinDetailPerformanceView coinDetailPerformanceView) {
        Function0<Unit> function0;
        if (z11 && (function0 = coinDetailPerformanceView.f18334d) != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final C44815m getBinding() {
        return (C44815m) this.f18332b.getValue(this, f18331e[0]);
    }

    /* JADX INFO: renamed from: h */
    public static final Unit m18629h(boolean z11, CoinDetailPerformanceView coinDetailPerformanceView) {
        Function0<Unit> function0;
        if (z11 && (function0 = coinDetailPerformanceView.f18334d) != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public final SpannableString m18630d(BigDecimal bigDecimal) {
        int color;
        String strM92642g = C42180b.m92642g(bigDecimal, null, null, 0, true, false, false, 55, null);
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        if (bigDecimal.compareTo(bigDecimal2) > 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            color = C22890g.m54291p(context);
        } else if (bigDecimal.compareTo(bigDecimal2) < 0) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            color = C22890g.m54289n(context2);
        } else {
            color = getResources().getColor(R$color.c_text);
        }
        SpannableString spannableString = new SpannableString(strM92642g);
        spannableString.setSpan(new ForegroundColorSpan(color), 0, strM92642g.length(), 33);
        return spannableString;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m18631e(@Nullable AssetCoinDetailEntity assetCoinDetailEntity, @Nullable String str, final boolean z11) {
        CurrencySpotTradingInfoResponse spotTradingInfo;
        BaseTextView baseTextView;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        BaseTextView baseTextView2;
        DashTextView dashTextView;
        DashTextView dashTextView2;
        AppCompatImageView appCompatImageView3;
        BaseTextView baseTextView3;
        BaseTextView baseTextView4;
        BaseTextView baseTextView5;
        BaseTextView baseTextView6;
        BaseTextView baseTextView7;
        BaseTextView baseTextView8;
        DashTextView dashTextView3;
        CurrencySpotTradingInfoResponse spotTradingInfo2;
        CharSequence text = null;
        if (AssetApiRemoteConfig.f17838a.m17476e()) {
            if (assetCoinDetailEntity == null || (spotTradingInfo2 = assetCoinDetailEntity.getSpotTradingInfo()) == null) {
                spotTradingInfo = null;
            } else {
                CurrencyOverallCostInfoResponse overallCostInfo = assetCoinDetailEntity.getOverallCostInfo();
                BigDecimal costUsdt = overallCostInfo != null ? overallCostInfo.getCostUsdt() : null;
                CurrencyOverallCostInfoResponse overallCostInfo2 = assetCoinDetailEntity.getOverallCostInfo();
                BigDecimal lastPrice = overallCostInfo2 != null ? overallCostInfo2.getLastPrice() : null;
                CurrencyOverallCostInfoResponse overallCostInfo3 = assetCoinDetailEntity.getOverallCostInfo();
                spotTradingInfo = spotTradingInfo2.copy(costUsdt, lastPrice, overallCostInfo3 != null ? overallCostInfo3.getProfitLossRate() : null);
            }
        } else if (assetCoinDetailEntity != null) {
            spotTradingInfo = assetCoinDetailEntity.getSpotTradingInfo();
        } else {
            spotTradingInfo = null;
        }
        if (spotTradingInfo == null) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        C44815m binding = getBinding();
        if (binding != null && (dashTextView3 = binding.f100434c) != null) {
            dashTextView3.setText(C27017c.f54310a.m66516f(R$string.kc_overview_coin_detail_costprice, new Object[0]) + '(' + C38184b.f85884a.m86148c() + ')');
        }
        C44815m binding2 = getBinding();
        if (binding2 != null && (baseTextView8 = binding2.f100437f) != null) {
            baseTextView8.setText(C27017c.f54310a.m66516f(R$string.kc_overview_coin_detail_lastprice, new Object[0]) + '(' + C38184b.f85884a.m86146a() + ')');
        }
        C44815m binding3 = getBinding();
        if (binding3 != null && (baseTextView7 = binding3.f100433b) != null) {
            BigDecimal costPrice = spotTradingInfo.getCostPrice();
            baseTextView7.setText(C27041f.m66669i(costPrice != null ? C38185c.m86151c(costPrice, false, 1, null) : null, "--"));
        }
        C44815m binding4 = getBinding();
        if (binding4 != null && (baseTextView6 = binding4.f100436e) != null) {
            BigDecimal lastPrice2 = spotTradingInfo.getLastPrice();
            baseTextView6.setText(C27041f.m66669i(lastPrice2 != null ? C38185c.m86151c(lastPrice2, false, 1, null) : null, "--"));
        }
        if (spotTradingInfo.getProfitLossRate() == null) {
            C44815m binding5 = getBinding();
            if (binding5 != null && (baseTextView5 = binding5.f100439h) != null) {
                baseTextView5.setText("--");
            }
            C44815m binding6 = getBinding();
            if (binding6 != null && (baseTextView4 = binding6.f100439h) != null) {
                baseTextView4.setTextColor(getResources().getColor(R$color.c_text));
            }
        } else {
            C44815m binding7 = getBinding();
            if (binding7 != null && (baseTextView = binding7.f100439h) != null) {
                baseTextView.setText(m18630d(spotTradingInfo.getProfitLossRate()));
            }
        }
        CoinDetailTracker coinDetailTracker = CoinDetailTracker.f18371a;
        coinDetailTracker.m18640i(spotTradingInfo.getProfitLossRate(), str);
        C44815m binding8 = getBinding();
        if (binding8 != null && (baseTextView3 = binding8.f100433b) != null) {
            text = baseTextView3.getText();
        }
        coinDetailTracker.m18639h(String.valueOf(text), str);
        if (z11) {
            C44815m binding9 = getBinding();
            if (binding9 != null && (appCompatImageView3 = binding9.f100435d) != null) {
                ViewExtKt.m66594y(appCompatImageView3);
            }
        } else {
            C44815m binding10 = getBinding();
            if (binding10 != null && (appCompatImageView = binding10.f100435d) != null) {
                ViewExtKt.m66577h(appCompatImageView);
            }
        }
        C44815m binding11 = getBinding();
        if (binding11 != null && (dashTextView2 = binding11.f100434c) != null) {
            dashTextView2.setNeedDash(true);
        }
        C44815m binding12 = getBinding();
        if (binding12 != null && (dashTextView = binding12.f100434c) != null) {
            C27046k.m66711z(dashTextView, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.j0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoinDetailPerformanceView.m18627f(this.f18362b);
                }
            }, 1, null);
        }
        C44815m binding13 = getBinding();
        if (binding13 != null && (baseTextView2 = binding13.f100433b) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.k0
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CoinDetailPerformanceView.m18628g(z11, this);
                }
            }, 1, null);
        }
        C44815m binding14 = getBinding();
        if (binding14 == null || (appCompatImageView2 = binding14.f100435d) == null) {
            return;
        }
        C27046k.m66711z(appCompatImageView2, 0L, new Function0() { // from class: com.kubi.assets.overview.detail.l0
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CoinDetailPerformanceView.m18629h(z11, this);
            }
        }, 1, null);
    }

    @Nullable
    public final Function0<Unit> getOnCostPriceTitleClick() {
        return this.f18333c;
    }

    @Nullable
    public final Function0<Unit> getOnEditCostClick() {
        return this.f18334d;
    }

    public final void setOnCostPriceTitleClick(@Nullable Function0<Unit> function0) {
        this.f18333c = function0;
    }

    public final void setOnEditCostClick(@Nullable Function0<Unit> function0) {
        this.f18334d = function0;
    }
}
