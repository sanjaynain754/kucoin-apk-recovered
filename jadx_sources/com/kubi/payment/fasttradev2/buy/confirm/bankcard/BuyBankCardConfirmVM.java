package com.kubi.payment.fasttradev2.buy.confirm.bankcard;

import android.os.Build;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.otc.R$string;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.payment.fast.data.entities.BankCard;
import com.kubi.payment.fast.data.entities.BuyPreviewOrder;
import com.kubi.payment.fast.data.entities.RiskSession;
import com.kubi.payment.fast.data.source.IFastRepository;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmExtraParams;
import com.kubi.payment.fasttradev2.buy.confirm.BuyCommonConfirmVM;
import com.kubi.payment.track.FastTrackData;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.util.ForterUtils;
import com.kubi.sdk.BaseApplication;
import com.kubi.utils.ToastCompat;
import com.kubi.utils.extensions.C27025c;
import com.kubi.utils.extensions.C27039d;
import com.kubi.utils.extensions.C27041f;
import et.C37242d;
import f00.C37304a;
import g00.InterfaceC37766r;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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

/* JADX INFO: compiled from: BuyBankCardConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020\u0014H\u0002J\u0010\u0010!\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0002\u0010\u001fJ \u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u00142\b\u0010$\u001a\u0004\u0018\u00010\u0014H\u0082@¢\u0006\u0002\u0010%J&\u0010&\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0082@¢\u0006\u0002\u0010+J\u0018\u0010,\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u0014H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00108F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0012¨\u0006."}, m90084d2 = {"Lcom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM;", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmVM;", "repository", "Lcom/kubi/payment/fast/data/source/IFastRepository;", "extraParams", "Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "<init>", "(Lcom/kubi/payment/fast/data/source/IFastRepository;Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;)V", "getRepository", "()Lcom/kubi/payment/fast/data/source/IFastRepository;", "getExtraParams", "()Lcom/kubi/payment/fasttradev2/buy/confirm/BuyCommonConfirmExtraParams;", "_needShowInputCVV", "Landroidx/lifecycle/MutableLiveData;", "", "needShowInputCVV", "Landroidx/lifecycle/LiveData;", "getNeedShowInputCVV", "()Landroidx/lifecycle/LiveData;", "_htmlString", "", "htmlString", "getHtmlString", "_redirectUrl", "redirectUrl", "getRedirectUrl", "placeOrder", "", "submitCVV", "cvv", "realPlaceOrder", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardToken", "loadRiskSessionId", "queryCollectStatus", "orderId", "overTimeStr", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryStatus", "startTime", "", "overTime", "", "(Ljava/lang/String;JILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildHtmlString", "threeDSMethodData", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nBuyBankCardConfirmVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BuyBankCardConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,266:1\n48#2,2:267\n*S KotlinDebug\n*F\n+ 1 BuyBankCardConfirmVM.kt\ncom/kubi/payment/fasttradev2/buy/confirm/bankcard/BuyBankCardConfirmVM\n*L\n175#1:267,2\n*E\n"})
public final class BuyBankCardConfirmVM extends BuyCommonConfirmVM {

    /* JADX INFO: renamed from: m0 */
    @NotNull
    public final IFastRepository f39100m0;

    /* JADX INFO: renamed from: n0 */
    @Nullable
    public final BuyCommonConfirmExtraParams f39101n0;

    /* JADX INFO: renamed from: o0 */
    @NotNull
    public final MutableLiveData<Boolean> f39102o0;

    /* JADX INFO: renamed from: p0 */
    @NotNull
    public final MutableLiveData<String> f39103p0;

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public final MutableLiveData<String> f39104q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyBankCardConfirmVM(@NotNull IFastRepository repository, @Nullable BuyCommonConfirmExtraParams buyCommonConfirmExtraParams) {
        super(repository, buyCommonConfirmExtraParams);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f39100m0 = repository;
        this.f39101n0 = buyCommonConfirmExtraParams;
        this.f39102o0 = new MutableLiveData<>();
        this.f39103p0 = new MutableLiveData<>();
        this.f39104q0 = new MutableLiveData<>();
    }

    /* JADX INFO: renamed from: f0 */
    private final String m47591f0(String str, String str2) {
        return "\n            <html>\n            <head>\n            \t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n            \t<title>KuCoin</title>\n            </head>\n            <body onload=\"document.getElementById('collect_form').submit();\">\n            \t<form id=\"collect_form\" target=\"_self\" method=\"post\" action=\"" + str + "\">\n            \t\t<input type=\"hidden\" name=\"threeDSMethodData\" value=\"" + str2 + "\">\n            \t</form>\n            </body>\n            </html>\n        ";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m0 */
    public final Object m47593m0(Continuation<? super String> continuation) {
        BuyBankCardConfirmVM$loadRiskSessionId$1 buyBankCardConfirmVM$loadRiskSessionId$1;
        if (continuation instanceof BuyBankCardConfirmVM$loadRiskSessionId$1) {
            buyBankCardConfirmVM$loadRiskSessionId$1 = (BuyBankCardConfirmVM$loadRiskSessionId$1) continuation;
            int i11 = buyBankCardConfirmVM$loadRiskSessionId$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                buyBankCardConfirmVM$loadRiskSessionId$1.label = i11 - Integer.MIN_VALUE;
            } else {
                buyBankCardConfirmVM$loadRiskSessionId$1 = new BuyBankCardConfirmVM$loadRiskSessionId$1(this, continuation);
            }
        } else {
            buyBankCardConfirmVM$loadRiskSessionId$1 = new BuyBankCardConfirmVM$loadRiskSessionId$1(this, continuation);
        }
        Object objMo46417M = buyBankCardConfirmVM$loadRiskSessionId$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = buyBankCardConfirmVM$loadRiskSessionId$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objMo46417M);
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = this.f39101n0;
            String str = C27025c.m66566d(buyCommonConfirmExtraParams != null ? Boxing.boxBoolean(buyCommonConfirmExtraParams.isRecurring()) : null) ? "recurringByCrypto" : "bycrypto";
            IFastRepository iFastRepository = this.f39100m0;
            buyBankCardConfirmVM$loadRiskSessionId$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
            buyBankCardConfirmVM$loadRiskSessionId$1.label = 1;
            objMo46417M = iFastRepository.mo46417M(str, buyBankCardConfirmVM$loadRiskSessionId$1);
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
    
        if (m47595p0(r9, r7, r2, r5) == r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0167, code lost:
    
        if (m47595p0(r10, r7, r4, r5) == r6) goto L55;
     */
    /* JADX INFO: renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47595p0(String str, long j11, int i11, Continuation<? super Unit> continuation) {
        BuyBankCardConfirmVM$queryStatus$1 buyBankCardConfirmVM$queryStatus$1;
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
        if (continuation instanceof BuyBankCardConfirmVM$queryStatus$1) {
            buyBankCardConfirmVM$queryStatus$1 = (BuyBankCardConfirmVM$queryStatus$1) continuation;
            int i14 = buyBankCardConfirmVM$queryStatus$1.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                buyBankCardConfirmVM$queryStatus$1.label = i14 - Integer.MIN_VALUE;
            } else {
                buyBankCardConfirmVM$queryStatus$1 = new BuyBankCardConfirmVM$queryStatus$1(this, continuation);
            }
        } else {
            buyBankCardConfirmVM$queryStatus$1 = new BuyBankCardConfirmVM$queryStatus$1(this, continuation);
        }
        BuyBankCardConfirmVM$queryStatus$1 buyBankCardConfirmVM$queryStatus$2 = buyBankCardConfirmVM$queryStatus$1;
        Object objMo46436s = buyBankCardConfirmVM$queryStatus$2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = buyBankCardConfirmVM$queryStatus$2.label;
        if (i15 == 0) {
            ResultKt.throwOnFailure(objMo46436s);
            buyBankCardConfirmVM$queryStatus$2.L$0 = str;
            buyBankCardConfirmVM$queryStatus$2.J$0 = j11;
            i12 = i11;
            buyBankCardConfirmVM$queryStatus$2.I$0 = i12;
            buyBankCardConfirmVM$queryStatus$2.label = 1;
            if (DelayKt.m90350b(2000L, buyBankCardConfirmVM$queryStatus$2) != coroutine_suspended) {
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
            i12 = buyBankCardConfirmVM$queryStatus$2.I$0;
            j13 = buyBankCardConfirmVM$queryStatus$2.J$0;
            str3 = (String) buyBankCardConfirmVM$queryStatus$2.L$0;
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
                    this.f39104q0.setValue(C27041f.m66668h(buyResponse.getRedirectUrl()));
                    return Unit.INSTANCE;
                }
                buyBankCardConfirmVM$queryStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                buyBankCardConfirmVM$queryStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                buyBankCardConfirmVM$queryStatus$2.L$2 = SpillingKt.nullOutSpilledVariable(buyResponse);
                buyBankCardConfirmVM$queryStatus$2.J$0 = j13;
                buyBankCardConfirmVM$queryStatus$2.I$0 = i12;
                buyBankCardConfirmVM$queryStatus$2.label = 3;
            } else {
                i13 = i12;
                str4 = str3;
                if (abstractC42878k instanceof AbstractC42878k.Error) {
                    throw new NoWhenBranchMatchedException();
                }
                buyBankCardConfirmVM$queryStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(str4);
                buyBankCardConfirmVM$queryStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                buyBankCardConfirmVM$queryStatus$2.J$0 = j13;
                buyBankCardConfirmVM$queryStatus$2.I$0 = i13;
                buyBankCardConfirmVM$queryStatus$2.label = 4;
            }
            return coroutine_suspended;
        }
        i12 = buyBankCardConfirmVM$queryStatus$2.I$0;
        j12 = buyBankCardConfirmVM$queryStatus$2.J$0;
        str2 = (String) buyBankCardConfirmVM$queryStatus$2.L$0;
        ResultKt.throwOnFailure(objMo46436s);
        if (System.currentTimeMillis() - j12 > i12 * 1000) {
            InterfaceC37766r.a.m85190a(C37304a.f82764a, C37242d.f82569a.m83350c() + '/' + str2 + "?appNeedLang=true", null, null, null, null, null, null, 126, null);
            return Unit.INSTANCE;
        }
        IFastRepository iFastRepository = this.f39100m0;
        buyBankCardConfirmVM$queryStatus$2.L$0 = str2;
        buyBankCardConfirmVM$queryStatus$2.J$0 = j12;
        buyBankCardConfirmVM$queryStatus$2.I$0 = i12;
        buyBankCardConfirmVM$queryStatus$2.label = 2;
        objMo46436s = iFastRepository.mo46436s(str2, buyBankCardConfirmVM$queryStatus$2);
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
                buyBankCardConfirmVM$queryStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(str3);
                buyBankCardConfirmVM$queryStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                buyBankCardConfirmVM$queryStatus$2.L$2 = SpillingKt.nullOutSpilledVariable(buyResponse);
                buyBankCardConfirmVM$queryStatus$2.J$0 = j13;
                buyBankCardConfirmVM$queryStatus$2.I$0 = i12;
                buyBankCardConfirmVM$queryStatus$2.label = 3;
            } else {
                i13 = i12;
                str4 = str3;
                if (abstractC42878k instanceof AbstractC42878k.Error) {
                    throw new NoWhenBranchMatchedException();
                }
                buyBankCardConfirmVM$queryStatus$2.L$0 = SpillingKt.nullOutSpilledVariable(str4);
                buyBankCardConfirmVM$queryStatus$2.L$1 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                buyBankCardConfirmVM$queryStatus$2.J$0 = j13;
                buyBankCardConfirmVM$queryStatus$2.I$0 = i13;
                buyBankCardConfirmVM$queryStatus$2.label = 4;
            }
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x010e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0123  */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0135  */
    /* JADX WARN: Code duplicated, block: B:49:0x013a  */
    /* JADX WARN: Code duplicated, block: B:51:0x013d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0154  */
    /* JADX WARN: Code duplicated, block: B:57:0x0159  */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x0178  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e3  */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019e, code lost:
    
        if (m47594o0(r8, r9, r2) == r3) goto L64;
     */
    /* JADX INFO: renamed from: q0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m47596q0(Continuation<? super Unit> continuation) {
        BuyBankCardConfirmVM$realPlaceOrder$1 buyBankCardConfirmVM$realPlaceOrder$1;
        BuyPreviewOrder.Response value;
        String str;
        BankCard.BuyRequest buyRequest;
        AbstractC42878k abstractC42878k;
        BankCard.BuyResponse buyResponse;
        String redirectUrl;
        String redirectUrl2;
        BankCard.BuyResponseExtension ext;
        String redirectUrlData;
        BankCard.BuyResponseExtension ext2;
        String redirectUrlData2;
        BankCard.BuyResponseExtension ext3;
        String delayTimeSeconds;
        if (continuation instanceof BuyBankCardConfirmVM$realPlaceOrder$1) {
            buyBankCardConfirmVM$realPlaceOrder$1 = (BuyBankCardConfirmVM$realPlaceOrder$1) continuation;
            int i11 = buyBankCardConfirmVM$realPlaceOrder$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                buyBankCardConfirmVM$realPlaceOrder$1.label = i11 - Integer.MIN_VALUE;
            } else {
                buyBankCardConfirmVM$realPlaceOrder$1 = new BuyBankCardConfirmVM$realPlaceOrder$1(this, continuation);
            }
        } else {
            buyBankCardConfirmVM$realPlaceOrder$1 = new BuyBankCardConfirmVM$realPlaceOrder$1(this, continuation);
        }
        Object objM47593m0 = buyBankCardConfirmVM$realPlaceOrder$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = buyBankCardConfirmVM$realPlaceOrder$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM47593m0);
            buyBankCardConfirmVM$realPlaceOrder$1.label = 1;
            objM47593m0 = m47593m0(buyBankCardConfirmVM$realPlaceOrder$1);
            if (objM47593m0 != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM47593m0);
        } else {
            if (i12 == 2) {
                buyRequest = (BankCard.BuyRequest) buyBankCardConfirmVM$realPlaceOrder$1.L$2;
                value = (BuyPreviewOrder.Response) buyBankCardConfirmVM$realPlaceOrder$1.L$1;
                str = (String) buyBankCardConfirmVM$realPlaceOrder$1.L$0;
                ResultKt.throwOnFailure(objM47593m0);
                abstractC42878k = (AbstractC42878k) objM47593m0;
                if (abstractC42878k instanceof AbstractC42878k.Success) {
                    buyResponse = (BankCard.BuyResponse) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                    if (!Intrinsics.areEqual(buyResponse.getRedirectUrlType(), BankCard.BuyResponseExtension.TYPE_COLLECT_INFO)) {
                        redirectUrl2 = buyResponse.getRedirectUrl();
                        if (redirectUrl2 != null || redirectUrl2.length() == 0) {
                            ext = buyResponse.getExt();
                            if (ext != null) {
                                redirectUrlData = ext.getRedirectUrlData();
                            } else {
                                redirectUrlData = null;
                            }
                            if (redirectUrlData != null || redirectUrlData.length() == 0) {
                                ToastCompat.m66437C(R$string.system_error);
                                return Unit.INSTANCE;
                            }
                        }
                        MutableLiveData<String> mutableLiveData = this.f39103p0;
                        String strM66668h = C27041f.m66668h(buyResponse.getRedirectUrl());
                        ext2 = buyResponse.getExt();
                        if (ext2 != null) {
                            redirectUrlData2 = ext2.getRedirectUrlData();
                        } else {
                            redirectUrlData2 = null;
                        }
                        mutableLiveData.setValue(m47591f0(strM66668h, C27041f.m66668h(redirectUrlData2)));
                        String strM66668h2 = C27041f.m66668h(buyResponse.getOrderId());
                        ext3 = buyResponse.getExt();
                        if (ext3 != null) {
                            delayTimeSeconds = ext3.getDelayTimeSeconds();
                        } else {
                            delayTimeSeconds = null;
                        }
                        buyBankCardConfirmVM$realPlaceOrder$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                        buyBankCardConfirmVM$realPlaceOrder$1.L$1 = SpillingKt.nullOutSpilledVariable(value);
                        buyBankCardConfirmVM$realPlaceOrder$1.L$2 = SpillingKt.nullOutSpilledVariable(buyRequest);
                        buyBankCardConfirmVM$realPlaceOrder$1.L$3 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                        buyBankCardConfirmVM$realPlaceOrder$1.L$4 = SpillingKt.nullOutSpilledVariable(buyResponse);
                        buyBankCardConfirmVM$realPlaceOrder$1.label = 3;
                    } else {
                        redirectUrl = buyResponse.getRedirectUrl();
                        if (redirectUrl != null || redirectUrl.length() == 0) {
                            ToastCompat.m66437C(R$string.system_error);
                            return Unit.INSTANCE;
                        }
                        this.f39104q0.setValue(C27041f.m66668h(buyResponse.getRedirectUrl()));
                    }
                } else {
                    if (abstractC42878k instanceof AbstractC42878k.Error) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m47536O().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
                }
                return Unit.INSTANCE;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM47593m0);
        }
        return Unit.INSTANCE;
        String str2 = (String) objM47593m0;
        if (str2 == null || str2.length() == 0) {
            IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
            FastTrackData fastTrackData = new FastTrackData("buy", null, 2, null);
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams = this.f39101n0;
            fastTrackData.setFiatCurrency(buyCommonConfirmExtraParams != null ? buyCommonConfirmExtraParams.getFiatCurrency() : null);
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams2 = this.f39101n0;
            fastTrackData.setCryptoCurrency(buyCommonConfirmExtraParams2 != null ? buyCommonConfirmExtraParams2.getCryptoCurrency() : null);
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams3 = this.f39101n0;
            fastTrackData.setPaymentMethodCode(buyCommonConfirmExtraParams3 != null ? buyCommonConfirmExtraParams3.getPaymentMethodCode() : null);
            BuyCommonConfirmExtraParams buyCommonConfirmExtraParams4 = this.f39101n0;
            fastTrackData.setChannelId(buyCommonConfirmExtraParams4 != null ? buyCommonConfirmExtraParams4.getChannelId() : null);
            Unit unit = Unit.INSTANCE;
            track.mo49802j("CHECK_RISK_ERROR", false, "-10007:CHECK_RISK_ERROR", fastTrackData);
            return Unit.INSTANCE;
        }
        value = m47534M().getValue();
        if (value == null) {
            return Unit.INSTANCE;
        }
        String strM66668h3 = C27041f.m66668h(value.getQuoteId());
        String fiatCurrency = value.getFiatCurrency();
        String fiatAmount = value.getFiatAmount();
        String cryptoCurrency = value.getCryptoCurrency();
        String cryptoAmount = value.getCryptoAmount();
        BuyCommonConfirmExtraParams buyCommonConfirmExtraParams5 = this.f39101n0;
        String cardId = buyCommonConfirmExtraParams5 != null ? buyCommonConfirmExtraParams5.getCardId() : null;
        String strC = ForterUtils.a.c(BaseApplication.INSTANCE.get());
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        BankCard.BuyRequest buyRequest2 = new BankCard.BuyRequest(strM66668h3, null, fiatCurrency, fiatAmount, cryptoCurrency, cryptoAmount, new BankCard.BuyRequestExtension(cardId, str2, strC, BRAND), null, null, null, m47535N().getValue(), 898, null);
        IFastRepository iFastRepository = this.f39100m0;
        buyBankCardConfirmVM$realPlaceOrder$1.L$0 = SpillingKt.nullOutSpilledVariable(str2);
        buyBankCardConfirmVM$realPlaceOrder$1.L$1 = SpillingKt.nullOutSpilledVariable(value);
        buyBankCardConfirmVM$realPlaceOrder$1.L$2 = SpillingKt.nullOutSpilledVariable(buyRequest2);
        buyBankCardConfirmVM$realPlaceOrder$1.label = 2;
        Object objMo46431k0 = iFastRepository.mo46431k0(buyRequest2, buyBankCardConfirmVM$realPlaceOrder$1);
        if (objMo46431k0 != coroutine_suspended) {
            str = str2;
            objM47593m0 = objMo46431k0;
            buyRequest = buyRequest2;
            abstractC42878k = (AbstractC42878k) objM47593m0;
            if (abstractC42878k instanceof AbstractC42878k.Success) {
                buyResponse = (BankCard.BuyResponse) ((AbstractC42878k.Success) abstractC42878k).m94040a();
                if (!Intrinsics.areEqual(buyResponse.getRedirectUrlType(), BankCard.BuyResponseExtension.TYPE_COLLECT_INFO)) {
                    redirectUrl = buyResponse.getRedirectUrl();
                    if (redirectUrl != null) {
                    }
                    ToastCompat.m66437C(R$string.system_error);
                    return Unit.INSTANCE;
                }
                redirectUrl2 = buyResponse.getRedirectUrl();
                if (redirectUrl2 != null) {
                    ext = buyResponse.getExt();
                    if (ext != null) {
                        redirectUrlData = ext.getRedirectUrlData();
                    } else {
                        redirectUrlData = null;
                    }
                    if (redirectUrlData != null) {
                    }
                    ToastCompat.m66437C(R$string.system_error);
                    return Unit.INSTANCE;
                }
                ext = buyResponse.getExt();
                if (ext != null) {
                    redirectUrlData = ext.getRedirectUrlData();
                } else {
                    redirectUrlData = null;
                }
                if (redirectUrlData != null) {
                }
                ToastCompat.m66437C(R$string.system_error);
                return Unit.INSTANCE;
                MutableLiveData<String> mutableLiveData2 = this.f39103p0;
                String strM66668h4 = C27041f.m66668h(buyResponse.getRedirectUrl());
                ext2 = buyResponse.getExt();
                if (ext2 != null) {
                    redirectUrlData2 = ext2.getRedirectUrlData();
                } else {
                    redirectUrlData2 = null;
                }
                mutableLiveData2.setValue(m47591f0(strM66668h4, C27041f.m66668h(redirectUrlData2)));
                String strM66668h5 = C27041f.m66668h(buyResponse.getOrderId());
                ext3 = buyResponse.getExt();
                if (ext3 != null) {
                    delayTimeSeconds = ext3.getDelayTimeSeconds();
                } else {
                    delayTimeSeconds = null;
                }
                buyBankCardConfirmVM$realPlaceOrder$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                buyBankCardConfirmVM$realPlaceOrder$1.L$1 = SpillingKt.nullOutSpilledVariable(value);
                buyBankCardConfirmVM$realPlaceOrder$1.L$2 = SpillingKt.nullOutSpilledVariable(buyRequest);
                buyBankCardConfirmVM$realPlaceOrder$1.L$3 = SpillingKt.nullOutSpilledVariable(abstractC42878k);
                buyBankCardConfirmVM$realPlaceOrder$1.L$4 = SpillingKt.nullOutSpilledVariable(buyResponse);
                buyBankCardConfirmVM$realPlaceOrder$1.label = 3;
            } else {
                if (abstractC42878k instanceof AbstractC42878k.Error) {
                    throw new NoWhenBranchMatchedException();
                }
                m47536O().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
            }
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }

    @NotNull
    /* JADX INFO: renamed from: h0 */
    public final LiveData<String> m47597h0() {
        return this.f39103p0;
    }

    @NotNull
    /* JADX INFO: renamed from: i0 */
    public final LiveData<Boolean> m47598i0() {
        return this.f39102o0;
    }

    @NotNull
    /* JADX INFO: renamed from: j0 */
    public final LiveData<String> m47599j0() {
        return this.f39104q0;
    }

    @NotNull
    /* JADX INFO: renamed from: l0, reason: from getter */
    public final IFastRepository getF39100m0() {
        return this.f39100m0;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m47602x0(@NotNull String cvv) {
        Intrinsics.checkNotNullParameter(cvv, "cvv");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyBankCardConfirmVM$submitCVV$1(this, cvv, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g0 */
    public final String m47592g0() {
        String cardToken;
        BuyPreviewOrder.Response.BuyCardInfo cardInfo;
        BuyPreviewOrder.Response value = m47534M().getValue();
        if (value != null && (cardInfo = value.getCardInfo()) != null) {
            cardToken = cardInfo.getCardToken();
        } else {
            cardToken = null;
        }
        String strM66668h = C27041f.m66668h(cardToken);
        if (strM66668h.length() == 0) {
            C43846g.m96568c(new OtcMessage("cardToken is empty", "BuyBankCardConfirmVM", false, 4, null), null, 2, null);
        }
        return strM66668h;
    }

    /* JADX INFO: renamed from: o0 */
    private final Object m47594o0(String str, String str2, Continuation<? super Unit> continuation) {
        Integer intOrNull;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str2 != null) {
            intOrNull = StringsKt.toIntOrNull(str2);
        } else {
            intOrNull = null;
        }
        Object objM47595p0 = m47595p0(str, jCurrentTimeMillis, C27039d.m66651k(intOrNull, 15), continuation);
        if (objM47595p0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objM47595p0;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m47601n0() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new BuyBankCardConfirmVM$placeOrder$1(this, null), 3, null);
    }
}
