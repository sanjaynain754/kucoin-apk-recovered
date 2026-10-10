package com.kubi.payment.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37620f3;
import p429lf.C42180b;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: ConfirmCountDownView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u001a\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u00020\u00132\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001cR\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, m90084d2 = {"Lcom/kubi/payment/widget/ConfirmCountDownView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastConfirmCountDownBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastConfirmCountDownBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "setCurrency", "", FirebaseAnalytics.Param.CURRENCY, "", "setUnitPrice", FirebaseAnalytics.Param.PRICE, "updateCountDownTime", "countDownTime", "setRefreshing", "isRefreshing", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConfirmCountDownView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmCountDownView.kt\ncom/kubi/payment/widget/ConfirmCountDownView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,78:1\n41#2:79\n65#2:80\n80#2,7:81\n*S KotlinDebug\n*F\n+ 1 ConfirmCountDownView.kt\ncom/kubi/payment/widget/ConfirmCountDownView\n*L\n26#1:79\n26#1:80\n26#1:81,7\n*E\n"})
public final class ConfirmCountDownView extends ConstraintLayout {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty<Object>[] f40394o = {Reflection.property1(new PropertyReference1Impl(ConfirmCountDownView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastConfirmCountDownBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f40395n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmCountDownView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40395n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37620f3>() { // from class: com.kubi.payment.widget.ConfirmCountDownView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37620f3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37620f3.m84821a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_fast_confirm_count_down, this);
    }

    private final C37620f3 getBinding() {
        return (C37620f3) this.f40395n.getValue(this, f40394o[0]);
    }

    public final void setRefreshing(boolean isRefreshing) {
        ProgressBar progressBar;
        BaseTextView baseTextView;
        ProgressBar progressBar2;
        BaseTextView baseTextView2;
        if (isRefreshing) {
            C37620f3 binding = getBinding();
            if (binding != null && (baseTextView2 = binding.f83884d) != null) {
                C27046k.m66700o(baseTextView2);
            }
            C37620f3 binding2 = getBinding();
            if (binding2 == null || (progressBar2 = binding2.f83883c) == null) {
                return;
            }
            C27046k.m66685H(progressBar2);
            return;
        }
        C37620f3 binding3 = getBinding();
        if (binding3 != null && (baseTextView = binding3.f83884d) != null) {
            C27046k.m66685H(baseTextView);
        }
        C37620f3 binding4 = getBinding();
        if (binding4 == null || (progressBar = binding4.f83883c) == null) {
            return;
        }
        C27046k.m66700o(progressBar);
    }

    /* JADX INFO: renamed from: a */
    public final void m49861a(@Nullable String str, @Nullable String str2) {
        BaseTextView baseTextView;
        C37620f3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f83886f) != null) {
            baseTextView.setText(getContext().getString(R$string.payment_price, C42180b.m92640e(DowngradeExKt.m66535e(str, null, 1, null), null, 0, false, false, false, 0, null, 127, null), C27041f.m66668h(str2)));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m49862b(@Nullable String str) {
        BaseTextView baseTextView;
        C37620f3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f83884d) != null) {
            baseTextView.setText(getContext().getString(R$string.payment_count_down_time, C27041f.m66668h(str)));
        }
    }

    public final void setCurrency(@Nullable String currency) {
        BaseTextView baseTextView;
        C37620f3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f83885e) != null) {
            baseTextView.setText(getContext().getString(R$string.payment_confirm_price, C27041f.m66668h(currency)));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfirmCountDownView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfirmCountDownView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
