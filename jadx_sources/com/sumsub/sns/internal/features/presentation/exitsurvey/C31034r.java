package com.sumsub.sns.internal.features.presentation.exitsurvey;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30336z;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.exitsurvey.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31034r extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f62731a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C31033q(savedStateHandle, (InterfaceC29953a) this.f62731a.f58168f.getValue(), (InterfaceC29984m) this.f62731a.f58180r.getValue(), new C30336z(this.f62731a));
    }

    public C31034r(C31023g c31023g, C28578h c28578h, Bundle bundle) {
        super(c31023g, bundle);
        this.f62731a = c28578h;
    }
}
