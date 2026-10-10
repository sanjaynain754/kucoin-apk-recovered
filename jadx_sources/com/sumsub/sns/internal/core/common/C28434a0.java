package com.sumsub.sns.internal.core.common;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.mlkit.vision.face.FaceDetector;
import kotlinx.coroutines.C41716o;
import p852kotlin.Result;
import p852kotlin.ResultKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.a0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28434a0 implements OnFailureListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FaceDetector f57947a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C41716o f57948b;

    public C28434a0(FaceDetector faceDetector, C41716o c41716o) {
        this.f57947a = faceDetector;
        this.f57948b = c41716o;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        this.f57947a.close();
        C41716o c41716o = this.f57948b;
        Result.Companion companion = Result.INSTANCE;
        c41716o.resumeWith(Result.m103844constructorimpl(ResultKt.createFailure(exc)));
    }
}
