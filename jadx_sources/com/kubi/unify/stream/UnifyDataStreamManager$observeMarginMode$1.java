package com.kubi.unify.stream;

import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
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
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyDataStreamManager$observeMarginMode$1", m90122f = "UnifyDataStreamManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyDataStreamManager$observeMarginMode$1 extends SuspendLambda implements Function2<Map<String, ? extends MarginModeInfoEntity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    public UnifyDataStreamManager$observeMarginMode$1(Continuation<? super UnifyDataStreamManager$observeMarginMode$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends MarginModeInfoEntity> map, Continuation<? super Unit> continuation) {
        return invoke2((Map<String, MarginModeInfoEntity>) map, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnifyDataStreamManager$observeMarginMode$1 unifyDataStreamManager$observeMarginMode$1 = new UnifyDataStreamManager$observeMarginMode$1(continuation);
        unifyDataStreamManager$observeMarginMode$1.L$0 = obj;
        return unifyDataStreamManager$observeMarginMode$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<String, MarginModeInfoEntity> map, Continuation<? super Unit> continuation) {
        return ((UnifyDataStreamManager$observeMarginMode$1) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map<String, MarginModeInfoEntity> map = (Map) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C44128b.m97266j("UDSM-observeMarginMode", map.toString());
        UnifyDataStreamManager.f53365a.m65362u().m65401k(map);
        return Unit.INSTANCE;
    }
}
