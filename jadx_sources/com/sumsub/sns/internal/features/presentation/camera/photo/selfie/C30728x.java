package com.sumsub.sns.internal.features.presentation.camera.photo.selfie;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.internal.features.presentation.camera.InterfaceC30798y;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30728x implements InterfaceC30798y {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41678w f62075a;

    @Override // com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g
    public final InterfaceC41678w getState() {
        return this.f62075a;
    }

    public C30728x(C30729y c30729y) {
        this.f62075a = C41636g.m90916g0(new C30727w(c30729y.f62078c.f57261i), ViewModelKt.getViewModelScope(c30729y), SharingStarted.INSTANCE.getLazily(), null);
    }
}
