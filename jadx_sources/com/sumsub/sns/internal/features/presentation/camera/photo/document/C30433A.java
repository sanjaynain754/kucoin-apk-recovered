package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.presentation.camera.C28754t;
import com.sumsub.sns.internal.core.presentation.camera.C28755u;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.core.presentation.camera.InterfaceC28756v;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.A */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30433A extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a */
    public int f61257a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f61258b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C30468J f61259c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30433A(C30468J c30468j, Continuation continuation) {
        super(2, continuation);
        this.f61259c = c30468j;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C30433A c30433a = new C30433A(this.f61259c, continuation);
        c30433a.f61258b = obj;
        return c30433a;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C30433A c30433a = new C30433A(this.f61259c, (Continuation) obj2);
        c30433a.f61258b = (InterfaceC28756v) obj;
        return c30433a.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r7 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        return r0;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f61257a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            InterfaceC28756v interfaceC28756v = (InterfaceC28756v) this.f61258b;
            if (interfaceC28756v instanceof C28755u) {
                C30468J c30468j = this.f61259c;
                C28755u c28755u = (C28755u) interfaceC28756v;
                ImageProxy imageProxy = c28755u.f58486a;
                C28758x c28758x = c28755u.f58487b;
                this.f61257a = 1;
                C30654y c30654y = C30468J.f61431o;
                Object objM91049g = C41686h.m91049g(C41782z0.m91393c(), new C30437B(c30468j, imageProxy, c28758x, null), this);
                if (objM91049g != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM91049g = Unit.INSTANCE;
                }
            } else if (interfaceC28756v instanceof C28754t) {
                C30468J c30468j2 = this.f61259c;
                Bitmap bitmap = ((C28754t) interfaceC28756v).f58484a;
                this.f61257a = 2;
                C30654y c30654y2 = C30468J.f61431o;
                Object objM91049g2 = C41686h.m91049g(C41782z0.m91393c(), new C30441C(c30468j2, bitmap, null), this);
                if (objM91049g2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objM91049g2 = Unit.INSTANCE;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }
}
