package com.sumsub.sns.internal.features.presentation.consent;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30088W;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.consent.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30871v extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f62367a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C30870u((InterfaceC29953a) this.f62367a.f58168f.getValue(), (InterfaceC29984m) this.f62367a.f58180r.getValue(), (InterfaceC29921d) this.f62367a.f58169g.getValue(), new C30088W(this.f62367a), this.f62367a.f58179q, savedStateHandle);
    }

    public C30871v(C30855f c30855f, C28578h c28578h, Bundle bundle) {
        super(c30855f, bundle);
        this.f62367a = c28578h;
    }
}
