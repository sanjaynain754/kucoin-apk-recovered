package com.sumsub.sns.internal.features.presentation.preview.applicantdata;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.C28432Z0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.applicantdata.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31477B extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final Document f63867a;

    /* JADX INFO: renamed from: b */
    public final C28578h f63868b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C31476A(this.f63867a, savedStateHandle, (InterfaceC29953a) this.f63868b.f58168f.getValue(), (InterfaceC29984m) this.f63868b.f58180r.getValue(), new C30156e((InterfaceC29953a) this.f63868b.f58168f.getValue(), (InterfaceC29984m) this.f63868b.f58180r.getValue()), new C28432Z0(), (InterfaceC29921d) this.f63868b.f58169g.getValue());
    }

    public C31477B(Document document, C31490h c31490h, C28578h c28578h, Bundle bundle) {
        super(c31490h, bundle);
        this.f63867a = document;
        this.f63868b = c28578h;
    }
}
