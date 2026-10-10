package com.kubi.payment.fast.sell.p2p;

import com.kubi.payment.p2p.P2PHelper;
import com.kubi.payment.p2p.data.entities.TaxInfo;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: P2PSellConfirmVM.kt */
/* JADX INFO: loaded from: classes33.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/payment/p2p/data/entities/TaxInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.payment.fast.sell.p2p.P2PSellConfirmVM$previewOrder$1$taxResult$1", m90122f = "P2PSellConfirmVM.kt", m90123i = {}, m90124l = {46}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class P2PSellConfirmVM$previewOrder$1$taxResult$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super TaxInfo>, Object> {
    int label;

    public P2PSellConfirmVM$previewOrder$1$taxResult$1(Continuation<? super P2PSellConfirmVM$previewOrder$1$taxResult$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new P2PSellConfirmVM$previewOrder$1$taxResult$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super TaxInfo> continuation) {
        return ((P2PSellConfirmVM$previewOrder$1$taxResult$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
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
        P2PHelper p2PHelper = P2PHelper.f39683a;
        this.label = 1;
        Object objM48409a = p2PHelper.m48409a(this);
        if (objM48409a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM48409a;
    }
}
