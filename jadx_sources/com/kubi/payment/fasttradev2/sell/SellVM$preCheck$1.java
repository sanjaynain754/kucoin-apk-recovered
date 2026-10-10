package com.kubi.payment.fasttradev2.sell;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.kubi.payment.data.entities.VersionCheck;
import com.kubi.payment.fast.data.entities.SellPaymentMethod;
import com.kubi.payment.fasttrade.FastTradeChannel;
import com.kubi.payment.fasttrade.FastTradeChannelHelper;
import com.kubi.payment.fasttrade.sell.precheck.PaymentMethodPreCheckInterceptor;
import com.kubi.payment.fasttrade.sell.precheck.SellSecurityPreCheckInterceptor;
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

/* JADX INFO: compiled from: SellVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.sell.SellVM$preCheck$1", m90122f = "SellVM.kt", m90123i = {0, 0, 0, 0}, m90124l = {670}, m90125m = "invokeSuspend", m90126n = {"selectedPaymentMethod", "preCheckRequest", "versionCheckRequest", "preCheckChain"}, m90127s = {"L$0", "L$1", "L$2", "L$3"})
public final class SellVM$preCheck$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FragmentManager $fragmentManager;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ SellVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellVM$preCheck$1(SellVM sellVM, FragmentManager fragmentManager, Context context, Continuation<? super SellVM$preCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = sellVM;
        this.$fragmentManager = fragmentManager;
        this.$context = context;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SellVM$preCheck$1(this.this$0, this.$fragmentManager, this.$context, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((SellVM$preCheck$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0136  */
    /* JADX WARN: Code duplicated, block: B:31:0x0144  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0144, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PreCheckResult preCheckResult;
        VersionCheck.Request request;
        PreCheckInterceptorChain preCheckInterceptorChain;
        PreCheckRequest.SellPreCheckRequest sellPreCheckRequest;
        Object objM49416a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            SellPaymentMethod.Response.PaymentMethod paymentMethod = (SellPaymentMethod.Response.PaymentMethod) this.this$0.f39428d0.getValue();
            if (paymentMethod == null) {
                return Unit.INSTANCE;
            }
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            preCheckResult = null;
            VersionCheck.Request request2 = new VersionCheck.Request("CRYPTO_TRADE", paymentMethod.getFiatCurrency(), paymentMethod.getCryptoCurrency(), paymentMethod.getPaymentMethodCode(), paymentMethod.getChannelId(), null, 32, null);
            FastTradeChannel fastTradeChannelM46724a = FastTradeChannelHelper.f38726a.m46724a(C27041f.m66668h(paymentMethod.getPaymentMethodCode()), C27041f.m66668h(paymentMethod.getChannelId()));
            if (fastTradeChannelM46724a instanceof FastTradeChannel.BankCard) {
                request = request2;
                sellPreCheckRequest = new PreCheckRequest.SellPreCheckRequest(this.$fragmentManager, request, false, 4, null);
                preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new SellSecurityPreCheckInterceptor(), new VersionPreCheckInterceptor()}));
            } else {
                request = request2;
                if (fastTradeChannelM46724a instanceof FastTradeChannel.Balance) {
                    sellPreCheckRequest = new PreCheckRequest.SellPreCheckRequest(this.$fragmentManager, request, true);
                    preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new SellSecurityPreCheckInterceptor(), new VersionPreCheckInterceptor()}));
                } else if (fastTradeChannelM46724a instanceof FastTradeChannel.P2P) {
                    PreCheckRequest.P2PSellPreCheckRequest p2PSellPreCheckRequest = new PreCheckRequest.P2PSellPreCheckRequest(this.$fragmentManager, null, true, paymentMethod.getP2pInfo(), this.$context);
                    preCheckInterceptorChain = new PreCheckInterceptorChain(CollectionsKt.listOf((Object[]) new IPreCheckInterceptor[]{new SellSecurityPreCheckInterceptor(), new PaymentMethodPreCheckInterceptor()}));
                    sellPreCheckRequest = p2PSellPreCheckRequest;
                } else {
                    preCheckInterceptorChain = null;
                    sellPreCheckRequest = null;
                }
            }
            if (sellPreCheckRequest != null) {
                if (preCheckInterceptorChain != null) {
                    this.L$0 = SpillingKt.nullOutSpilledVariable(paymentMethod);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(sellPreCheckRequest);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(request);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(preCheckInterceptorChain);
                    this.label = 1;
                    objM49416a = preCheckInterceptorChain.m49416a(sellPreCheckRequest, this);
                    if (objM49416a == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (Intrinsics.areEqual(preCheckResult, PreCheckResult.Success.INSTANCE)) {
                    this.this$0.f39430f0.setValue(Boxing.boxBoolean(true));
                } else {
                    C44128b.m97265i("SellVM pre check result:" + preCheckResult);
                }
            }
            this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        objM49416a = obj;
        preCheckResult = (PreCheckResult) objM49416a;
        if (Intrinsics.areEqual(preCheckResult, PreCheckResult.Success.INSTANCE)) {
            this.this$0.f39430f0.setValue(Boxing.boxBoolean(true));
        } else {
            C44128b.m97265i("SellVM pre check result:" + preCheckResult);
        }
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
