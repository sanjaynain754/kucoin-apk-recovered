package com.kubi.payment.channel.withdraw.ee;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.kubi.otc.R$drawable;
import com.kubi.otc.R$string;
import com.kubi.otc.entity.FiatAccountExtraInfo;
import com.kubi.otc.entity.FiatFee;
import com.kubi.otc.entity.FiatWithdrawAccountInfo;
import com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment;
import com.kubi.otc.view.FiatEditTextView;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.channel.withdraw.common.confirm.CommonWithdrawConfirmFragment;
import com.kubi.payment.channel.withdraw.common.confirm.WithdrawConfirmExtraParams;
import com.kubi.payment.flutter.FlutterNavigationHelper;
import com.kubi.payment.flutter.FlutterUtils;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.resources.widget.BaseTextView;
import com.kubi.router.core.Router;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27041f;
import com.kubi.utils.extensions.C27046k;
import com.tencent.bugly.proguard.InterfaceC33617e1;
import com.tencent.qcloud.tuicore.TUIConstants;
import f00.C37304a;
import g00.InterfaceC37758j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p026ay.C4400a;
import p270ft.C37595a3;
import p270ft.C37705x;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EasyEuroWithdrawInputFragment.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0005H\u0016J\b\u0010\r\u001a\u00020\u000eH\u0014J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002¨\u0006\u0015"}, m90084d2 = {"Lcom/kubi/payment/channel/withdraw/ee/EasyEuroWithdrawInputFragment;", "Lcom/kubi/otc/fiat/withdraw/AbsFiatWithdrawInputFragment;", "<init>", "()V", "initData", "", "onViewCreated", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEdd", "startAddAccount", "needLoadFee", "", "startOrderConfirm", "fee", "Lcom/kubi/otc/entity/FiatFee;", "preCheckAccount", "launchVerifyAccountPage", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class EasyEuroWithdrawInputFragment extends AbsFiatWithdrawInputFragment {

    /* JADX INFO: renamed from: i0 */
    @NotNull
    public static final Companion f38395i0 = new Companion(null);

    /* JADX INFO: renamed from: j0 */
    @NotNull
    public static String f38396j0 = "";

    /* JADX INFO: renamed from: k0 */
    @Nullable
    public static PaymentMethod f38397k0;

    /* JADX INFO: compiled from: EasyEuroWithdrawInputFragment.kt */
    @Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/payment/channel/withdraw/ee/EasyEuroWithdrawInputFragment$Companion;", "", "<init>", "()V", "fiatCurrency", "", "getFiatCurrency", "()Ljava/lang/String;", "setFiatCurrency", "(Ljava/lang/String;)V", "tempPaymentMethod", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "getTempPaymentMethod", "()Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "setTempPaymentMethod", "(Lcom/kubi/payment/channel/data/entities/PaymentMethod;)V", InterfaceC33617e1.f69659h, "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        public final void launch() {
            InterfaceC37758j.a.m85154c(C37304a.f82764a, null, null, null, 7, null);
        }

        public final void setFiatCurrency(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            EasyEuroWithdrawInputFragment.f38396j0 = str;
        }

        @NotNull
        public final String getFiatCurrency() {
            return EasyEuroWithdrawInputFragment.f38396j0;
        }

        @Nullable
        public final PaymentMethod getTempPaymentMethod() {
            return EasyEuroWithdrawInputFragment.f38397k0;
        }

        public final void setTempPaymentMethod(@Nullable PaymentMethod paymentMethod) {
            EasyEuroWithdrawInputFragment.f38397k0 = paymentMethod;
        }
    }

    @Override // com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment
    /* JADX INFO: renamed from: E4 */
    public boolean mo44393E4() {
        return false;
    }

    /* JADX INFO: renamed from: b5 */
    public static final Unit m46047b5(EasyEuroWithdrawInputFragment easyEuroWithdrawInputFragment) {
        FlutterNavigationHelper flutterNavigationHelper = FlutterNavigationHelper.f39477a;
        PaymentMethod f37438b0 = easyEuroWithdrawInputFragment.getF37438b0();
        String strM66668h = C27041f.m66668h(f37438b0 != null ? f37438b0.getPaymentMethodCode() : null);
        PaymentMethod f37438b1 = easyEuroWithdrawInputFragment.getF37438b0();
        flutterNavigationHelper.m48163b("WITHDRAW", strM66668h, C27041f.m66668h(f37438b1 != null ? f37438b1.getChannelId() : null));
        C43852m.m96591c(C27041f.m66668h(easyEuroWithdrawInputFragment.getF16323V()), "EddSubmission", null, null, 12, null);
        return Unit.INSTANCE;
    }

    @Override // com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment
    /* JADX INFO: renamed from: J4 */
    public void mo44397J4() {
        C4400a c4400aM56184f = Router.f46192a.m56184f(FlutterUtils.m48217b(FlutterUtils.f39512a, "payment/ee/withdraw/account", false, 2, null));
        PaymentMethod f37438b0 = getF37438b0();
        C4400a c4400aM4038a = c4400aM56184f.m4038a("channelId", C27041f.m66668h(f37438b0 != null ? f37438b0.getChannelId() : null)).m4038a("fiatCurrency", getF37436Z());
        PaymentMethod f37438b1 = getF37438b0();
        c4400aM4038a.m4038a("paymentMethodCode", C27041f.m66668h(f37438b1 != null ? f37438b1.getPaymentMethodCode() : null)).m4048k();
    }

    /* JADX INFO: renamed from: c5 */
    public final void m46050c5() {
        FlutterNavigationHelper flutterNavigationHelper = FlutterNavigationHelper.f39477a;
        PaymentMethod f37438b0 = getF37438b0();
        String strM66668h = C27041f.m66668h(f37438b0 != null ? f37438b0.getPaymentMethodCode() : null);
        PaymentMethod f37438b1 = getF37438b0();
        String strM66668h2 = C27041f.m66668h(f37438b1 != null ? f37438b1.getChannelId() : null);
        String strM66668h3 = C27041f.m66668h(f38396j0);
        FiatWithdrawAccountInfo f37439c0 = getF37439c0();
        flutterNavigationHelper.m48162a(strM66668h, strM66668h2, strM66668h3, C27041f.m66668h(f37439c0 != null ? f37439c0.getPayoutAccountId() : null));
    }

    @Override // com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment, com.kubi.sdk.base.p113ui.OldBaseFragment, com.kubi.sdk.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) throws JSONException {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        m46049a5();
    }

    @Override // com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment
    /* JADX INFO: renamed from: q4 */
    public void mo44413q4() {
        m44394F4(f38396j0);
        super.m44395G4(f38397k0);
    }

    /* JADX INFO: renamed from: e5 */
    public static final void m46048e5(EasyEuroWithdrawInputFragment easyEuroWithdrawInputFragment, DialogInterface dialogInterface, int i11) {
        easyEuroWithdrawInputFragment.m46050c5();
    }

    @Override // com.kubi.otc.fiat.withdraw.AbsFiatWithdrawInputFragment
    /* JADX INFO: renamed from: K4 */
    public void mo44398K4(@Nullable FiatFee fiatFee) {
        String paymentMethodCode;
        String channelId;
        String payoutAccountId;
        String inputText;
        FiatEditTextView fiatEditTextView;
        if (!m46051d5()) {
            return;
        }
        CommonWithdrawConfirmFragment.Companion companion = CommonWithdrawConfirmFragment.f38384X;
        Context mContext = this.mContext;
        Intrinsics.checkNotNullExpressionValue(mContext, "mContext");
        PaymentMethod f37438b0 = getF37438b0();
        String title = null;
        if (f37438b0 != null) {
            paymentMethodCode = f37438b0.getPaymentMethodCode();
        } else {
            paymentMethodCode = null;
        }
        String strM66668h = C27041f.m66668h(paymentMethodCode);
        PaymentMethod f37438b1 = getF37438b0();
        if (f37438b1 != null) {
            channelId = f37438b1.getChannelId();
        } else {
            channelId = null;
        }
        String strM66668h2 = C27041f.m66668h(channelId);
        String f37436z = getF37436Z();
        FiatWithdrawAccountInfo f37439c0 = getF37439c0();
        if (f37439c0 != null) {
            payoutAccountId = f37439c0.getPayoutAccountId();
        } else {
            payoutAccountId = null;
        }
        String strM66668h3 = C27041f.m66668h(payoutAccountId);
        C37705x c37705xM44408d4 = m44408d4();
        if (c37705xM44408d4 != null && (fiatEditTextView = c37705xM44408d4.f84849s) != null) {
            inputText = fiatEditTextView.getInputText();
        } else {
            inputText = null;
        }
        String strM66668h4 = C27041f.m66668h(inputText);
        PaymentMethod f37438b2 = getF37438b0();
        if (f37438b2 != null) {
            title = f37438b2.getTitle();
        }
        companion.launch(mContext, new WithdrawConfirmExtraParams(strM66668h, strM66668h2, strM66668h3, strM66668h4, f37436z, C27041f.m66668h(title)), EasyEuroWithdrawConfirmFragment.class);
    }

    /* JADX INFO: renamed from: a5 */
    public final void m46049a5() {
        C37595a3 c37595a3;
        BaseTextView baseTextView;
        C37705x c37705xM44408d4 = m44408d4();
        if (c37705xM44408d4 != null && (c37595a3 = c37705xM44408d4.f84835e) != null && (baseTextView = c37595a3.f83611d) != null) {
            C27046k.m66711z(baseTextView, 0L, new Function0() { // from class: com.kubi.payment.channel.withdraw.ee.d
                @Override // p852kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return EasyEuroWithdrawInputFragment.m46047b5(this.f38401b);
                }
            }, 1, null);
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new EasyEuroWithdrawInputFragment$handleEdd$2(this, null));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: d5 */
    public final boolean m46051d5() {
        String status;
        String reason;
        FiatAccountExtraInfo extra;
        String reason2;
        FiatAccountExtraInfo extra2;
        FiatWithdrawAccountInfo f37439c0 = getF37439c0();
        if (f37439c0 != null) {
            status = f37439c0.getStatus();
        } else {
            status = null;
        }
        if (status != null) {
            switch (status.hashCode()) {
                case 2283824:
                    if (status.equals("Init")) {
                        m46050c5();
                        return false;
                    }
                    break;
                case 308097193:
                    if (status.equals("Verifying")) {
                        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_warning).m54169Z4(true).m54161R4(0).m54157N4(true).m54167X4(R$string.payment_account_status_verify);
                        FiatWithdrawAccountInfo f37439c1 = getF37439c0();
                        if (f37439c1 != null && (extra = f37439c1.getExtra()) != null) {
                            reason = extra.getReason();
                        } else {
                            reason = null;
                        }
                        alertDialogFragmentHelperM54167X4.m54156M4(C27041f.m66668h(reason)).m54162S4(R$string.payment_ok, null).m54172c5(getChildFragmentManager());
                        return false;
                    }
                    break;
                case 1955883814:
                    status.equals("Active");
                    break;
                case 2021313932:
                    if (status.equals("Closed")) {
                        ToastCompat.m66437C(R$string.payment_ee_account_closed);
                        return false;
                    }
                    break;
                case 2096857181:
                    if (status.equals("Failed")) {
                        AlertDialogFragmentHelper alertDialogFragmentHelperM54167X5 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54165V4(R$drawable.ic2_common_error).m54169Z4(true).m54161R4(0).m54157N4(true).m54167X4(R$string.payment_account_status_failed_des);
                        FiatWithdrawAccountInfo f37439c2 = getF37439c0();
                        if (f37439c2 != null && (extra2 = f37439c2.getExtra()) != null) {
                            reason2 = extra2.getReason();
                        } else {
                            reason2 = null;
                        }
                        alertDialogFragmentHelperM54167X5.m54156M4(C27041f.m66668h(reason2)).m54159P4(R$string.payment_cancel, null).m54162S4(R$string.payment_retry, new DialogInterface.OnClickListener() { // from class: com.kubi.payment.channel.withdraw.ee.e
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                EasyEuroWithdrawInputFragment.m46048e5(this.f38402b, dialogInterface, i11);
                            }
                        }).m54172c5(getChildFragmentManager());
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
}
