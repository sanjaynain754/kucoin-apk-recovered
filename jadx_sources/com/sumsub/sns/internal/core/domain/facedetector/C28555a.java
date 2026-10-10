package com.sumsub.sns.internal.core.domain.facedetector;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.facedetector.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28555a extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28558d f58106a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bitmap f58107b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ RectF f58108c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Function1 f58109d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28555a(C28558d c28558d, Bitmap bitmap, RectF rectF, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f58106a = c28558d;
        this.f58107b = bitmap;
        this.f58108c = rectF;
        this.f58109d = function1;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C28555a(this.f58106a, this.f58107b, this.f58108c, this.f58109d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C28555a) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f58106a.f58115d) {
            this.f58106a.m69415a(this.f58107b, this.f58108c, this.f58109d);
        } else {
            C33272c.f67816e.f67810a.mo68955d("CompositeFaceDetector", "Detector stopped. Skipping.", null);
            this.f58109d.invoke(new C28565k(this.f58107b));
        }
        return Unit.INSTANCE;
    }
}
