package com.jumio.core.network;

import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.jumio.core.network.c */
/* JADX INFO: loaded from: classes56.dex */
public final class C9309c extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f14424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DownloadTask f14425b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Exception f14426c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9309c(DownloadTask downloadTask, Exception exc, Continuation continuation) {
        super(2, continuation);
        this.f14425b = downloadTask;
        this.f14426c = exc;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C9309c(this.f14425b, this.f14426c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C9309c(this.f14425b, this.f14426c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f14424a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            DownloadTask.ProgressListener progressListener = this.f14425b.getProgressListener();
            if (progressListener != null) {
                Exception exc = this.f14426c;
                this.f14424a = 1;
                if (progressListener.onProgressException(exc, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return null;
            }
        }
        return Unit.INSTANCE;
    }
}
