package com.kubi.tradebase.view.kline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.facebook.react.uimanager.ViewProps;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.sdk.widget.shape.view.ShapeTextView;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.view.kline.KLineIndicatorView;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import gf.C37878b0;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import n30.C42732h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p311hf.C38190h;
import p569qq.C43852m;
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

/* JADX INFO: compiled from: KLineIndicatorView.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u0018\u0010\u0013\u001a\u00020\u000f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u0012\u0010\u0014\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015J,\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00122\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002J,\u0010\u001a\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u00122\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, m90084d2 = {"Lcom/kubi/tradebase/view/kline/KLineIndicatorView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/tradebase/databinding/BtradebaseKlineIndicatorBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BtradebaseKlineIndicatorBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initMainIndicatorListener", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Consumer;", "", "initSecondaryIndicatorListener", "enterDrawEditState", "Lio/reactivex/functions/Action;", "handleMainIndicatorClick", "textView", "Landroid/widget/TextView;", ViewProps.POSITION, "handleSecondaryIndicatorClick", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineIndicatorView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineIndicatorView.kt\ncom/kubi/tradebase/view/kline/KLineIndicatorView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,109:1\n41#2:110\n65#2:111\n80#2,7:112\n256#3,2:119\n*S KotlinDebug\n*F\n+ 1 KLineIndicatorView.kt\ncom/kubi/tradebase/view/kline/KLineIndicatorView\n*L\n27#1:110\n27#1:111\n27#1:112,7\n31#1:119,2\n*E\n"})
public final class KLineIndicatorView extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f51687o = {Reflection.property1(new PropertyReference1Impl(KLineIndicatorView.class, "binding", "getBinding()Lcom/kubi/tradebase/databinding/BtradebaseKlineIndicatorBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f51688n;

    /* JADX INFO: renamed from: j */
    public final void m63419j(TextView textView, int i11, Consumer<Integer> consumer) throws Exception {
        boolean z11 = textView != null && textView.isSelected();
        C37878b0 c37878b0 = C37878b0.f85252a;
        if (z11) {
            i11 = -1;
        }
        c37878b0.m85540u(i11);
        C42732h binding = getBinding();
        if (binding != null) {
            binding.f94620f.setSelected(false);
            binding.f94618d.setSelected(false);
            binding.f94617c.setSelected(false);
        }
        if (textView != null) {
            textView.setSelected(!z11);
        }
        if (consumer != null) {
            consumer.accept(Integer.valueOf(c37878b0.m85525f()));
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m63420k(TextView textView, int i11, Consumer<Integer> consumer) throws Exception {
        boolean z11 = textView != null && textView.isSelected();
        C37878b0 c37878b0 = C37878b0.f85252a;
        if (z11) {
            i11 = -1;
        }
        c37878b0.m85541v(i11);
        C42732h binding = getBinding();
        if (binding != null) {
            binding.f94621g.setSelected(false);
            binding.f94619e.setSelected(false);
            binding.f94622h.setSelected(false);
        }
        if (textView != null) {
            textView.setSelected(!z11);
        }
        if (consumer != null) {
            consumer.accept(Integer.valueOf(c37878b0.m85526g()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineIndicatorView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        ImageView imageView;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51688n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C42732h>() { // from class: com.kubi.tradebase.view.kline.KLineIndicatorView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C42732h invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C42732h.m93635a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.btradebase_kline_indicator, this);
        C42732h binding = getBinding();
        if (binding == null || (imageView = binding.f94616b) == null) {
            return;
        }
        imageView.setVisibility(C38190h.f85888a.m86164i() ? 0 : 8);
    }

    private final C42732h getBinding() {
        return (C42732h) this.f51688n.getValue(this, f51687o[0]);
    }

    /* JADX INFO: renamed from: i */
    public static final Unit m63411i(Action action) throws Exception {
        C43852m.m96591c("B5klineLandscape", "klineDrawing", null, null, 12, null);
        if (action != null) {
            action.run();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m63412m(KLineIndicatorView kLineIndicatorView, Consumer consumer) throws Exception {
        ShapeTextView shapeTextView;
        C42732h binding = kLineIndicatorView.getBinding();
        if (binding != null) {
            shapeTextView = binding.f94620f;
        } else {
            shapeTextView = null;
        }
        kLineIndicatorView.m63419j(shapeTextView, 0, consumer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m63413n(KLineIndicatorView kLineIndicatorView, Consumer consumer) throws Exception {
        ShapeTextView shapeTextView;
        C42732h binding = kLineIndicatorView.getBinding();
        if (binding != null) {
            shapeTextView = binding.f94618d;
        } else {
            shapeTextView = null;
        }
        kLineIndicatorView.m63419j(shapeTextView, 1, consumer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m63414o(KLineIndicatorView kLineIndicatorView, Consumer consumer) throws Exception {
        ShapeTextView shapeTextView;
        C42732h binding = kLineIndicatorView.getBinding();
        if (binding != null) {
            shapeTextView = binding.f94617c;
        } else {
            shapeTextView = null;
        }
        kLineIndicatorView.m63419j(shapeTextView, 2, consumer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m63415r(KLineIndicatorView kLineIndicatorView, Consumer consumer) throws Exception {
        ShapeTextView shapeTextView;
        C42732h binding = kLineIndicatorView.getBinding();
        if (binding != null) {
            shapeTextView = binding.f94621g;
        } else {
            shapeTextView = null;
        }
        kLineIndicatorView.m63420k(shapeTextView, 0, consumer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m63416t(KLineIndicatorView kLineIndicatorView, Consumer consumer) throws Exception {
        ShapeTextView shapeTextView;
        C42732h binding = kLineIndicatorView.getBinding();
        if (binding != null) {
            shapeTextView = binding.f94619e;
        } else {
            shapeTextView = null;
        }
        kLineIndicatorView.m63420k(shapeTextView, 1, consumer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m63417u(KLineIndicatorView kLineIndicatorView, Consumer consumer) throws Exception {
        ShapeTextView shapeTextView;
        C42732h binding = kLineIndicatorView.getBinding();
        if (binding != null) {
            shapeTextView = binding.f94622h;
        } else {
            shapeTextView = null;
        }
        kLineIndicatorView.m63420k(shapeTextView, 2, consumer);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public final void m63418h(@Nullable final Action action) {
        ImageView imageView;
        C42732h binding = getBinding();
        if (binding != null && (imageView = binding.f94616b) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: u30.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineIndicatorView.m63411i(action);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m63421l(@Nullable final Consumer<Integer> consumer) {
        ShapeTextView shapeTextView;
        ShapeTextView shapeTextView2;
        ShapeTextView shapeTextView3;
        C42732h binding = getBinding();
        if (binding != null && (shapeTextView3 = binding.f94620f) != null) {
            C27046k.m66711z(shapeTextView3, 0L, new Function0() { // from class: u30.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineIndicatorView.m63412m(this.f101517b, consumer);
                }
            }, 1, null);
        }
        C42732h binding2 = getBinding();
        if (binding2 != null && (shapeTextView2 = binding2.f94618d) != null) {
            C27046k.m66711z(shapeTextView2, 0L, new Function0() { // from class: u30.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineIndicatorView.m63413n(this.f101519b, consumer);
                }
            }, 1, null);
        }
        C42732h binding3 = getBinding();
        if (binding3 != null && (shapeTextView = binding3.f94617c) != null) {
            C27046k.m66711z(shapeTextView, 0L, new Function0() { // from class: u30.c
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineIndicatorView.m63414o(this.f101521b, consumer);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m63422p(@Nullable final Consumer<Integer> consumer) {
        ShapeTextView shapeTextView;
        ShapeTextView shapeTextView2;
        ShapeTextView shapeTextView3;
        C42732h binding = getBinding();
        if (binding != null && (shapeTextView3 = binding.f94621g) != null) {
            C27046k.m66711z(shapeTextView3, 0L, new Function0() { // from class: u30.e
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineIndicatorView.m63415r(this.f101524b, consumer);
                }
            }, 1, null);
        }
        C42732h binding2 = getBinding();
        if (binding2 != null && (shapeTextView2 = binding2.f94619e) != null) {
            C27046k.m66711z(shapeTextView2, 0L, new Function0() { // from class: u30.f
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineIndicatorView.m63416t(this.f101526b, consumer);
                }
            }, 1, null);
        }
        C42732h binding3 = getBinding();
        if (binding3 != null && (shapeTextView = binding3.f94622h) != null) {
            C27046k.m66711z(shapeTextView, 0L, new Function0() { // from class: u30.g
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineIndicatorView.m63417u(this.f101528b, consumer);
                }
            }, 1, null);
        }
    }
}
