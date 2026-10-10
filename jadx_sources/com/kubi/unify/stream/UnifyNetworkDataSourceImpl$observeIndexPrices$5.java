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

/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeIndexPrices$5", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UnifyNetworkDataSourceImpl$observeIndexPrices$5 extends SuspendLambda implements Function2<Map<String, ? extends String>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UnifyNetworkDataSourceImpl this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<String, ? extends String> map, Continuation<? super Unit> continuation) {
        return invoke2((Map<String, String>) map, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyNetworkDataSourceImpl$observeIndexPrices$5(UnifyNetworkDataSourceImpl unifyNetworkDataSourceImpl, Continuation<? super UnifyNetworkDataSourceImpl$observeIndexPrices$5> continuation) {
        super(2, continuation);
        this.this$0 = unifyNetworkDataSourceImpl;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnifyNetworkDataSourceImpl$observeIndexPrices$5 unifyNetworkDataSourceImpl$observeIndexPrices$5 = new UnifyNetworkDataSourceImpl$observeIndexPrices$5(this.this$0, continuation);
        unifyNetworkDataSourceImpl$observeIndexPrices$5.L$0 = obj;
        return unifyNetworkDataSourceImpl$observeIndexPrices$5;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<String, String> map, Continuation<? super Unit> continuation) {
        return ((UnifyNetworkDataSourceImpl$observeIndexPrices$5) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Map map = (Map) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f53379e.setValue(map);
        return Unit.INSTANCE;
    }
}
