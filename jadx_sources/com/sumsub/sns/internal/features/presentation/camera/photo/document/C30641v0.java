package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Bitmap;
import com.sumsub.sns.internal.p126ml.docdetector.C33353d;
import java.io.IOException;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.v0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30641v0 extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30444C2 f61911b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Bitmap f61912c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f61913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30641v0(C30444C2 c30444c2, Bitmap bitmap, boolean z11, Continuation continuation) {
        super(2, continuation);
        this.f61911b = c30444c2;
        this.f61912c = bitmap;
        this.f61913d = z11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30641v0(this.f61911b, this.f61912c, this.f61913d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30641v0) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61910a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C33353d c33353d = this.f61911b.f61359m;
        Bitmap bitmap = this.f61912c;
        boolean z11 = this.f61913d;
        this.f61910a = 1;
        Object objM71663a = c33353d.m71663a(bitmap, z11, this);
        if (objM71663a == coroutine_suspended) {
            return coroutine_suspended;
        }
        return objM71663a;
    }
}
