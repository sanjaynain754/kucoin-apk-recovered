package com.sumsub.sns.internal.features.presentation.imageviewer;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.imageviewer.n */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31142n extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final Bundle f62974a;

    /* JADX INFO: renamed from: b */
    public final C28578h f62975b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C31141m(this.f62974a, (InterfaceC29953a) this.f62975b.f58168f.getValue(), (InterfaceC29984m) this.f62975b.f58180r.getValue());
    }

    public C31142n(C31134f c31134f, Bundle bundle, C28578h c28578h) {
        super(c31134f, bundle);
        this.f62974a = bundle;
        this.f62975b = c28578h;
    }
}
