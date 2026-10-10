package com.kubi.payment.fasttradev2.buy;

import androidx.fragment.app.FragmentManager;
import com.kubi.payment.data.entities.VersionCheck;
import com.kubi.payment.fast.data.entities.BuyPaymentMethod;
import com.kubi.payment.fasttrade.FastTradeChannel;
import com.kubi.payment.fasttrade.FastTradeChannelHelper;
import com.kubi.payment.fasttradev2.buy.precheck.BuyPreCheckInterceptor;
import com.kubi.payment.precheck.IPreCheckInterceptor;
import com.kubi.payment.precheck.PreCheckInterceptorChain;
import com.kubi.payment.precheck.PreCheckRequest;
import com.kubi.payment.precheck.PreCheckResult;
import com.kubi.payment.precheck.VersionPreCheckInterceptor;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: BuyVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.BuyVM$preCheck$1", m90122f = "BuyVM.kt", m90123i = {0, 0, 0, 0}, m90124l = {676}, m90125m = "invokeSuspend", m90126n = {"selectedPaymentMethod", "preCheckRequest", "versionCheckRequest", "preCheckChain"}, m90127s = {"L$0", "L$1", "L$2", "L$3"})
public final class BuyVM$preCheck$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FragmentManager $fragmentManager;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ BuyVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyVM$preCheck$1(BuyVM buyVM, FragmentManager fragmentManager, Continuation<? super BuyVM$preCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = buyVM;
        this.$fragmentManager = fragmentManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyVM$preCheck$1(this.this$0, this.$fragmentManager, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BuyVM$preCheck$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PreCheckRequest.BuyPreCheckRequest buyPreCheckRequest;
        PreCheckInterceptorChain preCheckInterceptorChain;
        PreCheckRequest.BuyPreCheckRequest buyPreCheckRequest2;
        Object objM49416a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            BuyPaymentMethod.Response.PaymentMethod paymentMethod = (BuyPaymentMethod.Response.PaymentMethod) this.this$0.f39044d0.getValue();
            if (paymentMethod == null) {
                return Unit.INSTANCE;
            }
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            VersionCheck.Request request = new VersionCheck.Request("CRYPTO_TRADE", paymentMethod.getFiatCurrency(), paymentMethod.getCryptoCurrency(), paymentMethod.getPaymentMethodCode(), paymentMethod.getChannelId(), null, 32, null);
            FastTradeChannel fastTradeChannelM46724a = FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(paymentMethod.getPaymentMethodCode()), C27041f.m66668h(paymentMethod.getChannelId()));
            if (fastTradeChannelM46724a instanceof FastTradeChannel.BankCard) {
                buyPreCheckRequest = new PreCheckRequest.BuyPreCheckRequest(this.$fragmentManager, request, false, false, false, 28, null);
                preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new BuyPreCheckInterceptor(), new VersionPreCheckInterceptor()}));
            } else if (fastTradeChannelM46724a instanceof FastTradeChannel.GooglePay) {
                buyPreCheckRequest = new PreCheckRequest.BuyPreCheckRequest(this.$fragmentManager, request, false, false, false, 28, null);
                preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new BuyPreCheckInterceptor(), new VersionPreCheckInterceptor()}));
            } else if (fastTradeChannelM46724a instanceof FastTradeChannel.Revolut) {
                buyPreCheckRequest = new PreCheckRequest.BuyPreCheckRequest(this.$fragmentManager, request, false, false, false, 28, null);
                preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new BuyPreCheckInterceptor(), new VersionPreCheckInterceptor()}));
            } else if (fastTradeChannelM46724a instanceof FastTradeChannel.Blik) {
                buyPreCheckRequest = new PreCheckRequest.BuyPreCheckRequest(this.$fragmentManager, request, false, true, false, 20, null);
                preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new BuyPreCheckInterceptor(), new VersionPreCheckInterceptor()}));
            } else if (fastTradeChannelM46724a instanceof FastTradeChannel.Balance) {
                buyPreCheckRequest = new PreCheckRequest.BuyPreCheckRequest(this.$fragmentManager, request, true, false, false, 24, null);
                preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new BuyPreCheckInterceptor(), new VersionPreCheckInterceptor()}));
            } else {
                if (fastTradeChannelM46724a instanceof FastTradeChannel.P2P) {
                    buyPreCheckRequest2 = new PreCheckRequest.BuyPreCheckRequest(this.$fragmentManager, null, false, true, false, 20, null);
                    preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf(new BuyPreCheckInterceptor()));
                } else if (fastTradeChannelM46724a instanceof FastTradeChannel.ThirdParty) {
                    buyPreCheckRequest2 = new PreCheckRequest.BuyPreCheckRequest(this.$fragmentManager, null, false, false, false, 28, null);
                    preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf(new BuyPreCheckInterceptor()));
                } else if (fastTradeChannelM46724a instanceof FastTradeChannel.ThirdPartyPayID) {
                    buyPreCheckRequest2 = new PreCheckRequest.BuyPreCheckRequest(this.$fragmentManager, null, false, true, true, 4, null);
                    preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf(new BuyPreCheckInterceptor()));
                } else if (fastTradeChannelM46724a instanceof FastTradeChannel.Ivy) {
                    buyPreCheckRequest = new PreCheckRequest.BuyPreCheckRequest(this.$fragmentManager, request, false, false, false, 28, null);
                    preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf(new VersionPreCheckInterceptor()));
                } else {
                    buyPreCheckRequest = new PreCheckRequest.BuyPreCheckRequest(this.$fragmentManager, request, false, false, false, 28, null);
                    preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new BuyPreCheckInterceptor(), new VersionPreCheckInterceptor()}));
                }
                buyPreCheckRequest = buyPreCheckRequest2;
            }
            this.L$0 = SpillingKt.nullOutSpilledVariable(paymentMethod);
            this.L$1 = SpillingKt.nullOutSpilledVariable(buyPreCheckRequest);
            this.L$2 = SpillingKt.nullOutSpilledVariable(request);
            this.L$3 = SpillingKt.nullOutSpilledVariable(preCheckInterceptorChain);
            this.label = 1;
            objM49416a = preCheckInterceptorChain.m49416a(buyPreCheckRequest, this);
            if (objM49416a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objM49416a = obj;
        }
        PreCheckResult preCheckResult = (PreCheckResult) objM49416a;
        if (Intrinsics.areEqual(preCheckResult, PreCheckResult.Success.INSTANCE)) {
            this.this$0.f39049i0.setValue(Boxing.boxBoolean(true));
        } else {
            C44128b.m97265i("BuyVM pre check result:" + preCheckResult);
        }
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
