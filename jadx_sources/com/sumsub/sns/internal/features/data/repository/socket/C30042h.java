package com.sumsub.sns.internal.features.data.repository.socket;

import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import kotlinx.coroutines.InterfaceC41775x1;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.repository.socket.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30042h extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30050p f60345a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30042h(C30050p c30050p, Continuation continuation) {
        super(3, continuation);
        this.f60345a = c30050p;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C30042h(this.f60345a, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        InterfaceC41775x1 interfaceC41775x1 = ((C29967J) this.f60345a.f60372b).f60198f;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f60345a.m70078a(WebSocketRepository$ConnectionState.DISCONNECTED, "socket flow completed");
        return Unit.INSTANCE;
    }
}
