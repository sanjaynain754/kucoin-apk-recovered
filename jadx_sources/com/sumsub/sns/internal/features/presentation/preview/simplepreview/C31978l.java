package com.sumsub.sns.internal.features.presentation.preview.simplepreview;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.documents.C30110D;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.simplepreview.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31978l extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C30110D f65018a;

    /* JADX INFO: renamed from: b */
    public final C28578h f65019b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C31977k(this.f65018a, (InterfaceC29953a) this.f65019b.f58168f.getValue(), (InterfaceC29984m) this.f65019b.f58180r.getValue());
    }

    public C31978l(C30110D c30110d, C31972f c31972f, Bundle bundle, C28578h c28578h) {
        super(c31972f, bundle);
        this.f65018a = c30110d;
        this.f65019b = c28578h;
    }
}
