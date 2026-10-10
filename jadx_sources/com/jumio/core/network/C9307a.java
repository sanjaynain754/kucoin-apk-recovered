package com.jumio.core.network;

import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: com.jumio.core.network.a */
/* JADX INFO: loaded from: classes56.dex */
public final class C9307a extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f14420a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ByteArrayDownloadTask f14421b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref.IntRef f14422c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f14423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9307a(ByteArrayDownloadTask byteArrayDownloadTask, Ref.IntRef intRef, int i11, Continuation continuation) {
        super(2, continuation);
        this.f14421b = byteArrayDownloadTask;
        this.f14422c = intRef;
        this.f14423d = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C9307a(this.f14421b, this.f14422c, this.f14423d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C9307a) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f14420a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            DownloadTask.ProgressListener<byte[]> progressListener = this.f14421b.getProgressListener();
            if (progressListener != null) {
                float f11 = (this.f14422c.element * 100) / this.f14423d;
                this.f14420a = 1;
                if (progressListener.onProgressUpdate(f11, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                return null;
            }
        }
        return Unit.INSTANCE;
    }
}
