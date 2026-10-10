package com.kubi.utaspotlib.biz.delegation;

import com.kubi.core.biz.order.record.active.UiState;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UtaDelegationRecordFragment.kt */
/* JADX INFO: loaded from: classes54.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/core/biz/order/record/active/OpenOrdersRecordContract$UiState;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.utaspotlib.biz.delegation.UtaDelegationRecordFragment$subOrderSizeFlow$1", m90122f = "UtaDelegationRecordFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UtaDelegationRecordFragment$subOrderSizeFlow$1 extends SuspendLambda implements Function2<UiState, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ UtaDelegationRecordFragment this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(UiState uiState, Continuation<? super Unit> continuation) {
        return ((UtaDelegationRecordFragment$subOrderSizeFlow$1) create(uiState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtaDelegationRecordFragment$subOrderSizeFlow$1(UtaDelegationRecordFragment utaDelegationRecordFragment, Continuation<? super UtaDelegationRecordFragment$subOrderSizeFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = utaDelegationRecordFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UtaDelegationRecordFragment$subOrderSizeFlow$1(this.this$0, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.m66035W3();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
