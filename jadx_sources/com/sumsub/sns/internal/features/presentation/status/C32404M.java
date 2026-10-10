package com.sumsub.sns.internal.features.presentation.status;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30088W;
import com.sumsub.sns.internal.features.domain.C30336z;
import com.sumsub.sns.internal.features.presentation.main.C31288j2;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.M */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32404M extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f66056a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f66056a.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f66056a.f58180r.getValue();
        C30088W c30088w = new C30088W(this.f66056a);
        C30336z c30336z = new C30336z(this.f66056a);
        InterfaceC29921d interfaceC29921d = (InterfaceC29921d) this.f66056a.f58169g.getValue();
        C28578h c28578h = this.f66056a;
        return new C32403L(interfaceC29953a, c30088w, c30336z, interfaceC29984m, interfaceC29921d, c28578h.f58179q, savedStateHandle, (C31288j2) c28578h.f58171i.getValue());
    }

    public C32404M(C32435m c32435m, C28578h c28578h, Bundle bundle) {
        super(c32435m, bundle);
        this.f66056a = c28578h;
    }
}
