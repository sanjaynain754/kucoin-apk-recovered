package com.kubi.payment.fast.paymentmethod.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.kubi.otc.R$layout;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37685s3;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: PaymentMethodsPopularView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView;", "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsPopularPayBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsPopularPayBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindData", "", "paymentMethodList", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsPopularView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsPopularView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n41#2:54\n65#2:55\n80#2,7:56\n65#2:63\n80#2,7:64\n1869#3,2:71\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsPopularView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsPopularView\n*L\n23#1:54\n23#1:55\n23#1:56,7\n23#1:63\n23#1:64,7\n45#1:71,2\n*E\n"})
public final class PaymentMethodsPopularView extends PaymentMethodsView {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f38663p = {Reflection.property1(new PropertyReference1Impl(PaymentMethodsPopularView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsPopularPayBinding;", 0))};

    /* JADX INFO: renamed from: o */
    @NotNull
    public final InterfaceC24293a f38664o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsPopularView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38664o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37685s3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsPopularView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37685s3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37685s3.m84961a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_methods_popular_pay, this);
    }

    private final C37685s3 getBinding() {
        return (C37685s3) this.f38664o.getValue(this, f38663p[0]);
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
        C37685s3 binding = getBinding();
        if (binding != null && (baseTextView3 = binding.f84628e) != null) {
            baseTextView3.setText(strM66668h);
        }
        if (strM66668h.length() == 0) {
            C37685s3 binding2 = getBinding();
            if (binding2 != null && (baseTextView2 = binding2.f84628e) != null) {
                C27046k.m66700o(baseTextView2);
            }
        } else {
            C37685s3 binding3 = getBinding();
            if (binding3 != null && (baseTextView = binding3.f84628e) != null) {
                C27046k.m66685H(baseTextView);
            }
        }
        C37685s3 binding4 = getBinding();
        if (binding4 != null && (linearLayoutCompat2 = binding4.f84626c) != null) {
            linearLayoutCompat2.removeAllViews();
        }
        List<PaymentMethodList.PaymentMethod> paymentMethods = paymentMethodList.getPaymentMethods();
        if (paymentMethods != null) {
            for (PaymentMethodList.PaymentMethod paymentMethod : paymentMethods) {
                if (!C27025c.m66566d(paymentMethod.isHidden())) {
                    PaymentMethodView.Companion companion = PaymentMethodView.f38647p;
                    Context context = getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    PaymentMethodView paymentMethodViewBuildPaymentMethodView = companion.buildPaymentMethodView(context, paymentMethod, getF38667n());
                    C37685s3 binding5 = getBinding();
                    if (binding5 != null && (linearLayoutCompat = binding5.f84626c) != null) {
                        linearLayoutCompat.addView(paymentMethodViewBuildPaymentMethodView);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsPopularView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38664o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37685s3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsPopularView$special$$inlined$viewBinding$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37685s3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37685s3.m84961a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_methods_popular_pay, this);
    }
}
