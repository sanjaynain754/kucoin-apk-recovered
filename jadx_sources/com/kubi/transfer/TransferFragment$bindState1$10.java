package com.kubi.transfer;

import c60.C4850d;
import com.kubi.transfer.view.TransferAmountView;
import com.kubi.transfer.view.TransferCoinPairView;
import com.kubi.transfer.view.TransferCoinView;
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
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.TransferFragment$bindState1$10", m90122f = "TransferFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TransferFragment$bindState1$10 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransferFragment this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return ((TransferFragment$bindState1$10) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFragment$bindState1$10(TransferFragment transferFragment, Continuation<? super TransferFragment$bindState1$10> continuation) {
        super(2, continuation);
        this.this$0 = transferFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferFragment$bindState1$10 transferFragment$bindState1$10 = new TransferFragment$bindState1$10(this.this$0, continuation);
        transferFragment$bindState1$10.L$0 = obj;
        return transferFragment$bindState1$10;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransferCoinPairView transferCoinPairView;
        TransferCoinPairView transferCoinPairView2;
        TransferAmountView transferAmountView;
        TransferCoinView transferCoinView;
        Boolean bool = (Boolean) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (bool != null) {
            TransferFragment transferFragment = this.this$0;
            boolean zBooleanValue = bool.booleanValue();
            C4850d c4850dM64464r4 = transferFragment.m64464r4();
            if (c4850dM64464r4 != null && (transferCoinView = c4850dM64464r4.f4956j) != null) {
                C26268b.m64515d(transferCoinView, !zBooleanValue);
            }
            C4850d c4850dM64464r5 = transferFragment.m64464r4();
            if (c4850dM64464r5 != null && (transferAmountView = c4850dM64464r5.f4954h) != null) {
                transferAmountView.m64814t(!zBooleanValue, TransferFragment.m64406Y3(transferFragment).getIsMultiAccountMode());
            }
            C4850d c4850dM64464r6 = transferFragment.m64464r4();
            if (c4850dM64464r6 != null && (transferCoinPairView2 = c4850dM64464r6.f4955i) != null) {
                C26268b.m64515d(transferCoinPairView2, zBooleanValue);
            }
            C4850d c4850dM64464r7 = transferFragment.m64464r4();
            if (c4850dM64464r7 != null && (transferCoinPairView = c4850dM64464r7.f4955i) != null) {
                transferCoinPairView.m64822f(TransferFragment.m64406Y3(transferFragment).getBaseCurrency(), TransferFragment.m64406Y3(transferFragment).getQuoteCurrency());
            }
        }
        return Unit.INSTANCE;
    }
}
