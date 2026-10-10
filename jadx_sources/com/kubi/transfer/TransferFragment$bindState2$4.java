package com.kubi.transfer;

import c60.C4850d;
import com.kubi.transfer.view.TransferCoinPairView;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TransferFragment.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.TransferFragment$bindState2$4", m90122f = "TransferFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TransferFragment$bindState2$4 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransferFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFragment$bindState2$4(TransferFragment transferFragment, Continuation<? super TransferFragment$bindState2$4> continuation) {
        super(2, continuation);
        this.this$0 = transferFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferFragment$bindState2$4 transferFragment$bindState2$4 = new TransferFragment$bindState2$4(this.this$0, continuation);
        transferFragment$bindState2$4.L$0 = obj;
        return transferFragment$bindState2$4;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super Unit> continuation) {
        return ((TransferFragment$bindState2$4) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransferCoinPairView transferCoinPairView;
        String str = (String) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C4850d c4850dM64464r4 = this.this$0.m64464r4();
        if (c4850dM64464r4 != null && (transferCoinPairView = c4850dM64464r4.f4955i) != null) {
            transferCoinPairView.setQuoteAvailableBalance(str);
        }
        return Unit.INSTANCE;
    }
}
