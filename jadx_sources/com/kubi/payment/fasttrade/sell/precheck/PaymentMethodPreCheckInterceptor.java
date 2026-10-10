package com.kubi.payment.fasttrade.sell.precheck;

import android.content.Context;
import android.content.DialogInterface;
import com.blankj.utilcode.util.C5277j0;
import com.kubi.otc.R$string;
import com.kubi.otc.otc.paytype.PayTypeWayFragment;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.precheck.IPreCheckInterceptor;
import com.kubi.payment.precheck.PreCheckRequest;
import com.kubi.payment.precheck.PreCheckResult;
import com.kubi.resources.dialog.AlertDialogFragmentHelper;
import com.kubi.sdk.base.p113ui.BaseFragmentActivity;
import com.kubi.utils.extensions.C27041f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.kubi.payment.fasttrade.sell.precheck.b, reason: from Kotlin metadata */
/* JADX INFO: compiled from: PaymentMethodPreCheckInterceptor.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096@¢\u0006\u0002\u0010\b¨\u0006\t"}, m90084d2 = {"Lcom/kubi/payment/fasttrade/sell/precheck/PaymentMethodPreCheckInterceptor;", "Lcom/kubi/payment/precheck/IPreCheckInterceptor;", "<init>", "()V", "intercept", "Lcom/kubi/payment/precheck/PreCheckResult;", "param", "Lcom/kubi/payment/precheck/PreCheckRequest;", "(Lcom/kubi/payment/precheck/PreCheckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class PaymentMethodPreCheckInterceptor implements IPreCheckInterceptor {
    /* JADX INFO: renamed from: c */
    public static final void m47137c(Context context, DialogInterface dialogInterface, int i11) {
        BaseFragmentActivity.m56573m0(context, C5277j0.m6253b(R$string.payment_p2p_menu_payment), PayTypeWayFragment.class.getName());
    }

    @Override // com.kubi.payment.precheck.IPreCheckInterceptor
    @Nullable
    /* JADX INFO: renamed from: a */
    public Object mo47135a(@NotNull PreCheckRequest preCheckRequest, @NotNull Continuation<? super PreCheckResult> continuation) {
        if (preCheckRequest instanceof PreCheckRequest.P2PSellPreCheckRequest) {
            PreCheckRequest.P2PSellPreCheckRequest p2PSellPreCheckRequest = (PreCheckRequest.P2PSellPreCheckRequest) preCheckRequest;
            SellPaymentMethod.Response.PaymentMethod.P2PInfo p2pInfo = p2PSellPreCheckRequest.getP2pInfo();
            if (!(p2pInfo != null ? Intrinsics.areEqual(p2pInfo.getUserPayTypeBind(), Boxing.boxBoolean(true)) : false)) {
                final Context context = p2PSellPreCheckRequest.getContext();
                AlertDialogFragmentHelper alertDialogFragmentHelperM54168Y4 = AlertDialogFragmentHelper.f43512a1.newInstanceAlert().m54168Y4(context.getString(R$string.payment_add_method));
                int i11 = R$string.payment_have_no_add_method;
                SellPaymentMethod.Response.PaymentMethod.P2PInfo p2pInfo2 = p2PSellPreCheckRequest.getP2pInfo();
                alertDialogFragmentHelperM54168Y4.m54156M4(context.getString(i11, C27041f.m66668h(p2pInfo2 != null ? p2pInfo2.getPayTypeCode() : null))).m54160Q4(context.getString(R$string.payment_select_other_methods), null).m54163T4(context.getString(R$string.payment_go_to_add), new DialogInterface.OnClickListener() { // from class: com.kubi.payment.fasttrade.sell.precheck.a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i12) {
                        PaymentMethodPreCheckInterceptor.m47137c(context, dialogInterface, i12);
                    }
                }).m54172c5(preCheckRequest.getFragmentManager());
                return PreCheckResult.Fail.INSTANCE;
            }
        }
        return PreCheckResult.Success.INSTANCE;
    }
}
