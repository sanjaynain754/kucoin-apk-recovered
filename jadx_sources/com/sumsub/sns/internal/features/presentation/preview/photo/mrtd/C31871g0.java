package com.sumsub.sns.internal.features.presentation.preview.photo.mrtd;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.common.AbstractC28437b;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.AbstractC28978A2;
import com.sumsub.sns.internal.features.data.model.common.C28988C2;
import com.sumsub.sns.internal.features.data.model.common.C28998E2;
import com.sumsub.sns.internal.features.data.repository.applicant.C29917M;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.domain.mrtd.AbstractC30268y;
import com.sumsub.sns.internal.features.domain.mrtd.C30234G;
import com.sumsub.sns.internal.features.domain.mrtd.C30256m;
import com.sumsub.sns.internal.features.domain.mrtd.C30261r;
import com.sumsub.sns.internal.features.domain.utils.C30316a;
import p852kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.photo.mrtd.g0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31871g0 extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f64775a;

    /* JADX INFO: renamed from: b */
    public final Bundle f64776b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        AbstractC30268y c30261r;
        C30316a c30316a = new C30316a();
        Bundle bundle = this.f64776b;
        AbstractC28978A2 abstractC28978A2 = bundle != null ? (AbstractC28978A2) AbstractC28437b.m69320a(bundle, "ARGS_MRTD_DOCUMENT", AbstractC28978A2.class, null) : null;
        if (abstractC28978A2 instanceof C28988C2) {
            c30261r = new C30256m(this.f64775a, (C28988C2) abstractC28978A2);
        } else {
            if (!(abstractC28978A2 instanceof C28998E2)) {
                throw new NoWhenBranchMatchedException();
            }
            C28578h c28578h = this.f64775a;
            c30261r = new C30261r((C29917M) c28578h.f58172j.getValue(), (InterfaceC29953a) c28578h.f58168f.getValue(), (C28998E2) abstractC28978A2);
        }
        return new C31868f0(savedStateHandle, c30316a, abstractC28978A2, c30261r, new C30234G(this.f64775a), (InterfaceC29953a) this.f64775a.f58168f.getValue(), (InterfaceC29984m) this.f64775a.f58180r.getValue());
    }

    public C31871g0(C31832F c31832f, C28578h c28578h, Bundle bundle) {
        super(c31832f, bundle);
        this.f64775a = c28578h;
        this.f64776b = bundle;
    }
}
