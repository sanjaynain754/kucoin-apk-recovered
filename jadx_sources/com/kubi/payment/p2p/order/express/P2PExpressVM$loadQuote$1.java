package com.kubi.payment.p2p.order.express;

import com.kubi.payment.p2p.data.entities.P2PExpress;
import com.kubi.payment.p2p.data.source.IP2PRepository;
import kotlinx.coroutines.InterfaceC41709m0;
import p477nt.AbstractC42878k;
import p852kotlin.Metadata;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: P2PExpressVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.p2p.order.express.P2PExpressVM$loadQuote$1", m90122f = "P2PExpressVM.kt", m90123i = {}, m90124l = {46}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class P2PExpressVM$loadQuote$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $orderId;
    int label;
    final /* synthetic */ P2PExpressVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2PExpressVM$loadQuote$1(P2PExpressVM p2PExpressVM, String str, Continuation<? super P2PExpressVM$loadQuote$1> continuation) {
        super(2, continuation);
        this.this$0 = p2PExpressVM;
        this.$orderId = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PExpressVM$loadQuote$1(this.this$0, this.$orderId, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((P2PExpressVM$loadQuote$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
            this.this$0.f39821b0.postValue(Boxing.boxBoolean(true));
            IP2PRepository iP2PRepository = this.this$0.f39819Z;
            String str = this.$orderId;
            this.label = 1;
            obj = iP2PRepository.mo48484e(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        AbstractC42878k abstractC42878k = (AbstractC42878k) obj;
        if (abstractC42878k instanceof AbstractC42878k.Success) {
            P2PExpress.HedgeResponse hedgeResponse = (P2PExpress.HedgeResponse) ((AbstractC42878k.Success) abstractC42878k).m94040a();
            this.this$0.f39824e0.postValue(hedgeResponse);
            this.this$0.f39822c0.postValue(Boxing.boxBoolean(false));
            this.this$0.m48912J(hedgeResponse.getExpireTime());
        } else if (abstractC42878k instanceof AbstractC42878k.Error) {
            this.this$0.f39822c0.postValue(Boxing.boxBoolean(true));
            this.this$0.m45659r().setValue(((AbstractC42878k.Error) abstractC42878k).getException());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.this$0.f39821b0.postValue(Boxing.boxBoolean(false));
        return Unit.INSTANCE;
    }
}
