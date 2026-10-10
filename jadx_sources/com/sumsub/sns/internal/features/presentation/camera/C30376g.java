package com.sumsub.sns.internal.features.presentation.camera;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.presentation.camera.C28740f;
import com.sumsub.sns.internal.core.presentation.camera.C28744j;
import com.sumsub.sns.internal.core.presentation.camera.C28747m;
import com.sumsub.sns.internal.core.presentation.camera.C28748n;
import com.sumsub.sns.internal.core.presentation.camera.C28749o;
import com.sumsub.sns.internal.core.presentation.camera.C28750p;
import com.sumsub.sns.internal.core.presentation.camera.C28751q;
import com.sumsub.sns.internal.core.presentation.camera.C28754t;
import com.sumsub.sns.internal.core.presentation.camera.C28755u;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s;
import java.io.File;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30376g implements InterfaceC28753s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30378h f61105a;

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final void mo69578a(File file) {
        this.f61105a.f61109f.invoke(new C28748n(file));
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: b */
    public final void mo69579b() {
        this.f61105a.f61109f.invoke(C28749o.f58481a);
    }

    public C30376g(C30378h c30378h) {
        this.f61105a = c30378h;
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    public final void onError(Exception exc) {
        this.f61105a.f61109f.invoke(new C28747m(exc));
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final void mo69577a(C28740f c28740f) {
        this.f61105a.f61109f.invoke(new C28750p(c28740f));
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: b */
    public final void mo69580b(File file) {
        this.f61105a.f61109f.invoke(new C28751q(file));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final Object mo69576a(ImageProxy imageProxy, C28758x c28758x, Continuation continuation) {
        C30374f c30374f;
        if (continuation instanceof C30374f) {
            c30374f = (C30374f) continuation;
            int i11 = c30374f.f61103d;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c30374f.f61103d = i11 - Integer.MIN_VALUE;
            } else {
                c30374f = new C30374f(this, (ContinuationImpl) continuation);
            }
        } else {
            c30374f = new C30374f(this, (ContinuationImpl) continuation);
        }
        Object obj = c30374f.f61101b;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c30374f.f61103d;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            C28755u c28755u = new C28755u(imageProxy, c28758x);
            ?? r11 = this.f61105a.f61110g;
            c30374f.f61100a = imageProxy;
            c30374f.f61103d = 1;
            if (r11.invoke(c28755u, c30374f) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            imageProxy = c30374f.f61100a;
            ResultKt.throwOnFailure(obj);
        }
        imageProxy.close();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final Object mo69575a(Bitmap bitmap, C28758x c28758x, C28744j c28744j) {
        Object objInvoke = this.f61105a.f61110g.invoke(new C28754t(bitmap, c28758x), c28744j);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }
}
