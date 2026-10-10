package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Bitmap;
import com.sumsub.sns.internal.p126ml.docdetector.C33353d;
import java.io.IOException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.L1 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30476L1 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30440B2 f61509b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bitmap f61510c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30476L1(C30440B2 c30440b2, Bitmap bitmap, Continuation continuation) {
        super(2, continuation);
        this.f61509b = c30440b2;
        this.f61510c = bitmap;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30476L1(this.f61509b, this.f61510c, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C30476L1(this.f61509b, this.f61510c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61508a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C33353d c33353d = this.f61509b.f61305f;
        Bitmap bitmap = this.f61510c;
        this.f61508a = 1;
        Object objM71663a = c33353d.m71663a(bitmap, false, (ContinuationImpl) this);
        if (objM71663a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM71663a;
    }
}
