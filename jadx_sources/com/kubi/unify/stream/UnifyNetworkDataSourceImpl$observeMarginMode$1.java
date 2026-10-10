package com.kubi.unify.stream;

import com.kubi.kumex.data.platform.model.MarginModeInfoEntity;
import java.util.Map;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\n"}, m90084d2 = {"<anonymous>", "", "", "Lcom/kubi/kumex/data/platform/model/MarginModeInfoEntity;", "accumulator", "value"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeMarginMode$1", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyNetworkDataSourceImpl$observeMarginMode$1 extends SuspendLambda implements Function3<Map<String, ? extends MarginModeInfoEntity>, Map<String, ? extends MarginModeInfoEntity>, Continuation<? super Map<String, ? extends MarginModeInfoEntity>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public UnifyNetworkDataSourceImpl$observeMarginMode$1(Continuation<? super UnifyNetworkDataSourceImpl$observeMarginMode$1> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends MarginModeInfoEntity> map, Map<String, ? extends MarginModeInfoEntity> map2, Continuation<? super Map<String, ? extends MarginModeInfoEntity>> continuation) {
        return invoke2((Map<String, MarginModeInfoEntity>) map, (Map<String, MarginModeInfoEntity>) map2, (Continuation<? super Map<String, MarginModeInfoEntity>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<String, MarginModeInfoEntity> map, Map<String, MarginModeInfoEntity> map2, Continuation<? super Map<String, MarginModeInfoEntity>> continuation) {
        UnifyNetworkDataSourceImpl$observeMarginMode$1 unifyNetworkDataSourceImpl$observeMarginMode$1 = new UnifyNetworkDataSourceImpl$observeMarginMode$1(continuation);
        unifyNetworkDataSourceImpl$observeMarginMode$1.L$0 = map;
        unifyNetworkDataSourceImpl$observeMarginMode$1.L$1 = map2;
        return unifyNetworkDataSourceImpl$observeMarginMode$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.L$0;
        Map map2 = (Map) this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (map2.size() >= map.size()) {
            return map2;
        }
        Map mutableMap = MapsKt.toMutableMap(map);
        mutableMap.putAll(map2);
        return mutableMap;
    }
}
