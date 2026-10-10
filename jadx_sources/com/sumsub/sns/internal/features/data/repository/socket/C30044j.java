package com.sumsub.sns.internal.features.data.repository.socket;

import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.socket.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30044j extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30050p f60348a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f60349b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30044j(C30050p c30050p, String str, Continuation continuation) {
        super(3, continuation);
        this.f60348a = c30050p;
        this.f60349b = str;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C30044j(this.f60348a, this.f60349b, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        int iDecrementAndGet = this.f60348a.f60377g.decrementAndGet();
        C33272c.f67816e.f67810a.mo68955d("WebSocketRepository", "unsubscribed: " + this.f60349b + ", active=" + iDecrementAndGet, null);
        return Unit.INSTANCE;
    }
}
