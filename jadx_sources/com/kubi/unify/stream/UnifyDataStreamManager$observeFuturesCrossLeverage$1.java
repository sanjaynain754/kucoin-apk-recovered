package com.kubi.unify.stream;

import java.util.Map;
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
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyDataStreamManager$observeFuturesCrossLeverage$1", m90122f = "UnifyDataStreamManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyDataStreamManager$observeFuturesCrossLeverage$1 extends SuspendLambda implements Function2<Map<String, ? extends String>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public UnifyDataStreamManager$observeFuturesCrossLeverage$1(Continuation<? super UnifyDataStreamManager$observeFuturesCrossLeverage$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends String> map, Continuation<? super Unit> continuation) {
        return invoke2((Map<String, String>) map, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnifyDataStreamManager$observeFuturesCrossLeverage$1 unifyDataStreamManager$observeFuturesCrossLeverage$1 = new UnifyDataStreamManager$observeFuturesCrossLeverage$1(continuation);
        unifyDataStreamManager$observeFuturesCrossLeverage$1.L$0 = obj;
        return unifyDataStreamManager$observeFuturesCrossLeverage$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<String, String> map, Continuation<? super Unit> continuation) {
        return ((UnifyDataStreamManager$observeFuturesCrossLeverage$1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map<String, String> map = (Map) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97266j("UDSM-observeFuturesCrossLeverage", map.toString());
        UnifyDataStreamManager.f53365a.m65362u().m65400j(map);
        return Unit.INSTANCE;
    }
}
