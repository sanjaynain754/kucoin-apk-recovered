package com.kubi.transfer;

import c60.C4850d;
import com.kubi.transfer.view.TransferAccountView;
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
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.transfer.TransferFragment$bindState1$14", m90122f = "TransferFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TransferFragment$bindState1$14 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ TransferFragment this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferFragment$bindState1$14(TransferFragment transferFragment, Continuation<? super TransferFragment$bindState1$14> continuation) {
        super(2, continuation);
        this.this$0 = transferFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransferFragment$bindState1$14 transferFragment$bindState1$14 = new TransferFragment$bindState1$14(this.this$0, continuation);
        transferFragment$bindState1$14.Z$0 = ((Boolean) obj).booleanValue();
        return transferFragment$bindState1$14;
    }

    public final Object invoke(boolean z11, Continuation<? super Unit> continuation) {
        return ((TransferFragment$bindState1$14) create(Boolean.valueOf(z11), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TransferAccountView transferAccountView;
        boolean z11 = this.Z$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C4850d c4850dM64464r4 = this.this$0.m64464r4();
        if (c4850dM64464r4 != null && (transferAccountView = c4850dM64464r4.f4953g) != null) {
            transferAccountView.m64795n(z11);
        }
        return Unit.INSTANCE;
    }
}
