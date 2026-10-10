package com.kubi.payment.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastFeeModel;
import com.kubi.payment.fast.data.entities.PreviewOrder;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37630h3;
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

/* JADX INFO: compiled from: ConfirmInfoView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u0016\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, m90084d2 = {"Lcom/kubi/payment/widget/ConfirmInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastConfirmInfoBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastConfirmInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onFeeClickListener", "Lkotlin/Function0;", "", "setOnFeeClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "onFinishInflate", "refreshUI", "previewOrder", "Lcom/kubi/payment/fast/data/entities/PreviewOrder$Response;", "updateCountDownTime", "countDownTime", "", "setRefreshing", "isRefreshing", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nConfirmInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConfirmInfoView.kt\ncom/kubi/payment/widget/ConfirmInfoView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,84:1\n41#2:85\n65#2:86\n80#2,7:87\n*S KotlinDebug\n*F\n+ 1 ConfirmInfoView.kt\ncom/kubi/payment/widget/ConfirmInfoView\n*L\n24#1:85\n24#1:86\n24#1:87,7\n*E\n"})
public final class ConfirmInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ KProperty<Object>[] f40398p = {Reflection.property1(new PropertyReference1Impl(ConfirmInfoView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastConfirmInfoBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f40399n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Function0<Unit> f40400o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f40399n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37630h3>() { // from class: com.kubi.payment.widget.ConfirmInfoView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37630h3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37630h3.m84843a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_fast_confirm_info, this);
    }

    /* JADX INFO: renamed from: b */
    public static final Unit m49865b(ConfirmInfoView confirmInfoView) {
        Function0<Unit> function0 = confirmInfoView.f40400o;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final C37630h3 getBinding() {
        return (C37630h3) this.f40399n.getValue(this, f40398p[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m49866c(@NotNull PreviewOrder.Response previewOrder) {
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        C37630h3 binding = getBinding();
        if (binding == null) {
            return;
        }
        BaseTextView baseTextView = binding.f83983e;
        Context context = getContext();
        int i11 = R$string.payment_price;
        FastFeeModel feeResponse = previewOrder.getFeeResponse();
        baseTextView.setText(context.getString(i11, C27041f.m66669i(feeResponse != null ? feeResponse.getFee() : null, "--"), previewOrder.getFiatCurrency()));
        binding.f83985g.setText(previewOrder.getPaymentMethodName());
        binding.f83980b.setCurrency(previewOrder.getCryptoCurrency());
        binding.f83980b.m49861a(previewOrder.getPrice(), previewOrder.getFiatCurrency());
        binding.f83987i.setText(getContext().getString(i11, C27041f.m66668h(previewOrder.getDepositCryptoAmount()), C27041f.m66668h(previewOrder.getCryptoCurrency())));
    }

    /* JADX INFO: renamed from: d */
    public final void m49867d(@NotNull String countDownTime) {
        ConfirmCountDownView confirmCountDownView;
        Intrinsics.checkNotNullParameter(countDownTime, "countDownTime");
        C37630h3 binding = getBinding();
        if (binding == null || (confirmCountDownView = binding.f83980b) == null) {
            return;
        }
        confirmCountDownView.m49862b(countDownTime);
    }

    public final void setOnFeeClickListener(@Nullable Function0<Unit> listener) {
        this.f40400o = listener;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        BaseTextView baseTextView;
        super.onFinishInflate();
        C37630h3 binding = getBinding();
        if (binding != null && (baseTextView = binding.f83982d) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.widget.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConfirmInfoView.m49865b(this.f40425b);
                }
            }, 1, null);
        }
    }

    public final void setRefreshing(boolean isRefreshing) {
        ConfirmCountDownView confirmCountDownView;
        C37630h3 binding = getBinding();
        if (binding != null && (confirmCountDownView = binding.f83980b) != null) {
            confirmCountDownView.setRefreshing(isRefreshing);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfirmInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ConfirmInfoView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
