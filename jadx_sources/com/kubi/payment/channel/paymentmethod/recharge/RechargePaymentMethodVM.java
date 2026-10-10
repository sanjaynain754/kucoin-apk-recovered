package com.kubi.payment.channel.paymentmethod.recharge;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.kubi.data.entity.CoinInfoEntity;
import com.kubi.otc.exception.OtcMessage;
import com.kubi.payment.base.BasePaymentVM;
import com.kubi.payment.channel.data.entities.GuidePayment;
import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.payment.channel.precheck.PreCheckInterceptorChain;
import com.kubi.payment.channel.precheck.PreCheckRequest;
import com.kubi.payment.data.entities.UserInfo;
import com.kubi.utils.extensions.C27041f;
import gf.C37900x;
import java.util.List;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41729r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p477nt.AbstractC42878k;
import p569qq.C43841b;
import p569qq.C43846g;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: RechargePaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0011\u001a\u00020\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0002\b\u0013J\u0006\u0010'\u001a\u00020\u0012J\u0010\u0010(\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010\u001fJ\u0016\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,2\u0006\u0010\u001c\u001a\u00020\u0017J\u0010\u0010-\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010\u001fJ6\u0010.\u001a \u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160/\u0012\n\u0012\b\u0012\u0004\u0012\u0002000/0\u00152\b\u0010)\u001a\u0004\u0018\u00010\u001fH\u0082@¢\u0006\u0002\u00101J\b\u00102\u001a\u00020\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010\u0014\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00160\u00150\tX\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010\u0019\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00160\u00150\f8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\f8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\f8F¢\u0006\u0006\u001a\u0004\b!\u0010\u000eR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\t8F¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00064"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodVM;", "Lcom/kubi/payment/base/BasePaymentVM;", "Lcom/kubi/payment/channel/data/source/IChannelRepository;", "repository", "<init>", "(Lcom/kubi/payment/channel/data/source/IChannelRepository;)V", "isFirstLoad", "", "_kycInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kubi/payment/data/entities/UserInfo$KycInfoResponse;", "kycInfo", "Landroidx/lifecycle/LiveData;", "getKycInfo", "()Landroidx/lifecycle/LiveData;", "preCheckChain", "Lcom/kubi/payment/channel/precheck/PreCheckInterceptorChain;", "setRechargePreCheckChain", "", "setRechargePreCheckChain$PaymentLib_googleRelease", "_paymentMethodList", "Lkotlin/Pair;", "", "Lcom/kubi/payment/channel/data/entities/PaymentMethod;", "Lcom/kubi/payment/channel/data/entities/GuidePayment$PaymentMethod;", "paymentMethodList", "getPaymentMethodList", "_paymentMethod", "paymentMethod", "getPaymentMethod", "_currencyIconUrl", "", "currencyIconUrl", "getCurrencyIconUrl", "_australiaStationElderly", "", "australiaStationElderly", "getAustraliaStationElderly", "()Landroidx/lifecycle/MutableLiveData;", "loadUserInfo", "loadPaymentMethodList", "fiatCurrency", "preCheck", "request", "Lcom/kubi/payment/channel/precheck/PreCheckRequest;", "refreshCurrencyIconUrl", "getList", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/payment/channel/data/entities/GuidePayment$Response;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "Companion", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nRechargePaymentMethodVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RechargePaymentMethodVM.kt\ncom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodVM\n+ 2 OtcIssue.kt\ncom/kubi/otc/exception/OtcIssueKt\n*L\n1#1,218:1\n48#2,2:219\n*S KotlinDebug\n*F\n+ 1 RechargePaymentMethodVM.kt\ncom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodVM\n*L\n128#1:219,2\n*E\n"})
public final class RechargePaymentMethodVM extends BasePaymentVM<IChannelRepository> {

    /* JADX INFO: renamed from: h0 */
    @NotNull
    public static final Companion f38305h0 = new Companion(null);

