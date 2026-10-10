package com.sumsub.sentry;

import com.sumsub.sns.internal.core.exception.SNSCallbacksLostOnRestoreException;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.cacher.InterfaceC33275c;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sentry.s0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C27993s0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f57126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C27997t0 f57127b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SNSCallbacksLostOnRestoreException f57128c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27993s0(C27997t0 c27997t0, SNSCallbacksLostOnRestoreException sNSCallbacksLostOnRestoreException, Continuation continuation) {
        super(2, continuation);
        this.f57127b = c27997t0;
        this.f57128c = sNSCallbacksLostOnRestoreException;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C27993s0(this.f57127b, this.f57128c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C27993s0(this.f57127b, this.f57128c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f57126a;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C27925b0 c27925b0M69004a = this.f57127b.f57132a.m69004a(this.f57128c);
                if (c27925b0M69004a == null) {
                    return Unit.INSTANCE;
                }
                InterfaceC33275c interfaceC33275c = this.f57127b.f57133b;
                this.f57126a = 1;
                if (interfaceC33275c.send(c27925b0M69004a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } catch (Throwable th2) {
            C33272c.f67814c.mo68956e("SentryHandledEventReporter", "captureException failed", th2);
        }
        return Unit.INSTANCE;
    }
}
