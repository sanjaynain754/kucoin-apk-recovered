package com.kubi.search.searchinitial.topsearch;

import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import com.kubi.operation.api.entity.SearchTopicEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: TopSearchVM.kt */
/* JADX INFO: loaded from: classes44.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/operation/api/entity/SearchTopicEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.search.searchinitial.topsearch.TopSearchVM$refreshTopicAndRealTimeSearch$1$list$2", m90122f = "TopSearchVM.kt", m90123i = {}, m90124l = {67}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class TopSearchVM$refreshTopicAndRealTimeSearch$1$list$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super SearchTopicEntity>, Object> {
    int label;
    final /* synthetic */ TopSearchVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopSearchVM$refreshTopicAndRealTimeSearch$1$list$2(TopSearchVM topSearchVM, Continuation<? super TopSearchVM$refreshTopicAndRealTimeSearch$1$list$2> continuation) {
        super(2, continuation);
        this.this$0 = topSearchVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopSearchVM$refreshTopicAndRealTimeSearch$1$list$2(this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super SearchTopicEntity> continuation) {
        return ((TopSearchVM$refreshTopicAndRealTimeSearch$1$list$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        InterfaceC41634e<SearchTopicEntity> interfaceC41634eM59628b = this.this$0.f48973V.m59628b();
        this.label = 1;
        Object objM42830k = RetrofitFlowExKt.m42830k(interfaceC41634eM59628b, this);
        if (objM42830k == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM42830k;
    }
}
