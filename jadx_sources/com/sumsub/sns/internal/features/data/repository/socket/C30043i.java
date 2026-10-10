package com.sumsub.sns.internal.features.data.repository.socket;

import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.socket.i */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30043i extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30050p f60346a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f60347b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30043i(C30050p c30050p, String str, Continuation continuation) {
        super(2, continuation);
        this.f60346a = c30050p;
        this.f60347b = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30043i(this.f60346a, this.f60347b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30043i(this.f60346a, this.f60347b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int iIncrementAndGet = this.f60346a.f60377g.incrementAndGet();
        C33272c.f67816e.f67810a.mo68955d("WebSocketRepository", "subscribed: " + this.f60347b + ", active=" + iIncrementAndGet, null);
        return Unit.INSTANCE;
    }
}
