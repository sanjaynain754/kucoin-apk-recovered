package com.kubi.market.monitor.lib.p100ui.floating.setting;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.kubi.data.entity.SymbolInfoEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.event.api.C12572a;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.core.ViewExtKt;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.chad.library.adapter.base.BaseViewHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import sl.C44521j;

/* JADX INFO: compiled from: CurrencyAdapter.kt */
/* JADX INFO: loaded from: classes27.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/market/monitor/lib/ui/floating/setting/CurrencyAdapterHolder;", "Lio/chad/library/adapter/base/BaseViewHolder;", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getView", "()Landroid/view/View;", "vb", "Lcom/kubi/kucoin/market/monitor/lib/databinding/ViewItemFloatingWindowSettingCurrencyBinding;", "getVb", "()Lcom/kubi/kucoin/market/monitor/lib/databinding/ViewItemFloatingWindowSettingCurrencyBinding;", "vb$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindData", "", "data", "Lcom/kubi/data/entity/TradeItemBean;", "MarketMonitorLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nCurrencyAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CurrencyAdapter.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/CurrencyAdapterHolder\n+ 2 ViewHolderBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewHolderBindings\n*L\n1#1,65:1\n18#2,5:66\n*S KotlinDebug\n*F\n+ 1 CurrencyAdapter.kt\ncom/kubi/market/monitor/lib/ui/floating/setting/CurrencyAdapterHolder\n*L\n52#1:66,5\n*E\n"})
public final class CurrencyAdapterHolder extends BaseViewHolder {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ KProperty<Object>[] f34279i = {Reflection.property1(new PropertyReference1Impl(CurrencyAdapterHolder.class, "vb", "getVb()Lcom/kubi/kucoin/market/monitor/lib/databinding/ViewItemFloatingWindowSettingCurrencyBinding;", 0))};

    /* JADX INFO: renamed from: g */
    @NotNull
    public final View f34280g;

    /* JADX INFO: renamed from: h */
    @NotNull
    public final InterfaceC24293a f34281h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrencyAdapterHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.f34280g = view;
        this.f34281h = new LazyViewBindingProperty(new Function1<CurrencyAdapterHolder, C44521j>() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.CurrencyAdapterHolder$special$$inlined$viewBinding$default$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44521j invoke(@NotNull CurrencyAdapterHolder viewHolder) {
                Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
                return C44521j.m98502a(viewHolder.itemView);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m40750d(TradeItemBean tradeItemBean) {
        C12572a.m23695d("remove_symbol", C27041f.m66668h(tradeItemBean != null ? tradeItemBean.getSymbol() : null), 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static final Unit m40751e(TradeItemBean tradeItemBean, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        C12572a.m23695d("top_symbol", C27041f.m66668h(tradeItemBean != null ? tradeItemBean.getSymbol() : null), 0L, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: f */
    public final C44521j m40753f() {
        return (C44521j) this.f34281h.getValue(this, f34279i[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m40752c(@Nullable final TradeItemBean tradeItemBean) {
        AppCompatImageView appCompatImageView;
        ImageView imageView;
        TextView textView;
        SymbolInfoEntity symbolInfoEntity;
        TextView textView2;
        String baseCurrency;
        SymbolInfoEntity symbolInfoEntity2;
        C44521j c44521jM40753f = m40753f();
        String quoteCurrency = null;
        if (c44521jM40753f != null && (textView2 = c44521jM40753f.f98676g) != null) {
            if (tradeItemBean != null && (symbolInfoEntity2 = tradeItemBean.getSymbolInfoEntity()) != null) {
                baseCurrency = symbolInfoEntity2.getBaseCurrency();
            } else {
                baseCurrency = null;
            }
            textView2.setText(baseCurrency);
        }
        C44521j c44521jM40753f2 = m40753f();
        if (c44521jM40753f2 != null && (textView = c44521jM40753f2.f98677h) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('/');
            if (tradeItemBean != null && (symbolInfoEntity = tradeItemBean.getSymbolInfoEntity()) != null) {
                quoteCurrency = symbolInfoEntity.getQuoteCurrency();
            }
            sb2.append(quoteCurrency);
            textView.setText(sb2.toString());
        }
        C44521j c44521jM40753f3 = m40753f();
        if (c44521jM40753f3 != null && (imageView = c44521jM40753f3.f98672c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CurrencyAdapterHolder.m40750d(tradeItemBean);
                }
            }, 1, null);
        }
        C44521j c44521jM40753f4 = m40753f();
        if (c44521jM40753f4 != null && (appCompatImageView = c44521jM40753f4.f98675f) != null) {
            ViewExtKt.m66575f(appCompatImageView, new Function1() { // from class: com.kubi.market.monitor.lib.ui.floating.setting.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CurrencyAdapterHolder.m40751e(tradeItemBean, (View) obj);
                }
            });
        }
    }
}
