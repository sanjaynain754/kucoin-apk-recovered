package com.kubi.payment.fasttradev2.buy.confirm.googlepay;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: BuyGooglePayConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fasttradev2.buy.confirm.googlepay.BuyGooglePayConfirmVM$placeOrder$1$riskSessionIdDeferred$1", m90122f = "BuyGooglePayConfirmVM.kt", m90123i = {}, m90124l = {154}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class BuyGooglePayConfirmVM$placeOrder$1$riskSessionIdDeferred$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super String>, Object> {
    int label;
    final /* synthetic */ BuyGooglePayConfirmVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyGooglePayConfirmVM$placeOrder$1$riskSessionIdDeferred$1(BuyGooglePayConfirmVM buyGooglePayConfirmVM, Continuation<? super BuyGooglePayConfirmVM$placeOrder$1$riskSessionIdDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = buyGooglePayConfirmVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BuyGooglePayConfirmVM$placeOrder$1$riskSessionIdDeferred$1(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super String> continuation) {
        return ((BuyGooglePayConfirmVM$placeOrder$1$riskSessionIdDeferred$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        BuyGooglePayConfirmVM buyGooglePayConfirmVM = this.this$0;
        this.label = 1;
        Object objM47641p0 = buyGooglePayConfirmVM.m47641p0(this);
        if (objM47641p0 == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM47641p0;
    }
}
