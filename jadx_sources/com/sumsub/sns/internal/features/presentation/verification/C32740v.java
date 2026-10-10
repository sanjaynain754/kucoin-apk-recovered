package com.sumsub.sns.internal.features.presentation.verification;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.C30069C;
import com.sumsub.sns.internal.features.domain.C30083Q;
import com.sumsub.sns.internal.features.domain.C30101b;
import com.sumsub.sns.internal.features.domain.C30156e;
import java.util.Map;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification.v */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32740v extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final ValidationIdentifierType f66992a;

    /* JADX INFO: renamed from: b */
    public final boolean f66993b;

    /* JADX INFO: renamed from: c */
    public final C28578h f66994c;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        return new C32720j0(this.f66992a, this.f66993b, new C30156e((InterfaceC29953a) this.f66994c.f58168f.getValue(), (InterfaceC29984m) this.f66994c.f58180r.getValue()), new C30083Q((InterfaceC29921d) this.f66994c.f58169g.getValue()), new C32707d(savedStateHandle, (Map) this.f66994c.f58161R.getValue()), new C30101b((InterfaceC29921d) this.f66994c.f58169g.getValue()), (InterfaceC29953a) this.f66994c.f58168f.getValue(), (InterfaceC29984m) this.f66994c.f58180r.getValue(), savedStateHandle, this.f66994c.f58179q, new C30069C());
    }

    public C32740v(C32730p c32730p, ValidationIdentifierType validationIdentifierType, boolean z11, C28578h c28578h, Bundle bundle) {
        super(c32730p, bundle);
        this.f66992a = validationIdentifierType;
        this.f66993b = z11;
        this.f66994c = c28578h;
    }
}
