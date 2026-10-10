package com.sumsub.sns.internal.features.presentation.verification2.host;

import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.features.data.model.common.ValidationIdentifierType;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.presentation.main.instructions.C31283h;
import com.sumsub.sns.internal.features.presentation.verification.C32707d;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.verification2.host.K */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32815K extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: a */
    public final C32840y f67155a;

    /* JADX INFO: renamed from: b */
    public final ValidationIdentifierType f67156b;

    /* JADX INFO: renamed from: c */
    public final boolean f67157c;

    /* JADX INFO: renamed from: d */
    public final boolean f67158d;

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel create(String str, Class cls, SavedStateHandle savedStateHandle) {
        C28578h serviceLocator$idensic_mobile_sdk_aar_defaultRelease = this.f67155a.getServiceLocator$idensic_mobile_sdk_aar_defaultRelease();
        return new C32814J(this.f67156b, this.f67157c, this.f67158d, new C32707d(savedStateHandle, (Map) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58161R.getValue()), new C32827k(savedStateHandle), (InterfaceC29953a) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58168f.getValue(), (InterfaceC29984m) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58180r.getValue(), savedStateHandle, new C31283h(savedStateHandle, (InterfaceC29984m) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58180r.getValue(), (Set) serviceLocator$idensic_mobile_sdk_aar_defaultRelease.f58162S.getValue()));
    }

    public C32815K(C32840y c32840y, ValidationIdentifierType validationIdentifierType, boolean z11, boolean z12) {
        super(c32840y, c32840y.getArguments());
        this.f67155a = c32840y;
        this.f67156b = validationIdentifierType;
        this.f67157c = z11;
        this.f67158d = z12;
    }
}
