package com.sumsub.sns.internal.features.presentation.prooface.session;

import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.TimeoutCancellationException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.G */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32155G extends SuspendLambda implements Function3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Throwable f65463a;

    public C32155G(Continuation continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        C32155G c32155g = new C32155G((Continuation) obj3);
        c32155g.f65463a = (Throwable) obj2;
        c32155g.invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Throwable th2 = this.f65463a;
        if (th2 instanceof TimeoutCancellationException) {
            TimeoutCancellationException timeoutCancellationException = (TimeoutCancellationException) th2;
            C33272c.f67816e.f67810a.mo68955d("Prooface", "ImageGathering phase: Camera preview init timeout.", timeoutCancellationException);
            throw new C32152E0(timeoutCancellationException);
        }
        throw th2;
    }
}
