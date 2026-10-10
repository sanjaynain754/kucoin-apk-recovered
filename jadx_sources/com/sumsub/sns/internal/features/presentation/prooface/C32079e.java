package com.sumsub.sns.internal.features.presentation.prooface;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.camera.core.ImageProxy;
import androidx.camera.view.PreviewView;
import com.sumsub.sns.core.widget.SNSLivenessFaceView;
import com.sumsub.sns.internal.core.presentation.camera.C28740f;
import com.sumsub.sns.internal.core.presentation.camera.C28744j;
import com.sumsub.sns.internal.core.presentation.camera.C28758x;
import com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s;
import com.sumsub.sns.internal.features.data.model.prooface.C29802E;
import com.sumsub.sns.internal.features.presentation.prooface.utils.AbstractC32267d;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.e */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32079e implements InterfaceC28753s {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SNSDefaultLiveness3dFaceFragment f65286a;

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final void mo69577a(C28740f c28740f) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: b */
    public final void mo69580b(File file) {
    }

    public C32079e(SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment) {
        this.f65286a = sNSDefaultLiveness3dFaceFragment;
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final void mo69578a(File file) {
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: b */
    public final void mo69579b() {
        AbstractC32267d.m71078a("onPreviewReady()");
        SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment = this.f65286a;
        SNSDefaultLiveness3dFaceFragment.Companion companion = SNSDefaultLiveness3dFaceFragment.f65151p;
        sNSDefaultLiveness3dFaceFragment.m70994l();
        SNSLivenessFaceView sNSLivenessFaceViewM70989g = this.f65286a.m70989g();
        if (sNSLivenessFaceViewM70989g != null) {
            sNSLivenessFaceViewM70989g.setVisibility(0);
        }
        this.f65286a.m70993k();
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    public final void onError(Exception exc) {
        C32109k0 c32109k0 = (C32109k0) this.f65286a.f65152a.getValue();
        c32109k0.getClass();
        c32109k0.m71042a(new C29802E(exc), (String) null);
        c32109k0.m71043a(exc);
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final Object mo69575a(Bitmap bitmap, C28758x c28758x, C28744j c28744j) {
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.core.presentation.camera.InterfaceC28753s
    /* JADX INFO: renamed from: a */
    public final Object mo69576a(ImageProxy imageProxy, C28758x c28758x, Continuation continuation) {
        RectF rectF;
        PreviewView previewViewM70988f;
        SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment = this.f65286a;
        SNSDefaultLiveness3dFaceFragment.Companion companion = SNSDefaultLiveness3dFaceFragment.f65151p;
        SNSLivenessFaceView sNSLivenessFaceViewM70989g = sNSDefaultLiveness3dFaceFragment.m70989g();
        if (sNSLivenessFaceViewM70989g == null || (previewViewM70988f = sNSDefaultLiveness3dFaceFragment.m70988f()) == null) {
            rectF = null;
        } else {
            Rect faceCapturingRect = sNSLivenessFaceViewM70989g.getFaceCapturingRect();
            int[] iArr = new int[2];
            sNSLivenessFaceViewM70989g.getLocationInWindow(iArr);
            int[] iArr2 = new int[2];
            sNSLivenessFaceViewM70989g.getLocationInWindow(iArr2);
            rectF = new RectF(((iArr2[0] - iArr[0]) + faceCapturingRect.left) / previewViewM70988f.getWidth(), ((iArr2[1] - iArr[1]) + faceCapturingRect.top) / previewViewM70988f.getHeight(), ((iArr2[0] - iArr[0]) + faceCapturingRect.right) / previewViewM70988f.getWidth(), ((iArr2[1] - iArr[1]) + faceCapturingRect.bottom) / previewViewM70988f.getHeight());
        }
        if (rectF == null) {
            SNSDefaultLiveness3dFaceFragment sNSDefaultLiveness3dFaceFragment2 = this.f65286a;
            C33272c.f67816e.f67810a.mo68956e("Prooface", "Capturing box is not available. Fragment added: " + sNSDefaultLiveness3dFaceFragment2.isAdded() + ", resumed: " + sNSDefaultLiveness3dFaceFragment2.isResumed(), null);
            return Unit.INSTANCE;
        }
        ((C32109k0) this.f65286a.f65152a.getValue()).m71040a(imageProxy, rectF, c28758x.f58488a);
        return Unit.INSTANCE;
    }
}
