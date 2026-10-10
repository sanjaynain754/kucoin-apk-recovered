package com.kubi.payment.fasttradev2.buy.confirm.googlepay;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcException;
import com.kubi.payment.fast.buy.popularpay.googlepay.h;
import com.kubi.payment.fast.data.entities.BankCard;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fast.data.entities.GooglePaymentData;
import com.kubi.payment.fast.data.entities.RiskSession;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmVM;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import et.C37242d;
import f00.C37304a;
import g00.InterfaceC37766r;
import java.util.List;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p477nt.AbstractC42878k;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: BuyGooglePayConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019J\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001eJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001aJ\u0010\u0010!\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010\"J \u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010&J&\u0010'\u001a\u00020 2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0082@¢\u0006\u0002\u0010,J\u0018\u0010-\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;", "repository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;)V", "getRepository", "()Lcom/kubi/payment/fast/data/source/IFastRepository;", "getExtraParams", "()Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "_htmlString", "Landroidx/lifecycle/MutableLiveData;", "", "htmlString", "Landroidx/lifecycle/LiveData;", "getHtmlString", "()Landroidx/lifecycle/LiveData;", "_redirectUrl", "redirectUrl", "getRedirectUrl", "googlePayClient", "Lcom/google/android/gms/wallet/PaymentsClient;", "loadPaymentDataTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/wallet/PaymentData;", "handlePaymentData", "Lcom/kubi/payment/fast/data/entities/GooglePaymentData;", "paymentData", "(Lcom/google/android/gms/wallet/PaymentData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placeOrder", "", "loadRiskSessionId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryCollectStatus", "orderId", "overTimeStr", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryStatus", "startTime", "", "overTime", "", "(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildHtmlString", "threeDSMethodData", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyGooglePayConfirmVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyGooglePayConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,295:1\n1#2:296\n44#3,2:297\n*S KotlinDebug\n*F\n+ 1 BuyGooglePayConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/googlepay/BuyGooglePayConfirmVM\n*L\n90#1:297,2\n*E\n"})
public final class BuyGooglePayConfirmVM extends BuyCommonConfirmVM {

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final IFastRepository f39131m0;

    /* JADX INFO: renamed from: n0 */
    @Nullable
    public final BuyCommonConfirmExtraParams f39132n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final MutableLiveData<String> f39133o0;

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public final MutableLiveData<String> f39134p0;

    /* JADX INFO: renamed from: q0 */
    @Nullable
    public PaymentsClient f39135q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyGooglePayConfirmVM(@NotNull IFastRepository repository, @Nullable BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        super(repository, buyCommonConfirmExtraParams);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39131m0 = repository;
        this.f39132n0 = buyCommonConfirmExtraParams;
        this.f39133o0 = new MutableLiveData<>();
        this.f39134p0 = new MutableLiveData<>();
        this.f39135q0 = h.a.e(BaseApplication.INSTANCE.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h0 */
    public final String m47639h0(String str, String str2) {
        return "\n            <html>\n            <head>\n            \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n            \t<title>KuCoin</title>\n            </head>\n            <body onload=\"document.getElementById('collect_form').submit();\">\n            \t<form id=\"collect_form\" target=\"_self\" method=\"post\" action=\"" + str + "\">\n            \t\t<input type=\"hidden\" name=\"threeDSMethodData\" value=\"" + str2 + "\">\n            \t</form>\n            </body>\n            </html>\n        ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p0 */
    public final Object m47641p0(Continuation<? super String> continuation) {
        BuyGooglePayConfirmVM$loadRiskSessionId$1 buyGooglePayConfirmVM$loadRiskSessionId$1;
        if (continuation instanceof BuyGooglePayConfirmVM$loadRiskSessionId$1) {
            buyGooglePayConfirmVM$loadRiskSessionId$1 = (BuyGooglePayConfirmVM$loadRiskSessionId$1) continuation;
            int i11 = buyGooglePayConfirmVM$loadRiskSessionId$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                buyGooglePayConfirmVM$loadRiskSessionId$1.label = i11 - Integer.MIN_VALUE;
            } else {
                buyGooglePayConfirmVM$loadRiskSessionId$1 = new BuyGooglePayConfirmVM$loadRiskSessionId$1(this, continuation);
            }
        } else {
            buyGooglePayConfirmVM$loadRiskSessionId$1 = new BuyGooglePayConfirmVM$loadRiskSessionId$1(this, continuation);
        }
        Object objMo46417M = buyGooglePayConfirmVM$loadRiskSessionId$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = buyGooglePayConfirmVM$loadRiskSessionId$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo46417M);
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = this.f39132n0;
            String str = C27025c.m66566d(buyCommonConfirmExtraParams != null ? Boxing.boxBoolean(buyCommonConfirmExtraParams.isRecurring()) : null) ? "recurringByCrypto" : "bycrypto";
            IFastRepository iFastRepository = this.f39131m0;
            buyGooglePayConfirmVM$loadRiskSessionId$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            buyGooglePayConfirmVM$loadRiskSessionId$1.label = 1;
            objMo46417M = iFastRepository.mo46417M(str, buyGooglePayConfirmVM$loadRiskSessionId$1);
            if (objMo46417M == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objMo46417M);
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) objMo46417M;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            return ((RiskSession) ((AbstractC42878k.Success) abstractC42878k).m94040a()).getSessionId();
        }
        if (!(abstractC42878k instanceof AbstractC42878k.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0124  */
    /* JADX WARN: Code duplicated, block: B:51:0x0149  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:58:0x016d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
    
        if (m47643y0(r9, r7, r2, r5) == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0167, code lost:
    
        if (m47643y0(r10, r7, r4, r5) == r6) goto L55;
     */
    /* JADX INFO: renamed from: y0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47643y0(String str, long j11, int i11, Continuation<? super Unit> continuation) {
        BuyGooglePayConfirmVM$queryStatus$1 buyGooglePayConfirmVM$queryStatus$1;
        int i12;
        long j12;
        String str2;
        long j13;
        String str3;
        AbstractC42878k abstractC42878k;
        int i13;
        String str4;
        BankCard.BuyResponse buyResponse;
        String redirectUrl;
        if (continuation instanceof BuyGooglePayConfirmVM$queryStatus$1) {
            buyGooglePayConfirmVM$queryStatus$1 = (BuyGooglePayConfirmVM$queryStatus$1) continuation;
            int i14 = buyGooglePayConfirmVM$queryStatus$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                buyGooglePayConfirmVM$queryStatus$1.label = i14 - Integer.MIN_VALUE;
            } else {
                buyGooglePayConfirmVM$queryStatus$1 = new BuyGooglePayConfirmVM$queryStatus$1(this, continuation);
            }
        } else {
            buyGooglePayConfirmVM$queryStatus$1 = new BuyGooglePayConfirmVM$queryStatus$1(this, continuation);
        }
        BuyGooglePayConfirmVM$queryStatus$1 buyGooglePayConfirmVM$queryStatus$2 = buyGooglePayConfirmVM$queryStatus$1;
        Object objMo46436s = buyGooglePayConfirmVM$queryStatus$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = buyGooglePayConfirmVM$queryStatus$2.label;
        if (i15 == 0) {
            ResultKt.throwOnFailure(objMo46436s);
            buyGooglePayConfirmVM$queryStatus$2.L$0 = str;
            buyGooglePayConfirmVM$queryStatus$2.J$0 = j11;
            i12 = i11;
            buyGooglePayConfirmVM$queryStatus$2.I$0 = i12;
            buyGooglePayConfirmVM$queryStatus$2.label = 1;
            if (DelayKt.m90350b(2000L, buyGooglePayConfirmVM$queryStatus$2) != coroutine_suspended) {
                j12 = j11;
                str2 = str;
            }
            return coroutine_suspended;
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 == 3) {
                    ResultKt.throwOnFailure(objMo46436s);
                    return Unit.INSTANCE;
                }
                if (i15 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objMo46436s);
                return Unit.INSTANCE;
            }
            i12 = buyGooglePayConfirmVM$queryStatus$2.I$0;
            j13 = buyGooglePayConfirmVM$queryStatus$2.J$0;
            str3 = (String) buyGooglePayConfirmVM$queryStatus$2.L$0;
            ResultKt.throwOnFailure(objMo46436s);
            abstractC42878k = (AbstractC42878k) objMo46436s;
            if (abstractC42878k instanceof AbstractC42878k.Success) {
                buyResponse = (BankCard.BuyResponse) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                if (Intrinsics.areEqual(buyResponse.getRedirectUrlType(), BankCard.BuyResponseExtension.TYPE_COLLECT_INFO)) {
                    redirectUrl = buyResponse.getRedirectUrl();
                    if (redirectUrl != null || redirectUrl.length() == 0) {
                        ToastCompat.m66437C(R$string.system_error);
                        return Unit.INSTANCE;
                    }
                    this.f39134p0.setValue(C27041f.m66668h(buyResponse.getRedirectUrl()));
                    return Unit.INSTANCE;
                }
                buyGooglePayConfirmVM$queryStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                buyGooglePayConfirmVM$queryStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                buyGooglePayConfirmVM$queryStatus$2.L$2 = SpillingKt.nullOutSpilledVariable(buyResponse);
                buyGooglePayConfirmVM$queryStatus$2.J$0 = j13;
                buyGooglePayConfirmVM$queryStatus$2.I$0 = i12;
                buyGooglePayConfirmVM$queryStatus$2.label = 3;
            } else {
                i13 = i12;
                str4 = str3;
                if (abstractC42878k instanceof AbstractC42878k.Error) {
                    throw new NoWhenBranchMatchedException();
                }
                buyGooglePayConfirmVM$queryStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(str4);
                buyGooglePayConfirmVM$queryStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                buyGooglePayConfirmVM$queryStatus$2.J$0 = j13;
                buyGooglePayConfirmVM$queryStatus$2.I$0 = i13;
                buyGooglePayConfirmVM$queryStatus$2.label = 4;
            }
            return coroutine_suspended;
        }
        i12 = buyGooglePayConfirmVM$queryStatus$2.I$0;
        j12 = buyGooglePayConfirmVM$queryStatus$2.J$0;
        str2 = (String) buyGooglePayConfirmVM$queryStatus$2.L$0;
        ResultKt.throwOnFailure(objMo46436s);
        if (System.currentTimeMillis() - j12 > i12 * 1000) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C37242d.f82569a.m83350c() + '/' + str2 + "?appNeedLang=true", null, null, null, null, null, null, 126, null);
            return Unit.INSTANCE;
        }
        IFastRepository iFastRepository = this.f39131m0;
        buyGooglePayConfirmVM$queryStatus$2.L$0 = str2;
        buyGooglePayConfirmVM$queryStatus$2.J$0 = j12;
        buyGooglePayConfirmVM$queryStatus$2.I$0 = i12;
        buyGooglePayConfirmVM$queryStatus$2.label = 2;
        objMo46436s = iFastRepository.mo46436s(str2, buyGooglePayConfirmVM$queryStatus$2);
        if (objMo46436s != coroutine_suspended) {
            j13 = j12;
            str3 = str2;
            abstractC42878k = (AbstractC42878k) objMo46436s;
            if (abstractC42878k instanceof AbstractC42878k.Success) {
                buyResponse = (BankCard.BuyResponse) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                if (Intrinsics.areEqual(buyResponse.getRedirectUrlType(), BankCard.BuyResponseExtension.TYPE_COLLECT_INFO)) {
                    redirectUrl = buyResponse.getRedirectUrl();
                    if (redirectUrl != null) {
                    }
                    ToastCompat.m66437C(R$string.system_error);
                    return Unit.INSTANCE;
                }
                buyGooglePayConfirmVM$queryStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                buyGooglePayConfirmVM$queryStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                buyGooglePayConfirmVM$queryStatus$2.L$2 = SpillingKt.nullOutSpilledVariable(buyResponse);
                buyGooglePayConfirmVM$queryStatus$2.J$0 = j13;
                buyGooglePayConfirmVM$queryStatus$2.I$0 = i12;
                buyGooglePayConfirmVM$queryStatus$2.label = 3;
            } else {
                i13 = i12;
                str4 = str3;
                if (abstractC42878k instanceof AbstractC42878k.Error) {
                    throw new NoWhenBranchMatchedException();
                }
                buyGooglePayConfirmVM$queryStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(str4);
                buyGooglePayConfirmVM$queryStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                buyGooglePayConfirmVM$queryStatus$2.J$0 = j13;
                buyGooglePayConfirmVM$queryStatus$2.I$0 = i13;
                buyGooglePayConfirmVM$queryStatus$2.label = 4;
            }
        }
        return coroutine_suspended;
    }

    @Nullable
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final BuyCommonConfirmExtraParams getF39132n0() {
        return this.f39132n0;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final LiveData<String> m47645j0() {
        return this.f39133o0;
    }

    @NotNull
    /* JADX INFO: renamed from: l0 */
    public final LiveData<String> m47646l0() {
        return this.f39134p0;
    }

    @NotNull
    /* JADX INFO: renamed from: m0, reason: from getter */
    public final IFastRepository getF39131m0() {
        return this.f39131m0;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m47649q0(@NotNull PaymentData paymentData) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyGooglePayConfirmVM$placeOrder$1(this, paymentData, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n0 */
    public final Object m47640n0(PaymentData paymentData, Continuation<? super GooglePaymentData> continuation) {
        return C41686h.m91049g(C42911a.m94120b(), new BuyGooglePayConfirmVM$handlePaymentData$2(paymentData, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x0 */
    public final Object m47642x0(String str, String str2, Continuation<? super Unit> continuation) {
        Integer intOrNull;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str2 != null) {
            intOrNull = StringsKt.toIntOrNull(str2);
        } else {
            intOrNull = null;
        }
        Object objM47643y0 = m47643y0(str, jCurrentTimeMillis, C27039d.m66651k(intOrNull, 15), continuation);
        if (objM47643y0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM47643y0;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: o0 */
    public final Task<PaymentData> m47648o0() {
        BuyPreviewOrder.Response.BuyGooglePayInfo googlePayInfo;
        String str;
        BuyPreviewOrder.Response value = m47534M().getValue();
        if (value == null || (googlePayInfo = value.getGooglePayInfo()) == null) {
            return null;
        }
        try {
            h hVar = h.a;
            List<String> supportedNetworks = googlePayInfo.getSupportedNetworks();
            String fiatAmount = value.getFiatAmount();
            String publicKey = googlePayInfo.getPublicKey();
            String merchantName = googlePayInfo.getMerchantName();
            String fiatCurrency = value.getFiatCurrency();
            String countryCode = googlePayInfo.getCountryCode();
            if (countryCode == null) {
                countryCode = "";
            }
            if (countryCode.length() == 0) {
                str = null;
            } else {
                str = countryCode;
            }
            JSONObject jSONObjectD = hVar.d(supportedNetworks, fiatAmount, publicKey, merchantName, fiatCurrency, str);
            C44128b.m97259c("payment", "Google Pay paymentDataRequestJson:" + jSONObjectD);
            PaymentDataRequest paymentDataRequestFromJson = PaymentDataRequest.fromJson(jSONObjectD.toString());
            Intrinsics.checkNotNullExpressionValue(paymentDataRequestFromJson, "fromJson(...)");
            PaymentsClient paymentsClient = this.f39135q0;
            if (paymentsClient == null) {
                return null;
            }
            return paymentsClient.loadPaymentData(paymentDataRequestFromJson);
        } catch (Exception e11) {
            C43846g.m96568c(new OtcException(new Throwable("Google Pay load payment data error: " + e11.getMessage()), "payment", false, null, 8, null), null, 2, null);
            return null;
        }
    }
}
