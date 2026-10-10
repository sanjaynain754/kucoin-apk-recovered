package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.internal.features.presentation.camera.InterfaceC30798y;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41678w;
import kotlinx.coroutines.flow.SharingStarted;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.t2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30633t2 implements InterfaceC30798y {

    /* JADX INFO: renamed from: a */
    public final InterfaceC41678w f61895a;

    @Override // com.sumsub.sns.internal.core.presentation.common.InterfaceC28773g
    public final InterfaceC41678w getState() {
        return this.f61895a;
    }

    public C30633t2(C30440B2 c30440b2) {
        this.f61895a = C41636g.m90916g0(new C30628s2(c30440b2.f61311l.f57261i), ViewModelKt.getViewModelScope(c30440b2), SharingStarted.INSTANCE.getLazily(), null);
    }
}
