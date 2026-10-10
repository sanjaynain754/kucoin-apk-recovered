package com.sumsub.sns.internal.features.presentation.prooface.session;

import android.graphics.RectF;
import androidx.camera.core.ImageProxy;
import com.sumsub.sns.internal.features.data.network.prooface.Liveness3dFaceRepository$LivenessRepositoryResult;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.Unit;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.prooface.session.o */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32232o implements InterfaceC32204d0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41634e f65668a = C41636g.m90879C();

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
        return this.f65668a;
    }
}
