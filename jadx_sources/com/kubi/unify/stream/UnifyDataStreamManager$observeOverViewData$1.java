package com.kubi.unify.stream;

import com.kubi.unify.entity.UnifyAccountOverviewEntity;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import ro.C44128b;

/* JADX INFO: compiled from: UnifyDataStreamManager.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/unify/entity/UnifyAccountOverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyDataStreamManager$observeOverViewData$1", m90122f = "UnifyDataStreamManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyDataStreamManager$observeOverViewData$1 extends SuspendLambda implements Function2<UnifyAccountOverviewEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public UnifyDataStreamManager$observeOverViewData$1(Continuation<? super UnifyDataStreamManager$observeOverViewData$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(UnifyAccountOverviewEntity unifyAccountOverviewEntity, Continuation<? super Unit> continuation) {
        return ((UnifyDataStreamManager$observeOverViewData$1) create(unifyAccountOverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnifyDataStreamManager$observeOverViewData$1 unifyDataStreamManager$observeOverViewData$1 = new UnifyDataStreamManager$observeOverViewData$1(continuation);
        unifyDataStreamManager$observeOverViewData$1.L$0 = obj;
        return unifyDataStreamManager$observeOverViewData$1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UnifyAccountOverviewEntity unifyAccountOverviewEntity = (UnifyAccountOverviewEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97266j("UDSM-fetchOverViewData", unifyAccountOverviewEntity.toString());
        UnifyDataStreamManager.f53365a.m65362u().m65402l(unifyAccountOverviewEntity);
        return Unit.INSTANCE;
    }
}
