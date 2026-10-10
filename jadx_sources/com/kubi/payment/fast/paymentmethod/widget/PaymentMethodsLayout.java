package com.kubi.payment.fast.paymentmethod.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p658ub.C45148b;
import p673ut.InterfaceC45309a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PaymentMethodsLayout.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nJ\u0014\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m90084d2 = {"Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/kubi/payment/fast/paymentmethod/widget/PaymentMethodListener;", "setPaymentMethodListener", "", "bindData", "paymentMethods", "", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$Response;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodsLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsLayout.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsLayout\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n1869#2,2:64\n*S KotlinDebug\n*F\n+ 1 PaymentMethodsLayout.kt\ncom/kubi/payment/fast/paymentmethod/widget/PaymentMethodsLayout\n*L\n26#1:64,2\n*E\n"})
public final class PaymentMethodsLayout extends LinearLayoutCompat {

    /* JADX INFO: renamed from: b */
    @Nullable
    public InterfaceC45309a f38658b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final void m46607a(@NotNull List<PaymentMethodList.Response> paymentMethods) {
        Intrinsics.checkNotNullParameter(paymentMethods, "paymentMethods");
        removeAllViews();
        for (PaymentMethodList.Response response : paymentMethods) {
            String paymentType = response.getPaymentType();
            PaymentMethodsView paymentMethodsThirdPartyView = null;
            if (paymentType != null) {
                switch (paymentType.hashCode()) {
                    case -786382386:
                        if (paymentType.equals("THIRD_PARTY")) {
                            Context context = getContext();
                            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                            paymentMethodsThirdPartyView = new PaymentMethodsThirdPartyView(context);
                        }
                        break;
                    case -448995838:
                        if (paymentType.equals("POPULAR_PAY") && !C45148b.m99792b(response.isHidden())) {
                            Context context2 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                            paymentMethodsThirdPartyView = new PaymentMethodsPopularView(context2);
                        }
                        break;
                    case -58169665:
                        if (paymentType.equals("P2P_EXPRESS")) {
                            Context context3 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                            paymentMethodsThirdPartyView = new PaymentMethodsP2PView(context3);
                        }
                        break;
                    case 378796732:
                        if (paymentType.equals(FastQuoteModel.PAY_BALANCE)) {
                            Context context4 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                            paymentMethodsThirdPartyView = new PaymentMethodsBalanceView(context4);
                        }
                        break;
                    case 1028436787:
                        if (paymentType.equals(FastQuoteModel.PAY_BANK_CARD)) {
                            Context context5 = getContext();
                            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                            paymentMethodsThirdPartyView = new PaymentMethodsBankCardView(context5);
                        }
                        break;
                }
            }
            if (paymentMethodsThirdPartyView != null) {
                paymentMethodsThirdPartyView.setPaymentMethodListener(this.f38658b);
                paymentMethodsThirdPartyView.mo46600a(response);
                addView(paymentMethodsThirdPartyView);
            }
        }
    }

    public final void setPaymentMethodListener(@NotNull InterfaceC45309a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f38658b = listener;
    }
}
