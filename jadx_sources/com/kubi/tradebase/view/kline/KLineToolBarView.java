package com.kubi.tradebase.view.kline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import cn.jiguang.privates.analysis.constants.JAnalysisConstants;
import com.kubi.flutter.proto.kline.ChangeToolBarModeEvent;
import com.kubi.flutter.proto.kline.ToolBarClick;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.tradebase.R$color;
import com.kubi.tradebase.R$drawable;
import com.kubi.tradebase.R$layout;
import com.kubi.tradebase.view.kline.KLineToolBarView;
import com.kubi.utils.extensions.C27046k;
import com.tencent.qcloud.tuicore.TUIConstants;
import io.reactivex.functions.Consumer;
import n30.C42733i;
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
import w00.C45682f;

/* JADX INFO: compiled from: KLineToolBarView.kt */
/* JADX INFO: loaded from: classes48.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u0016\u0010\u0013\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0019J\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u001d\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/tradebase/view/kline/KLineToolBarView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", JAnalysisConstants.EVENT_ATTRIBUTES, "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/tradebase/databinding/BtradebaseKlineToolbarBinding;", "getBinding", "()Lcom/kubi/tradebase/databinding/BtradebaseKlineToolbarBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "initDrawToolListener", "", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lio/reactivex/functions/Consumer;", "Lcom/kubi/flutter/proto/kline/ToolBarClick$ToolBarItemType;", "exitDrawTool", "changeToolBarMode", "event", "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent;", "setEyeState", "isHidden", "", "setLockState", "isLock", "setSelectState", "type", "Lcom/kubi/flutter/proto/kline/ChangeToolBarModeEvent$SelectItemType;", "TradeBaseLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nKLineToolBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineToolBarView.kt\ncom/kubi/tradebase/view/kline/KLineToolBarView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,116:1\n41#2:117\n65#2:118\n80#2,7:119\n*S KotlinDebug\n*F\n+ 1 KLineToolBarView.kt\ncom/kubi/tradebase/view/kline/KLineToolBarView\n*L\n25#1:117\n25#1:118\n25#1:119,7\n*E\n"})
public final class KLineToolBarView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ KProperty<Object>[] f51689c = {Reflection.property1(new PropertyReference1Impl(KLineToolBarView.class, "binding", "getBinding()Lcom/kubi/tradebase/databinding/BtradebaseKlineToolbarBinding;", 0))};

    /* JADX INFO: renamed from: b */
    @NotNull
    public final InterfaceC24293a f51690b;

    /* JADX INFO: renamed from: com.kubi.tradebase.view.kline.KLineToolBarView$a */
    /* JADX INFO: compiled from: KLineToolBarView.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final /* synthetic */ class C25951a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChangeToolBarModeEvent.SelectItemType.values().length];
            try {
                iArr[ChangeToolBarModeEvent.SelectItemType.SELECT_ITEM_SEGMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChangeToolBarModeEvent.SelectItemType.SELECT_ITEM_STRAIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChangeToolBarModeEvent.SelectItemType.SELECT_ITEM_RECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineToolBarView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51690b = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C42733i>() { // from class: com.kubi.tradebase.view.kline.KLineToolBarView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C42733i invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C42733i.m93637a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.btradebase_kline_toolbar, this);
    }

    private final C42733i getBinding() {
        return (C42733i) this.f51690b.getValue(this, f51689c[0]);
    }

    /* JADX INFO: renamed from: j */
    public static final Unit m63430j(Consumer consumer) throws Exception {
        if (consumer != null) {
            consumer.accept(ToolBarClick.ToolBarItemType.BAR_ITEM_Exit);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: l */
    public static final Unit m63431l(Consumer consumer) throws Exception {
        if (consumer != null) {
            consumer.accept(ToolBarClick.ToolBarItemType.BAR_ITEM_SEGMENT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static final Unit m63432m(Consumer consumer) throws Exception {
        if (consumer != null) {
            consumer.accept(ToolBarClick.ToolBarItemType.BAR_ITEM_STRAIGHT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m63433n(Consumer consumer) throws Exception {
        if (consumer != null) {
            consumer.accept(ToolBarClick.ToolBarItemType.BAR_ITEM_RECT);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m63434o(Consumer consumer) throws Exception {
        if (consumer != null) {
            consumer.accept(ToolBarClick.ToolBarItemType.BAR_ITEM_EYE);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m63435p(Consumer consumer) throws Exception {
        if (consumer != null) {
            consumer.accept(ToolBarClick.ToolBarItemType.BAR_ITEM_DROP);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: q */
    public static final Unit m63436q(Consumer consumer) throws Exception {
        if (consumer != null) {
            consumer.accept(ToolBarClick.ToolBarItemType.BAR_ITEM_LOCK);
        }
        return Unit.INSTANCE;
    }

    private final void setSelectState(ChangeToolBarModeEvent.SelectItemType type) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        ImageView imageView8;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        ImageView imageView12;
        int i11 = C25951a.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            C42733i binding = getBinding();
            if (binding != null && (imageView3 = binding.f94630g) != null) {
                C27046k.m66701p(imageView3, ContextCompat.getColor(getContext(), R$color.c_text));
            }
            C42733i binding2 = getBinding();
            if (binding2 != null && (imageView2 = binding2.f94631h) != null) {
                C27046k.m66701p(imageView2, ContextCompat.getColor(getContext(), R$color.c_icon));
            }
            C42733i binding3 = getBinding();
            if (binding3 == null || (imageView = binding3.f94629f) == null) {
                return;
            }
            C27046k.m66701p(imageView, ContextCompat.getColor(getContext(), R$color.c_icon));
            return;
        }
        if (i11 == 2) {
            C42733i binding4 = getBinding();
            if (binding4 != null && (imageView6 = binding4.f94630g) != null) {
                C27046k.m66701p(imageView6, ContextCompat.getColor(getContext(), R$color.c_icon));
            }
            C42733i binding5 = getBinding();
            if (binding5 != null && (imageView5 = binding5.f94631h) != null) {
                C27046k.m66701p(imageView5, ContextCompat.getColor(getContext(), R$color.c_text));
            }
            C42733i binding6 = getBinding();
            if (binding6 == null || (imageView4 = binding6.f94629f) == null) {
                return;
            }
            C27046k.m66701p(imageView4, ContextCompat.getColor(getContext(), R$color.c_icon));
            return;
        }
        if (i11 != 3) {
            C42733i binding7 = getBinding();
            if (binding7 != null && (imageView12 = binding7.f94630g) != null) {
                C27046k.m66701p(imageView12, ContextCompat.getColor(getContext(), R$color.c_icon));
            }
            C42733i binding8 = getBinding();
            if (binding8 != null && (imageView11 = binding8.f94631h) != null) {
                C27046k.m66701p(imageView11, ContextCompat.getColor(getContext(), R$color.c_icon));
            }
            C42733i binding9 = getBinding();
            if (binding9 == null || (imageView10 = binding9.f94629f) == null) {
                return;
            }
            C27046k.m66701p(imageView10, ContextCompat.getColor(getContext(), R$color.c_icon));
            return;
        }
        C42733i binding10 = getBinding();
        if (binding10 != null && (imageView9 = binding10.f94630g) != null) {
            C27046k.m66701p(imageView9, ContextCompat.getColor(getContext(), R$color.c_icon));
        }
        C42733i binding11 = getBinding();
        if (binding11 != null && (imageView8 = binding11.f94631h) != null) {
            C27046k.m66701p(imageView8, ContextCompat.getColor(getContext(), R$color.c_icon));
        }
        C42733i binding12 = getBinding();
        if (binding12 == null || (imageView7 = binding12.f94629f) == null) {
            return;
        }
        C27046k.m66701p(imageView7, ContextCompat.getColor(getContext(), R$color.c_text));
    }

    /* JADX INFO: renamed from: h */
    public final void m63437h(@NotNull ChangeToolBarModeEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        ChangeToolBarModeEvent.SelectItemType selectType = event.getSelectType();
        Intrinsics.checkNotNullExpressionValue(selectType, "getSelectType(...)");
        setSelectState(selectType);
    }

    /* JADX INFO: renamed from: i */
    public final void m63438i(@Nullable final Consumer<ToolBarClick.ToolBarItemType> consumer) {
        ImageView imageView;
        C42733i binding = getBinding();
        if (binding != null && (imageView = binding.f94626c) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: u30.n
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineToolBarView.m63430j(consumer);
                }
            }, 1, null);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m63439k(@Nullable final Consumer<ToolBarClick.ToolBarItemType> consumer) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        C42733i binding = getBinding();
        if (binding != null && (imageView6 = binding.f94630g) != null) {
            C27046k.m66711z(imageView6, 0L, new Function0() { // from class: u30.h
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineToolBarView.m63431l(consumer);
                }
            }, 1, null);
        }
        C42733i binding2 = getBinding();
        if (binding2 != null && (imageView5 = binding2.f94631h) != null) {
            C27046k.m66711z(imageView5, 0L, new Function0() { // from class: u30.i
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineToolBarView.m63432m(consumer);
                }
            }, 1, null);
        }
        C42733i binding3 = getBinding();
        if (binding3 != null && (imageView4 = binding3.f94629f) != null) {
            C27046k.m66711z(imageView4, 0L, new Function0() { // from class: u30.j
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineToolBarView.m63433n(consumer);
                }
            }, 1, null);
        }
        C42733i binding4 = getBinding();
        if (binding4 != null && (imageView3 = binding4.f94627d) != null) {
            C27046k.m66711z(imageView3, 0L, new Function0() { // from class: u30.k
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineToolBarView.m63434o(consumer);
                }
            }, 1, null);
        }
        C42733i binding5 = getBinding();
        if (binding5 != null && (imageView2 = binding5.f94625b) != null) {
            C27046k.m66711z(imageView2, 0L, new Function0() { // from class: u30.l
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineToolBarView.m63435p(consumer);
                }
            }, 1, null);
        }
        C42733i binding6 = getBinding();
        if (binding6 != null && (imageView = binding6.f94628e) != null) {
            C27046k.m66711z(imageView, 0L, new Function0() { // from class: u30.m
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return KLineToolBarView.m63436q(consumer);
                }
            }, 1, null);
        }
    }

    public final void setEyeState(boolean isHidden) {
        ImageView imageView;
        int i11;
        C42733i binding = getBinding();
        if (binding != null && (imageView = binding.f94627d) != null) {
            if (isHidden) {
                i11 = R$drawable.ic2_eye_close_20;
            } else {
                i11 = R$drawable.ic2_eye_open_20;
            }
            imageView.setImageResource(i11);
        }
    }

    public final void setLockState(boolean isLock) {
        ImageView imageView;
        int i11;
        C42733i binding = getBinding();
        if (binding != null && (imageView = binding.f94628e) != null) {
            if (isLock) {
                i11 = R$drawable.ic2_locked_20;
            } else {
                i11 = R$drawable.ic2_unlocked_20;
            }
            imageView.setImageResource(i11);
        }
    }
}
