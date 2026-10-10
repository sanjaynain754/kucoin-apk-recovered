package com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.preview.ekyc.eid.pin.x */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C31699x extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f64328a;

    /* JADX INFO: renamed from: b */
    public final Bundle f64329b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        AbstractC31686k c31681f;
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f64328a.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f64328a.f58180r.getValue();
        Bundle bundle = this.f64329b;
        if (bundle == null || (c31681f = (AbstractC31686k) bundle.getParcelable("pin_mode")) == null) {
            c31681f = new C31681f(false);
        }
        return new C31675M(c31681f, savedStateHandle, interfaceC29953a, interfaceC29984m);
    }

    public C31699x(C31696u c31696u, C28578h c28578h, Bundle bundle) {
        super(c31696u, bundle);
        this.f64328a = c28578h;
        this.f64329b = bundle;
    }
}
