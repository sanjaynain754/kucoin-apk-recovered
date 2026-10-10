package com.kubi.transfer;

import c60.C4850d;
import com.kubi.transfer.view.TransferAmountView;
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
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "isMultiAccountMode", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.TransferFragment$bindState1$12", m90122f = "TransferFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TransferFragment$bindState1$12 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ TransferFragment this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFragment$bindState1$12(TransferFragment transferFragment, Continuation<? super TransferFragment$bindState1$12> continuation) {
        super(2, continuation);
        this.this$0 = transferFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferFragment$bindState1$12 transferFragment$bindState1$12 = new TransferFragment$bindState1$12(this.this$0, continuation);
        transferFragment$bindState1$12.Z$0 = ((Boolean) obj).booleanValue();
        return transferFragment$bindState1$12;
    }

    public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
        return ((TransferFragment$bindState1$12) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransferAmountView transferAmountView;
        boolean z11 = this.Z$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        TransferFragment transferFragment = this.this$0;
        transferFragment.m64461o5(TransferFragment.m64406Y3(transferFragment).getAccountInfo(), z11);
        C4850d c4850dM64464r4 = this.this$0.m64464r4();
        if (c4850dM64464r4 != null && (transferAmountView = c4850dM64464r4.f4954h) != null) {
            transferAmountView.m64814t(true, TransferFragment.m64406Y3(this.this$0).getIsMultiAccountMode());
        }
        TransferFragment transferFragment2 = this.this$0;
        transferFragment2.m64466t4(TransferFragment.m64406Y3(transferFragment2).getIsSupportBatchTransfer());
        return Unit.INSTANCE;
    }
}
