package com.sumsub.sns.internal.features.presentation.result;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.result.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32361a extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f65937a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C32377q(savedStateHandle, (InterfaceC29953a) this.f65937a.f58168f.getValue(), (InterfaceC29984m) this.f65937a.f58180r.getValue());
    }

    public C32361a(C32369i c32369i, Bundle bundle, C28578h c28578h) {
        super(c32369i, bundle);
        this.f65937a = c28578h;
    }
}
