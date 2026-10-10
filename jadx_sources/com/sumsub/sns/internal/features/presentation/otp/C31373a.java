package com.sumsub.sns.internal.features.presentation.otp;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.otp.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31373a extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final Bundle f63572a;

    /* JADX INFO: renamed from: b */
    public final C28578h f63573b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C31389q(this.f63572a, savedStateHandle, (InterfaceC29953a) this.f63573b.f58168f.getValue(), (InterfaceC29984m) this.f63573b.f58180r.getValue());
    }

    public C31373a(C31382j c31382j, Bundle bundle, C28578h c28578h) {
        super(c31382j, bundle);
        this.f63572a = bundle;
        this.f63573b = c28578h;
    }
}
