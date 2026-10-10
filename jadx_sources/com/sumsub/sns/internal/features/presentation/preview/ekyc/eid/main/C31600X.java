package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.ekyc.C30163f;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.main.X */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31600X extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f64197a;

    /* JADX INFO: renamed from: b */
    public final Bundle f64198b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        Bundle bundle = this.f64198b;
        String string = bundle != null ? bundle.getString("eid_mobile_token", null) : null;
        Bundle bundle2 = this.f64198b;
        String string2 = bundle2 != null ? bundle2.getString("eid_url", null) : null;
        Bundle bundle3 = this.f64198b;
        String string3 = bundle3 != null ? bundle3.getString("eid_certificate_pem", null) : null;
        Bundle bundle4 = this.f64198b;
        return new C31583M0(string, string2, string3, new C30163f(bundle4 != null ? bundle4.getString("ekyc_confirmation_id", null) : null, (C29917M) this.f64197a.f58172j.getValue(), (InterfaceC29984m) this.f64197a.f58180r.getValue()), savedStateHandle, (InterfaceC29953a) this.f64197a.f58168f.getValue(), (InterfaceC29984m) this.f64197a.f58180r.getValue());
    }

    public C31600X(C31626i c31626i, C28578h c28578h, Bundle bundle) {
        super(c31626i, bundle);
        this.f64197a = c28578h;
        this.f64198b = bundle;
    }
}
