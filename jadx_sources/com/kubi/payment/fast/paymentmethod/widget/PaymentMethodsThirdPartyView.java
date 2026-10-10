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
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37690t3;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: PaymentMethodsThirdPartyView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsThirdPartyView;", "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsThirdPartyBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsThirdPartyBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindData", "", "paymentMethodList", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsThirdPartyView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsThirdPartyView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsThirdPartyView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n41#2:48\n65#2:49\n80#2,7:50\n65#2:57\n80#2,7:58\n1869#3,2:65\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsThirdPartyView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsThirdPartyView\n*L\n22#1:48\n22#1:49\n22#1:50,7\n22#1:57\n22#1:58,7\n41#1:65,2\n*E\n"})
public final class PaymentMethodsThirdPartyView extends PaymentMethodsView {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f38665p = {Reflection.property1(new PropertyReference1Impl(PaymentMethodsThirdPartyView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsThirdPartyBinding;", 0))};

    /* JADX INFO: renamed from: o */
    @NotNull
    public final InterfaceC24293a f38666o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsThirdPartyView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38666o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37690t3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsThirdPartyView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37690t3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37690t3.m84971a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_methods_third_party, this);
    }

    private final C37690t3 getBinding() {
        return (C37690t3) this.f38666o.getValue(this, f38665p[0]);
    }

    @Override // com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsView
    /* JADX INFO: renamed from: a */
    public void mo46600a(@NotNull PaymentMethodList.Response paymentMethodList) {
        LinearLayoutCompat linearLayoutCompat;
        LinearLayoutCompat linearLayoutCompat2;
        Intrinsics.checkNotNullParameter(paymentMethodList, "paymentMethodList");
        C37690t3 binding = getBinding();
        if (binding == null) {
            return;
        }
        String strM66668h = C27041f.m66668h(paymentMethodList.getTips());
        if (strM66668h.length() == 0) {
            BaseTextView tvCategoryTips = binding.f84679e;
            Intrinsics.checkNotNullExpressionValue(tvCategoryTips, "tvCategoryTips");
            C27046k.m66700o(tvCategoryTips);
        } else {
            binding.f84679e.setText(strM66668h);
            BaseTextView tvCategoryTips2 = binding.f84679e;
            Intrinsics.checkNotNullExpressionValue(tvCategoryTips2, "tvCategoryTips");
            C27046k.m66685H(tvCategoryTips2);
        }
        C37690t3 binding2 = getBinding();
        if (binding2 != null && (linearLayoutCompat2 = binding2.f84677c) != null) {
            linearLayoutCompat2.removeAllViews();
        }
        List<PaymentMethodList.PaymentMethod> paymentMethods = paymentMethodList.getPaymentMethods();
        if (paymentMethods != null) {
            for (PaymentMethodList.PaymentMethod paymentMethod : paymentMethods) {
                PaymentMethodView.Companion companion = PaymentMethodView.f38647p;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                PaymentMethodView paymentMethodViewBuildPaymentMethodView = companion.buildPaymentMethodView(context, paymentMethod, getF38667n());
                C37690t3 binding3 = getBinding();
                if (binding3 != null && (linearLayoutCompat = binding3.f84677c) != null) {
                    linearLayoutCompat.addView(paymentMethodViewBuildPaymentMethodView);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsThirdPartyView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38666o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37690t3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsThirdPartyView$special$$inlined$viewBinding$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37690t3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37690t3.m84971a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_methods_third_party, this);
    }
}
