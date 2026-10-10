package com.kubi.payment.channel.paymentmethod.recharge;

import com.kubi.otc.entity.FastQuoteModel;
import com.kubi.payment.channel.data.entities.GuidePayment;
import com.kubi.payment.channel.data.source.IChannelRepository;
import com.kubi.utils.extensions.C27041f;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: RechargePaymentMethodVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/payment/base/Result;", "Lcom/kubi/payment/channel/data/entities/GuidePayment$Response;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.channel.paymentmethod.recharge.RechargePaymentMethodVM$getList$guidePaymentListTask$1", m90122f = "RechargePaymentMethodVM.kt", m90123i = {}, m90124l = {209}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class RechargePaymentMethodVM$getList$guidePaymentListTask$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super AbstractC42878k<? extends GuidePayment.Response>>, Object> {
    final /* synthetic */ String $fiatCurrency;
    int label;
    final /* synthetic */ RechargePaymentMethodVM this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AbstractC42878k<? extends GuidePayment.Response>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super AbstractC42878k<GuidePayment.Response>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RechargePaymentMethodVM$getList$guidePaymentListTask$1(RechargePaymentMethodVM rechargePaymentMethodVM, String str, Continuation<? super RechargePaymentMethodVM$getList$guidePaymentListTask$1> continuation) {
        super(2, continuation);
        this.this$0 = rechargePaymentMethodVM;
        this.$fiatCurrency = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RechargePaymentMethodVM$getList$guidePaymentListTask$1(this.this$0, this.$fiatCurrency, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super AbstractC42878k<GuidePayment.Response>> continuation) {
        return ((RechargePaymentMethodVM$getList$guidePaymentListTask$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        IChannelRepository iChannelRepository = this.this$0.f38306Z;
        GuidePayment.Request request = new GuidePayment.Request(C27041f.m66668h(this.$fiatCurrency), FastQuoteModel.PAY_RECHARGE);
        this.label = 1;
        Object objMo45749w = iChannelRepository.mo45749w(request, this);
        if (objMo45749w == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objMo45749w;
    }
}
