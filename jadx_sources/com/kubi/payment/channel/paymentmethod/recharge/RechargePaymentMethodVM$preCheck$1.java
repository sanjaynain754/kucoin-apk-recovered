package com.kubi.payment.channel.paymentmethod.recharge;

import com.kubi.payment.channel.data.entities.PaymentMethod;
import com.kubi.payment.channel.precheck.PreCheckInterceptorChain;
import com.kubi.payment.channel.precheck.PreCheckRequest;
import com.kubi.payment.channel.precheck.PreCheckResult;
import com.kubi.payment.track.IPaymentTrack;
import com.kubi.payment.track.RechargeTrackData;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: RechargePaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.paymentmethod.recharge.RechargePaymentMethodVM$preCheck$1", m90122f = "RechargePaymentMethodVM.kt", m90123i = {}, m90124l = {175}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RechargePaymentMethodVM$preCheck$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ PaymentMethod $paymentMethod;
    final /* synthetic */ PreCheckRequest $request;
    int label;
    final /* synthetic */ RechargePaymentMethodVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RechargePaymentMethodVM$preCheck$1(RechargePaymentMethodVM rechargePaymentMethodVM, PreCheckRequest preCheckRequest, PaymentMethod paymentMethod, Continuation<? super RechargePaymentMethodVM$preCheck$1> continuation) {
        super(2, continuation);
        this.this$0 = rechargePaymentMethodVM;
        this.$request = preCheckRequest;
        this.$paymentMethod = paymentMethod;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RechargePaymentMethodVM$preCheck$1(this.this$0, this.$request, this.$paymentMethod, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((RechargePaymentMethodVM$preCheck$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    /* JADX WARN: Instruction removed from duplicated block: B:21:0x008b, please report this as an issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PreCheckResult preCheckResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            this.this$0.m45657p().setValue(Boxing.boxBoolean(true));
            PreCheckInterceptorChain preCheckInterceptorChain = this.this$0.f38309c0;
            if (preCheckInterceptorChain != null) {
                PreCheckRequest preCheckRequest = this.$request;
                this.label = 1;
                obj = preCheckInterceptorChain.m45996a(preCheckRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                preCheckResult = null;
            }
            this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
            if (preCheckResult instanceof PreCheckResult.c) {
                this.this$0.f38311e0.setValue(this.$paymentMethod);
            } else if (Intrinsics.areEqual(preCheckResult, PreCheckResult.a.f38376a)) {
                IPaymentTrack track = IPaymentTrack.f40346a.getTrack();
                RechargeTrackData rechargeTrackData = new RechargeTrackData(this.$request.getChannelId());
                rechargeTrackData.setFiatCurrency(this.$request.getFiatCurrency());
                Unit unit = Unit.INSTANCE;
                IPaymentTrack.m49794e(track, "CHECK_KYC", false, "-10001:CHECK_KYC", rechargeTrackData, 2, null);
            } else {
                C44128b.m97265i("fiat recharge pre check result:" + preCheckResult);
            }
            return Unit.INSTANCE;
        }
        preCheckResult = (PreCheckResult) obj;
        this.this$0.m45657p().setValue(Boxing.boxBoolean(false));
        if (preCheckResult instanceof PreCheckResult.c) {
            this.this$0.f38311e0.setValue(this.$paymentMethod);
        } else if (Intrinsics.areEqual(preCheckResult, PreCheckResult.a.f38376a)) {
            IPaymentTrack track2 = IPaymentTrack.f40346a.getTrack();
            RechargeTrackData rechargeTrackData2 = new RechargeTrackData(this.$request.getChannelId());
            rechargeTrackData2.setFiatCurrency(this.$request.getFiatCurrency());
            Unit unit2 = Unit.INSTANCE;
            IPaymentTrack.m49794e(track2, "CHECK_KYC", false, "-10001:CHECK_KYC", rechargeTrackData2, 2, null);
        } else {
            C44128b.m97265i("fiat recharge pre check result:" + preCheckResult);
        }
        return Unit.INSTANCE;
    }
}
