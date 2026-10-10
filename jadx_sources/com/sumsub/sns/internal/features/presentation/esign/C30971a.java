package com.sumsub.sns.internal.features.presentation.esign;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.esign.C30165b;
import com.sumsub.sns.internal.features.domain.esign.C30168e;
import com.sumsub.sns.internal.features.domain.esign.C30170g;
import com.sumsub.sns.internal.features.domain.esign.C30172i;
import com.sumsub.sns.internal.features.domain.esign.C30174k;
import java.io.File;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.esign.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30971a extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f62584a;

    /* JADX INFO: renamed from: b */
    public final Bundle f62585b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C30997n0(this.f62585b, savedStateHandle, (InterfaceC29953a) this.f62584a.f58168f.getValue(), (InterfaceC29984m) this.f62584a.f58180r.getValue(), (InterfaceC29921d) this.f62584a.f58169g.getValue(), new File(this.f62584a.f58163a.getCacheDir(), "sns_download"), new C30170g(), new C30172i(), new C30174k(), new C30168e(), new C30165b());
    }

    public C30971a(C30984h c30984h, C28578h c28578h, Bundle bundle) {
        super(c30984h, bundle);
        this.f62584a = c28578h;
        this.f62585b = bundle;
    }
}
