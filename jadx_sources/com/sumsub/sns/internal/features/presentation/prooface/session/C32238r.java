package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.RectF;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import kotlinx.coroutines.flow.C41679x;
import kotlinx.coroutines.flow.InterfaceC41634e;
import kotlinx.coroutines.flow.InterfaceC41669n;
import p852kotlin.Unit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32238r implements InterfaceC32204d0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41669n f65682a = C41679x.m91009a(C32201c0.f65577a);

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    /* JADX INFO: renamed from: a */
    public final boolean mo71054a(ImageProxy imageProxy, RectF rectF, float f11) {
        return false;
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    /* JADX INFO: renamed from: a */
    public final Object mo71051a(Liveness3dFaceRepository$LivenessRepositoryResult liveness3dFaceRepository$LivenessRepositoryResult, C32219i0 c32219i0) {
        return Unit.INSTANCE;
    }

    @Override // com.sumsub.sns.internal.features.presentation.prooface.session.InterfaceC32204d0
    public final InterfaceC41634e getState() {
        return this.f65682a;
    }
}
