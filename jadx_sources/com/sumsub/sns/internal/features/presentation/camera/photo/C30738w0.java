package com.sumsub.sns.internal.features.presentation.camera.photo;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30156e;
import com.sumsub.sns.internal.features.domain.C30332x;
import com.sumsub.sns.internal.features.domain.ekyc.C30159b;
import com.sumsub.sns.internal.features.domain.ekyc.C30161d;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.w0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30738w0 extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final String f62105a;

    /* JADX INFO: renamed from: b */
    public final C28578h f62106b;

    /* JADX INFO: renamed from: c */
    public final Bundle f62107c;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        Bundle bundle = this.f62107c;
        String string = bundle != null ? bundle.getString("extra_prefill_country") : null;
        String str2 = this.f62105a;
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f62106b.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f62106b.f58180r.getValue();
        C28578h c28578h = this.f62106b;
        return new C30736v0(str2, string, interfaceC29953a, interfaceC29984m, c28578h.f58179q, new C30156e((InterfaceC29953a) c28578h.f58168f.getValue(), (InterfaceC29984m) this.f62106b.f58180r.getValue()), new C30332x(this.f62106b), new C30159b(), new C30161d((InterfaceC29984m) this.f62106b.f58180r.getValue()));
    }

    public C30738w0(C30669g c30669g, String str, C28578h c28578h, Bundle bundle) {
        super(c30669g, bundle);
        this.f62105a = str;
        this.f62106b = c28578h;
        this.f62107c = bundle;
    }
}
