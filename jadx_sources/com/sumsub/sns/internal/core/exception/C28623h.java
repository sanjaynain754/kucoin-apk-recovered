package com.sumsub.sns.internal.core.exception;

import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.TimeoutKt;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.exception.h */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28623h extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58248a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28624i f58249b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Thread f58250c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Throwable f58251d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28623h(C28624i c28624i, Thread thread, Throwable th2, Continuation continuation) {
        super(2, continuation);
        this.f58249b = c28624i;
        this.f58250c = thread;
        this.f58251d = th2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28623h(this.f58249b, this.f58250c, this.f58251d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28623h) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58248a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C28622g c28622g = new C28622g(this.f58249b, this.f58250c, this.f58251d, null);
        this.f58248a = 1;
        Object objM90468c = TimeoutKt.m90468c(4000L, c28622g, this);
        if (objM90468c == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM90468c;
    }
}
