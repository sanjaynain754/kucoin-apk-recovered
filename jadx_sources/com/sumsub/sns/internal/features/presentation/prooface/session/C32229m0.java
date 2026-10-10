package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.features.data.network.prooface.C29900o;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import okhttp3.WebSocket;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.m0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32229m0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C32239r0 f65666a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32229m0(C32239r0 c32239r0, Continuation continuation) {
        super(2, continuation);
        this.f65666a = c32239r0;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C32229m0(this.f65666a, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C32229m0(this.f65666a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        C32239r0 c32239r0 = this.f65666a;
        AbstractC32267d.m71078a("LivenessSessionHandler: stopped");
        c32239r0.f65685c.m69417c();
        C29900o c29900o = c32239r0.f65684b;
        AbstractC32267d.m71078a("Liveness3dFaceRepository.disconnect");
        WebSocket webSocket = c29900o.f60011h;
        if (webSocket != null) {
            webSocket.close(1000, "disconnect");
        }
        c29900o.f60011h = null;
        return Unit.INSTANCE;
    }
}
