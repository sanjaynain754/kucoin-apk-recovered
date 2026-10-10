package com.sumsub.sns.internal.core.common;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.mlkit.vision.face.FaceDetector;
import kotlinx.coroutines.C41716o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.Z */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28431Z implements OnCanceledListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FaceDetector f57942a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C41716o f57943b;

    public C28431Z(FaceDetector faceDetector, C41716o c41716o) {
        this.f57942a = faceDetector;
        this.f57943b = c41716o;
    }

    @Override // com.google.android.gms.tasks.OnCanceledListener
    public final void onCanceled() {
        this.f57942a.close();
        this.f57943b.m91151P(0, null);
    }
}
