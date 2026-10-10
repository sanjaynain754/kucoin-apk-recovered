package com.kubi.core.spot.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.core.biz.notice.SymbolRiskStore;
import com.kubi.core.spot.view.SpotTradeRiskTipView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.tradecorebiz.R$layout;
import com.kubi.utils.extensions.C27046k;
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
import v30.C45397n0;
import w00.C45682f;

/* JADX INFO: compiled from: SpotTradeRiskTipView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/core/spot/view/SpotTradeRiskTipView;", "Lcom/kubi/sdk/widget/shape/layout/ShapeLinearLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/tradecorebiz/databinding/TradeCoreViewRiskTipBinding;", "getBinding", "()Lcom/kubi/tradecorebiz/databinding/TradeCoreViewRiskTipBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "initListener", "", "showRiskTip", "tip", "TradeCoreBizLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotTradeRiskTipView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotTradeRiskTipView.kt\ncom/kubi/core/spot/view/SpotTradeRiskTipView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n41#2:53\n65#2:54\n80#2,7:55\n1#3:62\n*S KotlinDebug\n*F\n+ 1 SpotTradeRiskTipView.kt\ncom/kubi/core/spot/view/SpotTradeRiskTipView\n*L\n22#1:53\n22#1:54\n22#1:55,7\n*E\n"})
public final class SpotTradeRiskTipView extends ShapeLinearLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f21289f = {Reflection.property1(new PropertyReference1Impl(SpotTradeRiskTipView.class, "binding", "getBinding()Lcom/kubi/tradecorebiz/databinding/TradeCoreViewRiskTipBinding;", 0))};

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC24293a f21290d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f21291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotTradeRiskTipView(@NotNull Context context, @NotNull AttributeSet attributes) {
        super(context, attributes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f21290d = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C45397n0>() { // from class: com.kubi.core.spot.view.SpotTradeRiskTipView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C45397n0 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C45397n0.m100328a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.trade_core_view_risk_tip, this);
        m23397b();
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m23398c(SpotTradeRiskTipView spotTradeRiskTipView) {
        spotTradeRiskTipView.setVisibility(8);
        String str = spotTradeRiskTipView.f21291e;
        if (str != null) {
            SymbolRiskStore.f20559a.m22056b(str);
        }
        return Unit.INSTANCE;
    }

    private final C45397n0 getBinding() {
        return (C45397n0) this.f21290d.getValue(this, f21289f[0]);
    }

    /* JADX INFO: renamed from: d */
    public final void m23399d(@Nullable String str, @Nullable String str2) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0) {
            setVisibility(8);
            return;
        }
        this.f21291e = str2;
        setVisibility(SymbolRiskStore.f20559a.m22055a(str2) ? 0 : 8);
        C45397n0 binding = getBinding();
        if (binding != null && (baseTextView3 = binding.f102239c) != null) {
            baseTextView3.setText(str);
        }
        C45397n0 binding2 = getBinding();
        if (binding2 != null && (baseTextView2 = binding2.f102239c) != null) {
            baseTextView2.setSelected(true);
        }
        C45397n0 binding3 = getBinding();
        if (binding3 == null || (baseTextView = binding3.f102239c) == null) {
            return;
        }
        baseTextView.setFadingEdgeLength(0);
    }

    /* JADX INFO: renamed from: b */
    private final void m23397b() {
        AppCompatImageView appCompatImageView;
        C45397n0 binding = getBinding();
        if (binding != null && (appCompatImageView = binding.f102238b) != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: bf.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotTradeRiskTipView.m23398c(this.f4066b);
                }
            }, 1, null);
        }
    }
}
