package com.kubi.payment.fast.paymentmethod.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsP2PView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37680r3;
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

/* JADX INFO: compiled from: PaymentMethodsP2PView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\b\u0010\u0016\u001a\u00020\u0012H\u0002R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsP2PView;", "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsP2pBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsP2pBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "isExpand", "", "bindData", "", "paymentMethodList", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "expandItems", "foldItems", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsP2PView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsP2PView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsP2PView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,92:1\n41#2:93\n65#2:94\n80#2,7:95\n65#2:102\n80#2,7:103\n1869#3,2:110\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsP2PView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsP2PView\n*L\n24#1:93\n24#1:94\n24#1:95,7\n24#1:102\n24#1:103,7\n55#1:110,2\n*E\n"})
public final class PaymentMethodsP2PView extends PaymentMethodsView {

    /* JADX INFO: renamed from: o */
    @NotNull
    public final InterfaceC24293a f38661o;

    /* JADX INFO: renamed from: p */
    public boolean f38662p;

    /* JADX INFO: renamed from: r */
    public static final /* synthetic */ KProperty<Object>[] f38660r = {Reflection.property1(new PropertyReference1Impl(PaymentMethodsP2PView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsP2pBinding;", 0))};

    /* JADX INFO: renamed from: q */
    @NotNull
    public static final Companion f38659q = new Companion(null);

    /* JADX INFO: compiled from: PaymentMethodsP2PView.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsP2PView$Companion;", "", "<init>", "()V", "DEFAULT_DISPLAY_COUNT", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsP2PView(@NotNull Context context) {
        LinearLayout linearLayout;
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38661o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37680r3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsP2PView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37680r3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37680r3.m84949a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_methods_p2p, this);
        C37680r3 binding = getBinding();
        if (binding == null || (linearLayout = binding.f84600e) == null) {
            return;
        }
        C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: ut.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentMethodsP2PView.m46609c(this.f101875b);
            }
        }, 1, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m46610f() {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView;
        this.f38662p = true;
        C37680r3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f84604i) != null) {
            baseTextView.setText(getContext().getString(R$string.payment_view_less));
        }
        C37680r3 binding2 = getBinding();
        if (binding2 != null && (appCompatImageView = binding2.f84597b) != null) {
            appCompatImageView.setImageResource(R$drawable.ic2_arrow_up_12);
        }
        C37680r3 binding3 = getBinding();
        int iM66650j = C27039d.m66650j((binding3 == null || (linearLayoutCompat2 = binding3.f84599d) == null) ? null : Integer.valueOf(linearLayoutCompat2.getChildCount()));
        if (iM66650j <= 3) {
            return;
        }
        for (int i11 = 3; i11 < iM66650j; i11++) {
            C37680r3 binding4 = getBinding();
            View childAt = (binding4 == null || (linearLayoutCompat = binding4.f84599d) == null) ? null : linearLayoutCompat.getChildAt(i11);
            if (childAt != null) {
                C27046k.m66685H(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m46611g() {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        AppCompatImageView appCompatImageView;
        BaseTextView baseTextView;
        this.f38662p = false;
        C37680r3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f84604i) != null) {
            baseTextView.setText(getContext().getString(R$string.payment_view_more));
        }
        C37680r3 binding2 = getBinding();
        if (binding2 != null && (appCompatImageView = binding2.f84597b) != null) {
            appCompatImageView.setImageResource(R$drawable.ic2_arrow_down_12);
        }
        C37680r3 binding3 = getBinding();
        int iM66650j = C27039d.m66650j((binding3 == null || (linearLayoutCompat2 = binding3.f84599d) == null) ? null : Integer.valueOf(linearLayoutCompat2.getChildCount()));
        for (int i11 = 3; i11 < iM66650j; i11++) {
            C37680r3 binding4 = getBinding();
            View childAt = (binding4 == null || (linearLayoutCompat = binding4.f84599d) == null) ? null : linearLayoutCompat.getChildAt(i11);
            if (childAt != null) {
                C27046k.m66700o(childAt);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m46609c(PaymentMethodsP2PView paymentMethodsP2PView) {
        if (paymentMethodsP2PView.f38662p) {
            paymentMethodsP2PView.m46611g();
        } else {
            paymentMethodsP2PView.m46610f();
        }
        return Unit.INSTANCE;
    }

    private final C37680r3 getBinding() {
        return (C37680r3) this.f38661o.getValue(this, f38660r[0]);
    }

    @Override // com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsView
    /* JADX INFO: renamed from: a */
    public void mo46600a(@NotNull PaymentMethodList.Response paymentMethodList) {
        BaseTextView baseTextView;
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        BaseTextView baseTextView2;
        BaseTextView baseTextView3;
        Intrinsics.checkNotNullParameter(paymentMethodList, "paymentMethodList");
        String strM66668h = C27041f.m66668h(paymentMethodList.getTips());
        C37680r3 binding = getBinding();
        if (binding != null && (baseTextView3 = binding.f84603h) != null) {
            baseTextView3.setText(strM66668h);
        }
        if (strM66668h.length() == 0) {
            C37680r3 binding2 = getBinding();
            if (binding2 != null && (baseTextView2 = binding2.f84603h) != null) {
                C27046k.m66700o(baseTextView2);
            }
        } else {
            C37680r3 binding3 = getBinding();
            if (binding3 != null && (baseTextView = binding3.f84603h) != null) {
                C27046k.m66685H(baseTextView);
            }
        }
        C37680r3 binding4 = getBinding();
        if (binding4 != null && (linearLayoutCompat2 = binding4.f84599d) != null) {
            linearLayoutCompat2.removeAllViews();
        }
        List<PaymentMethodList.PaymentMethod> paymentMethods = paymentMethodList.getPaymentMethods();
        if (paymentMethods != null) {
            for (PaymentMethodList.PaymentMethod paymentMethod : paymentMethods) {
                PaymentMethodView.Companion companion = PaymentMethodView.f38647p;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                PaymentMethodView paymentMethodViewBuildPaymentMethodView = companion.buildPaymentMethodView(context, paymentMethod, getF38667n());
                C37680r3 binding5 = getBinding();
                if (binding5 != null && (linearLayoutCompat = binding5.f84599d) != null) {
                    linearLayoutCompat.addView(paymentMethodViewBuildPaymentMethodView);
                }
            }
        }
        m46610f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsP2PView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        LinearLayout linearLayout;
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38661o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37680r3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsP2PView$special$$inlined$viewBinding$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37680r3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37680r3.m84949a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_methods_p2p, this);
        C37680r3 binding = getBinding();
        if (binding == null || (linearLayout = binding.f84600e) == null) {
            return;
        }
        C27046k.m66711z(linearLayout, 0L, new Function0() { // from class: ut.e
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentMethodsP2PView.m46609c(this.f101875b);
            }
        }, 1, null);
    }
}
