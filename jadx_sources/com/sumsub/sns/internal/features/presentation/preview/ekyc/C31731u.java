package com.sumsub.sns.internal.features.presentation.preview.ekyc;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.ekyc.C30158a;
import com.sumsub.sns.internal.features.domain.ekyc.C30159b;
import com.sumsub.sns.internal.features.domain.ekyc.C30161d;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.u */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31731u extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final Document f64444a;

    /* JADX INFO: renamed from: b */
    public final C28578h f64445b;

    /* JADX INFO: renamed from: c */
    public final Bundle f64446c;

    /* JADX INFO: renamed from: d */
    public final boolean f64447d;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        Bundle bundle = this.f64446c;
        C31729t c31729t = null;
        String string = bundle != null ? bundle.getString("args_country") : null;
        Bundle bundle2 = this.f64446c;
        String string2 = bundle2 != null ? bundle2.getString("args_source_id") : null;
        if (string != null && !StringsKt.isBlank(string) && string2 != null && !StringsKt.isBlank(string2)) {
            c31729t = new C31729t(string, string2);
        }
        return new C31707h0(this.f64444a, this.f64447d, c31729t, (C29917M) this.f64445b.f58172j.getValue(), new C30158a(), savedStateHandle, (InterfaceC29953a) this.f64445b.f58168f.getValue(), (InterfaceC29984m) this.f64445b.f58180r.getValue(), new C30156e((InterfaceC29953a) this.f64445b.f58168f.getValue(), (InterfaceC29984m) this.f64445b.f58180r.getValue()), new C30161d((InterfaceC29984m) this.f64445b.f58180r.getValue()), new C30159b());
    }

    public C31731u(Document document, C31715m c31715m, C28578h c28578h, Bundle bundle, boolean z11) {
        super(c31715m, bundle);
        this.f64444a = document;
        this.f64445b = c28578h;
        this.f64446c = bundle;
        this.f64447d = z11;
    }
}
