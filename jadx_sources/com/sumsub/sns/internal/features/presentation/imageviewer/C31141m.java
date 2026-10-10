package com.sumsub.sns.internal.features.presentation.imageviewer;

import android.os.Bundle;
import com.sumsub.sns.core.presentation.base.AbstractC28142p0;
import com.sumsub.sns.core.presentation.base.C28075O;
import com.sumsub.sns.core.presentation.base.C28076P;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import java.io.File;
import java.io.Serializable;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.imageviewer.m */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31141m extends AbstractC28142p0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f62972a;

    /* JADX INFO: renamed from: b */
    public final File f62973b;

    public C31141m(Bundle bundle, InterfaceC29953a interfaceC29953a, InterfaceC29984m interfaceC29984m) {
        super(interfaceC29953a, interfaceC29984m, new C28076P());
        this.f62972a = bundle;
        Serializable serializable = bundle != null ? bundle.getSerializable("file") : null;
        this.f62973b = serializable instanceof File ? (File) serializable : null;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28142p0
    public final InterfaceC41634e buildViewStateFlow(C28075O c28075o) {
        return C41636g.m90917h(C41636g.m90887K(new C31138j(this, null)), new C31140l(this, null));
    }
}
