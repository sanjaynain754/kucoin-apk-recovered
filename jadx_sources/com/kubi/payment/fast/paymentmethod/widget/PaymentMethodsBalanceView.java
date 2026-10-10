package com.kubi.payment.fast.paymentmethod.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
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
import p270ft.C37670p3;
import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.PropertyReference1Impl;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KProperty;
import w00.C45682f;

/* JADX INFO: compiled from: PaymentMethodsBalanceView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0013"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsBalanceView;", "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsBalanceBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsBalanceBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "bindData", "", "paymentMethodList", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsBalanceView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsBalanceView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsBalanceView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,43:1\n41#2:44\n65#2:45\n80#2,7:46\n65#2:53\n80#2,7:54\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsBalanceView.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsBalanceView\n*L\n18#1:44\n18#1:45\n18#1:46,7\n18#1:53\n18#1:54,7\n*E\n"})
public final class PaymentMethodsBalanceView extends PaymentMethodsView {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f38651p = {Reflection.property1(new PropertyReference1Impl(PaymentMethodsBalanceView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewPaymentMethodsBalanceBinding;", 0))};

    /* JADX INFO: renamed from: o */
    @NotNull
    public final InterfaceC24293a f38652o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsBalanceView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38652o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37670p3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsBalanceView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37670p3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37670p3.m84926a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_methods_balance, this);
    }

    private final C37670p3 getBinding() {
        return (C37670p3) this.f38652o.getValue(this, f38651p[0]);
    }

    @Override // com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsView
    /* JADX INFO: renamed from: a */
    public void mo46600a(@NotNull PaymentMethodList.Response paymentMethodList) {
        Intrinsics.checkNotNullParameter(paymentMethodList, "paymentMethodList");
        List<PaymentMethodList.PaymentMethod> paymentMethods = paymentMethodList.getPaymentMethods();
        if (paymentMethods == null || paymentMethods.isEmpty()) {
            return;
        }
        PaymentMethodList.PaymentMethod paymentMethod = paymentMethodList.getPaymentMethods().get(0);
        C37670p3 binding = getBinding();
        if (binding == null) {
            return;
        }
        String strM66668h = C27041f.m66668h(paymentMethodList.getTips());
        binding.f84403e.setText(strM66668h);
        if (strM66668h.length() == 0) {
            BaseTextView tvCategoryTips = binding.f84403e;
            Intrinsics.checkNotNullExpressionValue(tvCategoryTips, "tvCategoryTips");
            C27046k.m66700o(tvCategoryTips);
        } else {
            BaseTextView tvCategoryTips2 = binding.f84403e;
            Intrinsics.checkNotNullExpressionValue(tvCategoryTips2, "tvCategoryTips");
            C27046k.m66685H(tvCategoryTips2);
        }
        binding.f84401c.setPaymentMethodListener(getF38667n());
        binding.f84401c.m46592b(paymentMethod);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsBalanceView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38652o = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37670p3>() { // from class: com.kubi.payment.fast.paymentmethod.widget.PaymentMethodsBalanceView$special$$inlined$viewBinding$2
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37670p3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37670p3.m84926a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(getContext()).inflate(R$layout.payment_view_payment_methods_balance, this);
    }
}
