package com.sumsub.sns.internal.features.presentation.verification2.email;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.email.E */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32775E extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C32785g f67080a;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        Object viewModel$idensic_mobile_sdk_aar_defaultRelease = ((AbstractC28133l) this.f67080a.getParentFragment()).getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        if (!(viewModel$idensic_mobile_sdk_aar_defaultRelease instanceof InterfaceC32786h)) {
            viewModel$idensic_mobile_sdk_aar_defaultRelease = null;
        }
        InterfaceC32786h interfaceC32786h = (InterfaceC32786h) viewModel$idensic_mobile_sdk_aar_defaultRelease;
        if (interfaceC32786h != null) {
            C28578h serviceLocator$idensic_mobile_sdk_aar_defaultRelease = this.f67080a.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease();
            return new C32774D(interfaceC32786h, serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58179q, (InterfaceC29953a) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58168f.getValue(), (InterfaceC29984m) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58180r.getValue());
        }
        throw new IllegalStateException((Reflection.getOrCreateKotlinClass(C32785g.class).getSimpleName() + " requires parent VM to implement " + Reflection.getOrCreateKotlinClass(InterfaceC32786h.class).getSimpleName()).toString());
    }

    public C32775E(C32785g c32785g) {
        super(c32785g, c32785g.getArguments());
        this.f67080a = c32785g;
    }
}
