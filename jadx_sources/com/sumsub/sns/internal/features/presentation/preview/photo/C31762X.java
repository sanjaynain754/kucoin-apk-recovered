package com.sumsub.sns.internal.features.presentation.preview.photo;

import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.internal.features.data.model.common.C29054T;
import com.sumsub.sns.internal.features.domain.InterfaceC30271n0;
import com.sumsub.sns.internal.features.domain.documents.AbstractC30125T;
import p852kotlin.reflect.KProperty;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31762X implements InterfaceC30271n0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC31770c0 f64540a;

    public C31762X(AbstractC31770c0 abstractC31770c0) {
        this.f64540a = abstractC31770c0;
    }

    @Override // com.sumsub.sns.internal.features.domain.InterfaceC30271n0
    /* JADX INFO: renamed from: a */
    public final void mo70170a(C29054T c29054t, AbstractC30125T abstractC30125T, int i11) {
        AbstractC31770c0 abstractC31770c0 = this.f64540a;
        KProperty[] kPropertyArr = AbstractC31770c0.f64557l;
        AbstractC28073M0.updateState$default(abstractC31770c0, false, new C31768b0(i11, null), 1, null);
    }
}
