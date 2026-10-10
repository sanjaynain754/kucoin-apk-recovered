package com.sumsub.sns.internal.features.presentation.camera;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.presentation.camera.C28740f;
import com.sumsub.sns.internal.core.presentation.camera.C28744j;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s;
import java.io.File;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.I */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30346I implements InterfaceC28753s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC30348K f61023a;

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final void mo69577a(C28740f c28740f) {
        this.f61023a.mo70214a(c28740f);
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: b */
    public final void mo69579b() {
        this.f61023a.mo70239w();
    }

    public C30346I(AbstractC30348K abstractC30348K) {
        this.f61023a = abstractC30348K;
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final void mo69578a(File file) {
        ((AbstractC30359W) this.f61023a.getViewModel$idensic_mobile_sdk_aar_defaultRelease()).mo70248a(file);
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: b */
    public final void mo69580b(File file) {
        this.f61023a.mo70221b(file);
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    public final void onError(Exception exc) {
        this.f61023a.mo70216a(exc);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final Object mo69576a(ImageProxy imageProxy, C28758x c28758x, Continuation continuation) {
        C30345H c30345h;
        if (continuation instanceof C30345H) {
            c30345h = (C30345H) continuation;
            int i11 = c30345h.f61022d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30345h.f61022d = i11 - Integer.MIN_VALUE;
            } else {
                c30345h = new C30345H(this, (ContinuationImpl) continuation);
            }
        } else {
            c30345h = new C30345H(this, (ContinuationImpl) continuation);
        }
        Object obj = c30345h.f61020b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30345h.f61022d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC30348K abstractC30348K = this.f61023a;
            c30345h.f61019a = imageProxy;
            c30345h.f61022d = 1;
            if (abstractC30348K.mo70213a(imageProxy, c28758x, c30345h) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            imageProxy = c30345h.f61019a;
            ResultKt.throwOnFailure(obj);
        }
        imageProxy.close();
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final Object mo69575a(Bitmap bitmap, C28758x c28758x, C28744j c28744j) {
        Object objMo70212a = this.f61023a.mo70212a(bitmap, c28744j);
        return objMo70212a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo70212a : Unit.INSTANCE;
    }
}
