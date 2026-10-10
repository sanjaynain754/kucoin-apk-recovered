package com.kubi.payment.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$layout;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.C33978va;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.HashSet;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37655m3;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: NumberKeyboardView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0002J\b\u0010\u001c\u001a\u00020\u0014H\u0014R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m90084d2 = {"Lcom/kubi/payment/widget/NumberKeyboardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewBinding", "Lcom/kubi/otc/databinding/PaymentViewNumberKeyboardBinding;", "getViewBinding", "()Lcom/kubi/otc/databinding/PaymentViewNumberKeyboardBinding;", "viewBinding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "listeners", "Ljava/util/HashSet;", "Lcom/kubi/payment/widget/NumberKeyboardView$OnNumberChangeListener;", "Lkotlin/collections/HashSet;", "addListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeListener", "onFinishInflate", "onNumberChange", "number", "", "initViews", "onDetachedFromWindow", "OnNumberChangeListener", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNumberKeyboardView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NumberKeyboardView.kt\ncom/kubi/payment/widget/NumberKeyboardView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,129:1\n41#2:130\n65#2:131\n80#2,7:132\n65#2:139\n80#2,7:140\n*S KotlinDebug\n*F\n+ 1 NumberKeyboardView.kt\ncom/kubi/payment/widget/NumberKeyboardView\n*L\n20#1:130\n20#1:131\n20#1:132,7\n20#1:139\n20#1:140,7\n*E\n"})
public final class NumberKeyboardView extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f40406n;

    /* JADX INFO: renamed from: o */
    @NotNull
    public HashSet<InterfaceC21458a> f40407o;

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ KProperty<Object>[] f40405q = {Reflection.property1(new PropertyReference1Impl(NumberKeyboardView.class, "viewBinding", "getViewBinding()Lcom/kubi/otc/databinding/PaymentViewNumberKeyboardBinding;", 0))};

    /* JADX INFO: renamed from: p */
    @NotNull
    public static final Companion f40404p = new Companion(null);

    /* JADX INFO: compiled from: NumberKeyboardView.kt */
    @Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m90084d2 = {"Lcom/kubi/payment/widget/NumberKeyboardView$Companion;", "", "<init>", "()V", "ONE", "", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "POINT", "ZERO", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.payment.widget.NumberKeyboardView$a */
    /* JADX INFO: compiled from: NumberKeyboardView.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m90084d2 = {"Lcom/kubi/payment/widget/NumberKeyboardView$OnNumberChangeListener;", "", "onNumberChange", "", "number", "", "onDelete", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public interface InterfaceC21458a {
        /* JADX INFO: renamed from: a */
        void mo47159a(@NotNull String str);

        void onDelete();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberKeyboardView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40406n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37655m3>() { // from class: com.kubi.payment.widget.NumberKeyboardView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37655m3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37655m3.m84894a(C45682f.m100801b(viewGroup));
            }
        });
        this.f40407o = new HashSet<>();
    }

    /* JADX INFO: renamed from: A */
    public static final Unit m49873A(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C("9");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: B */
    public static final Unit m49874B(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C(C33978va.f72339h);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: C */
    private final void m49875C(String str) {
        Iterator<InterfaceC21458a> it = this.f40407o.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC21458a next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.mo47159a(str);
        }
    }

    private final C37655m3 getViewBinding() {
        return (C37655m3) this.f40406n.getValue(this, f40405q[0]);
    }

    /* JADX INFO: renamed from: n */
    public static final Unit m49889n(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C("1");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o */
    public static final Unit m49890o(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C("2");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p */
    public static final Unit m49891p(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C("0");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: r */
    public static final Unit m49892r(NumberKeyboardView numberKeyboardView) {
        Iterator<InterfaceC21458a> it = numberKeyboardView.f40407o.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            InterfaceC21458a next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.onDelete();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: t */
    public static final Unit m49893t(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C("3");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: u */
    public static final Unit m49894u(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C("4");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: w */
    public static final Unit m49895w(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C("5");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: x */
    public static final Unit m49896x(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C("6");
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: y */
    public static final Unit m49897y(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C(TUIConstants.TUICustomerServicePlugin.BUSINESS_ID_SRC_CUSTOMER_SERVICE_SAY_HELLO);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: z */
    public static final Unit m49898z(NumberKeyboardView numberKeyboardView) {
        numberKeyboardView.m49875C("8");
        return Unit.INSTANCE;
    }

    public final void addListener(@NotNull InterfaceC21458a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (this.f40407o.contains(listener)) {
            return;
        }
        this.f40407o.add(listener);
    }

    public final void removeListener(@NotNull InterfaceC21458a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f40407o.remove(listener);
    }

    /* JADX INFO: renamed from: m */
    private final void m49888m() {
        C37655m3 viewBinding = getViewBinding();
        if (viewBinding == null) {
            return;
        }
        TextView tv1 = viewBinding.f84280d;
        Intrinsics.checkNotNullExpressionValue(tv1, "tv1");
        C27046k.m66710y(tv1, 50L, new Function0() { // from class: com.kubi.payment.widget.d
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49889n(this.f40431b);
            }
        });
        TextView tv2 = viewBinding.f84281e;
        Intrinsics.checkNotNullExpressionValue(tv2, "tv2");
        C27046k.m66710y(tv2, 50L, new Function0() { // from class: com.kubi.payment.widget.i
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49890o(this.f40436b);
            }
        });
        TextView tv3 = viewBinding.f84282f;
        Intrinsics.checkNotNullExpressionValue(tv3, "tv3");
        C27046k.m66710y(tv3, 50L, new Function0() { // from class: com.kubi.payment.widget.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49893t(this.f40437b);
            }
        });
        TextView tv4 = viewBinding.f84283g;
        Intrinsics.checkNotNullExpressionValue(tv4, "tv4");
        C27046k.m66710y(tv4, 50L, new Function0() { // from class: com.kubi.payment.widget.k
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49894u(this.f40438b);
            }
        });
        TextView tv5 = viewBinding.f84284h;
        Intrinsics.checkNotNullExpressionValue(tv5, "tv5");
        C27046k.m66710y(tv5, 50L, new Function0() { // from class: com.kubi.payment.widget.l
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49895w(this.f40439b);
            }
        });
        TextView tv6 = viewBinding.f84285i;
        Intrinsics.checkNotNullExpressionValue(tv6, "tv6");
        C27046k.m66710y(tv6, 50L, new Function0() { // from class: com.kubi.payment.widget.m
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49896x(this.f40440b);
            }
        });
        TextView tv7 = viewBinding.f84286j;
        Intrinsics.checkNotNullExpressionValue(tv7, "tv7");
        C27046k.m66710y(tv7, 50L, new Function0() { // from class: com.kubi.payment.widget.n
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49897y(this.f40441b);
            }
        });
        TextView tv8 = viewBinding.f84287k;
        Intrinsics.checkNotNullExpressionValue(tv8, "tv8");
        C27046k.m66710y(tv8, 50L, new Function0() { // from class: com.kubi.payment.widget.o
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49898z(this.f40442b);
            }
        });
        TextView tv9 = viewBinding.f84288l;
        Intrinsics.checkNotNullExpressionValue(tv9, "tv9");
        C27046k.m66710y(tv9, 50L, new Function0() { // from class: com.kubi.payment.widget.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49873A(this.f40432b);
            }
        });
        TextView tvPoint = viewBinding.f84289m;
        Intrinsics.checkNotNullExpressionValue(tvPoint, "tvPoint");
        C27046k.m66710y(tvPoint, 50L, new Function0() { // from class: com.kubi.payment.widget.f
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49874B(this.f40433b);
            }
        });
        TextView tv0 = viewBinding.f84279c;
        Intrinsics.checkNotNullExpressionValue(tv0, "tv0");
        C27046k.m66710y(tv0, 50L, new Function0() { // from class: com.kubi.payment.widget.g
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49891p(this.f40434b);
            }
        });
        AppCompatImageView ivClear = viewBinding.f84278b;
        Intrinsics.checkNotNullExpressionValue(ivClear, "ivClear");
        C27046k.m66710y(ivClear, 50L, new Function0() { // from class: com.kubi.payment.widget.h
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NumberKeyboardView.m49892r(this.f40435b);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f40407o.clear();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_number_keyboard, this);
        m49888m();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NumberKeyboardView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40406n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37655m3>() { // from class: com.kubi.payment.widget.NumberKeyboardView$special$$inlined$viewBinding$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37655m3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37655m3.m84894a(C45682f.m100801b(viewGroup));
            }
        });
        this.f40407o = new HashSet<>();
    }
}
