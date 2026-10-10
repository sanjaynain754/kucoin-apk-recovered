package com.kubi.payment.fasttrade.sell.confirm.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.R$layout;
import com.kubi.otc.R$string;
import com.kubi.payment.fast.data.entities.SellPreviewOrder;
import com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmInfoView;
import com.kubi.payment.util.C21457l;
import com.kubi.payment.widget.ConfirmCountDownView;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.sdk.viewbindingdelegate.base.InterfaceC24293a;
import com.kubi.sdk.viewbindingdelegate.base.LazyViewBindingProperty;
import com.kubi.sdk.viewbindingdelegate.internal.UtilsKt;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.kubi.utils.extensions.DowngradeExKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p270ft.C37650l3;
import p429lf.C42180b;
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

/* JADX INFO: compiled from: SellConfirmInfoView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u000bJ\u0016\u0010\u0016\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\u0016\u0010\u0018\u001a\u00020\u00142\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013J\b\u0010\u0019\u001a\u00020\u0014H\u0014J\u000e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\"R\u001d\u0010\f\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmInfoView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "binding", "Lcom/kubi/otc/databinding/PaymentViewFastSellConfirmInfoBinding;", "getBinding", "()Lcom/kubi/otc/databinding/PaymentViewFastSellConfirmInfoBinding;", "binding$delegate", "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;", "onFeeClickListener", "Lkotlin/Function0;", "", "onTaxClickListener", "setOnFeeClickListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTaxClickListener", "onFinishInflate", "refreshUI", "previewOrder", "Lcom/kubi/payment/fast/data/entities/SellPreviewOrder$Response;", "updateCountDownTime", "countDownTime", "", "setRefreshing", "isRefreshing", "", "showDividerLine", "isShow", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSellConfirmInfoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SellConfirmInfoView.kt\ncom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmInfoView\n+ 2 ViewGroupBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ViewGroupBindingsKt\n*L\n1#1,126:1\n41#2:127\n65#2:128\n80#2,7:129\n*S KotlinDebug\n*F\n+ 1 SellConfirmInfoView.kt\ncom/kubi/payment/fasttrade/sell/confirm/widget/SellConfirmInfoView\n*L\n29#1:127\n29#1:128\n29#1:129,7\n*E\n"})
public final class SellConfirmInfoView extends ConstraintLayout {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ KProperty<Object>[] f38911q = {Reflection.property1(new PropertyReference1Impl(SellConfirmInfoView.class, "binding", "getBinding()Lcom/kubi/otc/databinding/PaymentViewFastSellConfirmInfoBinding;", 0))};

    /* JADX INFO: renamed from: n */
    @NotNull
    public final InterfaceC24293a f38912n;

    /* JADX INFO: renamed from: o */
    @Nullable
    public Function0<Unit> f38913o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public Function0<Unit> f38914p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellConfirmInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f38912n = new LazyViewBindingProperty(UtilsKt.m58554b(), new Function1<ViewGroup, C37650l3>() { // from class: com.kubi.payment.fasttrade.sell.confirm.widget.SellConfirmInfoView$special$$inlined$viewBinding$1
            @Override // p852kotlin.jvm.functions.Function1
            @NotNull
            public final C37650l3 invoke(@NotNull ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
                return C37650l3.m84884a(C45682f.m100801b(viewGroup));
            }
        });
        LayoutInflater.from(context).inflate(R$layout.payment_view_fast_sell_confirm_info, this);
    }

    /* JADX INFO: renamed from: c */
    public static final Unit m47091c(SellConfirmInfoView sellConfirmInfoView) {
        Function0<Unit> function0 = sellConfirmInfoView.f38913o;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: d */
    public static final Unit m47092d(SellConfirmInfoView sellConfirmInfoView) {
        Function0<Unit> function0 = sellConfirmInfoView.f38914p;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    private final C37650l3 getBinding() {
        return (C37650l3) this.f38912n.getValue(this, f38911q[0]);
    }

    /* JADX INFO: renamed from: e */
    public final void m47093e(@NotNull SellPreviewOrder.Response previewOrder) {
        Intrinsics.checkNotNullParameter(previewOrder, "previewOrder");
        C37650l3 binding = getBinding();
        if (binding == null) {
            return;
        }
        if (previewOrder.getFeeInfo() == null) {
            BaseTextView tvFee = binding.f84242d;
            Intrinsics.checkNotNullExpressionValue(tvFee, "tvFee");
            C27046k.m66700o(tvFee);
            BaseTextView tvFeeValue = binding.f84243e;
            Intrinsics.checkNotNullExpressionValue(tvFeeValue, "tvFeeValue");
            C27046k.m66700o(tvFeeValue);
        } else {
            binding.f84243e.setText(getContext().getString(R$string.payment_price, C27041f.m66669i(previewOrder.getFeeInfo().getFeeAmount(), "--"), C27041f.m66668h(previewOrder.getFeeInfo().getFeeCurrency())));
            BaseTextView tvFee2 = binding.f84242d;
            Intrinsics.checkNotNullExpressionValue(tvFee2, "tvFee");
            C27046k.m66685H(tvFee2);
            BaseTextView tvFeeValue2 = binding.f84243e;
            Intrinsics.checkNotNullExpressionValue(tvFeeValue2, "tvFeeValue");
            C27046k.m66685H(tvFeeValue2);
        }
        SellPreviewOrder.Response.TaxInfo taxInfo = previewOrder.getTaxInfo();
        String strM66668h = C27041f.m66668h(taxInfo != null ? taxInfo.getTaxMessage() : null);
        if (strM66668h.length() == 0) {
            BaseTextView tvTax = binding.f84248j;
            Intrinsics.checkNotNullExpressionValue(tvTax, "tvTax");
            C27046k.m66700o(tvTax);
            BaseTextView tvTaxValue = binding.f84249k;
            Intrinsics.checkNotNullExpressionValue(tvTaxValue, "tvTaxValue");
            C27046k.m66700o(tvTaxValue);
        } else {
            binding.f84249k.setText(strM66668h);
            BaseTextView tvTax2 = binding.f84248j;
            Intrinsics.checkNotNullExpressionValue(tvTax2, "tvTax");
            C27046k.m66685H(tvTax2);
            BaseTextView tvTaxValue2 = binding.f84249k;
            Intrinsics.checkNotNullExpressionValue(tvTaxValue2, "tvTaxValue");
            C27046k.m66685H(tvTaxValue2);
        }
        binding.f84245g.setText(previewOrder.getPaymentMethodName());
        binding.f84240b.setCurrency(previewOrder.getCryptoCurrency());
        binding.f84240b.m49861a(previewOrder.getPrice(), previewOrder.getFiatCurrency());
        binding.f84247i.setText(getContext().getString(R$string.payment_price, C42180b.m92640e(DowngradeExKt.m66535e(previewOrder.getFiatAmount(), null, 1, null), null, 0, false, false, false, 0, null, 127, null), C27041f.m66668h(previewOrder.getFiatCurrency())));
    }

    /* JADX INFO: renamed from: g */
    public final void m47095g(@NotNull String countDownTime) {
        ConfirmCountDownView confirmCountDownView;
        Intrinsics.checkNotNullParameter(countDownTime, "countDownTime");
        C37650l3 binding = getBinding();
        if (binding == null || (confirmCountDownView = binding.f84240b) == null) {
            return;
        }
        confirmCountDownView.m49862b(countDownTime);
    }

    public final void setOnFeeClickListener(@Nullable Function0<Unit> listener) {
        this.f38913o = listener;
    }

    public final void setOnTaxClickListener(@Nullable Function0<Unit> listener) {
        this.f38914p = listener;
    }

    /* JADX INFO: renamed from: f */
    public final void m47094f(boolean z11) {
        View view;
        C37650l3 binding = getBinding();
        if (binding != null && (view = binding.f84241c) != null) {
            view.setVisibility(C21457l.m49860h(z11));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        BaseTextView baseTextView;
        BaseTextView baseTextView2;
        super.onFinishInflate();
        C37650l3 binding = getBinding();
        if (binding != null && (baseTextView2 = binding.f84242d) != null) {
            C27046k.m66711z(baseTextView2, 0L, new Function0() { // from class: vt.a
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SellConfirmInfoView.m47091c(this.f102951b);
                }
            }, 1, null);
        }
        C37650l3 binding2 = getBinding();
        if (binding2 != null && (baseTextView = binding2.f84248j) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: vt.b
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SellConfirmInfoView.m47092d(this.f102952b);
                }
            }, 1, null);
        }
    }

    public final void setRefreshing(boolean isRefreshing) {
        ConfirmCountDownView confirmCountDownView;
        C37650l3 binding = getBinding();
        if (binding != null && (confirmCountDownView = binding.f84240b) != null) {
            confirmCountDownView.setRefreshing(isRefreshing);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SellConfirmInfoView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SellConfirmInfoView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
