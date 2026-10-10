package com.sumsub.sns.internal.core.presentation.camera;

import android.graphics.Bitmap;
import androidx.camera.core.ImageProxy;
import java.io.File;
import p852kotlin.coroutines.Continuation;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.camera.s */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public interface InterfaceC28753s {
    /* JADX INFO: renamed from: a */
    Object mo69575a(Bitmap bitmap, C28758x c28758x, C28744j c28744j);

    /* JADX INFO: renamed from: a */
    Object mo69576a(ImageProxy imageProxy, C28758x c28758x, Continuation continuation);

    /* JADX INFO: renamed from: a */
    void mo69577a(C28740f c28740f);

    /* JADX INFO: renamed from: a */
    void mo69578a(File file);

    /* JADX INFO: renamed from: b */
    void mo69579b();

    /* JADX INFO: renamed from: b */
    void mo69580b(File file);

    void onError(Exception exc);
}
