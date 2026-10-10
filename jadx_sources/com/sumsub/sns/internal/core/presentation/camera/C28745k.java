package com.sumsub.sns.internal.core.presentation.camera;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import com.sumsub.sns.internal.log.C33272c;
import java.io.File;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.k */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28745k implements ImageCapture.OnImageSavedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ File f58452a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C28746l f58453b;

    public C28745k(File file, C28746l c28746l) {
        this.f58452a = file;
        this.f58453b = c28746l;
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onImageSaved(ImageCapture.OutputFileResults outputFileResults) {
        C33272c.f67816e.f67810a.mo68956e("CameraX", "onImageSaved: " + this.f58452a, null);
        InterfaceC28753s interfaceC28753s = this.f58453b.f58460e;
        if (interfaceC28753s != null) {
            interfaceC28753s.mo69578a(this.f58452a);
        }
    }

    @Override // androidx.camera.core.ImageCapture.OnImageSavedCallback
    public final void onError(ImageCaptureException imageCaptureException) {
        C33272c.f67816e.f67810a.mo68956e("CameraX", "Photo capture failed: code=" + imageCaptureException.getImageCaptureError() + ", " + imageCaptureException.getClass().getSimpleName() + ": " + imageCaptureException.getMessage(), imageCaptureException);
    }
}
