package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.core.presentation.camera.C28740f;
import com.sumsub.sns.internal.core.presentation.camera.C28744j;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.features.presentation.prooface.utils.C32269f;
import java.io.File;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.n0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32120n0 implements InterfaceC28753s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SNSLiveness3dFaceFragment f65392a;

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final void mo69577a(C28740f c28740f) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: b */
    public final void mo69580b(File file) {
    }

    public C32120n0(SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment) {
        this.f65392a = sNSLiveness3dFaceFragment;
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final void mo69578a(File file) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: b */
    public final void mo69579b() {
        AbstractC32267d.m71078a("LivenessFragment: onPreviewReady");
        ((C32269f) this.f65392a.f65171d.getValue()).m71083d();
        ((C32072c2) this.f65392a.f65168a.getValue()).intent(C32042U0.f65187a);
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    public final void onError(Exception exc) {
        ((C32072c2) this.f65392a.f65168a.getValue()).intent(new C32033R0(exc));
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final Object mo69575a(Bitmap bitmap, C28758x c28758x, C28744j c28744j) {
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final Object mo69576a(ImageProxy imageProxy, C28758x c28758x, Continuation continuation) {
        C32072c2 c32072c2 = (C32072c2) this.f65392a.f65168a.getValue();
        SNSLiveness3dFaceFragment sNSLiveness3dFaceFragment = this.f65392a;
        Rect faceCapturingRect = sNSLiveness3dFaceFragment.m71008g().getFaceCapturingRect();
        int[] iArr = new int[2];
        sNSLiveness3dFaceFragment.m71007f().getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        sNSLiveness3dFaceFragment.m71008g().getLocationInWindow(iArr2);
        c32072c2.m71015a(imageProxy, new RectF(((iArr2[0] - iArr[0]) + faceCapturingRect.left) / sNSLiveness3dFaceFragment.m71007f().getWidth(), ((iArr2[1] - iArr[1]) + faceCapturingRect.top) / sNSLiveness3dFaceFragment.m71007f().getHeight(), ((iArr2[0] - iArr[0]) + faceCapturingRect.right) / sNSLiveness3dFaceFragment.m71007f().getWidth(), ((iArr2[1] - iArr[1]) + faceCapturingRect.bottom) / sNSLiveness3dFaceFragment.m71007f().getHeight()), c28758x.f58488a);
        return Unit.INSTANCE;
    }
}
