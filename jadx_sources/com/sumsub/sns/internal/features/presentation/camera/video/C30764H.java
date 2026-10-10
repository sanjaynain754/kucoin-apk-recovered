package com.sumsub.sns.internal.features.presentation.camera.video;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30302o;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.video.H */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30764H extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f62161a;

    /* JADX INFO: renamed from: b */
    public final Bundle f62162b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        C30302o c30302o = new C30302o(this.f62161a);
        Bundle bundle = this.f62162b;
        String string = bundle != null ? bundle.getString("EXTRA_ID_DOC_SET_TYPE") : null;
        Bundle bundle2 = this.f62162b;
        return new C30763G(savedStateHandle, c30302o, string, bundle2 != null ? bundle2.getString("EXTRA_TYPE") : null, (InterfaceC29953a) this.f62161a.f58168f.getValue(), (InterfaceC29984m) this.f62161a.f58180r.getValue());
    }

    public C30764H(C30776i c30776i, C28578h c28578h, Bundle bundle) {
        super(c30776i, bundle);
        this.f62161a = c28578h;
        this.f62162b = bundle;
    }
}
