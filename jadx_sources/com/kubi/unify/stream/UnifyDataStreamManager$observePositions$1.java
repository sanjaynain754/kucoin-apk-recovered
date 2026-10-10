package com.kubi.unify.stream;

import com.kubi.unify.entity.UnifyPositionEntity;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UnifyDataStreamManager.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/unify/entity/UnifyPositionEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyDataStreamManager$observePositions$1", m90122f = "UnifyDataStreamManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyDataStreamManager$observePositions$1 extends SuspendLambda implements Function2<List<? extends UnifyPositionEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public UnifyDataStreamManager$observePositions$1(Continuation<? super UnifyDataStreamManager$observePositions$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UnifyPositionEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<UnifyPositionEntity>) list, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnifyDataStreamManager$observePositions$1 unifyDataStreamManager$observePositions$1 = new UnifyDataStreamManager$observePositions$1(continuation);
        unifyDataStreamManager$observePositions$1.L$0 = obj;
        return unifyDataStreamManager$observePositions$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<UnifyPositionEntity> list, Continuation<? super Unit> continuation) {
        return ((UnifyDataStreamManager$observePositions$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<UnifyPositionEntity> list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        UnifyDataStreamManager.f53365a.m65362u().m65403m(list);
        return Unit.INSTANCE;
    }
}
