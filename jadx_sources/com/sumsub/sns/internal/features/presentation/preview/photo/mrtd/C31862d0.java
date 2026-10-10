package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.d0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31862d0 implements InterfaceC28773g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41678w f64749a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C31868f0 f64750b;

    public C31862d0(C31868f0 c31868f0) {
        this.f64750b = c31868f0;
        this.f64749a = C41636g.m90916g0(new C31859c0(new C31851Z(c31868f0.getViewState())), ViewModelKt.getViewModelScope(c31868f0), SharingStarted.INSTANCE.getLazily(), null);
    }

    @Override // com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g
    public final InterfaceC41678w getState() {
        return this.f64749a;
    }
}
