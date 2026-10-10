package com.kubi.unify.stream;

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
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "", "accumulator", "value"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$2", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyNetworkDataSourceImpl$observeIndexPrices$2 extends SuspendLambda implements Function3<Map<String, ? extends String>, Map<String, ? extends String>, Continuation<? super Map<String, ? extends String>>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public UnifyNetworkDataSourceImpl$observeIndexPrices$2(Continuation<? super UnifyNetworkDataSourceImpl$observeIndexPrices$2> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends String> map, Map<String, ? extends String> map2, Continuation<? super Map<String, ? extends String>> continuation) {
        return invoke2((Map<String, String>) map, (Map<String, String>) map2, (Continuation<? super Map<String, String>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<String, String> map, Map<String, String> map2, Continuation<? super Map<String, String>> continuation) {
        UnifyNetworkDataSourceImpl$observeIndexPrices$2 unifyNetworkDataSourceImpl$observeIndexPrices$2 = new UnifyNetworkDataSourceImpl$observeIndexPrices$2(continuation);
        unifyNetworkDataSourceImpl$observeIndexPrices$2.L$0 = map;
        unifyNetworkDataSourceImpl$observeIndexPrices$2.L$1 = map2;
        return unifyNetworkDataSourceImpl$observeIndexPrices$2.invokeSuspend(Unit.INSTANCE);
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
        return MapsKt.plus(map, map2);
    }
}