    /* JADX INFO: renamed from: Z */
    @NotNull
    public final IChannelRepository f38306Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f38307a0;

    /* JADX INFO: renamed from: b0 */
    @NotNull
    public final MutableLiveData<UserInfo.KycInfoResponse> f38308b0;

    /* JADX INFO: renamed from: c0 */
    @Nullable
    public PreCheckInterceptorChain f38309c0;

    /* JADX INFO: renamed from: d0 */
    @NotNull
    public final MutableLiveData<Pair<List<PaymentMethod>, List<GuidePayment.PaymentMethod>>> f38310d0;

    /* JADX INFO: renamed from: e0 */
    @NotNull
    public final MutableLiveData<PaymentMethod> f38311e0;

    /* JADX INFO: renamed from: f0 */
    @NotNull
    public final MutableLiveData<String> f38312f0;

    /* JADX INFO: renamed from: g0 */
    @NotNull
    public final MutableLiveData<Object> f38313g0;

    /* JADX INFO: compiled from: RechargePaymentMethodVM.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/payment/channel/paymentmethod/recharge/RechargePaymentMethodVM$Companion;", "", "<init>", "()V", "CODE_800115", "", "PaymentLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RechargePaymentMethodVM(@NotNull IChannelRepository repository) {
        super(repository);
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f38306Z = repository;
        this.f38307a0 = true;
        this.f38308b0 = new MutableLiveData<>();
        this.f38310d0 = new MutableLiveData<>();
        this.f38311e0 = new MutableLiveData<>();
        this.f38312f0 = new MutableLiveData<>();
        this.f38313g0 = new MutableLiveData<>();
    }

    @NotNull
    /* JADX INFO: renamed from: G */
    public final MutableLiveData<Object> m45890G() {
        return this.f38313g0;
    }

    @NotNull
    /* JADX INFO: renamed from: H */
    public final LiveData<String> m45891H() {
        return this.f38312f0;
    }

