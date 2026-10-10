package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.RectF;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import kotlinx.coroutines.flow.InterfaceC41634e;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public interface InterfaceC32204d0 {
    /* JADX INFO: renamed from: a */
    Object mo71051a(Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult, C32219i0 c32219i0);

    /* JADX INFO: renamed from: a */
    boolean mo71054a(ImageProxy imageProxy, RectF rectF, float f11);

    InterfaceC41634e getState();
}
