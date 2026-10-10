package com.kubi.payment.fast.paymentmethod;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.otc.security.SecuritySettingDialog;
import com.kubi.otc.service.OtcDepend;
import com.kubi.payment.fast.buy.balance.RecurringBalanceBuyConfirmFragment;
import com.kubi.payment.fast.buy.bankcard.RecurringBankCardConfirmFragment;
import com.kubi.payment.fast.buy.popularpay.googlepay.GooglePayConfirmFragment;
import com.kubi.payment.fast.buy.recurring.RecurringFrequency;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RecurringBuyHelper.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u001a\u001c\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0002\u001a$\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a$\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u000e"}, m90084d2 = {"previewOrderRecurringBuy", "", "Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;", "context", "Landroid/content/Context;", "paymentMethod", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "recurringFrequency", "Lcom/kubi/payment/fast/buy/recurring/RecurringFrequency;", "handleBalanceRecurring", "extraParams", "Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "handleBankCardRecurring", "handlePopularPayRecurring", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RecurringBuyHelperKt {
    /* JADX INFO: renamed from: e */
    public static final void m46586e(PaymentMethodFragment paymentMethodFragment, Context context, ConfirmExtraParams confirmExtraParams, PaymentMethodList.PaymentMethod paymentMethod) {
        if (PaymentMethodFragmentExtKt.m46567l(paymentMethodFragment, paymentMethod, context, confirmExtraParams, false)) {
            return;
        }
        RecurringBankCardConfirmFragment.a0.launch(context, confirmExtraParams);
    }

    /* JADX INFO: renamed from: d */
    public static final void m46585d(PaymentMethodFragment paymentMethodFragment, Context context, ConfirmExtraParams confirmExtraParams) {
        if (OtcDepend.f38138a.m45461j().isWithDrawPassword()) {
            RecurringBalanceBuyConfirmFragment.a0.launch(context, paymentMethodFragment, confirmExtraParams);
            return;
        }
        SecuritySettingDialog.Companion companion = SecuritySettingDialog.f38120x0;
        FragmentManager childFragmentManager = paymentMethodFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, new SecuritySettingDialog.SecuritySetting(false, true, false, false, false, null, 61, null));
    }

    /* JADX INFO: renamed from: g */
    public static final void m46588g(@NotNull PaymentMethodFragment paymentMethodFragment, @NotNull Context context, @Nullable PaymentMethodList.PaymentMethod paymentMethod, @Nullable RecurringFrequency recurringFrequency) {
        Intrinsics.checkNotNullParameter(paymentMethodFragment, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        if (paymentMethod == null || recurringFrequency == null) {
            return;
        }
        LifecycleOwnerKt.getLifecycleScope(paymentMethodFragment).launchWhenStarted(new RecurringBuyHelperKt$previewOrderRecurringBuy$1(paymentMethodFragment, paymentMethod, recurringFrequency, context, null));
    }

    /* JADX INFO: renamed from: f */
    public static final void m46587f(PaymentMethodFragment paymentMethodFragment, Context context, ConfirmExtraParams confirmExtraParams, PaymentMethodList.PaymentMethod paymentMethod) {
        String paymentMethodCode = paymentMethod.getPaymentMethodCode();
        if (paymentMethodCode != null) {
            int iHashCode = paymentMethodCode.hashCode();
            if (iHashCode != -1534821982) {
                if (iHashCode != 340261873) {
                    if (iHashCode != 340261997 || !paymentMethodCode.equals("google_pay_eu")) {
                        return;
                    }
                } else if (!paymentMethodCode.equals("google_pay_au")) {
                    return;
                }
            } else if (!paymentMethodCode.equals("google_pay")) {
                return;
            }
            GooglePayConfirmFragment.Companion.launch$default(GooglePayConfirmFragment.a0, context, paymentMethodFragment, confirmExtraParams, (String) null, 8, (Object) null);
        }
    }
}
