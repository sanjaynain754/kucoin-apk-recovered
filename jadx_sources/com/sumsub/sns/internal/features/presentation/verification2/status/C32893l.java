package com.sumsub.sns.internal.features.presentation.verification2.status;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28133l;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.presentation.screen.navigation.C28954k;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import p852kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.status.l */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32893l extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C32888g f67295a;

    /* JADX INFO: renamed from: b */
    public final C28954k f67296b;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        AbstractC28052C viewModel$idensic_mobile_sdk_aar_defaultRelease = ((AbstractC28133l) this.f67295a.getParentFragment()).getViewModel$idensic_mobile_sdk_aar_defaultRelease();
        if (!(viewModel$idensic_mobile_sdk_aar_defaultRelease instanceof InterfaceC32889h)) {
            viewModel$idensic_mobile_sdk_aar_defaultRelease = null;
        }
        InterfaceC32889h interfaceC32889h = (InterfaceC32889h) viewModel$idensic_mobile_sdk_aar_defaultRelease;
        if (interfaceC32889h != null) {
            C28578h serviceLocator$idensic_mobile_sdk_aar_defaultRelease = this.f67295a.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease();
            C28954k c28954k = this.f67296b;
            return new C32892k(interfaceC32889h, c28954k.f58856a, c28954k.f58857b, (InterfaceC29953a) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58168f.getValue(), (InterfaceC29984m) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58180r.getValue());
        }
        throw new IllegalStateException((Reflection.getOrCreateKotlinClass(C32888g.class).getSimpleName() + " requires parent VM to implement " + Reflection.getOrCreateKotlinClass(InterfaceC32889h.class).getSimpleName()).toString());
    }

    public C32893l(C32888g c32888g, C28954k c28954k) {
        super(c32888g, c32888g.getArguments());
        this.f67295a = c32888g;
        this.f67296b = c28954k;
    }
}
