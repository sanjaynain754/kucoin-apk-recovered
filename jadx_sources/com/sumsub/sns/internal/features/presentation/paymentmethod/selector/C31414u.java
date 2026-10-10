package com.sumsub.sns.internal.features.presentation.paymentmethod.selector;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.paymentmethod.selector.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31414u extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final Document f63660a;

    /* JADX INFO: renamed from: b */
    public final C28578h f63661b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C31413t(this.f63660a, (InterfaceC29953a) this.f63661b.f58168f.getValue(), (InterfaceC29984m) this.f63661b.f58180r.getValue());
    }

    public C31414u(Document document, C31401h c31401h, C28578h c28578h, Bundle bundle) {
        super(c31401h, bundle);
        this.f63660a = document;
        this.f63661b = c28578h;
    }
}
