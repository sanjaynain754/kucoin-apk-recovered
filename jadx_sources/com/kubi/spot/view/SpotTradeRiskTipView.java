package com.kubi.spot.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.layout.ShapeLinearLayout;
import com.kubi.spot.R$layout;
import com.kubi.spot.view.SpotTradeRiskTipView;
import com.kubi.utils.extensions.C27046k;
import f30.C37333d;
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
import t20.C44672w;
import w00.C45682f;

/* JADX INFO: compiled from: SpotTradeRiskTipView.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/spot/view/SpotTradeRiskTipView;", "Lcom/kubi/sdk/widget/shape/layout/ShapeLinearLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/spot/databinding/BspotViewRiskTipBinding;", "getBinding", "()Lcom/kubi/spot/databinding/BspotViewRiskTipBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "symbol", "", "initListener", "", "showRiskTip", "tip", "SpotLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSpotTradeRiskTipView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpotTradeRiskTipView.kt\ncom/kubi/spot/view/SpotTradeRiskTipView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,52:1\n41#2:53\n65#2:54\n80#2,7:55\n1#3:62\n*S KotlinDebug\n*F\n+ 1 SpotTradeRiskTipView.kt\ncom/kubi/spot/view/SpotTradeRiskTipView\n*L\n22#1:53\n22#1:54\n22#1:55,7\n*E\n"})
public final class SpotTradeRiskTipView extends ShapeLinearLayout {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ KProperty<Object>[] f51266f = {Reflection.property1(new PropertyReference1Impl(SpotTradeRiskTipView.class, "binding", "getBinding()Lcom/kubi/spot/databinding/BspotViewRiskTipBinding;", 0))};

    /* JADX INFO: renamed from: d */
    @NotNull
    public final InterfaceC24293a f51267d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f51268e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotTradeRiskTipView(@NotNull Context context, @NotNull AttributeSet attributes) {
        super(context, attributes);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        this.f51267d = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C44672w>() { // from class: com.kubi.spot.view.SpotTradeRiskTipView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C44672w invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C44672w.m98820a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.bspot_view_risk_tip, this);
        m63099b();
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m63100c(SpotTradeRiskTipView spotTradeRiskTipView) {
        spotTradeRiskTipView.setVisibility(8);
        String str = spotTradeRiskTipView.f51268e;
        if (str != null) {
            C37333d.f82848a.m83918b(str, Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    private final C44672w getBinding() {
        return (C44672w) this.f51267d.getValue(this, f51266f[0]);
    }

    /* JADX INFO: renamed from: d */
    public final void m63101d(@Nullable String str, @Nullable String str2) {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        if (str2 == null || str2.length() == 0 || str == null || str.length() == 0) {
            setVisibility(8);
            return;
        }
        this.f51268e = str2;
        Object objM83917a = C37333d.f82848a.m83917a(str2);
        Boolean bool = objM83917a instanceof Boolean ? (Boolean) objM83917a : null;
        setVisibility(bool != null ? bool.booleanValue() : true ? 0 : 8);
        C44672w binding = getBinding();
        if (binding != null && (baseTextView3 = binding.f99420c) != null) {
            baseTextView3.setText(str);
        }
        C44672w binding2 = getBinding();
        if (binding2 != null && (baseTextView2 = binding2.f99420c) != null) {
            baseTextView2.setSelected(true);
        }
        C44672w binding3 = getBinding();
        if (binding3 == null || (baseTextView = binding3.f99420c) == null) {
            return;
        }
        baseTextView.setFadingEdgeLength(0);
    }

    /* JADX INFO: renamed from: b */
    private final void m63099b() {
        AppCompatImageView appCompatImageView;
        C44672w binding = getBinding();
        if (binding != null && (appCompatImageView = binding.f99419b) != null) {
            C27046k.m66711z(appCompatImageView, 0L, new Function0() { // from class: g30.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SpotTradeRiskTipView.m63100c(this.f85167b);
                }
            }, 1, null);
        }
    }
}
