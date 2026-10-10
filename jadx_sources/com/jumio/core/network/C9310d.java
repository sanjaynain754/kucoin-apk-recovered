package com.jumio.core.network;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.jumio.core.network.d */
/* JADX INFO: loaded from: classes56.dex */
public final class C9310d extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f14427a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DownloadTask f14428b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f14429c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9310d(DownloadTask downloadTask, Object obj, Continuation continuation) {
        super(2, continuation);
        this.f14428b = downloadTask;
        this.f14429c = obj;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C9310d(this.f14428b, this.f14429c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C9310d(this.f14428b, this.f14429c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f14427a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            DownloadTask.ProgressListener progressListener = this.f14428b.getProgressListener();
            if (progressListener != null) {
                Object obj2 = this.f14429c;
                this.f14427a = 1;
                if (progressListener.onProgressDone(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return null;
            }
        }
        return Unit.INSTANCE;
    }
}