    @NotNull
    /* JADX INFO: renamed from: I */
    public final LiveData<UserInfo.KycInfoResponse> m45892I() {
        return this.f38308b0;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: J */
    public final Object m45893J(String str, Continuation<? super Pair<? extends AbstractC42878k<? extends List<PaymentMethod>>, ? extends AbstractC42878k<GuidePayment.Response>>> continuation) {
        RechargePaymentMethodVM$getList$1 rechargePaymentMethodVM$getList$1;
        InterfaceC41729r0 interfaceC41729r0M91102b;
        String str2;
        InterfaceC41729r0 interfaceC41729r0;
        Object obj;
        if (continuation instanceof RechargePaymentMethodVM$getList$1) {
            rechargePaymentMethodVM$getList$1 = (RechargePaymentMethodVM$getList$1) continuation;
            int i11 = rechargePaymentMethodVM$getList$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rechargePaymentMethodVM$getList$1.label = i11 - Integer.MIN_VALUE;
            } else {
                rechargePaymentMethodVM$getList$1 = new RechargePaymentMethodVM$getList$1(this, continuation);
            }
        } else {
            rechargePaymentMethodVM$getList$1 = new RechargePaymentMethodVM$getList$1(this, continuation);
        }
        Object obj2 = rechargePaymentMethodVM$getList$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = rechargePaymentMethodVM$getList$1.label;
        if (i12 != 0) {
            if (i12 == 1) {
                interfaceC41729r0 = (InterfaceC41729r0) rechargePaymentMethodVM$getList$1.L$2;
                interfaceC41729r0M91102b = (InterfaceC41729r0) rechargePaymentMethodVM$getList$1.L$1;
                str2 = (String) rechargePaymentMethodVM$getList$1.L$0;
                ResultKt.throwOnFailure(obj2);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = rechargePaymentMethodVM$getList$1.L$3;
                ResultKt.throwOnFailure(obj2);
            }
            return TuplesKt.m90091to(obj, obj2);
        }
        ResultKt.throwOnFailure(obj2);
        interfaceC41729r0M91102b = C41696j.m91102b(ViewModelKt.getViewModelScope(this), null, null, new RechargePaymentMethodVM$getList$paymentDataTask$1(this, str, null), 3, null);
        InterfaceC41729r0 interfaceC41729r0M91102b2 = C41696j.m91102b(ViewModelKt.getViewModelScope(this), null, null, new RechargePaymentMethodVM$getList$guidePaymentListTask$1(this, str, null), 3, null);
        rechargePaymentMethodVM$getList$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
        rechargePaymentMethodVM$getList$1.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        rechargePaymentMethodVM$getList$1.L$2 = interfaceC41729r0M91102b2;
        rechargePaymentMethodVM$getList$1.label = 1;
        Object objMo91198h = interfaceC41729r0M91102b.mo91198h(rechargePaymentMethodVM$getList$1);
        if (objMo91198h != coroutine_suspended) {
            str2 = str;
            interfaceC41729r0 = interfaceC41729r0M91102b2;
            obj2 = objMo91198h;
        }
        return coroutine_suspended;
        rechargePaymentMethodVM$getList$1.L$0 = SpillingKt.nullOutSpilledVariable(str2);
        rechargePaymentMethodVM$getList$1.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0M91102b);
        rechargePaymentMethodVM$getList$1.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41729r0);
        rechargePaymentMethodVM$getList$1.L$3 = obj2;
        rechargePaymentMethodVM$getList$1.label = 2;
        Object objMo91198h2 = interfaceC41729r0.mo91198h(rechargePaymentMethodVM$getList$1);
        if (objMo91198h2 != coroutine_suspended) {
            Object obj3 = obj2;
            obj2 = objMo91198h2;
            obj = obj3;
            return TuplesKt.m90091to(obj, obj2);
        }
        return coroutine_suspended;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final LiveData<PaymentMethod> m45894K() {
        return this.f38311e0;
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    public final LiveData<Pair<List<PaymentMethod>, List<GuidePayment.PaymentMethod>>> m45895L() {
        return this.f38310d0;
    }

    /* JADX INFO: renamed from: M */
    public final void m45896M(@Nullable String str) {
        if (this.f38307a0) {
            m45658q().setValue(new BasePaymentVM.LoadingUIState(false, false, false, false, 15, null));
            C43841b.m96557d("B7channel_deposit", "data_load_start", null, 4, null);
        } else {
            m45657p().setValue(Boolean.TRUE);
        }
        if (str == null || str.length() == 0) {
            C43846g.m96568c(new OtcMessage("fiatCurrency is null", "payment_recharge", false, 4, null), null, 2, null);
        }
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new RechargePaymentMethodVM$loadPaymentMethodList$1(this, str, null), 3, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m45898O(@NotNull PreCheckRequest request, @NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new RechargePaymentMethodVM$preCheck$1(this, request, paymentMethod, null), 3, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m45899P(@Nullable String str) {
        CoinInfoEntity coinInfoEntityM85638D = C37900x.f85280a.m85638D(C27041f.m66668h(str));
        String iconUrl = coinInfoEntityM85638D != null ? coinInfoEntityM85638D.getIconUrl() : null;
        if (iconUrl == null || iconUrl.length() == 0) {
            return;
        }
        this.f38312f0.setValue(coinInfoEntityM85638D != null ? coinInfoEntityM85638D.getIconUrl() : null);
    }

    /* JADX INFO: renamed from: Q */
    public final void m45900Q(@Nullable PreCheckInterceptorChain preCheckInterceptorChain) {
        this.f38309c0 = preCheckInterceptorChain;
    }

    /* JADX INFO: renamed from: N */
    public final void m45897N() {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new RechargePaymentMethodVM$loadUserInfo$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.f38307a0 = false;
    }
}
