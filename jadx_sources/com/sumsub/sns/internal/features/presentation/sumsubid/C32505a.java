package com.sumsub.sns.internal.features.presentation.sumsubid;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.sumsubid.C30053b;
import com.sumsub.sns.internal.features.data.repository.sumsubid.InterfaceC30056e;
import com.sumsub.sns.internal.features.presentation.verification.C32707d;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.sumsubid.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32505a extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f66334a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C32487O0((InterfaceC29953a) this.f66334a.f58168f.getValue(), (InterfaceC29984m) this.f66334a.f58180r.getValue(), (InterfaceC30056e) this.f66334a.f58174l.getValue(), (C30053b) this.f66334a.f58173k.getValue(), (InterfaceC29921d) this.f66334a.f58169g.getValue(), new C32707d(savedStateHandle, (Map) this.f66334a.f58161R.getValue()), savedStateHandle);
    }

    public C32505a(C32608z c32608z, C28578h c28578h, Bundle bundle) {
        super(c32608z, bundle);
        this.f66334a = c28578h;
    }
}
