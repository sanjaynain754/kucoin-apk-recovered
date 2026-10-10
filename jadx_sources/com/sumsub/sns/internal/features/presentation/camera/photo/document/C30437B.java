package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.common.AbstractC28396H;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.log.C33272c;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30437B extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C30468J f61268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ImageProxy f61269c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C28758x f61270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30437B(C30468J c30468j, ImageProxy imageProxy, C28758x c28758x, Continuation continuation) {
        super(2, continuation);
        this.f61268b = c30468j;
        this.f61269c = imageProxy;
        this.f61270d = c28758x;
    }

    /* JADX INFO: renamed from: a */
    public static final Bitmap m70274a(C30468J c30468j, int i11, int i12) {
        C30654y c30654y = C30468J.f61431o;
        return c30468j.m70371a(i11, i12);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C30437B(this.f61268b, this.f61269c, this.f61270d, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C30437B) create((InterfaceC41709m0) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61267a;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            final C30468J c30468j = this.f61268b;
            if (c30468j.f61446n) {
                if (C28468k0.f57988f) {
                    C33272c.f67816e.f67810a.mo68955d("DocCapture", "skipped frame", null);
                }
                return Unit.INSTANCE;
            }
            c30468j.f61446n = true;
            Object objM69280a = AbstractC28396H.m69280a(this.f61269c, new Function2() { // from class: com.sumsub.sns.internal.features.presentation.camera.photo.document.a3
                @Override // p852kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return C30437B.m70274a(c30468j, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                }
            });
            C30468J c30468j2 = this.f61268b;
            Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM69280a);
            if (thM103847exceptionOrNullimpl == null) {
                C30468J c30468j3 = this.f61268b;
                this.f61267a = 1;
                Object objM91049g = C41686h.m91049g(C41782z0.m91393c(), new C30441C(c30468j3, (Bitmap) objM69280a, null), this);
                if (objM91049g != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM91049g = Unit.INSTANCE;
                }
                if (objM91049g == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                c30468j2.f61446n = false;
                C33272c.f67816e.f67810a.mo68955d("DocCapture", "failed to convert imageProxy to bitmap", thM103847exceptionOrNullimpl);
                return Unit.INSTANCE;
            }
        }
        this.f61268b.f61446n = false;
        return Unit.INSTANCE;
    }
}
