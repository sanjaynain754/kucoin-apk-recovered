package com.kubi.payment.fast.paymentmethod;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.kubi.host.HostManager;
import com.kubi.otc.PaymentWebActivity;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.common.data.entities.UpgradeOptionRequest;
import com.kubi.payment.common.helper.UpgradeOptionHelper;
import com.kubi.payment.fast.buy.u;
import com.kubi.payment.fast.common.confirm.ConfirmExtraParams;
import com.kubi.payment.fast.data.entities.PaymentMethodList;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27099x;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27041f;
import ht.C38346y;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p026ay.C4400a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: PaymentMethodFragmentExt.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@¢\u0006\u0002\u0010\u000e\u001a\u0012\u0010\u000f\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u001a,\u0010\u0010\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n\u001a&\u0010\u0016\u001a\u00020\u0017*\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\n\u001a \u0010\u0019\u001a\u00020\u0017*\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0002\u001a\u0014\u0010\u001b\u001a\u00020\n*\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m90084d2 = {"KEY_CARD_ID", "", "KEY_EXTRA_PARAMS", "KEY_PURCHASE_TYPE", "ONE_TIME_PURCHASE", "RECURRING_PURCHASE", "KEY_NEED_LOGIN", "PAY_WITH_NEW_BANK_CARD_URL", "UPDATE_BANK_CARD_URL", "checkAppVersion", "", "Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;", "paymentMethod", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;", "(Lcom/kubi/payment/fast/paymentmethod/PaymentMethodFragment;Lcom/kubi/payment/fast/data/entities/PaymentMethodList$PaymentMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkDailyLimit", "preHandleBankcard", "context", "Landroid/content/Context;", "extraParams", "Lcom/kubi/payment/fast/common/confirm/ConfirmExtraParams;", "isOneTimePurchase", "launchPayWithNewBankCardPage", "", "confirmExtraParams", "launchUpdateBankCardPage", "cardId", "isExpired", "bankCardInfo", "Lcom/kubi/payment/fast/data/entities/PaymentMethodList$BankCardInfo;", "PaymentLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPaymentMethodFragmentExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodFragmentExt.kt\ncom/kubi/payment/fast/paymentmethod/PaymentMethodFragmentExtKt\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,171:1\n29#2:172\n29#2:173\n*S KotlinDebug\n*F\n+ 1 PaymentMethodFragmentExt.kt\ncom/kubi/payment/fast/paymentmethod/PaymentMethodFragmentExtKt\n*L\n127#1:172\n147#1:173\n*E\n"})
public final class PaymentMethodFragmentExtKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final String f38605a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f38606b;

    static {
        StringBuilder sb2 = new StringBuilder();
        HostManager hostManager = HostManager.a;
        sb2.append(hostManager.e());
        sb2.append("/express/pay-with-new-card");
        f38605a = sb2.toString();
        f38606b = hostManager.e() + "/express/payment-method/bank-card/update";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final Object m46559d(@NotNull PaymentMethodFragment paymentMethodFragment, @NotNull PaymentMethodList.PaymentMethod paymentMethod, @NotNull Continuation<? super Boolean> continuation) {
        PaymentMethodFragmentExtKt$checkAppVersion$1 paymentMethodFragmentExtKt$checkAppVersion$1;
        String str;
        if (continuation instanceof PaymentMethodFragmentExtKt$checkAppVersion$1) {
            paymentMethodFragmentExtKt$checkAppVersion$1 = (PaymentMethodFragmentExtKt$checkAppVersion$1) continuation;
            int i11 = paymentMethodFragmentExtKt$checkAppVersion$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                paymentMethodFragmentExtKt$checkAppVersion$1.label = i11 - Integer.MIN_VALUE;
            } else {
                paymentMethodFragmentExtKt$checkAppVersion$1 = new PaymentMethodFragmentExtKt$checkAppVersion$1(continuation);
            }
        } else {
            paymentMethodFragmentExtKt$checkAppVersion$1 = new PaymentMethodFragmentExtKt$checkAppVersion$1(continuation);
        }
        Object objM46258b = paymentMethodFragmentExtKt$checkAppVersion$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = paymentMethodFragmentExtKt$checkAppVersion$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM46258b);
            String paymentType = paymentMethod.getPaymentType();
            if (paymentType == null) {
                str = str;
            } else {
                int iHashCode = paymentType.hashCode();
                if (iHashCode != -448995838) {
                    String str2 = (iHashCode == 378796732 ? paymentType.equals(FastQuoteModel.PAY_BALANCE) : iHashCode == 1028436787 && paymentType.equals(FastQuoteModel.PAY_BANK_CARD)) ? "CRYPTO_TRADE" : "";
                    str = str2;
                } else if (paymentType.equals("POPULAR_PAY")) {
                    str = "POPULAR_PAY";
                }
                str = str2;
            }
            if (str.length() == 0) {
                return Boxing.boxBoolean(true);
            }
            paymentMethodFragment.showLoadingDialog();
            UpgradeOptionHelper upgradeOptionHelper = UpgradeOptionHelper.f38522a;
            UpgradeOptionRequest upgradeOptionRequest = new UpgradeOptionRequest(str, C27041f.m66668h(paymentMethod.getFiatCurrency()), C27041f.m66668h(paymentMethod.getCryptoCurrency()), C27041f.m66668h(paymentMethod.getPaymentMethodCode()), null, 16, null);
            FragmentManager childFragmentManager = paymentMethodFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            paymentMethodFragmentExtKt$checkAppVersion$1.L$0 = paymentMethodFragment;
            paymentMethodFragmentExtKt$checkAppVersion$1.L$1 = SpillingKt.nullOutSpilledVariable(paymentMethod);
            paymentMethodFragmentExtKt$checkAppVersion$1.L$2 = SpillingKt.nullOutSpilledVariable(str);
            paymentMethodFragmentExtKt$checkAppVersion$1.label = 1;
            objM46258b = upgradeOptionHelper.m46258b(upgradeOptionRequest, childFragmentManager, paymentMethodFragmentExtKt$checkAppVersion$1);
            if (objM46258b == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paymentMethodFragment = (PaymentMethodFragment) paymentMethodFragmentExtKt$checkAppVersion$1.L$0;
            ResultKt.throwOnFailure(objM46258b);
        }
        boolean zBooleanValue = ((Boolean) objM46258b).booleanValue();
        BaseFragment.hideLoadingDialog$default(paymentMethodFragment, false, 1, null);
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m46560e(@NotNull final PaymentMethodFragment paymentMethodFragment, @NotNull PaymentMethodList.PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethodFragment, "<this>");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        final PaymentMethodList.DailyLimit dailyLimit = paymentMethod.getDailyLimit();
        if (dailyLimit == null || C27025c.m66566d(dailyLimit.getDayLimitWhiteUser()) || C38346y.m86490A(dailyLimit.getLeftAmountCurrency()).compareTo(C38346y.m86490A(paymentMethod.getFiatAmount())) >= 0) {
            return true;
        }
        u uVar = u.a;
        FragmentManager childFragmentManager = paymentMethodFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        uVar.e(childFragmentManager, dailyLimit, new Function1() { // from class: com.kubi.payment.fast.paymentmethod.i
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PaymentMethodFragmentExtKt.m46561f(paymentMethodFragment, dailyLimit, (String) obj);
            }
        }, new Function0() { // from class: com.kubi.payment.fast.paymentmethod.j
            @Override // p852kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PaymentMethodFragmentExtKt.m46562g(paymentMethodFragment);
            }
        });
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static final Unit m46561f(PaymentMethodFragment paymentMethodFragment, PaymentMethodList.DailyLimit dailyLimit, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FragmentActivity activity = paymentMethodFragment.getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("data", dailyLimit.getLeftAmountCurrency());
            Unit unit = Unit.INSTANCE;
            activity.setResult(-1, intent);
        }
        paymentMethodFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m46563h(@NotNull final PaymentMethodFragment paymentMethodFragment, @Nullable final PaymentMethodList.BankCardInfo bankCardInfo) {
        Intrinsics.checkNotNullParameter(paymentMethodFragment, "<this>");
        boolean zM66566d = C27025c.m66566d(bankCardInfo != null ? bankCardInfo.getHasExpired() : null);
        if (zM66566d) {
            AlertDialogFragmentHelper alertDialogFragmentHelperM54162S4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54167X4(R$string.payment_update_card_title).m54169Z4(true).m54153J4(R$string.payment_update_card_content).m54157N4(true).m54161R4(0).m54159P4(R$string.payment_cancel, null).m54162S4(R$string.payment_update, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fast.paymentmethod.k
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    PaymentMethodFragmentExtKt.m46564i(paymentMethodFragment, bankCardInfo, dialogInterface, i11);
                }
            });
            FragmentManager childFragmentManager = paymentMethodFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            alertDialogFragmentHelperM54162S4.show(childFragmentManager, "payment_fast_bankcard_expired");
        }
        return zM66566d;
    }

    /* JADX INFO: renamed from: j */
    public static final void m46565j(@NotNull PaymentMethodFragment paymentMethodFragment, @NotNull Context context, @Nullable ConfirmExtraParams confirmExtraParams, boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(paymentMethodFragment, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        paymentMethodFragment.m46554Q3("B7PayWithNewCardCardInformation");
        C4400a c4400aM4038a = new C4400a(Uri.parse(f38605a), null, 2, null).m4038a("purchaseType", z11 ? "oneTimePurchase" : "recurringPurchase").m4038a("extraParams", Uri.encode(C27099x.m66919i(confirmExtraParams, false, 2, null)));
        Boolean bool = Boolean.TRUE;
        PaymentWebActivity.Companion.openUrl$default(PaymentWebActivity.f37079t, context, c4400aM4038a.m4038a("appNeedLang", bool).m4038a("needLogin", bool).m4038a("spm", "kcApp.B7PaymentMethod.button.2").m4045h(), null, null, false, false, 60, null);
        paymentMethodFragment.m46553P3(true);
    }

    /* JADX INFO: renamed from: k */
    public static final void m46566k(PaymentMethodFragment paymentMethodFragment, Context context, String str) {
        PaymentWebActivity.Companion.openUrl$default(PaymentWebActivity.f37079t, context, new C4400a(Uri.parse(f38606b), null, 2, null).m4038a("cardId", str).m4038a("appNeedLang", Boolean.TRUE).m4045h(), null, null, false, false, 60, null);
        paymentMethodFragment.m46553P3(true);
    }

    /* JADX INFO: renamed from: l */
    public static final boolean m46567l(@NotNull PaymentMethodFragment paymentMethodFragment, @NotNull PaymentMethodList.PaymentMethod paymentMethod, @NotNull Context context, @NotNull ConfirmExtraParams extraParams, boolean z11) throws JSONException {
        Intrinsics.checkNotNullParameter(paymentMethodFragment, "<this>");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(extraParams, "extraParams");
        if (!Intrinsics.areEqual(paymentMethod.getPaymentMethodCode(), "_ADD_NEW_CARD")) {
            return m46563h(paymentMethodFragment, paymentMethod.getBankCardInfo());
        }
        m46565j(paymentMethodFragment, context, extraParams, z11);
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static final Unit m46562g(PaymentMethodFragment paymentMethodFragment) {
        FragmentActivity activity = paymentMethodFragment.getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("data", "");
            Unit unit = Unit.INSTANCE;
            activity.setResult(-1, intent);
        }
        paymentMethodFragment.preformBackPressed();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final void m46564i(PaymentMethodFragment paymentMethodFragment, PaymentMethodList.BankCardInfo bankCardInfo, DialogInterface dialogInterface, int i11) {
        String cardId;
        Context context = paymentMethodFragment.getContext();
        if (bankCardInfo != null) {
            cardId = bankCardInfo.getCardId();
        } else {
            cardId = null;
        }
        m46566k(paymentMethodFragment, context, cardId);
    }
}
