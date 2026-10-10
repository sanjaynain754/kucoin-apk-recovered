package com.sumsub.sns.internal.features.presentation.support;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.support.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32621l implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a */
    public final C28578h f66556a;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel create(Class cls) {
        C28578h c28578h = this.f66556a;
        return new C32620k(c28578h.f58179q, (C30034c) c28578h.f58167e.getValue(), (InterfaceC29953a) this.f66556a.f58168f.getValue(), (InterfaceC29984m) this.f66556a.f58180r.getValue());
    }

    public C32621l(C28578h c28578h) {
        this.f66556a = c28578h;
    }
}
