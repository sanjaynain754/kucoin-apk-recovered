package com.sumsub.sns.internal.features.presentation.camera.photo.document;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.InterfaceC30271n0;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30125T;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.document.A2 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30436A2 implements InterfaceC30271n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C30440B2 f61266a;

    public C30436A2(C30440B2 c30440b2) {
        this.f61266a = c30440b2;
    }

    @Override // com.sumsub.sns.internal.features.domain.InterfaceC30271n0
    /* JADX INFO: renamed from: a */
    public final void mo70170a(C29054T c29054t, AbstractC30125T abstractC30125T, int i11) {
        AbstractC28073M0.updateState$default(this.f61266a, false, new C30662z2(i11, null), 1, null);
    }
}
