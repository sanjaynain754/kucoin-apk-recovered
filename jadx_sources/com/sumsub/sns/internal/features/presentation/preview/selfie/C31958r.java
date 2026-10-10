package com.sumsub.sns.internal.features.presentation.preview.selfie;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30319v0;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.selfie.r */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31958r extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final Document f64991a;

    /* JADX INFO: renamed from: b */
    public final C28578h f64992b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C31957q(this.f64991a, savedStateHandle, (InterfaceC29953a) this.f64992b.f58168f.getValue(), (InterfaceC29984m) this.f64992b.f58180r.getValue(), new C30319v0(this.f64992b), new C30156e((InterfaceC29953a) this.f64992b.f58168f.getValue(), (InterfaceC29984m) this.f64992b.f58180r.getValue()));
    }

    public C31958r(Document document, C31947g c31947g, C28578h c28578h, Bundle bundle) {
        super(c31947g, bundle);
        this.f64991a = document;
        this.f64992b = c28578h;
    }
}
