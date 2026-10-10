package com.sumsub.sns.internal.core.domain.facedetector;

import android.graphics.Bitmap;
import android.graphics.RectF;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.domain.facedetector.g */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public interface InterfaceC28561g {
    /* JADX INFO: renamed from: a */
    AbstractC28568n mo69426a(Bitmap bitmap, RectF rectF);

    String getName();

    boolean isStarted();

    void start();

    void stop();
}
