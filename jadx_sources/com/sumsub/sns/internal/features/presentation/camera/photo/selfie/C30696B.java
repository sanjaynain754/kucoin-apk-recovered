package com.sumsub.sns.internal.features.presentation.camera.photo.selfie;

import android.os.Bundle;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.C29062V;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.camera.photo.selfie.B */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30696B extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C28578h f62029a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        C29062V c29062v = C29070X.Companion;
        String str2 = (String) savedStateHandle.get("EXTRA_DOCUMENT_TYPE");
        c29062v.getClass();
        C29070X c29070xM69739a = C29062V.m69739a(str2);
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) this.f62029a.f58168f.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) this.f62029a.f58180r.getValue();
        Boolean bool = (Boolean) savedStateHandle.get("EXTRA_GALLERY_AVAILABLE");
        return new C30730z(savedStateHandle, c29070xM69739a, interfaceC29953a, interfaceC29984m, (String) savedStateHandle.get("EXTRA_COUNTRY_CODE"), bool != null ? bool.booleanValue() : false);
    }

    public C30696B(C30717m c30717m, C28578h c28578h, Bundle bundle) {
        super(c30717m, bundle);
        this.f62029a = c28578h;
    }
}
