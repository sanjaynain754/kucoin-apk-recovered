package com.sumsub.sns.internal.core.presentation.camera;

import android.graphics.Bitmap;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.j */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28744j extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f58450a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28746l f58451b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28744j(C28746l c28746l, Continuation continuation) {
        super(2, continuation);
        this.f58451b = c28746l;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28744j(this.f58451b, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C28744j(this.f58451b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r3.mo69575a(r7, r1, r6) == r0) goto L19;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C28746l c28746l;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f58450a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
        C28743i c28743i = new C28743i(this.f58451b, null);
        this.f58450a = 1;
        obj = C41686h.m91049g(abstractC41586e2M91393c, c28743i, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && (r3 = (c28746l = this.f58451b).f58460e) != null) {
            C28758x c28758xM69571d = c28746l.m69571d();
            this.f58450a = 2;
        }
        return Unit.INSTANCE;
    }
}
