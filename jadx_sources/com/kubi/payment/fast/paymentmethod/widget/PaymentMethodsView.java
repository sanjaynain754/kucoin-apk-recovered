package com.kubi.payment.fast.paymentmethod.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p673ut.InterfaceC45309a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PaymentMethodsView.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0014\u001a\u00020\u0010H\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodListener;", "getListener", "()Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodListener;", "setListener", "(Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodListener;)V", "setPaymentMethodListener", "", "bindData", "paymentMethodList", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "onDetachedFromWindow", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class PaymentMethodsView extends ConstraintLayout {

    /* JADX INFO: renamed from: n */
    @Nullable
    public InterfaceC45309a f38667n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo46600a(@NotNull PaymentMethodList.Response response);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Nullable
    /* JADX INFO: renamed from: getListener, reason: from getter */
    public final InterfaceC45309a getF38667n() {
        return this.f38667n;
    }

    public final void setListener(@Nullable InterfaceC45309a interfaceC45309a) {
        this.f38667n = interfaceC45309a;
    }

    public final void setPaymentMethodListener(@Nullable InterfaceC45309a interfaceC45309a) {
        this.f38667n = interfaceC45309a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38667n = null;
    }
}
